package modeling;

public class Matrix3
{
	double[] values;
	
	Matrix3(double[] values)
	{
		this.values = values;
	}
	
	Matrix3 multiply(Matrix3 other)
	{
		double[] result = new double[9];
		for (int r = 0; r < 3; r++)
		{
			for (int c = 0; c < 3; c++)
			{
				for (int i = 0; i < 3; i++)
				{
					result[r * 3 + c] += this.values[r * 3 + i] * other.values[i * 3 + c];
				}
			}
		}
		
		return new Matrix3(result);
	}
	
	Vertex transform(Vertex in)
	{
		return new Vertex(
				in.x * values[0] + in.y * values[3] + in.z * values[6],
				in.x * values[1] + in.y * values[4] + in.z * values[7],
				in.x * values[2] + in.y * values[5] + in.z * values[8]
		);
	}
}
