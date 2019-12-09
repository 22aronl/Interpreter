package ast;

import environment.*;
/**
 * This is a value that holds a boolean
 * 
 * @author Aaron Lo
 * @version 9-6-19
 */
public class Boolean extends Value
{
    private boolean val;
    /**
     * Constructor for objects of class Boolean
     * @param value the value of the boolean
     */
    public Boolean(boolean value)
    {
        val = value;
        
    }
    
    /**
     * The to string of the this value
     * @return the string value of the boolean
     */
    @Override
    public String toString()
    {
        return val + "" ;
    }
    
    /**
     * This gets the boolean value of this class
     * @return val
     */
    public boolean getBooleanValue()
    {
        return val;
    }
    
    /**
     * This gets the integer value of the boolean, 1 is true and 0 is false
     * @return the value 
     */
    public int getValue()
    {
        return val ? 1:0;
    }
    
    /**
     * This evaluates this to a value class
     * @param env the environment
     * @return the value of this boolean
     */
    public Value eval(Environment env)
    {
        return this;
    }
}
