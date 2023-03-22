package Morning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hash_Map {
	
	public static void main(String[] args) {
		
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	
	      map.put(34, "Pune");
	      map.put(12, "class");
	      map.put(65, "Batch");
	      map.put(76, "2023");
	      map.put(45, "Pune");
	
	     
	 for(Map.Entry<Integer,String> e : map.entrySet());
	 {
	   
//	System.out.println("key=" +e.getKey()+ "value="+ e.getValue());
	 }
	
	}

}









//Insertion
//Retrieval
//Deletion
	
	    //Key  ,  Value