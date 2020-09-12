import java.util.*;
public class week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letterBag bag = new letterBag();
		
		
		bag.clear();
		bag.add("a");
		bag.add("a");
		bag.add("b");
		bag.add("b");
		bag.add("c");
		bag.add("c");
		bag.add("d");
		bag.add("d");
		bag.add("e");
		bag.add("e");
		bag.remove("e");
		bag.remove("e");
		
		System.out.println("the frequency of a is " + bag.getFrequencyOf("a"));
		System.out.println("the max capacity of the bag is " + bag.getMax());
		System.out.println("the bag size is " + bag.size());
		
		

	}

}
