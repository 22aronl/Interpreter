package ast;


/**
 *  
 * 
 * @author Aaron Lo
 * @version 
 */
public class While extends Statement
{
    private Expression expression;
    private Program program;
    /**
     * Constructor for objects of class While
     */
    public While(Expression e, Program p)
    {
        expression = e;
        program = p;
    }
}
