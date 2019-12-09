package ast;

import environment.*;
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
    
    public Value eval(Environment env)
    {
        int a = exp1.eval(env).getValue();
        if(exp2 == null)
            return new Number(a);
            
        int b = exp2.eval(env).getValue();
        if(op.equals("*"))
            return new Number(a * b);
        else
            return new Number(a / b);
    }
    
}
