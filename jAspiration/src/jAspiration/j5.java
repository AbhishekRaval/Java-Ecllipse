package jAspiration;
import java.util.*;
class j5 {	

private static Scanner s1;

int addition(int a,int b){
	return a+b;
}
int subtraction(int a,int b){
	return a-b;
}
int multiplication(int a,int b){
	return a*b;
}

float division(int a,int b){
	return a/b;
}

public static void main(String[] args){
	s1 = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a,b;
	int add,sub,mul;
	float div;
	a = s1.nextInt();
	b = s1.nextInt();
	
	j5 op = new j5();
	add = op.addition(a, b);
	sub = op.subtraction(a, b);
	mul = op.multiplication(a, b);
	div = op.division(a, b);
	System.out.println("Your a=" + a + " & b= " + b  + "yields addition " + add + " subtraction " + sub + " mul " + mul + "div" + div );
}
}
