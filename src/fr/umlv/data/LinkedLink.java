package fr.umlv.data;

public class LinkedLink<E>{
	private Link<E> head;
	private int size;
	// no need constructor
	
	public Node<E> getHead(){
		return head;
	}
	public void add(Object text){
		head = new Link(text,head);
		size++;
	}
	
	public int size(){
		return size;
	}

	
	@Override
	public String toString(){
		String separator = "";
		StringBuilder builder = new StringBuilder();
		for(Link<E> l = head; l != null; l = l.next){
			builder.append(separator).append(l.element);
			separator = " ";
		}
		//if(head!= null){
		//builder.setlength(builder.length()-1);
		//}
		return builder.toString();
	}
	
	/*
	public String get(int index){
		if (index < 0){
			throw new IndexOutOfBoundsException();
		}
		Link l = head;
		for( ; l != null; l = l.next)
			if(index -- == 0)
				return l.element;
		throw new IndexOutOfBoundsException();
	}
	*/
	public E get(int index){
		if (index < 0 || index >= size()){
			throw new IndexOutOfBoundsException();
		}
		Link<E> l = head;
		for( ; l != null; l = l.next)
			if(index -- == 0)
				return l.element;
		throw new AssertionError();
	}
}
