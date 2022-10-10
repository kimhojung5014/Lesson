package ch15.Set.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String>set = new HashSet<>();
		set.add("java");
		set.add("java");
		set.add("servlet/jsp");
		set.add("jdbc");
		set.add("ibatis");
		
		int size = set.size();
		System.out.println("총 객체수: "+set.size());

		Iterator<String>iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		set.remove("jdbc");
		set.remove("ibatis");
		System.out.println("총 객체수: "+set.size());
		for(String element:set) {
			System.out.println(element);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("비어었습니다.");}
	}
}
