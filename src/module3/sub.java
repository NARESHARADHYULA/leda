package module3;

import java.util.Scanner;

public class sub {
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
				System.out.println(z1);
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
						if (c1==0) {

							//			System.out.println("hjjj");

						}
						else{
							c1=c1-1;
							char ch[] =x.toCharArray();
							ch[k]=(char)(c1+48);
							x=String.valueOf(ch);
							//			System.out.println(x+"in loop");
							//			System.out.println(k +"k value is ");
							for (int m = k+1; m<i; m++) {
								//				System.out.println("m"+m);
								char ch1[] =x.toCharArray();
								ch1[m]='9';
								x=String.valueOf(ch1);
								//				System.out.println("in second loop"+x);
							}
							//			System.out.println(x);
							break;
						}

					}
					x1=x1+10;
					sub=x1-x2;
					z=z+sub;
				}
			}
			int flag=0;
			//System.out.print("the sub  of these is : ");
			for (int i =z.length()-1 ; i >=0 ; i--) {
				/*if(flag==0){
					//System.out.println("in");
					//System.out.println(z.charAt(i));
					while (z.charAt(i)=='0') { 
						System.out.println("i in "+ i);
						i--;
						flag=1;
					} 
				}*/
				z1=z1+z.charAt(i);
			}		
			System.out.print(z1);

			long n2=System.currentTimeMillis();
			//System.out.println();
			//System.out.println(n2-n1);
			//System.out.println();
			//System.out.print(z);
		}
	} 

}
