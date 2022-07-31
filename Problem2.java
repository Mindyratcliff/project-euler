import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static void main(String [] args){
        List <Integer> fibonacci = new ArrayList <>();
        fibonacci.add(1);
        fibonacci.add(2);
        Integer sum = 0;
       for (int i = 1; i < 4000000; i++){
            fibonacci.add(fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2));  
            if(fibonacci.get(fibonacci.size() - 1) >= 4000000){
                break;
            }
        }
        for (Integer b : fibonacci){
              if (b % 2 == 0 && b <= 4000000){
                sum += b;
              } 
            }
        
        System.out.println(sum);
    }
}
