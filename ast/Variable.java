package ast;

import environment.*;
/**
 * A Variable -> contains the variable name
 * 
 * @author Aaron Lo
 * @version 12-9-19
 */
public class Variable extends Value
{
    private String name;
    /**
     * Constructor for objects of class Variable
     * @param name the variables name
     */
    public Variable(String name)
    {
        this.name = name;
    }
    
    /**
     * Evaluates the variable
     * @param env the environment
     * @return the value of the variable
     */
    public Value eval(Environment env)
    {
        return env.takeVariable(name);
    }
}
