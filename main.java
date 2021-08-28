public class main 
{
    public static void main(String[] args) 
    {  
        OddOrPair((float) Integer.parseInt(args[0]));

    }

    private static void OddOrPair(float Number)
    {
        float varResult;

        varResult = Number/2;

        System.out.println(varResult);
        System.out.println((int) varResult);
        
        if((int) varResult == varResult) System.out.println("Is Pair");
        else System.out.println("Is Odd");

    }// END private static void OddOrPair(int Number)
}// END public class main 