package threads_collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> h = new HashSet<>();
		h.add("Sonali");
		h.add("Sonal");
		h.add("Shreya");
		h.add("Priya");
		h.add("Ram");
		h.add("Sam");
		h.add("Sonali");
		
		Iterator<String> itr = h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
