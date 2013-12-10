/**
 * 
 */
package rec.model;

import java.util.Observable;
import java.util.Observer;

import rec.reasoner.Config;
import rec.reasoner.ConfigClock;
import rec.reasoner.ConfigMode;
import rec.reasoner.Reasoner;

/**
 * @author stefano
 * 
 */
public class Model extends Observable {

	@Override
	public synchronized void addObserver(Observer paramObserver) {
		reasoner.addObserver(paramObserver);
	}

	@Override
	public synchronized void deleteObserver(Observer paramObserver) {
		reasoner.deleteObserver(paramObserver);
	}

	public Model() {
		Config config = Config.newConfig();
		config.setOption(ConfigMode.LITE);
		config.setOption(ConfigClock.PSEUDO_TIME);

		rec.reasoner.Model model = rec.reasoner.Model.newModel(config);

		reasoner = Reasoner.newReasoner(model);
		assert invariant() : "Illegal state in Model()";
	}

	private Reasoner reasoner;

	private boolean invariant() {
		return (reasoner != null);
	}

	public void start() {
		reasoner.start();
	}

	public void stamp() {
		reasoner.flush();
		reasoner.stamp();
	}

	public void insert(String label, long time, double value) {
		reasoner.notify(label, time, value);
	}
	
	public Reasoner getReasoner(){
		return reasoner;
	}
}
