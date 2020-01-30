package DS;

import java.util.Scanner;

public class practice1 {
	public static int equal(String st1,String st2) {
	String str1,str2;
		if(st1.length()>st2.length()) {
		str1=st2;
		str2=st1;
		}else{
			str1=st1;
			str2=st2;
		}
		for(int i=0;i<str1.length();i++) {

			int a=str1.charAt(i);
			if(a>=65 && a<=90) {
				a+=32;
			}
			int b=str2.charAt(i);
			if(b>=65 && b<=90) {
				b+=32;
			}
		if(a-b>0) {
			return 1;
			}
		if(a-b<0) {
			return -1;
		}
		}
		return 0;
	}

	public static void main(String[] args) {
	Scanner  s= new Scanner(System.in);
	String str1=s.nextLine();
	String str2=s.nextLine();
	System.out.println(equal(str1,str2));
	}

}

