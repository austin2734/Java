public class InfixToPostfixConverter
{

    public void convertToPostfix(String expression)
    {
        StringBuffer infix = new StringBuffer();
        StringBuffer postfix = new StringBuffer();
        Stack<Character> stack = new Stack<>();


        infix.append(expression);
        infix.append(')');
        stack.push('(');

        while(!stack.isEmpty())
        {
            char currentChar = infix.charAt(0);
            infix.deleteCharAt(0);

            if (Character.isDigit(currentChar))
            {
                postfix.append(currentChar);
            }
            else if (currentChar == '(')
            {
                stack.push(currentChar);
            }
            else if (isOperator(currentChar))
            {
                // checks if element at top of stack is an operator and is
                // of greater precedence than currentChar value
                if(isOperator(stack.peak()) && precedence(currentChar, stack.peak()))
                {
                       // stack operator has greater precedence, added to postfix
                       postfix.append(stack.pop());
                }

                // currentChar added to stack
                stack.push(currentChar);

            }
            else if (currentChar == ')')
            {

                while(stack.peak() != '(')
                {
                    postfix.append(stack.pop());

                }

                stack.pop();
            }


        }


        System.out.printf("Postfix conversion of expression %s = %s%n%n", expression, postfix);

    }

    public boolean isOperator(char current)
    {
        return (operatorToInt(current) > 0);
    }

    public boolean precedence(char infixOperator, char stackOperator)
    {
       return (operatorToInt(infixOperator) <= operatorToInt(stackOperator));
    }

    private int operatorToInt(char operator)
    {
        int precedenceValue = -1;

        switch (operator)
        {
            case '^':
               precedenceValue = 3;
               break;
            case '*':
            case '%':
            case '/':
                precedenceValue = 2;
                break;

            case '+':
            case '-':
                precedenceValue = 1;
                break;

        }

        return precedenceValue;

    }

}

