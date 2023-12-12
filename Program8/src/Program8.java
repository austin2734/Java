public class Program8
{
    public static void main(String[] args)
    {
        InfixToPostfixConverter converter = new InfixToPostfixConverter();

        converter.convertToPostfix("7/9");
        converter.convertToPostfix("6+2*5");
        converter.convertToPostfix("6+2*5-8/4");
        converter.convertToPostfix("(6+2)*5-8/4");
        converter.convertToPostfix("(6+2)*5^8/4");
        converter.convertToPostfix("6%2^5-8/4*5");


    }

}
