package com.hashTable;

import java.util.ArrayList;

public class LinkedList<K, V> {
	MyMapNode<K, V> head;
	MyMapNode<K, V> tail;
	private final int numOfBuckets;
	ArrayList<MyMapNode<K, V>> myBucketArray;

	public LinkedList() {
		this.numOfBuckets = 20;
		this.myBucketArray = new ArrayList<>();
		for (int i = 0; i < numOfBuckets; i++)
			this.myBucketArray.add(null);
	}

	// creating add method
	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		MyMapNode<K, V> myNewNode = this.myBucketArray.get(index);
		if (myNewNode == null) {
			myNewNode = new MyMapNode<>(key, value);
			this.myBucketArray.set(index, myNewNode);
		}
		myNewNode = (MyMapNode<K, V>) searchNode(key);
		if (myNewNode == null) {
			myNewNode = new MyMapNode<>(key, value);
			this.append(myNewNode);
		} else {
			myNewNode.setValue(value);
		}
	}

	private int getBucketIndex(K word) {
		int hashCode = Math.abs(word.hashCode());
		int index = hashCode % numOfBuckets;
		return index;
	}

	// Append the value in the linked list
	public void append(MyMapNode<K, V> myNewNode) {
		if (this.head == null)
			this.head = myNewNode;
		if (this.tail == null)
			this.tail = myNewNode;
		else {
			this.tail.setNext(myNewNode);
			this.tail = myNewNode;
		}
	}

	// Searching for the word in the linked list
	public MyMapNode<K, V> searchNode(K data) {
		MyMapNode<K, V> currentNode = head;
		@SuppressWarnings("unused")
		int position = 0;
		while (currentNode != null) {
			position++;
			if (currentNode.getKey().equals(data)) {
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}

	// here we are Searching for the word and getting the value from the linked list
	public V get(K word) {
		int index = this.getBucketIndex(word);
		@SuppressWarnings("unused")
		MyMapNode<K, V> myNewNode = this.myBucketArray.get(index);
		if (this.myBucketArray.get(index) == null)
			return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) searchNode(word);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	// creating remove method
	public void replace(K word) {

		MyMapNode<K, V> currentNode = head;
		MyMapNode<K, V> previousNode = null;
		while (currentNode != null && currentNode.getKey().equals(word)) {
			head = currentNode.getNext();
			return;
		}
		while (currentNode != null && !(currentNode.getKey().equals(word))) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		if (currentNode != null) {
			previousNode.next = currentNode.next;
		}
		if (currentNode == null)
			System.out.println("Word not found!");
	}

	// Print the linked list
	@Override
	public String toString() {
		return "MyLinkedListNodes{" + head + "}";
	}

	public void printNodes() {
		System.out.println("My nodes: " + head);
	}

}
