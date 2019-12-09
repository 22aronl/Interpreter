package ast;

import environment.*;
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
    
    public int getValue()
    {
        throw new RuntimeException();
    }
    
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
