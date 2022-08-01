import java.io.*;
import java.math.BigInteger;

public class Problem3 {
    
    public static void primeFactors(BigInteger n)
    {
        BigInteger m = BigInteger.valueOf(2);

        while (n.mod(m) == BigInteger.ZERO) {
            n = n.divide(m);
        }

        BigInteger h = sqrt(n);

        for (BigInteger i = BigInteger.valueOf(3); i.compareTo(h) == -1; i = i.add(m)) {
            
            while (n.mod(i) == BigInteger.ZERO) {
                System.out.print(i + " ");
                n = n.divide(i);
            }
        }
    }

    public static BigInteger sqrt(BigInteger x) {
        BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
        BigInteger div2 = div;
        for(;;) {
            BigInteger y = div.add(x.divide(div)).shiftRight(1);
            if (y.equals(div) || y.equals(div2))
                return y;
            div2 = div;
            div = y;
        }
    }
 
    public static void main(String[] args)
    {
        BigInteger n = BigInteger.valueOf(600851475143l);
        primeFactors(n);
    }
}