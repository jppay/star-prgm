
/*
 * Author: Jimmy Paul
 * 
 * Version: 1.0 
 * 
 * Date: 13-June-2016
 * 
 * Description: 
 * This program accepts two numbers as input and finds 
 * perfect squares in the sequence between those numbers. 
 * Cases not covered in this version are: 
 * - checking if first input is lesser than second input
 * - negative numbers as input 
 * 
 */ 

import java.util.Scanner; 
import java.util.*;

class PrintStarPyramid {
	
	public static void main(String[] args) {
		
		System.out.print("Enter height of sequence: ");
		Scanner scanHeight = new Scanner(System.in);
		int intPyramidHeight = scanHeight.nextInt(); // Get height (int)
		
		for(int i=0; i < intPyramidHeight; i++) {
			for(int j=0; j < (intPyramidHeight - i); j++) { // Pad spaces from LHS based on height
				System.out.print(" ");
			}
			for(int k=0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}