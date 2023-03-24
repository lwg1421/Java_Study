package com.itskb.ws02;

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		int[][] arr = {
	            {1, 2, 5, 7, 3, 4},
	            {3, 1, 9, 8, 4, 5},
	            {6, 2, 4, 6, 2, 8},
	            {9, 7, 4, 3, 7, 8},
	            {2, 3, 4, 8, 4, 6},
	            {4, 6, 2, 3, 7, 8}
	    };
	    
	    int top = 0;
	    int bottom = 0;
	    int left = 0;
	    int right = 0;
	    
	    int sum = 0;
	    for (int r = 0; r <arr.length; r++) {
	        for (int c = 0; c<arr[r].length; c++) {
	            if(r != 0) top = arr[r-1][c];
	            if(r != arr.length-1) bottom = arr[r+1][c];
	            if(c != 0) left = arr[r][c-1];
	            if(c != arr.length-1) right = arr[r][c+1];
	            if ((top+bottom+left+right)%2 == 0) {
	                sum+=arr[r][c];
	            }
	            
	            top = 0;
	            bottom = 0;
	            left = 0;
	            right = 0;
	        }
	    }
	    System.out.println(sum);

	}

}
