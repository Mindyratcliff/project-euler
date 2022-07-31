import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static void main(String [] args) {
        List<Integer> multiples = new ArrayList <>();
        Integer sum = 0;
        for(int i = 1; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                multiples.add(i);
            }
        }
        for (Integer b : multiples){
            sum += b;
        }
        System.out.println(sum);
    }
}
