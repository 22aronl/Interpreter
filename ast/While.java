package ast;

import environment.*;
/**
 *  A while loop
 * 
 * @author Aaron Lo
 * @version 12-9-19
 */
public class While extends Statement
{
    private Expression expression;
    private Program program;
    /**
     * Constructor for objects of class While
     * @param e the xpression (condition)
     * @param p program to be run
     */
    public While(Expression e, Program p)
    {
        expression = e;
        program = p;
    }
    
    /**
     * Runs the while loop
     * @param env the environment
     */
    public void run(Environment env)
    {
        while(expression.eval(env).getBooleanValue())
            program.run(env);
    }
}
