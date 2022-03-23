import java.math.BigInteger;

public class quadrat2 {
    
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(16); 
        System.out.println(String.valueOf(a));

        for (int i = 1; i<6; i++) {
            a = a.multiply(a);
            System.out.println(a);
        }
    }
}