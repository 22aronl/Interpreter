package ast;

import environment.*;
/**
 * The abstract class Value, this is suppose to hold any certain value the test uses
 * 
 * @author Aaron Lo
 * @version 9-6-19
 */
public abstract class Value
{
    /**
     * This will evaluate this class to a Value
     * @param env the environment
     * @return the value in which it is evaluated
     */
    public abstract Value eval(Environment env);
    
    /**
     * This gets the value of the class
     * @return the value in integer form
     */
    public int getValue()
    {
        throw new RuntimeException();
    }
    
    /**
     * This gets the value of the class in boolean form
     * @return the value in boolean form
     */
    public boolean getBooleanValue()
    {
        throw new RuntimeException();
    }
    
    /**
     * The to string method
     * @return the string value of the class
     */
    @Override
    public String toString()
    {
        throw new RuntimeException();
    }
}
