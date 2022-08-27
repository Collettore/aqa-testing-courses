package test;

import javax.swing.*;
import java.util.Objects;

public class learning {

    enum BirdType{EAGLE, SWALLOW, PENGUIN,}

    public class Bird {
        private boolean layEggs;
        private boolean feathers;
        private boolean flying;
        private BirdType type;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Bird bird = (Bird) o;
            return type == bird.type;
        }

        @Override
        public int hashCode() {
            return Objects.hash(type);
        }

        public void fly(){
            if (flying)
                System.out.println("Can fly");
            else{
                System.out.println("cant fly");
            }

        }






//        public static void main(String[] args) {
//            Bird b
//        }
    }
}
