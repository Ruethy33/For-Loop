import java.util.Scanner;
public class ForLoop4 
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int sum = 0;
		for (int i = 5; i <=100; i = i + 5)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
