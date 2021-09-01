package com.bridgelabz.linkedlist;

public interface INodeIF<K> {
	K getKey();

	void setKey(K key);

	INodeIF<K> getNext();

	void setNext(INodeIF<K> next);
}
