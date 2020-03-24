package Kap5;

public class Kap5 {

	private int n1 = +1;
	private int n2 = -1;
	private int n3 = n1 + n2;
	private int n4 = n1 - n3;
	private int n5 = n4 * n2;
	private double n6 = n1 / n5;
	private int n7 = n5 % n3;
	
	private int n8 = n1++; //n8 = 1; n1 = 2;
	private int n9 = ++n1; //n9 = 3; n1 = 3;
	private int n10 = n2--; //n10 = -1; n2 = -2;
	private int n11 = --n2; //n11 = -3; n2 = -3;
	
	private boolean b1 = (1 == 2); //b1 = 0;
	private boolean b2 = (1 != 2); //b2 = 1;
	private boolean b3 = (3 < 3); //b3 = 0;
	private boolean b4 = (3 <= 3); //b4 = 1;
	private boolean b5 = (6 > 6); //b5 = 0;
	private boolean b6 = (6 >= 6); //b6 = 1;
	
	private boolean b7 = !b6; //b7 = 0;
	private boolean b8 = (b2 && b6); // b8 = 1;
	private boolean b9 = (b8 || b1); //b9 = 1;
	
	
	private boolean b10 = (false && f1()); //f1 wird nicht ausgewertet
	private boolean b11 = (false & f1()); //f1 wird ausgewertet
	private boolean b12 = (true || f1()); //f1 wird nicht ausgewertet
	private boolean b13 = (true | f1()); //f1 wird ausgewertet
	
	private static boolean f1() {
		return true;
	}
	
	private boolean b14;
	b14 = (true ^ true); //b14 = 0;
	b14 = (false ^ false); //b14 = 0;
	b14 = (true ^ false); //b14 = 1;
	b14 = (false ^ true); //b14 = 1;
}
