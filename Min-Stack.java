// Design a stack that supports push, pop, top, and retrieving the minimum 
// element in constant time.

// Implement the MinStack class:

//     MinStack() initializes the stack object.
//     void push(int val) pushes the element val onto the stack.
//     void pop() removes the element on the top of the stack.
//     int top() gets the top element of the stack.
//     int getMin() retrieves the minimum element in the stack.

// You must implement a solution with O(1) time complexity for each function.

import java.util.Stack;

class MinStack
{
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MinStack()
    {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int val)
    {
        if(stack1.isEmpty())
        {
            stack1.push(val);
            stack2.push(val);
        }
        else
        {
            if(stack2.peek() < val) stack2.push(stack2.peek());
            else stack2.push(val);
            stack1.push(val);
        }
    }

    public void pop()
    {
        stack1.pop();
        stack2.pop();
    }

    public int top()
    {
        return stack1.peek();
    }

    public int getMin()
    {
        return stack2.peek();
    }
}