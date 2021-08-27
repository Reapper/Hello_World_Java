public class main 
{
    public static void main(String[] args) 
    {
        int interger=Integer.parseInt(args[0]);  
        OddOrPair(interger);
    }

    private static void OddOrPair(int Number)
    {
        String Result = null;
        int varOdd = 1;
        int varPair = 0;

        while(true)
        {
            //System.out.println("start"+ varOdd + " | " + varPair + " | " + Number);
            if(Number == varOdd)
            {
                //System.out.println("odd");
                Result = "Is Odd";
                break;
            } else {
                //System.out.println("else 1"+ varOdd + " | " + varPair + " | " + Number);
                if(Number == varPair)
                {
                    //System.out.println("pair");
                    Result = "Is Pair";
                    break;
                } else {
                    //System.out.println("else 2");
                   // System.out.println("not " + varOdd + " | " + varPair + " | " + Number);
                    Result = "Is Not";
                    varOdd+=2;
                    varPair+=2;

                }// END if(Number == varPair)

            }// END if(Number == varOdd)

        }// END while(Number != (varOdd | varPair))
        
        System.out.println(Result);
    }// END private static void OddOrPair(int Number)

}// END public class main 

