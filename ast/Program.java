package ast;

import environment.*;
import java.util.*;
/**
 * The main block of the language 
 * 
 * @author Aaron Lo
 * @version 12-9-19
 */
public class Program
{
    private Statement s;
    private Program p;
    /**
     * Constructor for objects of class Program
     * @param s the statement
     * @param p the secondary program
     */
    public Program(Statement s, Program p)
    {
        this.s = s;
        this.p = p;
    }

    /**
     * Runs the program
     * @param env the environment
     */
    public void run(Environment env)
    {
        s.run(env);
        if(p!=null)
            p.run(env);
    }
}
