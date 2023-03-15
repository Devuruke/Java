package helloworld;

public class IfElseDemo {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 30;
        int num3 = 45;
        // if(expression) { Statements }
    //else if(expression){}
        // else if (expression){}   we can have multiple else if //
        //else {statements}  final else
        if(num1==num2){
            System.out.println("This is valid");
            //Nested if else
            if(num3!=num2)
            {
                System.out.println("This is nested if ");
            }
            else {
                System.out.println("This is nested else ");
            }
        }
        else if(num1>num2){
            System.out.println("This is not greather than");
        }
        else{
            System.out.println("This is not valid");
        }
    }
}
