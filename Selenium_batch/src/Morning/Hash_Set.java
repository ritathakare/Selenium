package Morning;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		
		//Insertion
	   //Retrieval
	  //Deletion
		
	HashSet<Integer> s = new HashSet<Integer>();
	   //Insertion
	   s.add(24);
	   s.add(43);
	   s.add(67);	   
	   s.add(56);
	   s.add(34);
	   s.add(78);
	   
	   for(int x:s)
	   {
		 System.out.println(x);  
	   }
       System.out.println("==============");
	   //Retrieval
       Iterator<Integer> i =  s.iterator();
       
       for(int x:s)//Using for loop
       {
    	   System.out.println(i.next());
       }
       System.out.println("==============");
       i= s.iterator();
       
       while(i.hasNext())//Using while loop
       {
    	   System.out.println(i.next());
  
       }
       System.out.println("==============");
       
       s.remove(67);
       i= s.iterator();
       
       while(i.hasNext())//Using while loop
       {
    	   System.out.println(i.next());
  
       }

       
	   
	}
}
