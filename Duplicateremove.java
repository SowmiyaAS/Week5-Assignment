package week5.day1;

public class Duplicateremove {

	public static void main(String[] args) {
		String str="we learn java basics as part of java sessions in java week1";
		String[] str1=str.split(" ");
		
		 for (int i = 0; i < str1.length; i++)
		 {
			  //System.out.println(str1[i]);//print words split
			  //use loop
			  for (int j = i+1; j < str1.length; j++) {
				  if(str1[i].equals(str1[j]))
				  {
						 
					 str1[j]=" ";
						 
						 
						 }
					}
			  
			  System.out.println(str1[i]+"");
					  
				  }
				
			}
			  
			  
			  
			
		}
