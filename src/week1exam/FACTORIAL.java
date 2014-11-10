package week1exam;

import java.io.*;
import java.util.Scanner;
public class FACTORIAL {
     public static void main(String[] args) {
			// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);String factvalue="1";
         int n=sc.nextInt();  
         for(int i=1;i<=n;i++){
            factvalue=fact( factvalue,i);
              //System.out.println(i);
         }
        System.out.println(factvalue);
     }
    // factorial //
	 public static String fact(String x , int n) {
         String y=n+""; String z; String h=""; String pro="";int j,m=0;
			 String sum="";
				z="0";
			for (int i = y.length()-1; i >=0 ; i--) {
	        	pro=nMultiply(x ,  (y.charAt(i)+""));
				//System.out.println(pro);
				for(j=0;j<m;j++){
					h=h+0;
				}
				h=pro+h;
				//System.out.println(h+" h is ");
				sum=Addition( h ,sum);
				h="";
				//System.out.println(sum);
				m++;
	        }
	        return sum;
		}


		// multiplication ////
		public static String nMultiply(String x , String y){
			String z=""; int carry = 0; String pro="";
			for (int i =  x.length()-1; i >=0; i--) {
	           
				int x1 =Integer.parseInt(x.charAt(i)+"");int x2 =Integer.parseInt(y.charAt(0)+"");
				int sum=x1*x2;
				if (carry!=0) {
					sum=sum+carry;
					carry=0;
				}
				if(sum>9){
					String z1= new String(sum+"");
					z=z+z1.charAt(1); 
					carry=Integer.parseInt(z1.charAt(0)+"");
				}
				else{
					z=z+new String(sum+"");
				}
		
	        }
			if (carry!=0) {
				z=z+carry;
			}
            for (int i =z.length()-1 ; i >=0 ; i--) {
				pro=pro+z.charAt(i);
			}

			return pro;
		}

		// adddition methood //	
		public static String  Addition(String x , String y) {
			int length=0; String pro="";
			int j=0; String h="";
			String z=""; int carry = 0; int k=0;
			if(x.length()>y.length()){
				for (int i = 0; i <x.length()-y.length(); i++) {
					h=h+0;
				}
				y=h+y;
				length=x.length();
			}
			else{ 
				for (int i = 0; i <y.length()-x.length(); i++) {
					h=h+0;
				}
				x=h+x;
				length=y.length();
			}
			for (int i = length-1; i >=0; i--) {
				int x1 =Integer.parseInt(x.charAt(i)+"");
				int x2 =Integer.parseInt(y.charAt(i)+"");
				if (carry!=0) {
					x1=x1+carry;
					carry=0;
				}
				int sum=x1+x2;
				if(sum>9){
					String z1= new String(sum+"");
					z=z+z1.charAt(1); 	
                    carry=Integer.parseInt(z1.charAt(0)+"");
				}
				else{
					z=z+new String(sum+"");
				}
			}
			if (carry!=0) {
				z=z+carry;
			}
        	for (int i =z.length()-1 ; i >=0 ; i--) {
				pro = pro+z.charAt(i);
			}

			return pro;
		}

}
