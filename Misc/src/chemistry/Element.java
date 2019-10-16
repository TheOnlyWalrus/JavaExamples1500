package chemistry;

public class Element
{
	MatterState naturalState;
	String symbol;
	int charge;
	int oxidationNumber;
	int totalCharge;
	int atomicMass;
	int neutrons;
	int protons;
	int electrons;
	int atomicNumber;
	int moles;
	double mass;
	double meltingTemperature;
	double molarMass;
	
	public Element(String symbol, MatterState naturalState, int moles, double molarMass, int neutrons, int protons, int charge)
	{
		this.naturalState = naturalState;
		this.symbol = symbol;
		this.moles = moles;
		this.molarMass = molarMass;
		this.neutrons = neutrons;
		this.protons = protons;
		this.atomicNumber = protons;
		this.charge = charge;
		this.mass = molarMass * moles;
		this.totalCharge = (int)(charge * moles);
		this.electrons = this.protons + this.charge;
		this.atomicMass = this.protons + this.neutrons;
	}
	
	public int getAtomicNumber()
	{
		return this.atomicNumber;
	}
	
	public int getCharge()
	{
		return this.charge;
	}
	
	public double getMass()
	{
		return this.mass;
	}
	
	public double getMoles()
	{
		return this.moles;
	}
	
	public int getTotalCharge()
	{
		return this.totalCharge;
	}
	
	public double getAtoms()
	{
		return 6.022e23 * this.moles;
	}
	
	public String toString()
	{
		if (this.moles > 1)
			return this.symbol + this.moles;
		return this.symbol;
	}
}
