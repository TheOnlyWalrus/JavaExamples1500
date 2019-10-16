package chemistry.elements;

import chemistry.Element;
import chemistry.MatterState;

public class Nitrogen extends Element
{

	public Nitrogen(int moles)
	{
		super("N", MatterState.GAS, moles, 14.01, 7, 7, -3);
	}
}
