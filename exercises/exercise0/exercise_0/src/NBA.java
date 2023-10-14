public class NBA {

    int sportCenter;
    int employee;
    int player;
    String nameOfSportCenter;
    String nameOfPlayer;
    float sales;
    float net;

    String uniqueName;

    public NBA(int sportCenter, int employee, int player, String nameOfSportCenter, String nameOfPlayer, float sales, float net, String uniqueName) {
        this.sportCenter = sportCenter;
        this.employee = employee;
        this.player = player;
        this.nameOfSportCenter = nameOfSportCenter;
        this.nameOfPlayer = nameOfPlayer;
        this.sales = sales;
        this.net = net;
        this.uniqueName = uniqueName;
        System.out.println("NBA Instance " + uniqueName + " created.");
    }

    void playGame() {
        // Method to simulate an NBA game
    }

    void hireEmployee() {
        // Method to hire an employee
    }

    void calculateNetIncome() {
        // Method to calculate the net income
    }

}
