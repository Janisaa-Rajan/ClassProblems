package com.example.set;
import java.util.TreeSet;
public class RemoveDuplicates {
			public static void main(String[] args) {
			int[] arr = {1,1,2,3,4,4,6,5,7,7};

	        TreeSet<Integer> set = new TreeSet<Integer>();

	        for (int i = 0; i<arr.length;i++) {
	            set.add(arr[i]);
	        }
	        System.out.println(set);

	}

}
