package algorithmsDAA;

public class timecomplex {
	public static long starttime(){
		long lStartTime = System.nanoTime();
		return lStartTime;
	}
	public static void endtime(long l){
		long lEndTime = System.nanoTime();
		long difference = lEndTime - l;
		System.out.println("Elapsed time for program is " + difference + " nano seconds or say "+ (difference/1000000000) + " seconds ");
	}

}
