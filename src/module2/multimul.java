package module2;
import java.util.Scanner;
public class multimul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		//System.out.println("enter number ");
		String x; String y;
		x=sc.next();
		//System.out.println("enter number ");
		y=sc.next();
		System.out.println(SchoolMul(x,y));
	}
	public static String SchoolMul(String x , String y){
		String sum="";
		String z; String h=""; String pro="";int j,m=0;
		z="0";
		for (int i = y.length()-1; i >=0 ; i--) {
			if(i==0&&y.charAt(0)=='-'){

			}
			else{
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
		}
		if(y.charAt(0)=='-'&&x.charAt(0)=='-'){

		}
		else if(y.charAt(0)=='-'||x.charAt(0)=='-') {
			sum='-'+sum;
		}
		else {

		}
		return sum;


	}
	// multiplication n ////
	public static String nMultiply(String x , String y){
		String z=""; int carry = 0; String pro="";
		for (int i =  x.length()-1; i >=0; i--) {
			if(i==0&&x.charAt(0)=='-'){

			}
			else {
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
		}
		if (carry!=0) {
			z=z+carry;
		}

		//System.out.print("the addition of these is : ");
		for (int i =z.length()-1 ; i >=0 ; i--) {
			pro=pro+z.charAt(i);
		}

		return pro;
	}

	// adddition //	
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

		//System.out.print("the addition of these is : ");
		for (int i =z.length()-1 ; i >=0 ; i--) {
			pro = pro+z.charAt(i);
		}

		return pro;
	}

}
