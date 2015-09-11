package algorithmsDAA;

import java.util.Scanner;

class MakeChange
{
    public static void makeChange( int [ ] coins, int differentCoins,int maxChange, 
									int [ ] coinsUsed, int [ ] lastCoin )
    {
         coinsUsed[ 0 ] = 0; lastCoin[ 0 ] = 1;

         for( int cents = 1; cents <= maxChange; cents++ )
         {
	     int minCoins = cents;
                 int newCoin  = 1;

                 for( int j = 0; j < differentCoins; j++ )
                 {
             	 if( coins[ j ] > cents )   
                   	 continue;
               
		 if( coinsUsed[ cents - coins[ j ] ] + 1 < minCoins )
                	{
                  	      minCoins = coinsUsed[ cents - coins[ j ] ] + 1;
                    	      newCoin  = coins[ j ];
               	 }
          	     }

                 coinsUsed[ cents ] = minCoins;
                 lastCoin[ cents ]  = newCoin;
        	}
    }

    public static void main( String [ ] args )
    {
	int n;
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
		
	System.out.println("\nEnter num of coin :");
	n = in.nextInt();
	int numCoins = n;
		
	int[] coins = new int[n];
		



	System.out.println("\nEnter coins:");
	
	for (int c = 0; c < n; c++) 
        	coins[c] = in.nextInt();
        
	System.out.println("\nEnter change :");
	int change = in.nextInt() ;

        	int [ ] used = new int[ change + 1 ];
        	int [ ] last = new int[ change + 1 ];

        	makeChange( coins, numCoins, change, used, last );

        	System.out.println( "\nBest is " + used[ change ] + " coins" );

        	for( int i = change; i > 0; )
        	{
                    System.out.print( last[ i ] + " " );
                    i -= last[ i ];
        	}
        	System.out.println( );
      }
}
 
