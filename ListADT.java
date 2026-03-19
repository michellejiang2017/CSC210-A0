/**
 * File Name: ListADT.java
 * Author: Michelle Jiang 
 * Date Created: 2026-01-30
 * A ListADT is an ordered sequence of elements of a specified type where elements can be accessed, 
 * inserted, and removed by their position in the sequence.
 * 
 * Creation of Object: A ListADT object starts as an empty list with a size of zero and is ready to accept insertions.
 * 
 */
interface ListADT<T> { 

    /**
     * Sets the value at the given index
     * @param index the index whose value is changed
     * @param value the value to change the index to 
     * @return the item that was previously at this position
     * @throws IndexOutOfBoundsException if the index is less than 0 or greater than or equal to the size of the list
     */
    T set(int index, T value); 

    /**
     * Adds element to existing list at the specified index. 
     * @param index the position where the new element should be inserted
     * @param value the element to be added to the ListADT object
     * @throws IndexOutOfBoundsException if the index is less than 0 or greater than the size of the list
     */
    void add(int index, T value); 

    /**
     * Queries number of elements in list. If empty, returns zero. 
     * @return size of list. 
     */
    int size(); 

    /**
     * Tests if a list is empty or not. 
     * @return true if empty, false if has elements
     */
    boolean isEmpty(); 

    /**
     * Accesses element at a given index. 
     * @param index the index to query
     * @throws IndexOutOfBoundsException if the index is less than 0 or greater than or equal to the size of the list
     * @return value at specified index
     */
    T get(int index); 

    /**
     * Removes item from list at given index. 
     * @param index the index to query
     * @throws IndexOutOfBoundsException if the index is less than 0 or greater than or equal to the size of the list
     * @return the element at the index specified
     */
    T remove(int index);
}