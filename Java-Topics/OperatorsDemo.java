package helloworld;

import org.w3c.dom.ls.LSOutput;
// reference link : https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
public class OperatorsDemo {
    public static void main(String[] args) {
        // = Simple operator
        int number1=10;
        int number2=20;
        //++, -- Unary Operator
        number1++;
        ++number1;
        // ! operator
        boolean bool=!true;
        System.out.println(bool);

        //Arithmetic Operator
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        System.out.println(number1%number2);
        //&& || Conditional Operator
        if((number1 == 10) || (number2 == 20)){
            System.out.println("This is COnditional Operator");
        }
        else{
            System.out.println("This is not COnditional Operator");
        }
    }

}
