package ast;


/**
 * 
 * 
 * @author Aaron Lo
 * @version 9-8-19
 */
public class NegExpr
{
    private Value value;
    private String op;
    /**
     * Constructor for objects of class NegExpr
     */
    public NegExpr(Value value, String op)
    {
        this.value = value;
        this.op = op;
    }
}
