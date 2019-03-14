package com.hd.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hd.suanfa.最长路径递归.TreeNode;



public class 二叉树的中序 {
	//定义一个树节点，包括左孩子，右孩子，及节点值】

		 
		
		 public static void main(String []args){
			 TreeNode tree =new TreeNode(1);
				TreeNode tree1 =new TreeNode(2);
				TreeNode tree2 =new TreeNode(3);
				tree.right = tree1;
				tree1.left = tree2;
				List list = new ArrayList<>();
				inorderTraversal(tree,list);
				System.out.println(list);
			 
		 }
		 
		   public static List<Integer> inorderTraversal(TreeNode root,List<Object> list ) {
			   if(root==null){
				   return null ;
			   }
				inorderTraversal(root.left,list);
				list.add(root.val);
				inorderTraversal(root.right,list);		   
				return null;     
		    }
}
