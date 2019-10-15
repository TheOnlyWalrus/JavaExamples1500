package dataTypes;

public class WholeNumber extends Number implements Comparable<Number>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2951186122589281554L;
	private Number value;
	
	public WholeNumber(Number value)
	{
		this.value = value;
	}

	@Override
	public int compareTo(Number o) {
		return 0;
	}

	@Override
	public int intValue() {
		return this.value.intValue();
	}

	@Override
	public long longValue() {
		return this.value.longValue();
	}

	@Override
	public float floatValue() {
		return 0;
	}

	@Override
	public double doubleValue() {
		return 0;
	}
}
