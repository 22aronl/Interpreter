package ast;

import environment.*;
/**
 * 
 * 
 * @author Aaron Lo
 * @version 9-6-19
 */
public class Number extends Value
{
    private int num;
    /**
     * Constructor for objects of class Number
     */
    public Number(int num)
    {
        this.num = num;
    }
    
    public String toString()
    {
        return num + "";
    }
    
    public boolean getBooleanValue()
    {
        return num != 0;
    }
    
    public int getValue()
    {
        return num;
    }
    
    public Value eval(Environment env)
    {
        return this;
    }
}
