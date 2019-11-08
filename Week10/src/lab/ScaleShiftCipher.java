package lab;

import java.util.Arrays;
import java.util.List;

public class ScaleShiftCipher
{
	public static String encrypt(String plain, int scale, int shift)
	{
		plain = plain.toLowerCase();
		char[] letters = plain.toCharArray();
		String ret = "";
		
		for (int X : letters)
		{
			char Y = (char)X;
			
			if (X >= 97 && X <= 122)
			{
				Y = (char)(((X - 97) * scale + shift) % 26 + 97);
			}
			
			ret += Y;
		}
		
		return ret;
	}
	
	public static String decrypt(String encrypted, int scale, int shift)
	{
		String alphabet = "abcdefghijklmnopqrstuvwxyz"; alphabet = encrypt(alphabet, scale, shift);
		encrypted = encrypted.toLowerCase();
		char[] letters = encrypted.toCharArray();
		
		for (int i = 0; i < letters.length; i++)
		{
			int character = letters[i];
			if (character >= 97 && character <= 122)
			{
				character = alphabet.indexOf(character);
				letters[i] = (char)(character+97);
			}
		}
		
		return new String(letters);
	}
	
	public static void main(String[] args)
	{
		int shift;
		int scale;
		String encrypted;
		String decrypted;
		
		/* Q1 */
		scale = 7;
		shift = 13;
		encrypted = "rw zhx bna ipbczoq qkrj tpjjndp, paqpc qkp bhiplhci psqcnbcpirq nq qkp qho hw zhxc mnu lcrqpxo whc 5 ohraqj ha qkp apsq triqpct.";
		decrypted = decrypt(encrypted, scale, shift);
		System.out.printf("------- Q1 -------\nEncrypted: %s\nDecrypted: %s\n", encrypted, decrypted);
		
		/* Q2 */
		scale = 7;
		shift = 13;
		
		String message = "Hello, World!";
		encrypted = encrypt(message, scale, shift);
		decrypted = decrypt(encrypted, scale, shift);
		
		System.out.printf("------- Q2 -------\nEncrypted: %s\nDecrypted: %s\n", encrypted, decrypted);
		
		/* Q3 */
		encrypted = "od vfqd ab yqxwh zbfq bkjmaxwd!";
		
        String[] commonWordsEN = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","part"};
        
        List<String> commonWords = Arrays.asList(commonWordsEN);
        
		System.out.println("------- Q3 -------");
		
		for (shift = 1; shift < 26; shift++)
		{
			for (scale = 1; scale < 26; scale++)
			{
				decrypted = decrypt(encrypted, scale, shift);
				for (String word : decrypted.split(" "))
				{
					if (commonWords.contains(word))
					{
						System.out.println("Shift: " + shift + " | Scale: " + scale + " | " + decrypted);
						break;
					}
				}
			}
		}
	}
}
