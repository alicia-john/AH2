import java.util.Scanner; 
public class Solution { 
    public static boolean isPrime(int num){
	boolean prime = true; 
	int i = 2;
	if (num == 0 || num == 1)
	{
		prime = false;
	}
        else
	{
		while(i < num)
		{
			if (num % i == 0) 
			{ 
            			prime = false; 
        		} 
			i++;
		}
	}
	return prime;
    }
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = input.nextInt();
	System.out.print(isPrime(num)); 
    } 
} 