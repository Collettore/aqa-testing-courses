package apps.birds;

public class Eagle {
    class Eagle extends Bird {

        Eagle(String name) {
            super(name);
        }

        @Override
        void feathers() {
            System.out.println("feathers");
        }

        @Override
        void layEggs() {
            System.out.println("egs");
        }

        @Override
        void fly() {
            System.out.println("fly");
        }


}
