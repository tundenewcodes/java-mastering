import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       AdvCalc calculator = new AdvCalc();
       Calc calcObj = new Calc();
       ArrayList array = new ArrayList<int>(4);
       int add = calculator.add(3,6);
       int subtract = calculator.sub(6,2);
       int divide = calculator.div(11,3);
       int multiply = calculator.mul(4,2);
       System.out.println(add + " and " + subtract + " and " + divide + " " + multiply);
    }
}




