package algorithmsDAA;

import java.util.Scanner;

public class MatrixChainMulti{
protected int m[][];
protected int s[][];
protected int n;
public void matrixChainOrder(int[] p){
n=p.length-1;
m=new int[n][n];
s=new int[n][n];
for(int i=0;i<n;i++){
m[i]=new int[n];
m[i][i]=0;
s[i]=new int[n];
}
for(int l=1;l<n;l++){
for(int i=0;i<n-l;i++){
int j=i+l;
m[i][j]=Integer.MAX_VALUE;
for(int k=i;k<j;k++){
int q=m[i][k]+m[k+1][j]+p[i]*p[k+1]*p[j+1];
if(q<m[i][j]){
m[i][j]=q;
s[i][j]=k;
}
}
}
}
}
void printOptimalParens(){
printOptimalParens(s,0,n-1);
}
void printOptimalParens(int[][]s, int i, int j) {
	if(i==j){
	System.out.print("A"+i); 
	}
	else{
	System.out.print("(" );
	printOptimalParens(s,i,s[i][j]);
	printOptimalParens(s,s[i][j]+1,j);
	System.out.print(")");
	}
}

public static void main (String[] args) {
MatrixChainMulti mcm=new MatrixChainMulti();
System.out.println("How many elements?");
@SuppressWarnings("resource")
Scanner s1 = new Scanner(System.in);
int n =s1.nextInt();
int[] p = new int[n];
System.out.println("Enter " + n + " values");
for(int i=0;i<n;i++){
	p[i] = s1.nextInt();
}
try{
mcm.matrixChainOrder(p);
mcm.printOptimalParens();
}catch(Exception e){
e.printStackTrace();
}
}
}  