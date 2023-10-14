public class School {

    int numOfStudent;
    int numOfMajor;
    int numOfBuilding;
    int numOfCollege;
    int fee;
    boolean isVacation;
    String location;
    boolean forMilitary;

    String uniqueName;

    public School(int numOfStudent, int numOfMajor, int numOfBuilding, int numOfCollege, String location, boolean forMilitary, String uniqueName) {
        this.numOfStudent = numOfStudent;
        this.numOfMajor = numOfMajor;
        this.numOfBuilding = numOfBuilding;
        this.numOfCollege = numOfCollege;
        this.fee = 0; // Initialize fee to 0
        this.isVacation = false; // Initialize isVacation to false
        this.location = location;
        this.forMilitary = forMilitary;
        this.uniqueName = uniqueName;
        System.out.println("School " + uniqueName + " created.");
    }

    void haveClass(){};

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void setNumOfBuilding(int numOfBuilding) {
        this.numOfBuilding = numOfBuilding;
    }

     private void setVacation(){}
}
