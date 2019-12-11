package parser;

import scanner.*;
import environment.*;
import java.io.*;
/**
 * The Tester class
 * 
 * @author Aaron Lo
 * @version 9-6-19
 */
public class Tester
{
    /**
     * Main method, runs the tester
     * @param args no idea
     */
    public static void main(String[] args) throws IOException
    {
        File[] files = (new File("testFile")).listFiles();
        int counter = 1;
        String specific = "NO";
        for(int i = 0; i < files.length; i++)
        {
            String name = files[i].getName();
            if(name.length() < 2 && !name.substring(0, 2).equals("wq"))
                continue;
            if(!specific.equals("NO") && !name.equals(specific))
                continue;
            System.out.println("Running test number " + counter + ": "+ 
                    name.substring(0, name.indexOf(".") == -1 ? 
                        name.length() : name.indexOf(".")));
            Parser p = new Parser(new Scanner(new FileInputStream("testFile/" + name)));
            Environment env = new Environment();
            p.parseProgram().run(env);
            counter++;
            System.out.println("---------------------");
            System.out.println("");
        }
    }
}
