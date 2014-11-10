package module1;

import java.util.Scanner;

public class multipilicationSingle {
	public static void main(String[] args){
			String x;
			String y;
			String z=""; int carry = 0;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter a number ");
			x=sc.next();
			System.out.println("enter a number ");
			y=sc.next();
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

			System.out.print("the addition of these is : ");
			for (int i =z.length()-1 ; i >=0 ; i--) {
				System.out.print(z.charAt(i));
			}
	}
	
}
