//Ethan Bhavsar

public class FactCalc {
    private int result;
    private int input;
    
    public FactCalc() {
        result = 1;
        System.out.println(result);
    }
    public int factorial(int n) {
        System.out.println(result);
        while(n > 0) {
            result *= n;
            n--;
            System.out.println(result);
        }  
    return result;
    }
}