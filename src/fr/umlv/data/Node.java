/*
package fr.umlv.data;

public interface Node {
	public String current();
	public Node next();
	

}
*/

package fr.umlv.data;

public interface Node<E> {
	public E current();
	public Node<E> next();
	

}
