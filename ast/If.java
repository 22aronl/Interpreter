package ast;


/**
 *  
 * 
 * @author Aaron Lo
 * @version 
 */
public class If extends Statement
{
    private Expression expression;
    private Program program1;
    private Program program2;
    /**
     * Constructor for objects of class If
     */
    public If(Expression e, Program one, Program two)
    {
        expression = e;
        program1 = one;
        program2 = two;
    }
}
