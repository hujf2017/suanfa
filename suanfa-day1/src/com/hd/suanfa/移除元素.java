package com.hd.suanfa;

import java.util.ArrayList;
import java.util.List;

public class ÒÆ³ıÔªËØ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={3,2,2,3};
		System.out.println(removeElement(a,3));
	}
	
	 public static int removeElement(int[] nums, int val) {
		 int i=0;
		 int j=nums.length;
		 while(i<j){
			 if(nums[i] == val){
				 nums[i] = nums[j-1];
				 j--;
			 }else{
				 i++;
			 }
		 }
		 
		 return j;
	        
	    }

}
