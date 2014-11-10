package module1;
import java.util.Scanner;
public class SchoolAddition {
	public static void main(String[] args){
		String x;int length=0;
		String y; int j=0; String h="";
		String z=""; int carry = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number ");
		x=sc.next();
		System.out.println("enter a number ");
		y=sc.next();  
		System.out.println(add(x,y));
		//System.out.println();
		//System.out.print(z);
	}
	public static String add(String x, String y){	
		int length=0;
		 int j=0; String h="";
		String z=""; int carry = 0;
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
			//System.out.println(length);

		}
		for (int i = length-1; i >=0; i--) {
			int x1 =Integer.parseInt(x.charAt(i)+"");
			int x2 =Integer.parseInt(y.charAt(i)+"");
			//System.out.println("x1 is : "+x1);System.out.println("x2 is" + x2);
			if (carry!=0) {
				x1=x1+carry;
				//System.out.println("x1 with carry "+x1);
				carry=0;
			}
			int sum=x1+x2;
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
		y="";
		//System.out.print("the addition of these is : ");
		for (int i =z.length()-1 ; i >=0 ; i--) {
			y=y+z.charAt(i);
			//System.out.print(z.charAt(i));
		}
		return y;
	}
}
