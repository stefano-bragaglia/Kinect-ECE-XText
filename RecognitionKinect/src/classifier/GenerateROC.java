package classifier;

import java.awt.*;
import java.io.*;
import java.util.*;

import weka.core.*;
import weka.classifiers.evaluation.*;
import weka.classifiers.functions.SMO;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;
import weka.gui.visualize.*;

/**
 * Generates and displays a ROC curve from a dataset. Uses a default NaiveBayes
 * to generate the ROC data.
 * 
 * @author FracPete
 */
public class GenerateROC {

	/**
	 * takes one argument: dataset in ARFF format (expects class to be last
	 * attribute)
	 * @throws Exception 
	 */
	
	public GenerateROC(String file, String svm) throws Exception{
		// load data
				Instances data = new Instances(new BufferedReader(new FileReader(
						getClass().getResource(file).getFile())));

				data = filterDataSet(data);
				data.setClassIndex(0);
				
				File fileNET = new File(getClass().getResource(svm).getFile());
				// train classifier
				SMO cl = new SMO();
				cl = (SMO) weka.core.SerializationHelper.read(fileNET.getPath());
				Evaluation eval = new Evaluation(data);
				eval.crossValidateModel(cl, data, 10, new Random(1));

				// generate curve
				ThresholdCurve tc = new ThresholdCurve();
				int classIndex = 0;
				Instances result = tc.getCurve(eval.predictions(), classIndex);

				// plot curve
				ThresholdVisualizePanel vmc = new ThresholdVisualizePanel();
				vmc.setROCString("(Area under ROC = "
						+ Utils.doubleToString(ThresholdCurve.getROCArea(result), 4) + ")");
				vmc.setName(result.relationName());
				PlotData2D tempd = new PlotData2D(result);
				tempd.setPlotName(result.relationName());
				tempd.addInstanceNumberAttribute();
				// specify which points are connected
				boolean[] cp = new boolean[result.numInstances()];
				for (int n = 1; n < cp.length; n++)
					cp[n] = true;
				tempd.setConnectPoints(cp);
				// add plot
				vmc.addPlot(tempd);

				// display curve
				String plotName = vmc.getName();
				final javax.swing.JFrame jf = new javax.swing.JFrame(
						"Weka Classifier Visualize: " + plotName);
				jf.setSize(500, 400);
				jf.getContentPane().setLayout(new BorderLayout());
				jf.getContentPane().add(vmc, BorderLayout.CENTER);
				jf.addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosing(java.awt.event.WindowEvent e) {
						jf.dispose();
					}
				});
				jf.setVisible(true);
	}
	
	protected Instances filterDataSet(Instances data) throws Exception{
		String[] options = new String[2];
		options[0] = "-R";                                    			// "range"
		options[1] = "1,2,4,8,9,13,14,18";               
		
		Remove remove = new Remove();                         // new instance of filter
		remove.setOptions(options);                           // set options
		remove.setInputFormat(data);                          // inform filter about dataset **AFTER** setting options
		Instances newData = Filter.useFilter(data, remove);   // apply filter

		return newData;
	}
	
	public static void main(String[] args) throws Exception {
		new GenerateROC(args[0], args[1]);
	}
}