package cse360assign2;

/*
 *  <h1> Calculator </h1>
 * 
 * <p>
 * The calculator class represents a object that can 
 * perform basic arithmetic operations
 * 
 * @author Stone Gulliksen
 * @version 1.0 (initial version)
 * @since 02/16/2019
 */
public class calculater {
	
	
	/* primitive integer value to represent the total returned
	 * within the calculations performed in the following functions
	 */
	private int total;
	
	/**
	 * This constructor represents the calculator 
	 * with the total integer variable being initialized to 
	 * zero within it
	 */
	public calculater () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 
	 * This method getTotal is used to return the integer
	 * value that is represented by variable 'total'
	 * @return 0 integer being returned from function at time
	 */
	public int getTotal () 
	{
		return 0;
	}
	
	/**
	 * This is the add method that will perform the arithmetic operation
	 * Addition which will increase the total value by the amount of the integer
	 * passed in
	 * @param integer value being passed to be added onto the total
	 */
	public void add (int value)
	{
		
	}
	
	/**
	 * This is the subtract method that will perform the arithmetic operation
	 * Subtraction using a value as its parameter with the total being decreased 
	 * by said value
	 * @param integer value being passed in to subtract total by
	 */
	public void subtract (int value) 
	{
		
	}
	
	/**
	 * This is the multiply method that will perform the arithmetic operation
	 * Multiplication using a value as its parameter with the total being multiplied 
	 * by the given value
	 * @param value being passed to multiply the total by
	 */
	public void multiply (int value) 
	{
		
	}
	
	/**
	 * This is the divide method that will perform the arithmetic operation
	 * Division using a value as its parameter. Total will be divided by the value passed in 
	 * @param value being passed to divide the total by
	 */
	public void divide (int value)
	{
		
	}
	
	/**
	 * This is the getHistory method that will return a String representation
	 * containing previous calculations performed
	 * @return String representation of previous calculations performed
	 */
	public String getHistory ()
	{
		return "";
	}
}
