package parser;

import scanner.*;
import java.io.*;
/**
 * The Tester class
 * 
 * @author Aaron Lo
 * @version 9-6-19
 */
public class Tester
{
    public static void main(String[] args) throws IOException
    {
        File[] files = (new File("testFile")).listFiles();
        int counter = 1;
        for(int i = 0; i < files.length; i++)
        {
            String name = files[i].getName();
            if(name.length() < 6 && !name.substring(0, 2).equals("wq"))
                continue;
            System.out.println("Running test number " + counter + ": "+ name.substring(0, name.indexOf(".") == -1 ? 
                        name.length() : name.indexOf(".")));
            Parser p = new Parser(new Scanner(name));
            p.parseProgram();
            counter++;
            System.out.println("---------------------");
            System.out.println("");
        }
    }
}
