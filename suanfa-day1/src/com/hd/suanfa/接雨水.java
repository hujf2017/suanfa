package com.hd.suanfa;

public class 接雨水 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a ={0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap1(a));

	}
	//1.要计算能盛多少雨水，每两个之间，双指针计算中间为0的值
	
	private static int trap(int[] a) {
		// TODO Auto-generated method stub
		int left =0;  //max 总的数量
		int right=a.length-1;
		int all = 0; //all为单个槽的数量
		//双指针
		while(left<right){
			if(a[left]==0){
				left++;
				continue;
			}
			if(a[right]==0){
				right--;
				continue;
			}
			for(int b=left ;b<=right;b++){
				if(a[b]==0){
					all++;
					continue;
				}else{
					a[b]--;
					continue;
				}
			}
		}
		return all;
//		for(int i=0;i<max;i++){
//			for(int j=0;i<a.length;i++){
//				if()
//			}
//		}
	}
	
	//2.从左往右，从右往左，以最高值为界。当前一个>后一个时，必然有值，职位 before-after.如果后一个》前一个，之前的已经添加，故直接将标准转移至新的。
	
		private static int trap1(int[] a) {
			// TODO Auto-generated method stub
			int all = 0; //all为单个槽的数量
			//1.找到最大值
			int max=0;
			int x=0;
			for(int i=0;i<a.length;i++){
				if(max<a[i]){
					max = a[i];
					x=i;
				}

			}
			//从左往右
			int left =0;  
			for(int i=0;i<x;i++){
				if(left<a[i]){
					left =a[i];
				}else{
					all = all+left -a[i];//原值+差值
				}
			}
			
			//从右往左
			int right =0;
			for(int i=a.length-1;i>x;i--){
				if(right<a[i]){
					right=a[i];
				}else{
					all=all+right-a[i];
				}
			}
			return all;
			
		}

}
