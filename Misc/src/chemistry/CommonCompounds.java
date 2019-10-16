package chemistry;

import chemistry.elements.*;

public class CommonCompounds
{
	public static class Ammonia extends Compound
	{
		public Ammonia(int moles)
		{
			super(moles, new Nitrogen(1), new Hydrogen(3));
		}
	}
	
	public static class Ammonium extends Compound
	{
		public Ammonium(int moles)
		{
			super(moles, new Nitrogen(1), new Hydrogen(4));
		}
	}
	
	public static class Carbonate extends Compound
	{
		public Carbonate(int moles)
		{
			super(moles, new Carbon(1), new Oxygen(3));
		}
	}
	
	public static class HydrogenPeroxide extends Compound
	{
		public HydrogenPeroxide(int moles)
		{
			super(moles, new Hydrogen(2), new Oxygen(2));
		}
	}
	
	public static class Hydroxide extends Compound
	{
		public Hydroxide(int moles)
		{
			super(moles, new Hydrogen(1), new Oxygen(1));
		}
	}
	
	public static class Nitrate extends Compound
	{
		public Nitrate(int moles)
		{
			super(moles, -1, new Nitrogen(1), new Oxygen(3));
		}
	}
	
	public static class Water extends Compound
	{
		public Water(int moles)
		{
			super(moles, new Hydrogen(2), new Oxygen(1));
		}
	}
}
