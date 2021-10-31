import java.util.Arrays;
import java.util.ArrayList;

public class StringStuff
{
	public static int getDigCount( String s )
	{
    int counter = 0;
  for(int i=0;i<s.length();i++)
    {
      if(Character.isDigit(s.charAt(i)))
      counter++;
    
    }
    //System.out.println("digit in  "+ s +  "is" + counter);
		return counter;

    }


//"a".compareTo("b"); // returns a negative number, here -1
//"a".compareTo("a"); // returns  0
//"b".compareTo("a"); // returns a positive number, here 1
    public static int compareAlpha(String s1, String s2)
    {
      int a =s1.compareTo(s2);
     // System.out.println ( "comparison of" + s1 + " and " + s2 + " returns " +a );

      return a;
    }
	
	
	public static ArrayList<String> digitSort( ArrayList<String> list )
	{

        for(int i=1;i<list.size();i++){

            String key = list.get(i);

            for(int j= i-1;j>=0;j--){
                   if(getDigCount(key) < getDigCount(list.get(j))){
                    list.set(j+1,list.get(j));
                    if(j==0){
                        list.set(0, key);
                    }
                }
                else if (getDigCount(key) == getDigCount(list.get(j))){
                   
                   if (compareAlpha(key, list.get(j)) < 0){
                       list.set(j+1,list.get(j));
                    if(j==0){
                        list.set(0, key);
                    }

                   }
                                      
                    list.set(j+1,key);
                    break; 
                }
                else{
                    list.set(j+1,key);
                    break; 
                }
            }
        }       
return list;
  }
}