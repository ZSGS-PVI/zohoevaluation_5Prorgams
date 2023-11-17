package zohotest;

import java.util.Arrays;
import java.util.Scanner;

public class reverseString_5 {
	
	public static String print(String word,int n) {
		
        char[] chars = word.toCharArray();
        String ans="";
        Arrays.sort(chars);
        for(int i=chars.length-1;i>=0;i--) {
         
       ans+=chars[i];
        
	}
        return ans;
	}

	public static void main(String[] args) {
		
	Scanner in=new Scanner(System.in);
	System.out.println("enter the n value");
	int n=in.nextInt();
	in.nextLine();
	
	String str[]=new String[n];
	for(int i=0,k=1;i<n;i++,k++) {
		System.out.print("enter the string "+k+": ");
		str[i]=in.nextLine();
	}
	for(int i=0;i<n;i++) {
	String k=print(str[i],n);
	System.out.println(k);
	}

}
}
