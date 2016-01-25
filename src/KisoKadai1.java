

public class KisoKadai1 {

		public static void main(String[] args) {
		   System.out.println("九九表");

		   System.out.println("xの値を入れてください。");
		   int x = new java.util.Scanner(System.in).nextInt();


		   System.out.println("yの値を入れてください。");
		   int y = new java.util.Scanner(System.in).nextInt();
		   for( int i=1; i<=x; i ++) {
	        for( int j=1; j<=y; j ++) {
	    	  int value = i * j;
	    	  System.out.print(i + "X" + j + "=");

	    	  if(value < 10) {

	    	System.out.print(" ");
	    	  }

	    	  System.out.print(value +" ");
	       }
	       System.out.println();
	       	}
	}
}
