public class Chair {
    String material;
    String color;
    int legs;
    boolean hasBackrest;
    boolean isAdjustable;
    double weightCapacity;
    double height;
    String uniqueName;

    Chair(String material, String color, int legs, boolean hasBackrest, boolean isAdjustable, double weightCapacity, double height, String uniqueName) {
        this.material = material;
        this.color = color;
        this.legs = legs;
        this.hasBackrest = hasBackrest;
        this.isAdjustable = isAdjustable;
        this.weightCapacity = weightCapacity;
        this.height = height;
        this.uniqueName = uniqueName;
        System.out.println("Chair " + uniqueName + " created.");
    }

    void sit() {
    }

    void adjustHeight() {
    }

    void reclineBackrest() {
    }
}