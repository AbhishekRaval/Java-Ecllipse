package College_programs;

public class episode1 {

	public static void main(String[] args) {
	int i;
	for(i=10;i<100;i++){
		int neew = 0;
		
		neew = (neew + ((i%10)*10) + (i/10));
		
		if(i + 27== neew){
			System.out.println(i);
				}
	}

	}

}
