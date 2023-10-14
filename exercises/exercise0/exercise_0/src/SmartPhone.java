public class SmartPhone {
    String brand;
    String model;
    int storage;
    int battery_level;
    int screen_size;
    int camera_resolution;
    int apps_installed;
    String uniqueName;

    public void call(){};
    public void take_photo(){};
    public void message(){};

    SmartPhone(String brand, String model, int storage, int screen_size, int cameraResolution, String uniqueName) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.battery_level = 100; // Initialize battery level to 100%
        this.screen_size = screen_size;
        this.camera_resolution = cameraResolution;
        this.apps_installed = 0; // Initialize apps installed to 0
        this.uniqueName = uniqueName;
        System.out.println("SmartPhone " + uniqueName + " created.");
    }

}
