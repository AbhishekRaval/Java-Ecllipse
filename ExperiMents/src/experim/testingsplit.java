package experim;

public class testingsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serialNo= "004-034556";
	    String[] parts = serialNo.split("-");
	    String string1 = parts[0]; // 004
	    String string2 = parts[1]; // 034556
	    System.out.println(parts[0] + parts[1]);
	    System.out.println(string1);
	    System.out.println(string2);
	    String n1;
	    n1 = "1,abhishek,2dhanlaxmisoc,9979911809";
	    String[] n11 = n1.split(",");
	    for(int i=0;i<n11.length;i++)
	    {
	      	System.out.println(n11[i]);
	    }
	}

}
