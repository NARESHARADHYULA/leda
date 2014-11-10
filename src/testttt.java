import java.io.*;
import java.util.*;
public class testttt {
    public static void main(String [] args ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        String  n=sc.next();// take as string 
        String x="0";
               while(!x.equalsIgnoreCase(n)){ // use string increment 
                   
            	  // System.out.println("shdghs");
            	   x=Addition(x,"1");
                   //System.out.println(x);
                   if(!Prime(x)){ 
                         System.out.println("prime is "+x);
                    }
               }               
           }
    public static boolean Prime(String  n){
        //System.out.println("ghvhg");
    	String x="1";
        if(n.equalsIgnoreCase("1"))
            return false;
        while(!x.equalsIgnoreCase(n)){
           x=Addition(x,"1");
          // System.out.println(x);
           //System.out.println(n);
           if(Div(n,x))
              return false;
       }
       return true;
    }
    public static boolean Div(String n ,String x){
        int n1=Integer.parseInt(n);
        int n2=Integer.parseInt(x); int count=0;
        //System.out.println(n1+"  "+ n2);
        if(n1%n2==0){
        	count++;
        	if(count>1){
        		return false;
	
        	}
                    }
        return true;
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