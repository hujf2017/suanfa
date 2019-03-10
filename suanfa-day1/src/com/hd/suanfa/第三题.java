package com.hd.suanfa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class µÚÈıÌâ {
	 public static int lengthOfLongestSubstring(String s) {
		 	Map ab = new HashMap();
	        int a =s.length();
	        int max=0;
	        int k=0;
	        for(int i=k;i<a;i++){
	        	if(ab.containsKey(((s.charAt(i))))){
	        		if(max<ab.size()){
	        			max=ab.size();
	        		}
	        		 k=(int) ab.get(s.charAt(i));
	        		// ab= new HashMap();
	        		 i=k;
	        		 
	        		 
	        	}else{
	        		ab.put(s.charAt(i),i);
	        		if(max<ab.size()){
	        			max=ab.size();
	        		}
	        	}
	        }    
			return max;        
	    }
	 public static void main(String []args){
		 String s ="abcbcbbqwer";
		 System.out.println(lengthOfLongestSubstring(s));
	 }
}
