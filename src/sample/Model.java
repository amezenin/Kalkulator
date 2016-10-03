package sample;

/**
 * Created by Anton on 29.09.2016.
 */
public class Model {

    public double calculation (double a, double b, String operator) { //prinimaet dva 4isla
        switch (operator){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if(b == 0) return 0;
                return a/b;
        }

        System.out.println("Неизвестный оператор" + operator);
        return 0;
    }

}
