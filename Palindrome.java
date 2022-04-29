package week2.day1;

public class Palindrome {
public static void main(String[] args) {
	String actual="madam";
	String riverse="";
	int i;
	for(i=actual.length()-1;1>=0;i--) {
		riverse=riverse+actual.charAt(i);
	}
	if(actual.equalsIgnoreCase(riverse))
		System.out.println(actual+"is a palindrome");
	else {
		System.out.println(actual+"is not a palindrome");
	}
}
}
