package week1exam;

import java.io.*;
import java.util.Scanner;
public class power {
   
	public static void main(String[] args){
			String x; int n1,n2;
			String y; int flag=0;
			Scanner sc= new Scanner(System.in);
			//System.out.println("enter a number ");
			n1=sc.nextInt();
			//System.out.println("enter a number ");
			n2=sc.nextInt(); String pro=n1+"";String base=n1+"";
        //System.out.println(n1);     System.out.println(n2); 
        if(n2==0){
            pro="1";
           
        }
       
        for(int i=0;i<n2-1;i++){
            pro=pow(pro,base);//System.out.println(pro); 
        } 
        System.out.println(pro);

	}
            public static String pow(String x , String y){
			     String pro=""; String z=""; int carry = 0;
                for (int i =  x.length()-1; i >=0; i--) {
				int x1 =Integer.parseInt(x.charAt(i)+"");int x2 =Integer.parseInt(y.charAt(0)+"");
				//System.out.println("x1 is : "+x1);System.out.println("x2 is" + x2);
				int sum=x1*x2;
				if (carry!=0) {
					sum=sum+carry;
					//System.out.println("x1 with carry "+x1);
					carry=0;
				}
				if(sum>9){
					//System.out.println("carry came");
					String z1= new String(sum+"");
					z=z+z1.charAt(1); //System.out.println("add value "+z);
					carry=Integer.parseInt(z1.charAt(0)+"");//System.out.println("carry "+carry);
				}
				else{
					z=z+new String(sum+"");
				}
			}
			if (carry!=0) {
				z=z+carry;
			}

			//System.out.print("the addition of these is : ");
			for (int i =z.length()-1 ; i >=0 ; i--) {
				//System.out.print(z.charAt(i));
                pro=pro+z.charAt(i);
			}
                return pro;
        }
	
}






