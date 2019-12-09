package ast;

import java.util.*;
import environment.*;
/**
 *  
 * 
 * @author Aaron Lo
 * @version 
 */
public class Read
{
    private String variable;
    /**
     * Constructor for objects of class Read
     */
    public Read(String b)
    {
        variable = b;
    }
    
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

