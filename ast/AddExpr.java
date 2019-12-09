package ast;


/**
 *  
 * 
 * @author Aaron Lo
 * @version 
 */
public class AddExpr
{
    private MultExpr exp1;
    private String op;
    private AddExpr exp2;
    /**
     * Constructor for objects of class AddExpr
     */
    public AddExpr(MultExpr exp1, AddExpr exp2, String op)
    {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.op = op;
    }
}
