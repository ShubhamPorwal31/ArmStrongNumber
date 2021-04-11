package primeNumer;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int n =153;
		int c, temp;
		int sum=0;
		temp = n;
	
		while(n>0)
		{
			c = n% 10;
			n = n/10;
			sum = sum + (c*c*c);
		}
		
		if(sum == temp)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}

	}

}
