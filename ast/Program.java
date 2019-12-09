package ast;

import environment.*;
import java.util.*;
/**
 *  
 * 
 * @author Aaron Lo
 * @version 
 */
public class Program
{
    private Statement s;
    private Program p;
    /**
     * Constructor for objects of class Program
     */
    public Program(Statement s, Program p)
    {
        this.s = s;
        this.p = p;
    }

    public void run(Environment env)
    {
        s.run(env);
        if(p!=null)
            p.run(env);
    }
}
