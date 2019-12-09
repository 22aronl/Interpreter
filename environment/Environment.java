package environment;

import java.util.*;
import ast.*;
/**
 * The Environment class
 * 
 * @author Aaron Lo
 * @version 12-6-19
 */
public class Environment
{
    private HashMap<String, Value> map;
    /**
     * Constructor for objects of class Environment
     */
    public Environment()
    {
        map = new HashMap<String, Value>();
    }
    
    /**
     * Assigns the Variables
     * @param name the name of the variable
     * @param v the value the variable should contain
     */
    public void assignVariable(String name, Value v)
    {
        map.put(name, v);
    }
    
    /**
     * This gets the balue of the Variable
     * @param name hte name of the variable
     * @return the variable's value
     */
    public Value takeVariable(String name)
    {
        return map.get(name);
    }

}
