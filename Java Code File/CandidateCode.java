/* Read input from STDIN. Print your output to STDOUT*/
import java.io.*;
import java.util.*;
public class CandidateCode 
{
   public static void main(String args[] ) throws Exception 
   {
	   Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int k = 0; k < n; k++)
		{

			int number = sc.nextInt();
			int[] pl_energy = new int[number];
			int[] vl_strength = new int[number];

			for (int i = 0; i < vl_strength.length; i++)
			{
			
				vl_strength[i] = sc.nextInt();
			}

			for (int i = 0; i < pl_energy.length; i++)
			{
			
				pl_energy[i] = sc.nextInt();
			}

			
			Arrays.sort(pl_energy);
			Arrays.sort(vl_strength);

		
			boolean result = true;
			for (int i = 0; i < number; i++) 
			{
				if (pl_energy[i] > vl_strength[i]) 
				{
					result = true;
				} 
				else 
				{
					result = false;
               				break;
				}
			}
			if(result) 
			{
				System.out.println("WIN");
			} 
			else 
			{
				System.out.println("LOSE");
			}

		}

   }
}
