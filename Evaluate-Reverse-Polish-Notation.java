// You are given an array of strings tokens that represents an arithmetic 
// expression in a Reverse Polish Notation.

// Evaluate the expression. Return an integer that represents the value of 
// the expression.

// Note that:

//     The valid operators are '+', '-', '*', and '/'.
//     Each operand may be an integer or another expression.
//     The division between two integers always truncates toward zero.
//     There will not be any division by zero.
//     The input represents a valid arithmetic expression in a reverse 
//     polish notation.
//     The answer and all the intermediate calculations can be represented 
//     in a 32-bit integer.

import java.util.Stack;

class Solution
{
    public int evalRPN(String tokens[])
    {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++)
        {
            if(!tokens[i].equals("+") && 
               !tokens[i].equals("-") &&
               !tokens[i].equals("*") &&
               !tokens[i].equals("/"))
            {
                stack.push(Integer.parseInt(tokens[i]));
            }
            else if(tokens[i].equals("+"))
            {
                stack.push(stack.pop() + stack.pop());
            }   
            else if(tokens[i].equals("-"))
            {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }
            else if(tokens[i].equals("*"))
            {
                stack.push(stack.pop() * stack.pop());
            }
            else if(tokens[i].equals("/"))
            {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
        }
        return stack.pop();
    }
}