public class House {

    int sqft;
    int location;
    String age;
    String material;
    String owner;
    String use;
    String type;
    boolean hasYard;
    boolean rent;
    String uniqueName;

    public boolean rent(){
        return rent;
    }

    protected void sell(){
    }

    void storage(){}

    public House(int sqft, int location, String age, String material, String owner, String use, String type, boolean hasYard, String uniqueName) {
        this.sqft = sqft;
        this.location = location;
        this.age = age;
        this.material = material;
        this.owner = owner;
        this.use = use;
        this.type = type;
        this.hasYard = hasYard;
        this.rent = false;
        this.uniqueName = uniqueName;
        System.out.println("House " + uniqueName + " created.");
    }

}
