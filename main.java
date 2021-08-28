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

        for(;(Number >= varOdd) | (Number >= varPair);)
        {
            if(Number == varOdd) Result = "Is Odd";
            if(Number == varPair) Result = "Is Pair";

            varOdd+=2;
            varPair+=2;            
        }// END for(;(Number >= varOdd) | (Number >= varPair);)
        
        System.out.println(Result);
    }// END private static void OddOrPair(int Number)

}// END public class main 

