package math;

public interface Chemistry
{
	public static double frequencyFromWavelength(double wavelength)
	{
		/*
		 * Speed of light / lambda
		 */
		return Constants.C / wavelength;
	}
	
	public static double wavelengthFromFrequency(double frequency)
	{
		/*
		 * Speed of light / frequency
		 */
		return Constants.C / frequency;
	}
	
	public static double energyFromFrequency(int n, double frequency)
	{
		/*
		 * Quantum Number * plancks * frequency
		 */
		return n * Constants.h * frequency;
	}
	
	public static double energyOfElementAtN(int atomicNumber, int n)
	{
		/*
		 * -RH * (Z^2 / n^2)
		 */
		return -Constants.RH * (Math.pow(atomicNumber, 2) / Math.pow(n, 2));
	}
	
	public static double deBroglie(double particleMass, double frequency)
	{
		/*
		 * plancks / (m * frequency)
		 */
		return Constants.h / (particleMass * frequency);
	}
}
