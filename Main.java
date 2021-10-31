import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
   public static void main(String args[])
	{ StringStuff s = new StringStuff();
	
		String[] ss = "one eleven11 thirteen 1234 22two 22tao three 4four 5five 66it a bee".split( " " );
    	ArrayList< String> sf1 = new ArrayList<>();;
		ArrayList< String> sf;
		sf = new ArrayList< String >( Arrays.asList( ss ) );		
		sf1= s.digitSort( sf );
		System.out.println( sf1 );
//  System.out.println( s.compareAlpha("a", "b"));	
//  System.out.println( s.compareAlpha("1", "a"));	
//   System.out.println( s.compareAlpha("aa3", "3"));	
//  System.out.println( s.compareAlpha("33b", "a12"));	
			
		//add more test cases																						
	} 
}