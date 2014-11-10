import java.io.*;
import java.util.*;
public class test {
    public static void main(String args[] ) throws Exception 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
      Scanner scan=new Scanner(System.in);
      String x=scan.next(); 
      collitz(x);
    }
    public static void collitz(String x)
      {
        int count=0;
        String num="";
        while(!(num.equals("1")))
        {
          if((Integer.parseInt(x.charAt(x.length()-1)+""))%2==0)
            {    
              //System.out.println(x);
              num=divide(x);
              x=num;
              num=num.replaceFirst("^0*","");
             System.out.println("num"+num);
            } 
            else
                {
                  int carry=0;
                String out="";
                System.out.println(x);
                  for(int i=x.length()-1;i>=0;i--)
                      { //System.out.println("hello");
                         int a=(Integer.parseInt(x.charAt(i)+""))*3 + carry;
                       //  System.out.println(a);
                         //System.out.println("a"+a);
                         if(a>9)
                             {
                               carry=a/10;
                               out=a%10+out;
                             }
                         else
                         {
                        	 out=a+out;
                        	 carry=0;
                         }
                      }
                  System.out.println(out);
                     if(carry!=0)
                         out=carry+out;
               // System.out.println(out);
                int[] dummy=new int[out.length()];
                for(int i=0;i<out.length();i++)
                   {  
                      dummy[i]=out.charAt(i)-48; 
                   }   
                for(int i=dummy.length-1;i>=0;i--)
                   {
    	             if(dummy[i]==9)
    		           {
    		            dummy[i]=0;
    		      
    		            dummy[i-1]=dummy[i-1]+1;
    		            }
    	             else
    		          {
    		           dummy[i]=dummy[i]+1;
    		           break;
    		          }
                   }
                String final1="";
                for(int i=0;i<out.length();i++)
                  {
                     final1=final1+dummy[i];
                  }
                num=final1;
                }
            count++;
            num=num.replaceFirst("^0*","");
        }
        System.out.println(count);
      }
    public static String divide(String x)
    {      

        int carry=0;
        String str="";
        for(int i=0;i<x.length();i++)
        {
            int a=(carry*10)+Integer.parseInt(x.charAt(i)+"");
            //System.out.println(a+"a");
               carry=a%2;
             //  System.out.println(carry+"carry");
               int b=(a/2);
             //  System.out.println(b+"quo");
               str=str+b; 
             //  System.out.println(str);
        }
       return str;
    }
}