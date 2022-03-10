package week5assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Uniquechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="babub";
		
		Set<Character> input1=new LinkedHashSet<Character>();
		for (int i = 0; i <input.length()-1; i++) {
			
//		            a.add(input.charAt(i));
//		            System.out.println(a);
			
		char name=input.charAt(i);
			System.out.println(name);
			input1.add(name);
			}
		System.out.println(input1);
		 
		
	}
	}
