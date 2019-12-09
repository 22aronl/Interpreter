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
    
    public Value eval(Environment env)
    {
        throw new RuntimeException();
    }
}
