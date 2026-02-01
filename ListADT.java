/**
 * File Name: ListADT.java
 * Author: Michelle Jiang 
 * Date Created: 2026-01-30
 * Purpose: This interface is an Abstract Data Type for the List type. The interface would guide a user on how a ListADT object will be created with methods, exceptions and return types. 
 * Creation of Object: A ListADT object would be created using the parameter (E indicating the type of element in the list) with initial size being zero (ie empty) and initial capacity of 10. Can also initialize with specified intial capacity. As such, the initial state of the list would be new List with a specific element. 
 * 
 */
interface ListADT<E> { 

    /**
     * Adds element to existing list. 
     * @param element the element to be added to the ListADT object
     */
    void add(E element); 

    /**
     * Queries number of elements in list. If empty, returns zero. 
     * @return size of list. 
     */
    int size(); 

    /**
     * Accesses element at a given index. 
     * @param index the index to query
     * @exception IndexOutOfBoundsException when index does not exist in list
     * @return value at specified index
     */
    E get(int index); 

    /**
     * Removes item from list at given index. 
     * @param index the index to query
     * @exception IndexOutOfBoundsException when index does not exist in list
     */
    void remove(int index);
}