package codingTest.goormlevel.tree;

import java.util.TreeSet;

public class PreorderTraversal {

	public static void main(String[] args) throws Exception {

		int[] arr = {6,3,9,1,5,7,11};
		
		TreeSet set = new TreeSet();
		
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		System.out.print(set.headSet(12));
		
	}

}
