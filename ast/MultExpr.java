package ast;

import environment.*;
/**
 *  This the an MultExpr that is combination of negExpr + multExpr
 * 
 * @author Aaron Lo
 * @version 12-9-19
 */
public class MultExpr
{
    private NegExpr exp1;
    private String op;
    private MultExpr exp2;
    /**
     * Constructor for objects of class MultExpr
     * @param exp1 an Neg Expression
     * @param exp2 the multiple Exp2
     * @param op the operator that can either be * or /
     */
    public MultExpr(NegExpr exp1, MultExpr exp2, String op)
    {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.op = op;
    }
    
    /**
     * This evaluates the mult experssion
     * @param env the environment
     * @return the value it equals
     */
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
