package helloworld;

public class TernaryOperator {
    public static void main(String[] args) {
        int num1 =25;
        int num2 = 40;

        // Variable = (conditions) ? True expression : False expression
        // Ternary operator is similar to if else condition

        //if else statements
        if(num1>num2){
            System.out.println("Num1 > Num2");
        }
        else{
            System.out.println("Num1 < Num2");
        }
        //Ternary statements
        String result = (num1>num2) ? "Num1 > Num2" : "Num1 < Num2" ;
        System.out.println(result);
    }
}
