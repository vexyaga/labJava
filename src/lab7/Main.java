package lab7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        problema1_var1();
        problema1_var2();
        problema2_var1();
        problema2_var2();
    }
    public static void problema1_var1(){
        List<Integer> numereIntregi = Arrays.asList(3, 6, 8, 43, 65, 22, 76);

        AtomicReference<Integer> sum = new AtomicReference<>(0);
        numereIntregi.forEach(n -> {
            sum.set( sum.get() + n);
        });
           System.out.println(sum.get() / numereIntregi.size());
    }
    public static void problema1_var2(){
        List<Integer> numereIntregi = Arrays.asList(3, 6, 8, 43, 65, 22, 76);

        double v = numereIntregi.stream()
                .mapToDouble(i -> i.doubleValue())
                .average()
                .orElse(0.0);

        System.out.println(v);
    }
    public static void problema2_var1(){
        List<String> papa = Arrays.asList("mere","pere","morcovi","icecream","boba");

        papa.forEach(s ->{
            papa.set(papa.indexOf(s), s.toUpperCase());
        });
        System.out.println(papa);
    }

    public static void problema2_var2(){
        List<String> papa = Arrays.asList("mere","pere","morcovi","icecream","boba");
        List<String> result = papa.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}