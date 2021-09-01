package com.bridgelabz.linkedlist;

public class MyNodeImpl<K> implements INodeIF<K> {
	private K key;
	private INodeIF<K> next;

	public MyNodeImpl(K key) {
		super();
		this.key = key;
		this.next = null;
	}

	public INodeIF<K> getNext() {
		return next;
	}

	public void setNext(INodeIF<K> next) {
		this.next = next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}
}
