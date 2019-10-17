package chemistry;

public class Element
{
	private MatterState state;
	private String symbol;
	private int charge;
	private int oxidationNumber;
	private int totalCharge;
	private int atomicMass;
	private int neutrons;
	private int protons;
	private int electrons;
	private int atomicNumber;
	private int moles;
	private double mass;
	private double meltingTemperature;
	private double molarMass;
	
	public Element(String symbol, MatterState state, int moles, double molarMass, int neutrons, int protons, int charge)
	{
		this.state = state;
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
	
	public int getAtomicMass()
	{
		return this.atomicMass;
	}

	public double getAtoms()
	{
		return 6.022e23 * this.moles;
	}
	
	public int getCharge()
	{
		return this.charge;
	}
	
	public int getElectrons()
	{
		return this.electrons;
	}
	
	public double getMass()
	{
		return this.mass;
	}
	
	public double getMeltingTemperature()
	{
		return this.meltingTemperature;
	}
	
	public double getMolarMass()
	{
		return this.molarMass;
	}
	
	public double getMoles()
	{
		return this.moles;
	}
	
	public int getOxidationNumber()
	{
		return this.oxidationNumber;
	}
	
	public MatterState getState()
	{
		return this.state;
	}
	
	public int getTotalCharge()
	{
		return this.totalCharge;
	}
	
	public String toString()
	{
		if (this.moles > 1)
			return this.symbol + this.moles;
		return this.symbol;
	}
}
