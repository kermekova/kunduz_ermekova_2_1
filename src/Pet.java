import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color_Emun ColorEnum;
    private Shelter shelter;

    public int getAge() {
        return age;
    }


    public Color_Emun getColorEnum() {
        return ColorEnum;
    }

    public void setColorEnum(Color_Emun colorEnum) {
        ColorEnum = colorEnum;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge(){
        Random random = new Random();

        return random.nextInt(20)+1;

    }

    public String getInfo(){
        return "Age: " + age +
                "\nColour: " + ColorEnum +
                "\nShelter name: " + shelter.getName() +
                "\nSchelter adress :" + shelter.getAddress();
    }
}

