package chemistry.elements;

import chemistry.Element;
import chemistry.MatterState;

public class Hydrogen extends Element
{	
	public Hydrogen(int moles)
	{
		super("H", MatterState.GAS, moles, 1.008, 0, 1, 1);
	}
}
