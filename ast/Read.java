package ast;

import java.util.*;
import environment.*;
/**
 *  Reads in a value
 * 
 * @author Aaron Lo
 * @version 12-9-19
 */
public class Read
{
    private String variable;
    /**
     * Constructor for objects of class Read
     * @param b the variable to be set
     */
    public Read(String b)
    {
        variable = b;
    }
    
    /**
     * Runs the read method
     * @param env the environment
     */
    public void run(Environment env)
    {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        Value v = null;
        if(k.equals("true") || k.equals("false"))
            v = new Boolean(k.equals("true"));
        else
            v = new Number(Integer.parseInt(k));
            
        env.assignVariable(variable, v);
    }
}

