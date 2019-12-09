package ast;

import environment.*;
/**
 *  The expression class which contains either a boolean or integer
 * 
 * @author Aaron Lo
 * @version 12-9-19
 */
public class Expression extends Value
{
    private AddExpr exp1;
    private String relop;
    private Expression exp2;
    /**
     * Constructor for objects of class Expression
     * @param exp1 the addExpr
     * @param exp2 a secondary exp2, may be null
     * @param relop the way to evalute this expression; (<, >, <=, >=, <>, =)
     */
    public Expression(AddExpr exp1, Expression exp2, String relop)
    {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.relop = relop;
    }
    
    
    /**
     * This evaluates the expression into a Value
     * @param env the environemnt
     * @return the value, either boolean or number
     */
    public Value eval(Environment env)
    {
        Value k = exp1.eval(env);
        if(exp2 == null)
            return k;
            
        Value v = exp2.eval(env);
        
        int a = k.getValue();
        int b = v.getValue();
        if(relop.equals(">"))
            return new Boolean(a > b);
        else if(relop.equals("<"))
            return new Boolean(a < b);
        else if(relop.equals("<="))
            return new Boolean(a <= b);
        else if(relop.equals(">="))
            return new Boolean(a >= b);
        else if(relop.equals("<>"))
            return new Boolean(a != b);
        else if(relop.equals("="))
            return new Boolean(a == b);
        throw new RuntimeException();
    }
}
