import java.awt.Color;

public class U2L01animal {
	private int heightFt;
	private int weightLbs;
	private Color skinFurFeathersEtc;
	private int numLimbs;
	
	//default constructor – takes no parameters, sets attributes to default
	public U2L01animal () {
		setHeightFt(15);
		setWeightLbs(1800);
		setSkinFurFeathersEtc(Color.BLACK);
		setNumLimbs(4);
	}
	
	//overload constructor – can take whatever parameters you like
	public U2L01animal(int height, int weight, Color sffe, int limbs) {
		setHeightFt(height);
		setWeightLbs(weight);
		setSkinFurFeathersEtc(sffe);
		setNumLimbs(limbs);
	}
	
	//getters/accessors
	public int getHeightFt() {
		return heightFt;
	}
	public int getWeightLbs() {
		return weightLbs;
	}
	public Color getSkinFurFeathersEtc() {
		return skinFurFeathersEtc;
	}
	public int getNumLimbs() {
		return numLimbs;
	}
	
	public void setHeightFt(int height) {
		if (height > 0) {
			heightFt = height;
		} else {
			heightFt = 3;
			System.out.println("Height cannot be 0 or negative. Defaulting to 3 ft.");
		}
	}
	
	public void setWeightLbs(int weight) {
		if (weight > 0) {
			weightLbs = weight;
		} else {
			weightLbs = 50;
			System.out.println("Weight cannot be 0 or negative. Defaulting to 50 lbs.");
		}
	}
	
	

	
	/*  public static void main(String[] args) {
		// TODO Auto-generated method stub

	}  */

}
