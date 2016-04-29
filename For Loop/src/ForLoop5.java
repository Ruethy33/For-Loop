import java.util.Scanner;
public class ForLoop5 
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("where should i start?");
		int start = userInput.nextInt();
		System.out.println("where should i stop?");
		int stop = userInput.nextInt();
		int sum = 0;
		for (int i = start; i<=stop; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
