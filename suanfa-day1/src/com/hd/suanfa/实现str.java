package com.hd.suanfa;

public class  µœ÷str {

	public static void main(String[] args) {
		String haystack = "mississippi", needle = "issip";
		System.out.println(strStr(haystack,needle));
	}
	public static int strStr(String haystack, String needle) {
		int i=0;
		int m=0;
		int j = needle.length();
		if(j==0){
			return 0;
		}
		 for(int k=m;k<haystack.length();k++){
			 if(haystack.charAt(k) ==needle.charAt(i) ){
				 //System.out.println(haystack.charAt(k));
				 i++;
				 if(i==j){
					 return k-j+1;
				 }
				 continue ;
			 }
			 k=k-i;
			 i=0;			 
		 }
		return -1;
    }
}
