package module4;
import java.util.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        String temp="";
        if(s1.charAt(0)=='-'&&s1.charAt(0)=='-')
            {
            s1=s1.substring(1);
            s2=s2.substring(1);
        }
        else if(s1.charAt(0)=='-' || s2.charAt(0)=='-')
		{
			temp="-";
			if(s1.charAt(0)=='-')
				s1=s1.substring(1);
			else if(s2.charAt(0)=='-')
				s2=s2.substring(1);	
		}
		String res=rec(s1,s2);
		int j=0;
		while(j<res.length()-1)
		{
			if(res.charAt(j)!='0')
				break;
			else
				j++;
		}
		System.out.println(temp+res.substring(j));
		in.close();
	}
    static int z=0;
    static String rec(String a,String b)
	{
		if(a.length()<=b.length())
			return mul(a,b)+zero(b.length()*z);
		else
		{
			String a0=a.substring(a.length()-b.length());
			String a1=a.substring(0, a.length()-b.length());
			String st=mul(a0,b)+zero(b.length()*z);
			z++;
			return sum(st,rec(a1,b));
		}
	}
	static String mul(String a,String b)
	{
		if(a.length()<b.length())
			a=zero(b.length()-a.length())+a;
		else
			b=zero(a.length()-b.length())+b;
		if(a.length()==1 && b.length()==1)
			return Integer.parseInt(a)*Integer.parseInt(b)+"";
		else
		{
			if(a.length()%2 !=0)
			{
				a=0+a;
				b=0+b;
			}
			int l=a.length()/2;
			String a0=a.substring(0, a.length()/2);
			String a1=a.substring(a.length()/2);
			String b0=b.substring(0, b.length()/2);
			String b1=b.substring(b.length()/2);
			String p0=mul(a0,b0);
			String p2=mul(a1,b1);
			String p1=mul(sum(a0,a1),sum(b0,b1));
			return sum(sum(p0+zero(2*l),(sub(p1,sum(p0,p2)))+zero(l)),p2);
		}
	}
	static String zero(int n)
	{
		String str="";
		for (int i = 0; i < n; i++) 
		{
			str=str+0;
		}
		return str;
	}
	static String sum(String str1,String str2)
	{
		String res="";
		int l=Math.abs(str1.length()-str2.length());
		for(int i=0;i<l;i++)
		{
			if(str1.length()<str2.length())
				str1=0+str1;
			else
				str2=0+str2;
		}
		l=str1.length();
		int r=0,c=0;
		for(int i=0;i<l;i++)
		{
			r=Integer.parseInt(""+str1.charAt(l-1-i))+Integer.parseInt(""+str2.charAt(l-1-i))+c;
			res=(r%10)+res;
			c=r/10;
			if(i==l-1 && c!=0)
				res=c+res;
		}
		return res;
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
}