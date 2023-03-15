package helloworld;

public class BreakandContinueDemo {
    public static void main(String[] args) {
        //break & continue should use within the loop, not work outside of the loop
        for(int i=1; i<=10;i++)
        {
            if(i==8){
               break; // stop the execution once reached the value 8 and jump out of loop
                //continue; // continue by skipping the particular condition
            }
            System.out.println(i);
        }
        System.out.println("final statement");
    }
}
