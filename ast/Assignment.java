package ast;

import environment.*;
/**
 *  This Assignment class assigns the value of hte expression to the variable name
 * 
 * @author Aaron Lo
 * @version 12-9-19
 */
public class Assignment extends Statement
{
    private String name;
    private Expression expression;
    /**
     * Constructor for objects of class Assingment
     * @param n the variables name
     * @param e the expression
     */
    public Assignment(String n, Expression e)
    {
        name = n;
        expression = e;
    }
    
    /**
     * This assigns value to the variable
     * @param env the Environment
     */
    public void run(Environment env)
    {
        env.assignVariable(name, expression.eval(env));
    }
}
