package com.hd.suanfa;

public class ����ˮ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a ={0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap1(a));

	}
	//1.Ҫ������ʢ������ˮ��ÿ����֮�䣬˫ָ������м�Ϊ0��ֵ
	
	private static int trap(int[] a) {
		// TODO Auto-generated method stub
		int left =0;  //max �ܵ�����
		int right=a.length-1;
		int all = 0; //allΪ�����۵�����
		//˫ָ��
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
	
	//2.�������ң��������������ֵΪ�硣��ǰһ��>��һ��ʱ����Ȼ��ֵ��ְλ before-after.�����һ����ǰһ����֮ǰ���Ѿ���ӣ���ֱ�ӽ���׼ת�����µġ�
	
		private static int trap1(int[] a) {
			// TODO Auto-generated method stub
			int all = 0; //allΪ�����۵�����
			//1.�ҵ����ֵ
			int max=0;
			int x=0;
			for(int i=0;i<a.length;i++){
				if(max<a[i]){
					max = a[i];
					x=i;
				}

			}
			//��������
			int left =0;  
			for(int i=0;i<x;i++){
				if(left<a[i]){
					left =a[i];
				}else{
					all = all+left -a[i];//ԭֵ+��ֵ
				}
			}
			
			//��������
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
