package ast;

import environment.*;
/**
 *  
 * 
 * @author Aaron Lo
 * @version 
 */
public class Program
{
    private Statement statement;
    private Program program;
    /**
     * Constructor for objects of class Program
     */
    public Program(Statement s, Program p)
    {
        statement = s;
        program  = p;
    }
    
    public void run(Environment env)
    {
        statement.run(env);
        program.run(env);
    }
}
