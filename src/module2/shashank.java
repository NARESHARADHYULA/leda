package module2;
import java.util.*;
public class shashank
{
  public static void main(String args[])
  {
	int carry=0,k=0;
	String out="";
	Scanner scan =new Scanner(System.in);
    String in1=scan.next();
    String in2=scan.next();
    String[] final1=new String[in2.length()];
    String final2="";
     for(int i=in2.length()-1;i>=0;i--)
      {  System.out.println(carry);
    	 out="";
    	 for(int j=in1.length()-1;j>=0;j--)
    	 { System.out.println(carry+"in for  ");
	       int a=Integer.parseInt(in1.charAt(j)+"")*Integer.parseInt(in2.charAt(i)+"")+carry; 
	       	carry=0;
	       if(a>9)
	       {  System.out.println("carry came ");
	    	  carry=a/10;
	    	  System.out.println("carry is" + carry);
	    	  out=a%10+out;
	    	  System.out.println(out+" out is ");
	       }
	       else
	    	   out=a+out;
	        
	      }
	    	  
    	      if(carry!=0)
    	      {
    	    	  final1[k]=carry+out;
    	    	  carry=0;
    	      }
    	      else
    	    	  final1[k]=out;
	    	  k++;
      }
     int len=final1.length;
     int len1=len;
     for(int i=0;i<len;i++)
     {
    	 System.out.println(final1[i]);
     }
    for(int i=0;i<len;i++)
    {
      String temp=final1[i];
      final1[i]="";
      for(int p=0;p<len1-1;p++)
    	 final1[i]=final1[i]+0;
      final1[i]=final1[i]+temp;
      for(int p=len;p>len1;p--)
         final1[i]=final1[i]+0;
      len1--; 		
    }
    carry=0;
    int len2=final1[0].length();
    for(int i=len2-1;i>=0;i--)
    {
	  int a1=0;
     //carry=0;
	  for(int j=0;j<final1.length;j++)
	 {
       a1=a1+Integer.parseInt(final1[j].charAt(i)+""); 
	 }
	  //System.out.println(carry);
     a1=a1+carry;
     carry=0;
     //System.out.println(a1);
	 if(a1>9)
     {
  	  carry=a1/10;
  	  final2=a1%10+final2;
     }
	 else
		 final2=a1+final2;
    }
    //System.out.println(final2);
  }
}