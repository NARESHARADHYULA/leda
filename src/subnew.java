import java.util.Scanner;

public class subnew {
	public static void main(String[] args){

		String x;int length=0; int k;String c;
		String y; int j=0; String h=""; String z1="";
		String z=""; int carry = 0; int flag2=0; int flag1=0;
		Scanner sc= new Scanner(System.in);
		//System.out.println("enter a number ");
		x=sc.next();
		//System.out.println("enter a number ");
		y=sc.next();  
		long n1=System.currentTimeMillis();
		System.out.println(sub(x,y));
	}
	public static String  sub(String x,String y){
		int length=0; int k;String c; String ans="";
		int j=0; String h=""; String z1="";
		String z=""; int carry = 0; int flag2=0; int flag1=0;
		if(x.length()>y.length()){

			for (int i = 0; i <x.length()-y.length(); i++) {
				h=h+0;
			}
			y=h+y;
			length=x.length();
			/*	String temp=x;
				x=y;
				y=temp;*/
		}
		else if (y.length()>x.length()){
			z1="-";
			for (int i = 0; i <y.length()-x.length(); i++) {
				h=h+0;
			}
			x=h+x;
			length=y.length();
			String temp=x;
			x=y;
			y=temp;
			//System.out.println(length);

		} 
		else {
			if(x.equalsIgnoreCase(y)){
				z1="0";
				//System.out.println("chg");
				//System.out.println(z1);
				flag1=1; flag2=1;
			}
			else {
				for (int i = 0; i <= x.length(); i++) {
					//System.out.println("i "+x.charAt(i)); System.out.println("i "+y.charAt(i));
					if (x.charAt(i)<y.charAt(i)) {
						//System.out.println("i "+x.charAt(i)); System.out.println("i "+y.charAt(i));
						String temp=x;
						x=y;
						y=temp;
						//	System.out.println(x);
						//	System.out.println(y);
						length=y.length();
						z1="-";
						break;
					}
					if(x.charAt(i)==y.charAt(i)){
						continue;
					}
					if (x.charAt(i)>y.charAt(i)) {
						break;
					}

				}
			}

		}
		if(flag1==0){
			//System.out.println(length);
			for (int i = x.length()-1; i >=0; i--) {
				//System.out.println("innn");
				int x1 =Integer.parseInt(x.charAt(i)+"");
				int x2 =Integer.parseInt(y.charAt(i)+"");
				//System.out.println("x1 is : "+x1);System.out.println("x2 is" + x2);
				int sub=x1-x2;
				//System.out.println(sub);
				if(sub>=0){
					//System.out.println("carry came");
					//String z1= new String(sub+"");
					z=z+sub;
				}
				else{
					for (k=i-1; k>=0;k--) {
						c=x.charAt(k)+""; int c1=Integer.parseInt(c);
						if (c1==0) {}
						else{
							c1=c1-1;
							char ch[] =x.toCharArray();
							ch[k]=(char)(c1+48);
							x=String.valueOf(ch);
							for (int m = k+1; m<i; m++) {
								char ch1[] =x.toCharArray();
								ch1[m]='9';
								x=String.valueOf(ch1);
							}
							break;
						}

					}
					x1=x1+10;
					sub=x1-x2;
					z=z+sub;
				}
			}
			int flag=0;
			for (int i =z.length()-1 ; i >=0 ; i--) {
				z1=z1+z.charAt(i);
			}		
			//System.out.print(z1);
			return z1;
		}
		return z1;

	}
}
