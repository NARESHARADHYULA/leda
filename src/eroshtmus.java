
import java.util.*;
public class eroshtmus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long m1=System.currentTimeMillis();
		int a[]=new int[n+1];
		a[0]=1;a[1]=1;
		int i=3;
		while(i<=Math.sqrt(n))
		{
			if(a[i]==0)
			{
				for(int j=2;i*j<=n;j++)
					a[i*j]=1;
			}
			i+=2;
		}
		//long m2=System.currentTimeMillis();
		System.out.println("2");
		for(int j=3;j<=n;j+=2)
		{
			if(a[j]==0)
				System.out.println(j);
		}
		long m2=System.currentTimeMillis();
		System.out.println(m2-m1);
	}
	public static void eros(int a , int b){
		
	}
}
