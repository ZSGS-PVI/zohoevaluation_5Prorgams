package zohotest;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
	
	public class Regax_3 {
		public static boolean isValidExpression(String expression) {
			String regex = "^(\\([^()]*\\))*$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(expression);
			return matcher.matches();
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Expression : ");
			String S=sc.nextLine();
			System.out.println((isValidExpression(S) ? "Valid" : "Invalid"));
			System.out.println();
		}
	}