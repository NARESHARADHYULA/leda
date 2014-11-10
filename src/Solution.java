import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {

	public static void main(String[] args) throws IOException 
	{
		String num1, num2,num3;
		
		num3="";		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first number\n");		
		num1=br.readLine();				//storing the big numbers as strings
		
		System.out.println("Enter the second number\n");		
		num2=br.readLine();				//storing the big number as string

		if(num2.length()>num1.length())
			{
				int n=num2.length()-num1.length();
				while(n>0)
				{
					num1='0'+num1;
					n--;
				}
				System.out.println("num1= "+num1);
			}
		
		else if(num1.length()>num2.length())
		{
			int n=num1.length()-num2.length();
			while(n>0)
			{
				num2='0'+num2;
				n--;				
			}
			System.out.println("num2= "+num2);
		}
				
		num3=multiply(num1,num2);
		
		System.out.println(num3);
		
	}
	
	public static String multiply(String a, String b)
	{    if (a.length()!=b.length()) {
		if (a.length()>b.length()){
			int l=a.length()-b.length();
			for (int i = 0; i < l; i++) {
				b=0+b;
			}
		}
		else {
			int l=b.length()-a.length();
			for (int i = 0; i < l; i++) {
				a=0+a;
			}
		}
		}
		System.out.println("a is "+ a); System.out.println("b is "+ b);
		int na=a.length();
		int nb=b.length();
		String res="";
		String b0="",b1="",a0="",a1="";
		
		//base condition for recursion
		if((na==1)&&(nb==1))
		{
			int ai=Integer.parseInt(a);
			int bi=Integer.parseInt(b);
			return res+(ai*bi);
		}
		
		else
		{
			//padding with zero if there are odd number of digits in the number
			if(na%2==1)
			{
				a='0'+a;
				na+=1;
			}			
			
			//dividing the digit into a1 and a0
		    a1=a.substring(0,na/2);
			a0=a.substring(na/2);
			System.out.println("a1 "+a1); 	System.out.println("a0 "+a0);
			//padding with zero if there are odd number of digits in the number
			if(nb%2==1)
			{
				b='0'+b;
				nb+=1;
			}
		
			//dividing the digit into b1 and b0
			b1=b.substring(0,nb/2);
			b0=b.substring(nb/2);				
			System.out.println("b1 "+b1); 	System.out.println("b0 "+b0);
			//a · b = a1 · b1 ·B^2k +(a1 · b0+a0 · b1) ·B^k +a0 · b0 
			
			//implementing first part of expression 			
			String p2=multiply(a1,b1);
			System.out.println("String p2=multiply(a1,b1); "+p2);
			//implementing third part of expression
			String p0=multiply(a0,b0);
			System.out.println("String p0=multiply(a0,b0); "+p0);	

			//implementing 2nd part of expression 
			String p1=multiply(add(a0,a1),add(b0,b1));
			System.out.println("add(p2,p0) "+add(p2,p0));
			System.out.println("p1 "+p1);
			String res1=sub(p1,add(p2,p0));
			//System.out.println("p1="+p1);
			
			int n1=na;
			//appending just zeroes at the end since we are working with 10's complement for p2
			while (n1>0)
				{
					p2=p2+'0';
					n1--;					
				}
			
			n1=na/2;
			//appending zeroes at end in middle term
			while (n1>0)
			{
				res1=res1+'0';
				n1--;
			}
			
			System.out.println(" res1 is "+res1);
			System.out.println("p2 is "+p2);
			System.out.println(p0);
			res=add(p2,res1);
			res=add(res,p0);		
			
			return res;
			
		}	
		
	}

	//method to add two strings
		public static String add(String num1,String num2)
		{
			
			String num3="";
			int res, carry=0;
			
			
			//appending zeros to num1 if length of num1 is less
			if(num1.length()<num2.length())
			{
				int n=num2.length()-num1.length();
				while(n!=0)
				{
					num1="0"+num1;
					n--;
				}
			}
			
			//appending zeros to num2 if length of num2 is less
			else if(num2.length()<num1.length())
			{
				int n=num1.length()-num2.length();
				while(n!=0)
				{
					num2="0"+num2;
					n--;
				}
			}
			
			//running the loop till strings are not null
			while(num1.length()!=0)
			{
				
				char c1=num1.charAt(num1.length()-1);
				char c2=num2.charAt(num2.length()-1);
				
				//convert c1 and c2 into integer and then add
				res=Integer.parseInt(""+c1)+ Integer.parseInt(""+c2)+carry;		
				
				//if we get a 2 digit number after addition then breaking the carry and storing the units part
				if(res/10!=0)
				{
					num3=(res%10)+num3;
					carry=res/10;
				}
				
				else	
				{
					num3=res+num3;	
					carry=0;
				}
			
				//truncating the last digit of num1 and num2
				num1=num1.substring(0,num1.length()-1);
				num2=num2.substring(0,num2.length()-1);
			}
			
			if(carry!=0)
			num3=carry+num3;
			//System.out.println("num3= "+num3);
			return num3;
		}
		
	/*public static String sub(String num1,String num2)
	{		
		
		if(num1.equals(num2))
			return "0";
			
		
		if(num1.length()<num2.length())
		{
			int n=num2.length()-num1.length();
			while(n!=0)
			{
				num1="0"+num1;
				n--;
			}
		}
		
		//appending zeros to num2 if length of num2 is less
		else if(num2.length()<num1.length())
		{
			int n=num1.length()-num2.length();
			while(n!=0)
			{
				num2="0"+num2;
				n--;
			}
		}
		
		String num3=checkSmall(num1,num2);
		
		if(num3.equals(num1))		
			//then implement num2-num1
			return "-"+subtract(num2,num1);	
			
		else
			return subtract(num1,num2);
	}
	
	public static String checkSmall(String num1,String num2)
	{
	
		int n=0;
		
		while(n<num1.length())
		{
			char c1=num1.charAt(n);		
			char c2=num2.charAt(n);
			
			int n1=Integer.parseInt(""+c1);
			int n2=Integer.parseInt(""+c2);
			n++;
			
			if(n1<n2)
				return num1;
			else if(n1>n2)
				return num2;
			else
				continue;
			
		}
		if(n==num1.length())
			
		n++;
		return "0";
	}
	
	public static String subtract(String s1,String s2)
	{
		int b=0,res=0;
		String result="";
		while(s1.length()>0)
		{
		
			char ch1=s1.charAt(s1.length()-1);
			char ch2=s2.charAt(s2.length()-1);
		
			int n1=Integer.parseInt(""+ch1);
			int n2=Integer.parseInt(""+ch2);
		
			n1=n1-b;
			if(n1<n2)
			{
				n1=n1+10;
				b=1;
			}
			
			else
				b=0;
			
			res=n1-n2;
			result=res+result;
			
			s1=s1.substring(0,s1.length()-1);
			s2=s2.substring(0,s2.length()-1);
		}
		return result; 
	}*/
	public static String sub(String s1,String s2)
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
