import java.util.*;
public class letterBag {
	private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private int[] frequencies;
	private Node firstNode;
	private int numOfItems;
	public letterBag() {
		frequencies = new int[26];
		firstNode = null;
		numOfItems = 0;
	}
	
	private class Node{
		private letterBag data;
		private int frequency;
		private Node next;
		
		@SuppressWarnings("unused")
		private Node(final letterBag Data, final Node nextNode) {
			data = Data;
			next = nextNode;
			frequency=1;
		}
		
		public Node(final String letters, final Node tempNode) {
		}

		private void addF() {
			frequency++;
		}
		
		private int getF() {
			return frequency;
		}
	}
	
	
	
	
	

	public void add(String letters) {
		String lower = letters.toLowerCase();
		int index = getIndexForLetters(lower);
		frequencies[index]++;
		
	}
	
	public int getFrequencyOf(String string) {
		Node currNode = firstNode;
		while (currNode!=null) {
			if(currNode.data.equals(string)) {
				return currNode.getF();
			}
		}
		return 0;
	}
	
	public int getMax() {
		if(firstNode!=null) {
			Node currNode = firstNode;
			Node maxNode = firstNode;
			while(currNode!=null) {
				if(currNode.getF()>=maxNode.getF()) {
					maxNode=currNode.next;
				}
				return maxNode.getF();
			}
		} else {
		return 0;
		}
		return 0;
	}
	
	public void clear() {
		firstNode = null;
		numOfItems = 0;
	}
	
	public int size() {
		return numOfItems;
	}
	
	public void remove(String letters) {
		String lower = letters.toLowerCase();
		int index = getIndexForLetters(lower);
		frequencies[index]--;
	}
	
	
	
	private int getIndexForLetters(String lower) {
		return alphabet.indexOf(lower);
	}
}
