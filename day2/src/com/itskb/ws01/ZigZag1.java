package com.itskb.ws01;

public class ZigZag1 {

	public static void main(String[] args) {
		int [][] intArray = 
			{
					{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20}
			};

		for (int r = 0; r < intArray.length; r++) {
			if (r%2==0) {
				for (int c = 0; c<intArray[r].length; c++) {
					System.out.print(intArray[r][c] + " ");
				}
				System.out.println();
			} else {
				for (int c = intArray[r].length-1; c>=0; c--) {
					System.out.print(intArray[r][c] + " ");
				}
				System.out.println();
			}
		}
	}

}
