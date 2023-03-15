package helloworld;

public class NestedLoopDemo {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<10;i++) {
            int j=2;
            //nested loop should be independent of parent loop, so u can easily track the debug
            // otherwise it creates critical
            while(j<=5){
            System.out.println("value of i is "+i+" value of j is "+j+" ");
            j++;
            }
            count++; // check why its not working 

        }

    }
}
