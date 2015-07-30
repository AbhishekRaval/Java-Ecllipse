package jAspiration;

public class dirconsole2 {

	static void add(int...b){
		int a=0;
		for(int no:b){
		a+=no;
		}
		System.out.println("Summation is " + a);
		}
		public static void main(String arg[]){
		int[] a = new int[arg.length];
		System.out.println(arg.length);
		for(int i=0;i<arg.length;i++){
		a[i]= Integer.parseInt(arg[i]);
		}
		add(a);

		}

}
