package DIVISION;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="480",y="4";
		//System.out.println(checkgreater("480","4"));
		for (int i = 0; i <x.length(); i++) {
			String d=x.substring(0, y.length());
		}
	}
	public static boolean checkgreater(String x,String y){
		for (int i = 0; i < x.length(); i++) {
			int x1=Integer.parseInt(x.charAt(i)+"");int y1=Integer.parseInt(y.charAt(i)+""); 
			if (x1>y1){return true;}
			if(x1==y1){}
		}
		return false;

	}
}
