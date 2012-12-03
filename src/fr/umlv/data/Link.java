package fr.umlv.data;


class Link<E> implements Node{
	final E element;
	final Link<E> next;

	Link (E text, Link<E> next) {
		this.element = text;
		this.next = next;
	}

	@Override
	public E current() {
		return element;
	}

	@Override
	public Node next() {
		return next;
	}

}
prout
