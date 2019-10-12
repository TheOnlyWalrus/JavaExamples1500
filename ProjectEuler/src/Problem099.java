import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem099
{
	public static void main(String[] args)
	{
		int maxline = 0;
		double max = 0;
		int current = 0;
		
		FileInputStream stream = null;
		try {
			stream = new FileInputStream("src/ext/p099_base_exp.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(1);
		}
		
		DataInputStream in = new DataInputStream(stream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line;
		String[] line_arr;
		
		try {
			while ((line = br.readLine()) != null)
			{
				current++;
				line_arr = line.replace("\n", "").split(",");
				double base = Math.log(Integer.parseInt(line_arr[0]));
				int exp = Integer.parseInt(line_arr[1]);
				
				double num = base * exp;
				if (num > max)
				{
					maxline = current;
					max = num;
				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(maxline);
	}
}
