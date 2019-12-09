package ast;

import environment.*;
/**
 *  
 * 
 * @author Aaron Lo
 * @version 
 */
public class Assingment extends Statement
{
    private String name;
    private Expression expression;
    /**
     * Constructor for objects of class Assingment
     */
    public Assingment(String n, Expression e)
    {
        name = n;
        expression = e;
    }
    
    public void run(Environment env)
    {
        env.assignVariable(name, expression.eval(env));
    }
}
