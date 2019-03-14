package com.hd.suanfa;


/**
 * Definition for a binary tree node.
 * */

 
public class 最长路径递归 {
	//定义一个树节点，包括左孩子，右孩子，及节点值
	public static  class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	   

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int []a ={3,9,20,15,7};
			TreeNode tree =new TreeNode(1);
			TreeNode tree1 =new TreeNode(2);
			TreeNode tree2 =new TreeNode(3);
			TreeNode tree3 =new TreeNode(4);
			TreeNode tree4 =new TreeNode(5);
			//TreeNode tree5 =new TreeNode(5);
			tree.left =tree1;
			tree.right=tree2;
			tree2.left=tree3;
			tree2.right=tree4;
		//	tree2.right=tree5;
			System.out.println(maxDepth(tree));

		}

		 public static int maxDepth(TreeNode root) {
	         return  root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right )) + 1;
	    } 
		private static int longestUnivaluePath(TreeNode tree) {
				int i=1;
				if(tree==null){
					return 0;
				}else{
					return calc(tree,i);
				}			
		}
		private static int calc(TreeNode tree, int x) {
				int i=x;
				int j=x;
				int max =0;
				if(tree.left!=null){
					i++;    //
					max=calc(tree.left,i);	
					
				}
				if(tree.right!=null){
					j++;
					max=calc(tree.right,j);
					
				}
				int k=Math.max(i, j);
				return 	Math.max(max, k);
			}
}


