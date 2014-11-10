package module7;
import java.io.*;
import java.util.*;
public class runtimek432 {
	public static void main(String [] args){
		String x=""; String z="";
		String y="";int h=0,j=0,m=0;
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for (int i = 0; i <n; i++) {
			x=x+"3";
			y=y+"3";
		}
		System.out.println(x);
		System.out.println(y);
		long t1 = System.currentTimeMillis();
		z=rec4(x,y);
		long t2 = System.currentTimeMillis();
		long kt4=t2-t1;
		long t3 = System.currentTimeMillis();
		z=rec32(x,y);
		long t4 = System.currentTimeMillis();
		long kt32=t4-t3;
		System.out.println(kt4+"   "+kt32);
		/*int flag=0;
		for (int i = 0; i <= z.length(); i++) {
			while(flag!=1){
				if(z.charAt(i)!='0'){flag=1;}
				i++;	
			}
			System.out.print(z.charAt(i-1));
		}*/
		//System.out.println(rec(x,y));
		
	}
	public static String rec4(String x,String y){
		int pad=0;
		if(x.length()!=1 && y.length()!=4){
			if(x.length()!=y.length()){
				if (x.length()>y.length()) {
					pad=x.length()-y.length();
					for (int i = 0; i <pad; i++) {
						y=0+y;
					}
				}
				else{
					pad=y.length()-x.length();
					for (int i = 0; i <pad; i++) {
						x=0+x;
					}
				}

			}
			if (x.length()%2!=0) {
				x=0+x;
				y=0+y;
			}

			//System.out.println(x);System.out.println(y);
			int k=x.length()/2; 
			String a0 =x.substring(0, x.length()/2);
			String b0 =y.substring(0, y.length()/2);
			String a1 =x.substring(x.length()/2);
			String b1 =y.substring(y.length()/2);
			//System.out.println(" a0 "+a0); System.out.println(" a1 "+a1);
			//System.out.println(" b0 "+b0);System.out.println(" b1 "+ b1);
			String p2=rec4(a0,b0);
			//System.out.println("p0"+p2);
			String p0=rec4(a1,b1);
			//System.out.println("p2"+p0);
//			System.out.println("a0  a1 "+add(a0,a1)); System.out.println("b0  b1  "+add(b0,b1));
			String p1= rec4(add(a0,a1),add(b0,b1));
			//System.out.println("p1 "+p1);	//System.out.println("p1 "+p1);	System.out.println("p0 "+p2);
			//System.out.println("add "+add(p2,p0));
			//System.out.println("sub  "+sub(p1,add(p2,p0)));

			//return add(add(rec(a0,b0)+paddzero(2*k),(sub(rec(add(a0,a1),add(b0,b1)),add(rec(a0,b0),rec(a1,b1))))+paddzero(k)),rec(a1,b1));

			return add(add(p2+paddzero(2*k),sub(p1,add(p2,p0))+paddzero(k)),p0);
			//return  add(add((rec(a0,b0)+paddzero(2*k)),(add(rec(a0,b1),rec(a1,b0))+paddzero(k))),rec(a1,b1));
		}
		else {
			return SchoolMul(x,y);
		}
	}
	public static String rec32(String x,String y){
		int pad=0;
		if(x.length()!=1 && y.length()!=32){
			if(x.length()!=y.length()){
				if (x.length()>y.length()) {
					pad=x.length()-y.length();
					for (int i = 0; i <pad; i++) {
						y=0+y;
					}
				}
				else{
					pad=y.length()-x.length();
					for (int i = 0; i <pad; i++) {
						x=0+x;
					}
				}

			}
			if (x.length()%2!=0) {
				x=0+x;
				y=0+y;
			}

			//System.out.println(x);System.out.println(y);
			int k=x.length()/2; 
			String a0 =x.substring(0, x.length()/2);
			String b0 =y.substring(0, y.length()/2);
			String a1 =x.substring(x.length()/2);
			String b1 =y.substring(y.length()/2);
			//System.out.println(" a0 "+a0); System.out.println(" a1 "+a1);
			//System.out.println(" b0 "+b0);System.out.println(" b1 "+ b1);
			String p2=rec32(a0,b0);
			//System.out.println("p0"+p2);
			String p0=rec32(a1,b1);
			//System.out.println("p2"+p0);
//			System.out.println("a0  a1 "+add(a0,a1)); System.out.println("b0  b1  "+add(b0,b1));
			String p1= rec32(add(a0,a1),add(b0,b1));
			//System.out.println("p1 "+p1);	//System.out.println("p1 "+p1);	System.out.println("p0 "+p2);
			//System.out.println("add "+add(p2,p0));
			//System.out.println("sub  "+sub(p1,add(p2,p0)));

			//return add(add(rec(a0,b0)+paddzero(2*k),(sub(rec(add(a0,a1),add(b0,b1)),add(rec(a0,b0),rec(a1,b1))))+paddzero(k)),rec(a1,b1));

			return add(add(p2+paddzero(2*k),sub(p1,add(p2,p0))+paddzero(k)),p0);
			//return  add(add((rec(a0,b0)+paddzero(2*k)),(add(rec(a0,b1),rec(a1,b0))+paddzero(k))),rec(a1,b1));
		}
		else {
			return SchoolMul(x,y);
		}
	}

	public static String  paddzero(int k){
		String x="";
		for (int i = 0; i <k; i++) {
			x=x+'0';
		}
		return x;
	}
	public static String add(String x, String y){	
		//System.out.println("x" + x); 	System.out.println("y" + y);
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
			//System.out.println("x  "+x.charAt(i)+"");System.out.println("y  "+y.charAt(i)+"");
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
	static String sub(String s1,String s2)
	{
		String res="",temp="";
		int l=Math.abs(s1.length()-s2.length());
		for(int i=0;i<l;i++)
		{
			if(s1.length()<s2.length())
				s1=0+s1;
			else
				s2=0+s2;
		}
		if(Integer.parseInt(""+s1.charAt(0))<Integer.parseInt(""+s2.charAt(0)))
		{
			temp=s1;
			s1=s2;
			s2=temp;
			temp="-";
		}
		int b=0;
		for(int i=s1.length()-1;i>=0;i--)
		{
			int x=Integer.parseInt(""+s1.charAt(i));
			int y=Integer.parseInt(""+s2.charAt(i));
			if(b==1)
				x=x-1;
			if(x-y>=0)
			{
				b=0;
				res=(x-y)+res;
			}
			else
			{
				b=1;
				x=x+10;
				res=(x-y)+res;
			}
		}
		int j=0;
		while(j<res.length()-1)
		{
			if(res.charAt(j)!='0')
				break;
			else
				j++;
		}
		return (temp+res.substring(j));
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