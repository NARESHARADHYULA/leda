package pc2;
import java.util.*;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		String s1=in.next();
		System.out.println("enter number");
		String s2=in.next();
		s2=s2.replaceFirst("^0*", "");
		String res=div(s1,s2);
		System.out.println(res);
		in.close();
	}
	static String div(String s1,String s2)
	{
		String q="",r="";
		String d=s1.substring(0,s2.length());
		boolean flag=true;
		int length=d.length()-1;
		while(flag)
		{
			System.out.println("s2: "+s2+"  "+"d: "+d);
			while(compare(s2,d))
			{
				System.out.println(s2+"  "+d);
				if(length==s1.length()-1)
				{
					break;
				}
				else
				{
					q=q+"0";
					length=length+1;
					//System.out.println(length);
					d=d+s1.charAt(length);
				}
			}
			for(int j=1;j<=10;j++)
			{
				if(compare(product(s2,j+""),d))
				{
					System.out.println(j+"j");
					r=sub(d,product(s2,(j-1)+""));
					System.out.println(r+"rem");
					//if()
					q=q+(j-1);
					System.out.println("q: "+q);
					break;
				}
			}
			//System.out.println("length: "+length);
			if(length==s1.length()-1)
				return q+" "+r;
			else
			{
				length++;
				d="";
				d=r+s1.charAt(length);
			}
		}
		return q;
	}
	static boolean compare(String a,String b)
	{		int a1=a.length();
		System.out.println("a:"+a+" "+"b:"+b);
		b=b.replaceFirst("^0*","");
		if(b.equals("")){
			b="0";
		}
		if(a.length()>b.length()){
			return true;
		}
		else if(a.length()<b.length())
		{
			return false;
		}
		else
		{
			for(int i=0;i<a1;i++)
			{   System.out.println("not greater");
				if(a.charAt(i)>b.charAt(i))
				{
					return true;
				}
				else if(a.charAt(i)<b.charAt(i)){
					return false;
				}
				else{
					
				}
			}
			return false;
		}
	}
	static String product(String s,String ch)
	{
		String temp="";
		int c=0,r=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			r=Integer.parseInt(""+s.charAt(i))*Integer.parseInt(ch)+c;
			temp=(r%10)+temp;
			c=r/10;
		}
		if(c!=0)
			temp=c+temp;
		int j=0;
		while(j<temp.length()-1)
		{
			if(temp.charAt(j)!='0')
				break;
			else
				j++;
		}
		return temp.substring(j);
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
}
