package DS;

public class ExceptionExample{
	
	public static int divide(int a,int b) throws MYException {
		if(b<1) {
			throw new MYException("put denominator positive number");
		}
		return a/b;
	}

	public static void main(String[] args) throws MYException{
	int a=10;
	int b=0;
		int x=divide(a,b);
	
	}

}
