package ast;

import environment.*;
/**
 * 
 * 
 * @author Aaron Lo
 * @version 9-6-19
 */
public class Boolean extends Value
{
    private boolean val;
    /**
     * Constructor for objects of class Boolean
     */
    public Boolean(boolean value)
    {
        val = value;
        
    }
    
    public String toString()
    {
        return val + "" ;
    }
    
    public boolean getBooleanValue()
    {
        return val;
    }
    
    public int getValue()
    {
        return val ? 1:0;
    }
    
    public Value eval(Environment env)
    {
        return this;
    }
}
