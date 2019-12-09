package ast;

import environment.*;

/**
 *  An if class, This will run program1 if expression is true, otherwise program2
 * 
 * @author Aaron Lo
 * @version 12-9-19
 */
public class If extends Statement
{
    private Expression expression;
    private Program program1;
    private Program program2;
    /**
     * Constructor for objects of class If
     * @param e the expression to bve evaluated
     * @param one the programnumber one
     * @param two the program number two
     * 
     */
    public If(Expression e, Program one, Program two)
    {
        expression = e;
        program1 = one;
        program2 = two;
    }
    
    /**
     * This runs the if statement
     * @param env the environment inwhich it runs
     */
    public void run(Environment env)
    {
        if(expression.eval(env).getBooleanValue())
        {
            program1.run(env);
            return;
        }
        
        if(program2 != null)
            program2.run(env);
    }
}
