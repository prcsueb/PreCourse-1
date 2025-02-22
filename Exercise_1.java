// Time Complexity : O(1)
// Space Complexity : O(MAX)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(top == MAX-1) {
            return false;
        }
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        if(top == -1) {
            return 0;
        }
        a[top--] = 0;
        return 1;
    } 
  
    int peek()
    { 
        if(top == -1) return 0;
        return a[top];
    }
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
    } 
}
