package fr.umlv.data.main;
// STRINGBUILDER = BOUCLE SINON NON

import fr.umlv.data.*;


public class Main {
	
	public static <E> int textSum(LinkedLink<E> l){

		int sum = 0;
		for(Node node = l.getHead(); node != null;node = node.next()){
			sum += ((String) node.current()).length();
		}
		return sum;
	}
	public static void main(String[] args) {
		LinkedLink test = new LinkedLink();
		test.add("prout");
		
		test.add("hi");
		test.add("I");
		test.add("test");
		test.add("prout");
		System.out.println(test);
		
		System.out.println(test.get(3));
	}
}