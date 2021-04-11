package primeNumer;

public class ReverseString {

	public static void main(String[] args) {
		String input = "test";

		// converting string into bytes 
		
		byte [] sysArray = input.getBytes();
		
		byte[]result = new byte [sysArray.length];
		int  q = sysArray.length;
		
		for(int i=0;i<sysArray.length; i++)
		{
			result[i] = sysArray[sysArray.length-i-1];
			System.out.println(new String(result));
		}
		
		 }

}
