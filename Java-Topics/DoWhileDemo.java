package helloworld;

public class DoWhileDemo {
    /* do {
    statements
    }
    while(condition)
     */
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i>10);
            System.out.println("Outside do while loop - Do while not need curly brace{}, need;");

            while(i==10){
                System.out.println(i);
            }
        System.out.println("Outside while loop - While loop need curly brace{}");

    }
}
