import java.util.Scanner;
 class sundaram {
	public static void main(String [] args){
	try{
        	Scanner sc= new Scanner(System.in);
        	Scanner sc1= new Scanner(System.in);
		int x=sc.nextInt(); 
		for (int i = 0; i < x; i++) {
			String x1= sc1.nextLine();
			String y[] = x1.split(" ");
			int a=Integer.parseInt(y[0]);
			int b=Integer.parseInt(y[1]);
			sundaram(a,b);
			
		}
	 } catch(Exception e){
            return;
        }
		
	}
	public static void  sundaram(int a, int b){
		int arr[]=new int[b];
		long x=System.currentTimeMillis();
		for (int i = 1; i < b; i++) {
			for (int j = 1; j <((b-i)/(2*i+1)); j++) {
				arr[i+j+2*i*j]=1;
			}
		}
		if (a<=2) {
			System.out.println("2");
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]==0) {
				if ((2*i+1)>b) {
					break;
				}
				else if ((2*i+1)<a) {

				}
				else {
					System.out.println(2*i+1);
				}
			}
		}
	}
}






