package Coding_Guru.src;

import java.util.*;

public class Set_Map {

	public static void main(String[] args) {

		/**
		 * Set is an interface that contains
		 * Sortedset is interface , this is implemented by
		 * hashset - uses hashmap internally
		 * treeset - implents set interface ,stores in ascending order of values
		 * linkedhashset - implents set interface .preserves insertion order
		 * Set doesn't store duplicat values
		 * 
		 * Map is an interface
		 * 
		 * Map can store duplicate values
		 * doesn't preserve insertion order
		 * uses key value pair to store values
		 * accessing elemets by their value can be done in O(1)
		 * 
		 */
		
		Set<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(5);
		set.add(2);
		set.add(3);
		set.add(1);
		
		for(int i : set) {
			System.out.println(i);
		}
		
		/**
		 * output :
		 * 1
		 * 2
		 * 3
		 * 5
		 * 
		 * this has no duplicates and in increasing order
		 */
		Map<Integer,Integer> map = new HashMap<>();
		
		map.put(1,map.getOrDefault(1, 0)+1);
		map.put(5,map.getOrDefault(5, 0)+1);
		map.put(2,map.getOrDefault(2, 0)+1);
		map.put(3,map.getOrDefault(3, 0)+1);
		map.put(1,map.getOrDefault(1, 0)+1);
		
		for(int i : map.keySet()) {
			System.out.println(i+" value: "+ map.get(i));
		}
		
		/**
		 * output :
		 * 1 value: 2
			2 value: 1
			3 value: 1
			5 value: 1

		 * 
		 */
		
		
	}

}
