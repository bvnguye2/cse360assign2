/* Author: Brandon Nguyen
 * 
 * Class ID: 124
 * 
 * Assignment 2
 * 
 * Description: This program creates and array and a count. Integers in the array can be added, removed, searched, and printed out. Count 
 * keeps track of the number of integers in the array.
 * 
 * Github URL: https://github.com/bvnguye2/cse360assign2
 */

/**
 * The SimpleList class adds and removes integers to an array, returns the count of integers in the array, prints out the contents of the array
 * and returns the location of an integer in the array.
 */
public class SimpleList {
	
	private int[] list;
	private int count;
	
	
	/**
	 * SimpleList constructor class that initializes list to an array of size 10 and count to 0
	 * 
	 */
	public SimpleList() //constructor class that initializes list and count
	{
		list = new int[10]; //initialize an array of size 10
		count = 0; // initialize count to 0
	}
	
	
	/**
	 * Add class adds an integer to the first spot of an array and shifts the other integers back one and increases the size of the array if the array is full
	 * @param insert the integer being inserted into the array
	 */
	public void add(int insert)
	{
		int increaseSize = list.length;
		if(count == list.length) //if the array is full increaseSize is 1.5 times the size of the array
		{
			increaseSize = increaseSize + increaseSize/2;
		}
		
		int[] temp = new int[increaseSize]; //creates a temporary array
		temp[0] = insert; //adds the new integer to the beginning of the temporary array
		
		for(int index = 1; index < list.length; index++)
		{
			temp[index] = list[index - 1]; //adds the contents of list array after the newly added integer
		}
		
		count++;
		list = temp; //copy to temporary array to list
	}
	
	
	/**
	 * Remove class removes an integer if it is within the array and decreases the size of the array by 25% if the array is more that 25% empty
	 * @param exit the integer being removed from the array
	 */
	public void remove(int exit)
	{
		final int SMALLEST = 1; //smallest size array can be
		
		for(int index = 0; index < list.length; index++) //iterates through the array
		{
			if(exit == list[index] && index != list.length - 1) //if the integer being removed isn't the last element of the array shift everything over 1
			{
				count--;
				list[index] = list[index + 1];
			}
			else if(exit == list[index] && index == list.length - 1)//if the integer being removed is the last element just set it to 0
			{
				count--;
				list[index] = 0;
			}
		}
		
		if(count < list.length * 3/4 && list.length != SMALLEST) //if the count is less that 75% of the array decrease the size of the array
		{
			int[] temp = new int[list.length * 3/4];
			
			for(int index = 0; index < temp.length; index++)
			{
				temp[index] = list[index];
			}
			
			list = temp;
		}
	}
	
	
	/**
	 * Count class returns the number of integers in the array
	 * @return count the number of integers in the array
	 */
	public int count()
	{
		return count; //return the number of integers in the array
	}
	
	
	/**
	 * ToString class prints out the contents of the array
	 * @return toString the String of all the contents of the array
	 */
	public String toString()
	{
		String toString = "";
		
		for(int index = 0; index < count; index++)
		{
			toString += list[index]; //add the integer to the toString
			if(index != count - 1) //if the integer is not the last one add a space
			{
				toString += " ";
			}
		}
		
		return toString; //return the String of all the integers in the array
	}
	
	
	/**
	 * Looking class returns the location of the integer that is being searched for
	 * @param looking the integer being searched for in the array
	 * @return location the integer of the index of the looking parameter
	 */
	public int search(int looking)
	{
		int location = -1;
		for(int index = 0; index < list.length; index++)
		{
			if(list[index] == looking) //if the int is found return the location
			{
				location = index;
			}
		}
			
		return location; //return -1 if not found
	}
	
	/**
	 * Append adds the integer to the end of the class and increase the size of the array by 50% if the array is full
	 * @param append is the integer being added to the end of the array
	 */
	public void append(int append)
	{
		int increaseSize = list.length;
		if(count == list.length) //increases the size of the array if it is full
		{
			increaseSize = list.length + list.length/2;
		}
		
		int[] temp = new int[increaseSize];
		
		for(int index = 0; index < list.length; index++)
		{
			temp[index] = list[index];
		}
		
		temp[count] = append;
		list = temp;
	}
	
	/**
	 * First class returns the number at the front of the array
	 * @return the first integer in the array
	 */
	public int first() 
	{
		if(count == 0)
		{
			return -1;
		}
		
		return list[0];
	}
	
	/**
	 * Last class returns the number at the end of the array
	 * @return the last integer in the array
	 */
	public int last() 
	{
		if(count == 0)
		{
			return -1;
		}
		
		return list[count - 1];
	}
	
	/**
	 * Size class returns the current size of the array
	 * @return the current size of the array as an integer
	 */
	public int size()
	{
		return list.length;
	}
	
	
	
}
