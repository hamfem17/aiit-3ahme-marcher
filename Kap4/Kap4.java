package Kap4;

import java.util.Vector;

/**
 * @author Simon Marcher
 */

public class Kap4 {
	
	private boolean bool = true;
	private char character = 'A';
	private byte byt = 127;
	private short shrt =  32767;
	private int integer = 2147483647;
	private long lng = 9223372036854775807; //Muesste eigentlich funktionieren
	private float flt = 3.40282347 * (10^38); //Das auch
	private double dble = 1.79769313486231570 * (10^308);
	private char[] literale = {'\b', '\t', '\n', '\f', '\r', '\'', '\\'};
	private int[][][] raum = new int[10][10][10];

	private String string = new String();
	private Vector vector = new Vector();
	
	private static void byteKit() {	
		
		int value = 145;
		byte byteValue = (byte)value;
		double doubleValue = (double)value;
		
	}
	
	
}
