package RodrigoPackage2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionExample {

	public static void main(String[] args) {
		
		// HashSet: duplicate not allowed; random order.
		System.out.println("HashSet");
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(122);
		hs1.add(444);
		hs1.add(554);
		hs1.add(4);
		hs1.add(10);
		hs1.add(555);
		hs1.add(122);
		
		for (Integer i : hs1) {
			System.out.println(i);
		}
		System.out.println("###########################");
		
		
		// LinkedHashSet: duplicate not allowed; Maintains the order.
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> hs2 = new LinkedHashSet<Integer>();
		hs2.add(122);
		hs2.add(444);
		hs2.add(554);
		hs2.add(4);
		hs2.add(10);
		hs2.add(555);
		hs2.add(122);
		
		for (Integer i : hs2) {
			System.out.println(i);
		}
		System.out.println("###########################");
		
		
		// TreeSet: duplicate not allowed; Maintains order.
		System.out.println("TreeSet");
		TreeSet<Integer> hs3 = new TreeSet<Integer>();
		hs3.add(122);
		hs3.add(444);
		hs3.add(554);
		hs3.add(4);
		hs3.add(10);
		hs3.add(555);
		hs3.add(122);
				
		for (Integer i : hs3) {
			System.out.println(i);
		}
		System.out.println("###########################");
		
		
		// ArrayList: duplicate allowed; Maintains order.
		System.out.println("ArrayList");
		ArrayList<Integer> hs4 = new ArrayList<Integer>();
		hs4.add(122);
		hs4.add(444);
		hs4.add(554);
		hs4.add(4);
		hs4.add(10);
		hs4.add(555);
		hs4.add(122);
					
		for (Integer i : hs4) {
			System.out.println(i);
		}
		System.out.println("###########################");

		
		// LinkedList: duplicate allowed; Ascending order.
		System.out.println("LinkedList");
		LinkedList<Integer> hs5 = new LinkedList<Integer>();
		hs5.add(122);
		hs5.add(444);
		hs5.add(554);
		hs5.add(4);
		hs5.add(10);
		hs5.add(555);
		hs5.add(122);
					
		for (Integer i : hs4) {
			System.out.println(i);
		}
		System.out.println("###########################");
		
		
		// HashMap: random order
		System.out.println("HashMap");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(112, "Automation");
		hm.put(222, "SDET");
		hm.put(1233, "Cypress");
		hm.put(4444, "APIs");
		hm.put(5555, "Devops");
	
		Set<Integer> allkeys = hm.keySet();
		
		for (Integer i : allkeys) {
			System.out.println("key is " + i);
			System.out.println("value is " + hm.get(i));
		}
		System.out.println("###########################");
		
		
		// LinkedHashMap: Maintains order
		System.out.println("LinkedHashMap");
		LinkedHashMap<Integer, String> hm2 = new LinkedHashMap<Integer, String>();
		hm2.put(112, "Automation");
		hm2.put(222, "SDET");
		hm2.put(1233, "Cypress");
		hm2.put(4444, "APIs");
		hm2.put(5555, "Devops");
	
		Set<Integer> allkeys2 = hm2.keySet();
		
		for (Integer i : allkeys2) {
			System.out.println("key is " + i);
			System.out.println("value is " + hm2.get(i));
		}
		System.out.println("###########################");

		
		
		// TreeMap: Ascending order
		System.out.println("TreeMap");
		TreeMap<Integer, String> hm3 = new TreeMap<Integer, String>();
		hm3.put(112, "Automation");
		hm3.put(222, "SDET");
		hm3.put(1233, "Cypress");
		hm3.put(4444, "APIs");
		hm3.put(5555, "Devops");
	
		Set<Integer> allkeys3 = hm3.keySet();
		
		for (Integer i : allkeys3) {
			System.out.println("key is " + i);
			System.out.println("value is " + hm3.get(i));
		}	
	}
}
