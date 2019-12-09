package ast;


/**
 *  
 * 
 * @author Aaron Lo
 * @version 
 */
public class Expression extends Value
{
    private AddExpr exp1;
    private String relop;
    private Expression exp2;
    /**
     * Constructor for objects of class Expression
     */
    public Expression(AddExpr exp1, Expression exp2, String relop)
    {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.relop = relop;
    }
}
