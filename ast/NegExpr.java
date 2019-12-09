package ast;

import environment.*;
/**
 * This can potentailly negative the following expression
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
     * @param value the value it holds
     * @param op the operator either + or -
     */
    public NegExpr(Value value, String op)
    {
        this.value = value;
        this.op = op;
    }

    /**
     * This will evaluate the neg expression, if the op is - this will negative everything
     *  Otherwise false
     *  @param env the environment
     *  @return the value
     */
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
