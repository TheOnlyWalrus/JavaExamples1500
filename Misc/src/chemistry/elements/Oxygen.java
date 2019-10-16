package chemistry.elements;

import chemistry.Element;
import chemistry.MatterState;

public class Oxygen extends Element
{
	public Oxygen(int moles)
	{
		super("O", MatterState.GAS, moles, 16, 0, 1, -2);
	}
}

