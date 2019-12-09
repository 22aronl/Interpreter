package ast;


/**
 *  
 * 
 * @author Aaron Lo
 * @version 
 */
public class MultExpr
{
    private NegExpr exp1;
    private String op;
    private MultExpr exp2;
    /**
     * Constructor for objects of class MultExpr
     */
    public MultExpr(NegExpr exp1, MultExpr exp2, String op)
    {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.op = op;
    }
}
