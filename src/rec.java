import java.util.*;
public class rec {

	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		my(sc.nextInt());
	}

	private static void my(int n) {
		// TODO Auto-generated method stub
		int n1=n;	
		myrec(n,n1);
	}

	private static void myrec(int n, int n1) {
		// TODO Auto-generated method stub
		if (n1>0) {
			System.out.println(n);
			myrec(n,n1-1);
		}	
		
	}
}
