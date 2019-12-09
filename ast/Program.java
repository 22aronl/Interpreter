package ast;


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
}
