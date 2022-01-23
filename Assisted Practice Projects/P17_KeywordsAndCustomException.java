package Assisted_Practice_Projects_S;

public class P17_KeywordsAndCustomException {
        public static void main(String[] args)
        {

            int a=12,b=0,ak;

            try
            {
                if(b==0)        
                    throw(new ArithmeticException("Can't divide by zero."));
                else
                {
                    ak = a / b;
                    System.out.print("\nThe result is : " + ak);
                }
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\nError : " + Ex.getMessage());
            }

            System.out.print("\n\t\nEnd of the program.");
        }
}
