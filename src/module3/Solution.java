package module3;

import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);   String x=""; String y=""; String z="";int sum=0;
		x=sc.next();y=sc.next(); z=sc.next();

		while(x.length()-1!=1){
			System.out.println(x+"");
			for(int i=0;i<=x.length()-1;i++){
				int x1 =Integer.parseInt(x.charAt(i)+"");
				sum=sum+x1;
				System.out.println("sum is "+ sum);
				System.out.println(x1);
				//System.out.println(sum);
			}  
			System.out.println(x);
			x=sum+"";
		}
		System.out.println(x);
	}
}