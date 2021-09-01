package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {

	public INodeIF<K> head;
	public INodeIF<K> tail;
	
	public MyLinkedList() 
	
	{
		this.head=null;
		this.tail=null;
		
	}
	public boolean isEmpty()
	{
		if(this.head==null && this.tail==null)
		{
			return true;
		}
		else
			return false;

	}
	public void  addNode(INodeIF<K> newNode)
	{
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		if(this.head==null)
		{
			this.head=newNode;
		}
		else
		{
			INodeIF<K> tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
		
	}
	public void appendNode(INodeIF<K> newNode)
	{
		if(this.head==null)
		{
			this.head=newNode;
		}
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		else
		{
			
			
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
		
		
	}
	
	public void insertNode(INodeIF<K> myNode,INodeIF<K> newNode)
	{
		INodeIF<K> tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		
		
	}
	
	public INodeIF<K> pop()
	{
		
		INodeIF<K> tempNode=head;
		this.head=head.getNext();
		if(this.head==null) {
			this.tail = null;
		}
		return tempNode;
		
	}
	public INodeIF<K> popLast()
	{
		INodeIF<K> tempNode= head;
		while(tempNode.getNext()!=tail)
		{
			
			tempNode=tempNode.getNext();
			
		}
		this.tail=tempNode;
		this.tail.setNext(null);
		tempNode=tempNode.getNext();
		if(this.tail==null) {
			this.head = null;
		}
		return tempNode;
		
	}
	
	public INodeIF<K> search(K key)
	{
		INodeIF<K> tempNode = head;
		INodeIF<K> requiredNode=null;
		while(tempNode.getNext()!=null && tempNode.getKey()!=key)
		{
			
			
			tempNode=tempNode.getNext();
		}
		if(tempNode.getKey()==key)
		{
			requiredNode=tempNode;
		}
		
		
		return requiredNode;
		
		
	}
	public boolean insertAfterGivenKey(K key,MyNodeImpl<K> newNode) {
		if(this.search(key)!=null) {
			this.insertNode(this.search(key), newNode);
			return true;
		} else {
			return false;
		}
	}
	public INodeIF<K> deleteGivenKeyNode(K key)
	{
		INodeIF<K> tempNode=search(key);
		
		if(tempNode==head)
		{
			tempNode=pop();
		}
		else if(tempNode==tail)
		{
			tempNode=popLast();
		}
		else
		{
			INodeIF<K> previousNode=head;
			while(previousNode.getNext()!=tempNode)
			{
				tempNode=tempNode.getNext();
			}
			
			previousNode.setNext(tempNode.getNext());
			
		}
		return tempNode;
		
	}
	public int size()
	{
		int listSize=0;
		INodeIF<K> tempNode=head;
		if(tempNode!=null)
		while(tempNode!=tail)
		{
			listSize++;
			tempNode=tempNode.getNext();
			
		}
		listSize++;
		
		return listSize;
	}
	public void  printNodes()
	{
		
		StringBuffer myNodes = new StringBuffer("My nodes are: ");
		INodeIF<K> tempNode= head;
		while(tempNode.getNext()!=null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append(" -> ");
			tempNode=tempNode.getNext();
			
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
}
	
