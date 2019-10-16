package chemistry.elements;

import chemistry.Element;
import chemistry.MatterState;

public class Carbon extends Element
{
	public Carbon(int moles)
	{
		super("C", MatterState.GAS, moles, 12.01, 6, 6, 4);
	}
}
