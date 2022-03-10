package week5assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingnumSet {
	public static void main(String[] args) {
	
         int[] numbers= {4,6,7,2,3,1,9,10,8,8,6};
		Set<Integer> a=new HashSet<Integer>();
		
		
		for (int i = 0; i < numbers.length; i++) {
			
			a.add(numbers[i]);
		}
	  Set<Integer> number= a;
		System.out.println(number);
	   List<Integer> b=new ArrayList<Integer>(number);
	   for (int i = 0; i < b.size(); i++) {
		   
		   
		   
		   if(i+1!= b.get(i))
		   {
			   System.out.println(i+1);
			   break;
			 
		
	    
	    }
		}
		
       
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       /*for (int i = 0; i < b.size()-1; i++) {
    	  
    	  int missing=b.get(i+1)-b.get(i);
    	  if(missing!=1)

    	  {
    		  System.out.println(b.get(i+1)-1);
    	  }
	}*/
              
              

				
		
	}
}

