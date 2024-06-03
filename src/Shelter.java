public class Shelter {
    private String name;
    private String address;

    public Shelter(String name,String address) {
        this.name= name;
        this.address=address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
