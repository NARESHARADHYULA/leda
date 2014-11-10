
public class smltest {
	public static void main(String [] args){
		int n=6;
		int y=n%4;
		int y1=9%4; int p=0;
		String x="12345678";
		for (int i = 0; i <=x.length(); i=i+2) {
		
			String a=x.substring(p,i);
			p=i;
			System.out.println(a);
			System.out.println(i);
		}
	
		System.out.println("y "+y +" y1 "+y1);
	}
}
