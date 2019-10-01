package lecture;

public class TestMathFunctions
{
	public static void main(String[] args)
	{
		double x = 2.0;
		double y = 3.0;
		int a = 2;
		int b = 3;
		
		System.out.println("DOUBLE MIN (2.0, 3.0) " + Math.min(x, y));
		System.out.println("INT MIN (2, 3) " + Math.min(a, b));
		System.out.println("MIXED MIN (2.0, 3) " + Math.min(x, b));
		System.out.println("DOUBLE MAX (2.0, 3.0) " + Math.max(x, y));
		System.out.println("SQRT (4) " + Math.sqrt(4));
		System.out.println("POW (2, 2) " + Math.pow(2, 2));
		System.out.println("POW (4, 0.5) " + Math.pow(4, 0.5));
		/* Random
		 * new = (old * a + b) % c
		 * a, b, and c are all very large
		 * a and b are usually prime
		 */
		System.out.println("RANDOM " + Math.random());
		/*
		 * Sin expects radians
		 * 
		 * Math.toRadians(degress) returns radians from degrees
		 * Math.toDegrees(radians) return degrees from radians
		 */
		System.out.println("SIN (270 deg) " + Math.sin(270));
		System.out.println("SIN (270 rad) " + Math.sin(Math.toRadians(270)));
		System.out.println("COS (45) " + Math.cos(45));
		System.out.println("ACOS (0) (to degrees) " + Math.toDegrees(Math.acos(0)));
		System.out.println("ATAN2 (-1, -1) (to degrees) " + Math.toDegrees(Math.atan2(-1, -1)));
		/*
		 * Log in java is the natural log (ln)
		 */
		System.out.println("LOG (100) " + Math.log(100));
		/*
		 * Log10 = Normal Log
		 */
		System.out.println("LOG10 (100) " + Math.log10(100));
		System.out.println("EXP (0) " + Math.exp(0));
		System.out.println("ABS (-1.2) " + Math.abs(-1.2));
		System.out.println("ABS (-1) " + Math.abs(-1));
		/*
		 * Ceil = ceiling (round up)
		 * Floor = round down
		 * Round = normal round
		 */
		System.out.println("CEIL (4.1) " + Math.ceil(4.1));
		System.out.println("FLOOR (4.9) " + Math.floor(4.9));
		/*
		 * Round returns a long
		 * Possibility of an infinite number (rounding error)
		 */
		System.out.println("ROUND (4.49) " + Math.round(4.49));
		System.out.println("ROUND (4.5) " + Math.round(4.5));
	}
}
