package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;


public class test2 {
 public static void sort(int[] array) {
	 int lastindex=0;
	 int sortborder=array.length-1;
	 for(int i=0;i<array.length-1;i++) {
		 for(int j=0;j<sortborder;j++) {
			 if(array[j]>array[j+1]) {
				 int temp=array[j];
				 array[j]=array[j+1];
				 array[j+1]=temp;//可以在此加一个bool标志位，如果一轮内层循环没有交换操作，则标识位为true，直接break外层结束
				 lastindex=j;
			 }
		 }
		 sortborder=lastindex;
	 }
 }
 
 public static void quicksort(int[] arr,int startindex,int endindex) { //快排，每一次围绕pviotindex的分治交个partition函数
 if(startindex>=endindex)
 { return ;}
 int pivotindex=partition(arr,startindex,endindex);
 quicksort(arr, startindex, pivotindex-1);
 quicksort(arr, pivotindex+1,endindex );
 }
 
 public static int partition(int[] arr, int startindex,int endindex) {
	 
	 int pivot=arr[startindex];
	 int left=startindex;
	 int right=endindex;
	 while(left!=right) {
		 while(left<right&&arr[right]>pivot) {
			 right--;
		 }
		 while(left<right&&arr[left]<=pivot) {
			 left++;
		 }
		 
		 if(left<right) {
			 int p=arr[left];
			 arr[left]=arr[right];
			 arr[right]=p;
		 }
	 }
	 arr[startindex]=arr[left];
	 arr[left]=pivot;
	 
	 return left;
 }
 
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*  Set<String> s=new HashSet<>();
  TreeSet<String> ts=new TreeSet<>();
  ts.add("my");
  ts.add("name");
  ts.add("jiaboyan");
  ts.add("hello");
  ts.add("world");
  ts.add("1");
  ts.add("2");
  ts.add("3");
  s.add("tret");
  s.add("rew");
  String[] ss= (String[]) s.toArray(new String[s.size()]);
  System.out.println(Arrays.toString(ss));
  Iterator<String> it=ts.iterator();
  while(it.hasNext()) {
	  String str=it.next();
	  System.out.println(str);
  }
  System.out.println("------------------");
  Iterator<String> desit=ts.descendingIterator();
  while(desit.hasNext()) {
	  String str=desit.next();
	  System.out.println(str);
  }*/
	/*String s="sgdfhj3564545";
	String[] ss=s.split("5");
	System.out.println(Arrays.toString(ss));
	*/
		int[] arr= {4,2,3,1,5,6,9,7,2,8,0};
		int[] arr1= {4,2,3,1,5,6,9,7,2,8,0};
		/*System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		arr=Arrays.copyOf(arr, 2*arr.length);
		System.out.println(Arrays.toString(arr));*/
		/*System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));*/
		/*System.out.println(Arrays.toString(arr1));
		quicksort(arr1, 0, arr.length-1);
		System.out.println(Arrays.toString(arr1));
		System.out.println("ygjh");
		*/
		Stack<Map<String, Integer>> st=new Stack<>();
		Map m=new HashMap<String, Integer>();
		m.put("aaa", 111);
		m.put("bbb", 222);
		m.put("ccc", 222);
		Map m1=new HashMap<String, Integer>();
		m1.put("ddd", 114);
		m1.put("eee", 225);
		m1.put("fff", 226);
		st.push(m);
		System.out.println(st.peek());
		st.push(m1);
		//st.peek();
	}
}
