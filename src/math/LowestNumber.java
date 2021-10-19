package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */


		int[] arr = {25, 86, 41, 97, 22, 34};
		int smallest = Integer.MAX_VALUE;
		int index=0;
		while(index<arr.length) {
			//check if smallest is greater than element
			if(smallest>arr[index]) {
				//update smallest
				smallest=arr[index];
			}
			index++;
		}
		System.out.println("The smallest number is : "+ smallest);
	}

}
