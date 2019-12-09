package parser;

import java.util.ArrayList;
import java.util.List;
import scanner.*;
import ast.*;

/**
 * This parses the file and returns what is evaluated
 * 
 * @author aaron Lo 
 * @version 10-1-19
 */
public class Parser
{
    private Scanner sc;
    private String currentToken;
    /**
     * This constructs the parser with the scanner
     * @param sc the scanner
     */
    public Parser(Scanner sc)
    {
        this.sc = sc;
        try
        {
            currentToken = this.sc.nextToken();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * This eats the next token of scanner
     * @param s checks if it is equals
     * @throws IllegalArgumentException if teh current token != s
     */
    private void eat(String s)
    {
        if(!s.equals(currentToken))
            throw new IllegalArgumentException("Does Not Match the Given Token in PARSER :" + 
                s + " " + currentToken);

        try
        {
            currentToken = sc.nextToken();
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    /**
     * This parses the current Number
     * @return the number of current Token
     */
    public ast.Number parseNumber()
    {
        int k = Integer.parseInt(currentToken);
        eat(currentToken);
        return new ast.Number(k);
    }

    /**
     * This parses the Variable
     * @return the variable in the currentToken
     */
    public Variable parseVariable()
    {
        String k = currentToken;
        eat(currentToken);
        return new Variable(k);
    }

    /**
     * Checks if the number is a number
     * @param num the given number in a string
     * @return true if this is a number otherwise flase
     */
    public boolean isNumber(String num)
    {
        try
        {
            Integer.parseInt(num);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    /**
     * Parses the Value in the currentToken
     * @return the value from this currneToken
     */
    public Value parseValue()
    {
        if(currentToken.equals("("))
        {
            eat("(");
            Expression exp1 = parseExpression();
            eat(")");
            return exp1;
        }
        else if(isNumber(currentToken))
        {
            return parseNumber();
        }
        else
            return parseVariable();
    }

    /**
     * This parses the negativeexpr in the grammar
     * @return a neg expr class 
     */
    public NegExpr parseNegExpr()
    {
        String op = "+";
        if(currentToken.equals("-"))
        {
            op = "-";
            eat("-");
        }
       
        return new NegExpr(parseValue(), op);
    }

    /**
     * This parses the multExpress in the grammar
     * @return the mulExpr class
     */
    public MultExpr parseMultExpr()
    {
        NegExpr neg = parseNegExpr();
        String op = "";
        MultExpr exp1 = null;
        if(currentToken.equals("*") || currentToken.equals("/"))
        {
            op = currentToken;
            eat(currentToken);
            exp1 = parseMultExpr();
        }
        return new MultExpr(neg, exp1, op);
    }

    /**
     * This parses the ADdExpression in the grammar
     * @return the AddEXpr in ast
     */
    public AddExpr parseAddExpr()
    {
        MultExpr mult = parseMultExpr();
        String op = "";
        AddExpr exp1 = null;
        if(currentToken.equals("+") || currentToken.equals("-"))
        {
            op = currentToken;
            eat(currentToken);
            exp1 = parseAddExpr();
        }
        return new AddExpr(mult, exp1, op);
    }

    /**
     * Checks if this is a relop (<, >, >=, <=, <>, =)
     * @return true if this is a relop; otherwise false
     */
    public boolean isRelop(String op)
    {
        return op.equals("<")||op.equals(">")||op.equals("<=")||op.equals(">=")||
        op.equals("<>")||op.equals("=");
    }

    /**
     * Parses the Expression in grammar
     * @return the expression in ast
     */
    public Expression parseExpression()
    {
        AddExpr add = parseAddExpr();
        String op = "";
        Expression exp1 = null;
        if(isRelop(currentToken))
        {
            op = currentToken;
            eat(currentToken);
            exp1 = parseExpression();
        }
        return new Expression(add, exp1, op);
    }

    /**
     * Parses the statement
     * @return the statement
     */
    public Statement parseStatement()
    {
        if(currentToken.equals("display"))
        {
            eat("display");
            Expression e = parseExpression();
            Read r = null;
            if(currentToken.equals("read"))
            {
                eat("read");
                r = new Read(currentToken);
                eat(currentToken);
            }
            return new Display(e, r);
        }
        else if(currentToken.equals("assign"))
        {
            eat("assign");
            String name = currentToken;
            eat(currentToken);
            eat("=");
            return new Assingment(name, parseExpression());
        }
        else if(currentToken.equals("while"))
        {
            eat("while");
            Expression e = parseExpression();
            eat("do");
            Program p = parseProgram();
            eat("end");
            return new While(e, p);
        }
        else if(currentToken.equals("if"))
        {
            eat("if");
            Expression e = parseExpression();
            eat("then");
            Program p1 = parseProgram();
            Program p2 = null;
            if(currentToken.equals("else"))
            {
                eat("else");
                p2 = parseProgram();
            }
            eat("end");
            return new If(e, p1, p2);
        }
        throw new RuntimeException();
    }
    
    public boolean isStatement()
    {
        return currentToken.equals("display") || currentToken.equals("assign") || 
            currentToken.equals("while") || currentToken.equals("if");
    }

    public Program parseProgram()
    {
        Statement s = parseStatement();
        Program p = null;
        if(isStatement())
            p = parseProgram();
        return new Program(s, p);
    }
}