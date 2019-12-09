package ast;

import environment.*;
/**
 * The number Value
 * 
 * @author Aaron Lo
 * @version 9-6-19
 */
public class Number extends Value
{
    private int num;
    /**
     * Constructor for objects of class Number
     * @param num the number it holds
     */
    public Number(int num)
    {
        this.num = num;
    }
    
    /**
     * Number to STring
     * @return the string ofr hte number
     */
    @Override
    public String toString()
    {
        return num + "";
    }
    
    /**
     * This gets the boolean value of number, false if it equals 0 otherwise true
     * @return the boolean balue of the number
     */
    public boolean getBooleanValue()
    {
        return num != 0;
    }
    
    /**
     * The numberial number of the number
     * @return the nubmer
     */
    public int getValue()
    {
        return num;
    }
    
    /**
     * Evalutates the nubmer
     * @param env the environment
     * @return this class itself
     */
    public Value eval(Environment env)
    {
        return this;
    }
}
