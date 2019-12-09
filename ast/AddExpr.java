package ast;

import environment.*;
/**
 *  This is addExpr in which it adds together a MultExpr and a potentiall AddExpr
 * 
 * @author Aaron Lo
 * @version 12-9-19
 */
public class AddExpr
{
    private MultExpr exp1;
    private String op;
    private AddExpr exp2;
    /**
     * Constructor for objects of class AddExpr
     * @param exp1 the multExpr for language
     * @param exp2 the addexp
     * @param op the operator either + or -
     */
    public AddExpr(MultExpr exp1, AddExpr exp2, String op)
    {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.op = op;
    }
    
    /**
     * Evaluates this addExpr
     * @param env the environment
     * @return the value of addExpr
     */
    public Value eval(Environment env)
    {
        int a = exp1.eval(env).getValue();
        if(exp2 == null)
            return new Number(a);
        int b = exp2.eval(env).getValue();
        if(op.equals("+"))
            return new Number(a + b);
        else
            return new Number(a - b);
    }
}
