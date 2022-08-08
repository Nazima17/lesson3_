import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {15.2, 17.3, 18.2, 16.4, 15.3, 19.2, -16.2, 14.3, 16.3, 14.3};
        int drink = 0;
        double coffe = 0;
        double average ;
        boolean  letter = false ;
        for (double num : numbers){
            if (num < 0) {
                letter = true ;


            }
            if (num > 0 && letter) {
                coffe=num+coffe;
                drink++;
            }
        }
        average=coffe/drink;
        System.out.println(average);


    }
    }



