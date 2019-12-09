package ast;

import environment.*;
/**
 *  The statement class -> any structures
 * 
 * @author Aaron Lo
 * @version 12-9-19
 */
public abstract class Statement
{
    /**
     * Runs the statement
     * @param env the environment
     */
    public abstract void run(Environment env);
}
