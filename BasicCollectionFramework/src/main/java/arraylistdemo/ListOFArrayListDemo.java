package arraylistdemo;


import java.util.ArrayList;
import java.util.List;

public class ListOFArrayListDemo {
	/*
	 * 1. Basic Methods:

    add(E e): Appends the specified element to the end of this list.
    add(int index, E element): Inserts the specified element at the specified position in this list.
    get(int index): Returns the element at the specified position in this list.
    set(int index, E element): Replaces the element at the specified position in this list with the specified element.
    remove(int index): Removes the element at the specified position in this list.
    remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.
    clear(): Removes all elements from the list.
    isEmpty(): Returns true if the list contains no elements.
    size(): Returns the number of elements in the list.
    contains(Object o): Returns true if the list contains the specified element.
    indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 if it is not found.
    lastIndexOf(Object o): Returns the index of the last occurrence of the specified element, or -1 if it is not found.
    toArray(): Returns an array containing all elements in this list in proper sequence.
    toArray(T[] a): Returns an array containing all elements in this list in proper sequence, with the runtime type of the returned array being that of the specified array.

2. Iterating Methods:

    iterator(): Returns an iterator over the elements in this list.
    listIterator(): Returns a list iterator over the elements in this list.
    listIterator(int index): Returns a list iterator over the elements in this list, starting at the specified position.

3. Bulk Operations:

    addAll(Collection<? extends E> c): Appends all elements in the specified collection to the end of this list.
    addAll(int index, Collection<? extends E> c): Inserts all elements from the specified collection into the list at the specified position.
    removeAll(Collection<?> c): Removes all elements from the list that are also contained in the specified collection.
    retainAll(Collection<?> c): Retains only the elements in this list that are contained in the specified collection.
    containsAll(Collection<?> c): Returns true if this list contains all elements in the specified collection.

4. Sorting and Replacing Methods:

    sort(Comparator<? super E> c): Sorts the list according to the specified Comparator.
    replaceAll(UnaryOperator<E> operator): Replaces each element of the list with the result of applying the operator to that element.
    removeIf(Predicate<? super E> filter): Removes all elements of the list that satisfy the given predicate.

5. Miscellaneous:

    clone(): Returns a shallow copy of this ArrayList.
    equals(Object o): Compares the specified object with this list for equality.
    hashCode(): Returns the hash code value for this list.
    ensureCapacity(int minCapacity): Increases the capacity of this ArrayList instance, if necessary, to ensure it can hold at least the number of elements specified by the minimum capacity argument.
    trimToSize(): Trims the capacity of this ArrayList instance to be the list's current size.

6. Stream Methods (Java 8 and Later):

    stream(): Returns a sequential Stream with the elements of the list.
    parallelStream(): Returns a possibly parallel Stream with the elements of the list.

These methods provide flexibility for adding, modifying, removing, querying, and iterating through elements in an ArrayList. Let me know if you need examples or explanations for any of these methods!*/
	//1.An ArrayList in Java is a resizable array implementation of the List interface.
		//2.Unlike arrays, which have a fixed size, an ArrayList can dynamically grow or shrink as elements are added or removed. 
		//When i am trying to add the element at the last index of the list  using set method, it is give java.lang.error .because
		/*
		 * Yes, you can add an element to the last index of an ArrayList,
		 *  but instead of using the set() method, you need to use the add() method.
	      The add() method appends the element to the end of the ArrayList. 
	      The set() method replaces an element at a specified index, which will throw an IndexOutOfBoundsException if the index doesn't already exist.*/
		//3.How to Add an Element to the Last Index:
	   //The add() method automatically appends the new element at the end of the list, 
	   //so you don’t need to manage the index manually.
		public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		System.out.println(list);
	// To access the element use get()
		System.out.println(list.get(2));
		//To modify the element using set using index,value
		//list.set(3,"orange"); modify using add method
		list .add(3,"orange");
		System.out.println(list);
		//Removing the element
		System.out.println("Remove element from the list:"+list.remove(2));
		System.out.println("Print  the list:"+list);
		//Iterating Through Elements

//You can iterate through an ArrayList using a loop.
		for(String fruit:list) {
			System.out.println("List of element in the fruit:"+fruit);
		}
		//How to did you handle the dynamic data.
		
		int listOfFruits=list.size();
		for(int i=0;i<listOfFruits;i++) {
			System.out.println("List of element using for loop:"+list.get(i));
		}
	//How to clear all the element in the list
		/*The list.clear() method in Java is used to remove all the elements from an ArrayList. 
		 * However, it does not return a value; it just performs the action of clearing the list. 
		 * Therefore, trying to print list.clear() will result in an error or unexpected output, as clear() has a return type of void.
		 * If you want to clear the list and then print the result, 
		 * you can first call clear() and then print the list to show that it is empty.*/
		list.clear();
		System.out.println("Clear the element in the list:"+list);
		//If you need to check whether the list has been cleared, you can also use list.isEmpty():
         System.out.println("Is the list empty? " + list.isEmpty());
		
		}		
		
}
