package ast;

import environment.*;
/**
 * 
 * 
 * @author Aaron Lo
 * @version 9-6-19
 */
public abstract class Value
{
    public abstract Value eval(Environment env);
}
