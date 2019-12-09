package ast;

import environment.*;
/**
 * 
 * 
 * @author Aaron Lo
 * @version 
 */
public class Variable extends Value
{
    private String name;
    /**
     * Constructor for objects of class Variable
     */
    public Variable(String name)
    {
        this.name = name;
    }
    
    public int getValue()
    {
        throw new RuntimeException();
    }
    
    public boolean getBooleanValue()
    {
        throw new RuntimeException();
    }
    
    public Value eval(Environment env)
    {
        return env.takeVariable(name);
    }
}
