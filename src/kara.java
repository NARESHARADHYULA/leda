import java.io.*;
import java.util.*;
public class kara {	
	public static String rec(String s1,String s2) {
		String ao="",a1="",bo="",b1="";String s5="";
		int lp=0;
		if(s1.length()>s2.length())
		{
			lp=s1.length()-s2.length();
			for(int i=0;i<lp;i++) 
				s2="0"+s2;
		} else {
			 lp=s2.length()-s1.length();
			for(int i=0;i<lp;i++)
				s1="0"+s1;
		}
		if(s1.length()%2!=0){
			s1=0+s1;
			s2=0+s2;
		}
		if(s1.length()!=1) {
		
		int k=s1.length()/2;
		ao=s1.substring(k,s1.length());
		a1=s1.substring(0,k);
		bo=s2.substring(k,s2.length());
		b1=s2.substring(0,k);
		//System.out.println("s1="+s1+"       ao="+ao+"       a1="+a1+"\ns2="+s2+"     bo="+bo+"     b1="+b1);
		String p1=rec(a1,b1)+paddzero(2*k);
		String po=rec(ao,bo);
		String p2=rec(add(ao,a1),add(b1,bo));
		return sub(p2,add(p1,po))+paddzero(k);
	   }
		else {
			return Integer.parseInt(s1)*Integer.parseInt(s2)+"";
		}
	
	}
	public static  String paddzero(int k){
		String k1="0";
		for (int i = 0; i <k; i++) {
			k1=k1+0;
		}
		return k1;
	}
	public static boolean check(String s)  {
		int f=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='0')
				return false;
		}
		return true;
	}
	
	
	
	/*public static String sub(String s1,String s2) {
		if(check(s1)) {
			if(check(s2) )
				return "0";
			else
				return "-"+s2;
		}
		if(check(s2)){
			return s1;
		}
		while(s1.charAt(0)=='0'&&s1.length()>1) {
				s1=s1.substring(1,s1.length());
			}
		while(s2.charAt(0)=='0'&&s2.length()>1) {
				s2=s2.substring(1,s2.length());
			}
		int f=0;
		if(s2.length()>s1.length())
		{
			f=1;
			
			String temp=s1;
			s1=s2;
			s2=temp;
		}
		while(s1.length()!=s2.length()) 
				s2="0"+s2;
		String sa="";
		//System.out.print("s1="+s1+"       s2="+s2);
		int p1=0,p2=0,c1=0,c2=0,j=0;
		j=s1.length()-1;
		for(int i=s2.length()-1;i>=0;i--)
		{
			p1=Integer.parseInt(s1.substring(j,j+1))+p1;
			j--;
			p2=Integer.parseInt(s2.substring(i,i+1))+p2;
			if(p1>=p2) {
				c2=p1-p2;
				sa=c2+sa;
				p1=0;p2=0;
			} else {
				c2=10+p1-p2;
				sa=c2+sa;
				p1=-1;p2=0;
				
			}
		}
		if(j>0)
		sa=s1.substring(0,j)+sa;
			while(sa.charAt(0)=='0'&&sa.length()>1) {
				sa=sa.substring(1,sa.length());
			}
			//System.out.print("     sa="+sa+"\n");
		return sa;
	}*/

	public static String add(String s1,String s2) {
		int lp=0;
		String s="";
		int c1=0,c2=0;
		if(s1.length()>s2.length())
		{
			lp=s1.length()-s2.length();
			for(int i=0;i<lp;i++) 
				s2="0"+s2;
		} else {
			 lp=s2.length()-s1.length();
			for(int i=0;i<lp;i++)
				s1="0"+s1;
		}
		System.out.println(s1+"\n"+s2);
		int i=0;
		for(i=s1.length()-1;i>=0;i--) {
			c1=Integer.parseInt(s1.substring(i,i+1))+Integer.parseInt(s2.substring(i,i+1))+c2;
			s=c1%10+s;
			c2=c1/10;
			if(i==0&&c2>0)
				s=c2+s;
		}
		return s;
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
		

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		int f=0;
		if(s1.charAt(0)=='-')
		{
			s1=s1.substring(1,s1.length());
			f=1;
		}
		if((s2.charAt(0)=='-'))
		{
			s2=s2.substring(1,s2.length());
			if(f==1)
				f=0;
			else
				f=1;
		}
		in.close();
		int lp=0;
		if(s1.length()>s2.length())
		{
			lp=s1.length()-s2.length();
			for(int i=0;i<lp;i++) 
				s2="0"+s2;
		} else {
			 lp=s2.length()-s1.length();
			for(int i=0;i<lp;i++)
				s1="0"+s1;
		}
		for(int i=0;;i++) {
			if(Math.pow(2,i)>s1.length())
			{
				int j=(int)Math.pow(2,i)-s1.length();
				while(j>0)
				{
					s1="0"+s1;
					s2="0"+s2;
					j--;
				}
				break;
			}
		}
		//System.out.println("s1="+s1+"\nS2="+s2);
		String s=rec(s1,s2);
		while(s.charAt(0)=='0')
			s=s.substring(1,s.length());
		if(f==1)
			s="-"+s;
		System.out.println(s);
	}
}