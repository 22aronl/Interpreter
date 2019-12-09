package ast;

import environment.*;
/**
 *  This displays the expression give to it
 *  
 * 
 * @author Aaron Lo
 * @version 12-9-19
 */
public class Display extends Statement
{
    private Expression display;
    private Read read;
    /**
     * Constructor for objects of class Display
     * @param d the xpression to display
     * @param r the read class
     */
    public Display(Expression d, Read r)
    {
        display = d;
        read = r;
    }

    /**
     * Runs this display by printing to consol
     * @param env the environment in which everything operates
     */
    public void run(Environment env)
    {
        System.out.println(display.eval(env));
        if(read != null)
            read.run(env);
    }
}
