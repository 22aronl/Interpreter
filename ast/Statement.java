package ast;

import environment.*;
/**
 *  
 * 
 * @author Aaron Lo
 * @version 
 */
public abstract class Statement
{
    public abstract void run(Environment env);
}
