package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TestHashCode {

	public static void main(String[] args) {
		Integer arr[] = {1, 3, 0, 4, 0, 5, 0};

		List<Integer> l = Arrays.asList(arr);
		List<Integer> result = new ArrayList<>(); 
		ListIterator<Integer> itr = l.listIterator();
		
		while(itr.hasNext()) {
			if(itr.next() == 0) {
				result.add(0);
				itr.remove();
			}
		}
		
		System.out.println("first list: " + l);
		//System.out.println("final list: " + l);
		
		//0, 0, 0, 1, 3, 4, 5
	}

}
