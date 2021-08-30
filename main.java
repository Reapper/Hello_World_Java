public class main 
{
    public static void main(String[] args) 
    {  
        OddOrPair((float) Integer.parseInt(args[0]));
    }

    private static void OddOrPair(float Number)
    {
        if ((Number % 2) == 1) System.out.println("is odd");
        else System.out.println("is pair");

    }// END private static void OddOrPair(int Number)
}// END public class main 