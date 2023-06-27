package com.IET.test;

import java.util.Arrays;

public class Solution {	
	 public static boolean canMakeArithmeticProgression(int[] arr) {
		 System.out.println((arr[0]));
	       // Arrays.sort(arr);
	        int a =((arr[0])-(arr[1]));
	        for(int i=0;i<1;i++)
	        {
	        	//       -13  - -17
	             //4
	            System.out.println(a);
	            if(arr.length>2){
	            if(a==(arr[i+1]-arr[i+2]))
//	             4==(-17- -8)    
	            {
	            	System.out.println(arr[i+1]-arr[i+2]);
	            	//System.out.println(1);
	                return true;
	            }
	            }
	            if(arr.length<=2){
	            	System.out.println(2);
	            	return true;
	            }
	           
	        }	        
	        return false;	        
	    }
	
	 	 
	public static void main(String[] args) {
		
		int [] gain = {-13,-17,-8,-10,-20,2,3,-19,2,-18,-5,7,-12,18,-17,12,-1};
		System.out.println(canMakeArithmeticProgression(gain));
	}

}
