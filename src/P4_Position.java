/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class P4_Position {

	public static void main(String[] args) {
		double s0 = 2;
		double v0 = 5;
		double t = 10;
		double a = 12;
		double s = s0 + (v0 * t) + (.5 * (a * (t * t))); 
		System.out.println(s);
	}

}
