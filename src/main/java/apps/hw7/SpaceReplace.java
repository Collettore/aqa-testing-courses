package apps.hw7;

import java.util.Scanner;

public class SpaceReplace {
    public static void main(String[] args) {
//        Scanner text = new Scanner(System.in);
//        System.out.println("print your text with a loot 'space'");

        String space = "Hello,   there  is a many     spaces";
        space = space.replaceAll("( )+", " ");

        System.out.println(space);





        
    }
}
