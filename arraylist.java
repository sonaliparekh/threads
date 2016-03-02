package threads_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sonali");
		al.add("Shreya");
		al.add("Priya");
		al.add("Ankit");
		al.add("Ram");
		al.add("Sonali");
		
		Iterator il = al.iterator();
		while(il.hasNext())
		{
			
			System.out.println(il.next());
		}
	}

}
