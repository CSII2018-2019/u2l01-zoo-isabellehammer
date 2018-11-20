import java.awt.Color;

public class U2L01zoo {

	public static void main(String[] args) {
		//create using default constructor
		U2L01animal a1 = new U2L01animal();
		a1.setSkinFurFeathersEtc(Color.RED); //call a method on an instance of an object
		a1.setWeightLbs(100);
		System.out.println(a1);//print calls toString method
		
		//create using overloaded constructor
		U2L01animal a2 = new U2L01animal(5, 120, Color.YELLOW, 4);
		
		

	}

}
