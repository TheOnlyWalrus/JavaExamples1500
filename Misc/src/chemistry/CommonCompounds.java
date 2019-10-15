package chemistry;

public class CommonCompounds
{
	public static class HydrogenPeroxide extends Compound
	{
		public HydrogenPeroxide(int moles) {
			super(moles, new Hydrogen(2), new Oxygen(2));
		}
	}
	
	public static class Hydroxide extends Compound
	{
		public Hydroxide(int moles) {
			super(moles, new Hydrogen(1), new Oxygen(1));
		}
	}
	
	public static class Water extends Compound
	{
		public Water(int moles) {
			super(moles, new Hydrogen(2), new Oxygen(1));
		}
	}
}
