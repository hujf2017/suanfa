package com.hd.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
		
		
		  //Definition for a binary tree node.
		   class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
		
public class ±éÀú2²æÊ÷ {

	
	 public static void main(String []args){
		 List<Integer> s =  Arrays.asList(1,null,2,3);
		 System.out.println(inorderTraversal(s));
	 }

	 public static List<Integer> inorderTraversal(List<Integer> s) {
		 int k=0;
		 for(int i=k;i<s.size();i++){
			 TreeNode first = new TreeNode(s.get(i));
			 first.left =new TreeNode(s.get(2^(i-1)));
			 first.right = new TreeNode(s.get(i+2));
		 }   
		return s;
	 }
}
