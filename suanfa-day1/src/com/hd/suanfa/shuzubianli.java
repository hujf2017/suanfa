package com.hd.suanfa;

import java.util.HashMap;
import java.util.Map;

public class shuzubianli {
	public static void main(String[] args){
		int []a = {2,7,11,15,1,8};
		System.out.println(twoSum2(a,9)[0]);
	}
	
	
	    public static int[] twoSum(int[] nums, int target) {
	    	Map  a = new HashMap();//保持数组中的每个元素与其索引相互对应的最好方法是什么？哈希表。
	    	for(int i=0;i<nums.length;i++){
	    		a.put(nums[i], i);//配置号索引
	    	}
	    	for(int i=0;i<nums.length;i++){//两次遍历哈利表	
	    		int k=target - nums[i];
	    		if(a.containsKey(k)&& (int) a.get(k)!=i){
	    			return new int []{i,(int) a.get(k)};
	    		}
	    	}
	    	 throw new IllegalArgumentException("No two sum solution");
	    }
	    
	    public static int[] twoSum2(int[] nums, int target) {
	    	Map  a = new HashMap();//保持数组中的每个元素与其索引相互对应的最好方法是什么？哈希表。
	    	for(int i=0;i<nums.length;i++){
	    		int k=target - nums[i];
	    		if(a.containsKey(k)){
	    		//	System.out.println( a.get(k));
	    			return new int []{i,(int) a.get(k)};
	    		}
	    		a.put(nums[i], i);
	    	}
	    	 throw new IllegalArgumentException("No two sum solution");
	    }
	    
	    
}
