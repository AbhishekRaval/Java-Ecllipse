package experim;
import java.io.*;  
class readandwrite{  
public static void main(String args[])throws Exception{  
FileInputStream fin=new FileInputStream("abc.txt");  
FileOutputStream fout=new FileOutputStream("M.java");  
int i=0;  
while((i=fin.read())!=-1){  
fout.write((byte)i);  
}  
fin.close();  
}  
}  