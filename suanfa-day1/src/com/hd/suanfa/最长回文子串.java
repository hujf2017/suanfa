package com.hd.suanfa;

public class 最长回文子串 {
	public static void main(String[] args) {
		String s = "dabab";//babad
		System.out.print(longestPalindrome(s));
	}

	public static String longestPalindrome(String s) {
		String s1 = "" ;
		String k="";
		int left = 0, right = s.length();
		int max = 0;
		int length = 0;
		for (int i = right - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		for (int i = 0; i < s.length(); i++) {
			for(int j=i+1;j<s.length()+1;j++){
				System.out.println(s1.substring(i, j));
				if(s.contains((s1.substring(i, j)))){
					max = max + 1;
					//k= s1.substring(i, j) ;
				}else{
					if(length<max){
						length = max;
						k= s1.substring(i, j-1) ;
					}
					max = 0;
					break;
				}
			}
		}
		return k;

	}
}
