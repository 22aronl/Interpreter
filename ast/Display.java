package ast;

import environment.*;
/**
 *  
 * 
 * @author Aaron Lo
 * @version 
 */
public class Display extends Statement
{
    private Expression display;
    private Read read;
    /**
     * Constructor for objects of class Display
     */
    public Display(Expression d, Read r)
    {
        display = d;
        read = r;
    }

    public void run(Environment env)
    {
        System.out.println(display.eval(env));
        if(read != null)
            read.run(env);
    }
}
