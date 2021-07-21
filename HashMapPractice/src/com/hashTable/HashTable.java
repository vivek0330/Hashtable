package com.hashTable;

public class HashTable {
	public static void main(String[] args) {
		System.out.println("******************************************");
		System.out.println("*    Welcome to the hash table program   *");
		System.out.println("******************************************");
		System.out.println("\n");
		// Creating object as hashCode for LinkedList class
		LinkedList<String, Integer> list = new LinkedList<String, Integer>();
		String message = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

		// String to String[] conversion.
		String[] messageArray = message.toLowerCase().split(" ");
		// Here we are Iterating within the array
		for (String word : messageArray) {
			// Search for the word in the linked list
			Integer value = list.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			list.add(word, value);

		}
		// Display the linked list
		System.out.println(list);
		System.out.println("\n");

		// Create remove method
		list.replace("avoidable");
		System.out.println("************************************");
		System.out.println("*    After replace method call ::  *");
		System.out.println("************************************");
		System.out.println("\n" + list);
	}
}
