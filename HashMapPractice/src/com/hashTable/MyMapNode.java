package com.hashTable;

public class MyMapNode<K, V> {
	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	// Creating getters and setters
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public MyMapNode<K, V> getNext() {
		return next;
	}

	public void setNext(MyMapNode<K, V> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder nodeString = new StringBuilder();
		nodeString.append("Node{" + "K=").append(key).append(" V=").append(value).append("}");
		if (next != null)
			nodeString.append("\n").append(next);
		return nodeString.toString();
	}
}