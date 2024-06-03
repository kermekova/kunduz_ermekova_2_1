public class Main {
    public static void main(String[] args) {

        String[] commands = {"Sit", "Run"};
        Shelter shelter = new Shelter("Peace", "Chui 1");
        Dog dog = new Dog("Rex", "Saint Bernard",  commands, Color_Emun.WHITE, shelter);
        System.out.println(dog.getInfo());

        dog.makeVoice();
        dog.makeVoice( "Гав гав");


        Shelter shelter2 = new Shelter("Harmony", "Abaya 4");
        Dog dog2 = new Dog("Bella", "Golden Retriever", Color_Emun.GRAY, shelter2);
        System.out.println(dog2.getInfo());

        dog.makeVoice();
        dog.makeVoice( "Гав гав");
    }
}