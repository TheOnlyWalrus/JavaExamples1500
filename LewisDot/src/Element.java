

public class Element
{
	public int group;
	public int period;
	public int valence;
	public String symbol;
	public String name;
	
	public Element(int group, int period, String symbol, String name)
	{
		this.group = group;
		this.period = period;
		
		if (this.group < 3)
			this.valence = this.group;
		else if (this.group > 12)
			this.valence = this.group - 10;
		
		this.symbol = symbol;
		this.name = name;
	}
}
