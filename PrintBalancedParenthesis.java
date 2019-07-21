package Optimized;

class PrintBalancedParenthesis  
{ 
    // Function that print all combinations of  
    // balanced parentheses 
    // open store the count of opening parenthesis 
    // close store the count of closing parenthesis 
    static void _printParenthesis(char charArray[], int pos, int n, int open, int close) 
    { 
        if(close == n)  
        { 
            // print the possible combinations 
            for(int i=0;i<charArray.length;i++) 
                System.out.print(charArray[i]); 
            System.out.println(); 
            return; 
        } 
        else
        { 
            if(open > close) { 
            	charArray[pos] = '}'; 
                _printParenthesis(charArray, pos+1, n, open, close+1); 
            } 
            
            else if(open < n) { 
            	charArray[pos] = '{'; 
                _printParenthesis(charArray, pos+1, n, open+1, close); 
            } 
        } 
    } 
      
    // Wrapper over _printParenthesis() 
    static void printParenthesis(char chArray[], int n) 
    { 
        if(n > 0) 
        _printParenthesis(chArray, 0, n, 0, 0); 
        return; 
    } 
      
    // driver program  
    public static void main (String[] args)  
    { 
        int n = 3; 
        char[] str = new char[2 * n]; 
        printParenthesis(str, n); 
    } 
} 
  
