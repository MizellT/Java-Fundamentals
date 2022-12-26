package labs_examples.practice_package;

public class ForLoops {
    public static void main(String[] args){
        //counting up
        for(int count = 0; count < 5; count = count + 1) {
            System.out.println("This is count: " + count);
        }
        {
            System.out.println();
        }
        //counting backwards
        for(int count = 5; count >= 0; count = count - 1){
            System.out.println("This is count: " + count);
        }
        {
            System.out.println();
        //loop through every other number from 100 to 0
        for(int count = 100; count >= 0; count = count -= 2) {
            System.out.println("This is count: " + count);
        }
        {
            System.out.println();}
        }
    }
}

