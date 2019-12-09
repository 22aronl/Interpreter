package ast;

import environment.*;
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
    
    public Value eval(Environment env)
    {
        if(op.equals("-"))
            if(value instanceof Boolean)
                return new Boolean(!value.getBooleanValue());
            else
                return new Number(-1 * value.getValue());
        return value.eval(env);
    }
}
