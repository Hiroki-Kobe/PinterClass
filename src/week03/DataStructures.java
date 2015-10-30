package week03;

import java.util.ArrayList;
import java.util.List;

public class DataStructures {
	
	
	/*
	 * 
	 * @param myList
	 * @return only a list with only even numbers!
	 */
	public List getEven(List myList){
		
		List evenNumbers = new ArrayList();
		
		/*
		 * 
		 * Write codes here!! 
		 * 
		 */
		
		return evenNumbers;
		
	}
	public static void main(String[] args) {
		int i1;
		i1 = 5;
		
		ArrayList myList; //--declaration
		myList = new ArrayList(); //--initialization
		
		for(int i=1; i <= 10; i++ ){
			myList.add(i);
		}
		
		System.out.println("Size: " + myList.size());
		System.out.println("Contents: ");
		
		for(int i=0; i < myList.size(); i++){
		    System.out.println("" + myList.get(i));
		}
	}

}
