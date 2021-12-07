
public class reversestring {
	public static void main(String[] args) {
		//string
		String str1 = "Hello";
		//reversed string will be stored in reverseS variable
		String reverseS = "";
		//length of string will be stored in len
		int len=str1.length();
		for(int i=len-1;i>=0;i--)
		reverseS = reverseS + str1.charAt(i);
		//print string before reverse
		System.out.println("\nString before reversal : "+str1);
		//print string after reverse
		System.out.println("String after reversal : "+ reverseS);
		}
		}


