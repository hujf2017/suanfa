package com.hd.suanfa;

import java.util.ArrayList;
import java.util.List;

import com.hd.suanfa.最长路径递归.TreeNode;

public class 二叉树层次遍历 {

	 public static void main(String []args){
		 TreeNode tree =new TreeNode(3);
			TreeNode tree1 =new TreeNode(9);
			TreeNode tree2 =new TreeNode(20);
			TreeNode tree3 =new TreeNode(15);
			TreeNode tree4 =new TreeNode(7);
			tree.left = tree1;
			tree.right = tree2;
			tree2.left = tree3;
			tree2.right = tree4;
			List<Object> list = new ArrayList<>();
			levelOrder(tree,list);
			System.out.println(list);
		 
	 }
	 
	 public static List<List<Integer>> levelOrder(TreeNode root,List<Object> list) {
		 
		 if(root!=null){
			List<Integer> list1 = new ArrayList<Integer>();
			list1.add(root.val);
			levelOrder(root.left,list);
			levelOrder(root.right,list);
			list.add(list1);
		 }
		 return null;
	          
	    }
}
