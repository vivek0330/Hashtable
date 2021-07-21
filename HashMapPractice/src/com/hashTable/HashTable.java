package com.hashTable;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to HashTable program");
        //Creating object as hashCode for LinkedList class
        LinkedList<String, Integer> hashCode = new LinkedList<String, Integer>();
        String message = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        //String to String[] conversion.
        String[] messageArray = message.toLowerCase().split(" ");
        //Here we are Iterating within the array
          for(String word : messageArray) {
            //Search for the word in the linked list
            Integer value = hashCode.get(word);
            if (value == null)
                value = 1;
             else
                value = value + 1;
                hashCode.add(word, value);

          }
        //Display the linked list
        System.out.println(hashCode);
    }
}
