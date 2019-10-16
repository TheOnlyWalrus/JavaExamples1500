package chemistry;

public class Reaction
{
	Compound[] reactants;
	Compound[] products;
	
	public Reaction(Compound[] reactants, Compound[] products)
	{
		this.reactants = reactants;
		this.products = products;
	}
}
