package College_programs;
import java.util.Scanner;
public class highestpowerprob {
private static Scanner s1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
s1 = new Scanner(System.in);
int x,y;
System.out.println("Here we are helping you out to find out to highest power of the number");
System.out.println("Example highest power of 5 in 25! is 6, similarly you can find out highest power of your nummber");
System.out.println("So let's take inputs from you.");
System.out.println("Highest power of x  in y! is blank, enter values of x & y");
x = s1.nextInt();
y = s1.nextInt();
	/// here starts the core logic of the program ///

	int i=0 ; 
	int new1=0;
	while(x<y){
		new1 += (y/(Math.pow(x,i)));
		i++;
	}
	
	System.out.println("the highest power of " + x + " in " + y + " is " + new1);
	}

}
