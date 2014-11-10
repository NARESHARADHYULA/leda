package week1exam;

import java.io.*;
import java.util.*;
public class prog4 
{
   public static void main(String args[] ) throws Exception 
   {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT */
       Scanner sc=new Scanner(System.in);
       String x=sc.next();int count=1;
       while(terminate(x)!=1)
       {
           if((Integer.parseInt(x.charAt(x.length()-1)+""))%2==0)
               x=nby2(x);
           else 
               x=Addition(Multiply(x,"3"),"1");
           count++;
       }
       System.out.println(count);
   }
   public static String nby2(String x)
   {  
       int carry=0;
       String str="";
       for(int i=0;i<x.length();i++)
       {
           int a=(carry*10)+Integer.parseInt(x.charAt(i)+"");
           //System.out.println(a+"a");
              carry=a%2;
            //  System.out.println(carry+"carry");
              int b=(a/2);
            //  System.out.println(b+"quo");
              str=str+b; 
            //  System.out.println(str);
       }
      return str;
   }
   public static int terminate(String x)
   { // System.out.println(x);
      x=x.replaceFirst("^0*","");
     //System.out.println(x);
      if(x.compareTo("1")==0) 
          return 1;
      else 
          return 0;
  }
    public static String Multiply(String x , String y){
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