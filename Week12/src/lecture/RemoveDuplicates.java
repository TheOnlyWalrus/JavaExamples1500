package lecture;

public class RemoveDuplicates
{
	public static int[] dedupe(int[] x)
	{
		int[] temp = new int[x.length];
		int keep = 0;
		boolean found = false;
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < keep; j++)
			{
				if (x[i] == x[j])
				{
					found = true;
					break;
				}
			}
			
			if (!found)
			{
				temp[keep] = x[i];
				keep++;
			}
		}
		
		int[] ret = new int[keep];
		
		for (int i = 0; i < keep; i++)
		{
			ret[i] = temp[i];
		}
		
		return ret;
	}
	
	public static void main(String[] args)
	{
		System.out.println(dedupe(new int[] {1, 2, 7, 2, 4, 3, 2, 3, 5}));
	}
}
