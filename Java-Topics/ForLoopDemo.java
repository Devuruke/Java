package helloworld;

public class ForLoopDemo {
    public static void main(String[] args) {
        //for(init;condition;updation){}

       for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        //Other way but which is not recommended
       /* int i =1;
        * for(;i<=10;i++){
          *  System.out.println(i);
        }
        //while loop - DOn't know the number of iterations
        * do while - DOn't know the number of iterations but want to execute atleast once
        *            irrespective of whatever the condition is
        * for - how many iterations u want to run
        */
    }
}
