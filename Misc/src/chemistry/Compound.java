package chemistry;

public class Compound
{
	int moles;
	int charge;
	double mass;
	double molarMass;
	
	public Compound(int moles, Element ...elements)
	{
		this.moles = moles;
		
		double sum = 0;
		int tempCharge = 0;
		for (Element element : elements)
		{
			sum += element.getMass();
			tempCharge += element.getTotalCharge();
		}
		
		this.molarMass = sum;
		this.charge = tempCharge;
		this.mass = this.molarMass * moles;
	}
	
	public int getCharge()
	{
		return this.charge;
	}
	
	public int getTotalCharge()
	{
		return this.charge * this.moles;
	}

	public double getMass()
	{
		return this.mass;
	}
	
	public double getMolarMass()
	{
		return this.molarMass;
	}
}
