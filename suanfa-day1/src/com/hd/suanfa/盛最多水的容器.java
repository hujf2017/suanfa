package com.hd.suanfa;

public class 盛最多水的容器 {
	public static void main(String[] args){
		int a[] = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(maxArea(a));
	}
	
//	 public static int maxArea(int[] height) {
//		 int max=0;
//		 for(int i=0;i<height.length;i++){
//			 for(int j=i;j<height.length;j++){
//				 int a =Math.min(height[i], height[j]);
//				 int b = j-i;
//				 int s=a*b;
//				 max = Math.max(s, max);
//				 System.out.println(s);
//			 }
//		 }	 
//		 
//		return max;
//	        
//	    }
	//双指针算法
	public static int maxArea(int[] height) {
		int max=0;
		int left =0;
		int right =height.length-1;
		int length =height.length;
		while(left <right){
			length=length-1;
			int s =Math.min(height[left], height[right])*(length);
			max = Math.max(s , max);			
			if (height[left] < height[right])
				left++;
            else
            	right--;
		}
		
		return max;
		
	}
}
