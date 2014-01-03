package gui.make.take;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import static constants.HumanBodyValues.*;

public class LimbSquare extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String image, SILimage;
	private ImageIcon squareImage;
	private int humanBodyPart;
	private int[] b_posture;
	private int posture;
	
	
	public LimbSquare(String image, String SILimage, int hbp, int pos){
		this.image = image;
		this.SILimage = SILimage;
		humanBodyPart = hbp;
		posture = pos;
		
		configure();
	}
	
	public LimbSquare(String image, String SILimage, int hbp, int[] pos){
		this.image = image;
		this.SILimage = SILimage;
		humanBodyPart = hbp;
		b_posture = pos;
		configure();
	}
	
	private void configure(){
		setPreferredSize(new Dimension(SQUARE_DIM, SQUARE_DIM));
		squareImage = new ImageIcon(getClass().getResource(image).getFile());
		setIcon(squareImage);
	}
	
	public void setSILimage(String i){
		SILimage = i;
	}
	
	public String getSILimage(){
		return SILimage;
	}
	
	public int getHumanBodyPart(){
		return humanBodyPart;
	}
	
	public void setHumanBodyPart(int hbp){
		humanBodyPart = hbp;
	}
	
	public int[] getBodyPosture(){
		return b_posture;	
	}
	
	public void setBodyPosture(int[] pos){
		b_posture = pos;
	}
	
	public int getPosture(){
		return posture;	
	}
	
	public void setPosture(int pos){
		posture = pos;
	}
}
