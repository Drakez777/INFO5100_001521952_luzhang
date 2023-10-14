public class Main {
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone("Samsung", "Galaxy S21", 128, 999,6400, "Phone1");
        SmartPhone phone2 = new SmartPhone("Samsung", "Galaxy S21", 128, 999,6400, "Phone2");
        SmartPhone phone3 = new SmartPhone("Samsung", "Galaxy S21", 128, 999,6400, "Phone3");

        School school1 = new School(100,10,20,5, "5th Street", false, "school1");
        School school2 = new School(100,10,20,5, "5th Street", false, "school2");
        School school3 = new School(100,10,20,5, "5th Street", false, "school3");

        NBA nba1= new NBA(100,5000,300,"Chase Center","JIMMY", 3.14f, 3.3f, "nba1");
        NBA nba2= new NBA(100,5000,300,"Chase Center","JIMMY", 3.14f, 3.3f, "nba2");
        NBA nba3= new NBA(100,5000,300,"Chase Center","JIMMY", 3.14f, 3.3f, "nba3");

        House house1 = new House(1500, 95131,"30year","wood", "James", "private", "house", true, "house1");
        House house2 = new House(1500, 95131,"30year","wood", "James", "private", "house", true, "house2");
        House house3 = new House(1500, 95131,"30year","wood", "James", "private", "house", true, "house3");

        Employee employee1 = new Employee(999,"Wade","Harden","Wade@gmail.com",6000, "IT",5,true,"employee1");
        Employee employee2 = new Employee(999,"Wade","Harden","Wade@gmail.com",6000, "IT",5,true,"employee2");
        Employee employee3 = new Employee(999,"Wade","Harden","Wade@gmail.com",6000, "IT",5,true,"employee3");

        Dog dog1 = new Dog("Lily", "Qiu", 4, "black", 33.3,"dog1");
        Dog dog2 = new Dog("Lily", "Qiu", 4, "black", 33.3,"dog2");
        Dog dog3 = new Dog("Lily", "Qiu", 4, "black", 33.3,"dog3");

        Chair chair1 = new Chair("wood","white",4,true,true,22.5,12.6,"chair1");
        Chair chair2 = new Chair("wood","white",4,true,true,22.5,12.6,"chair2");
        Chair chair3 = new Chair("wood","white",4,true,true,22.5,12.6,"chair3");

        Car car1 = new Car("toyota","camry",4,"blue","es34576","gas",888798,200,"car1");
        Car car2 = new Car("toyota","camry",4,"blue","es34576","gas",888798,200,"car2");
        Car car3 = new Car("toyota","camry",4,"blue","es34576","gas",888798,200,"car3");


        Book book1 = new Book("Book","KAY",987,"ABC","ENG","TRUMPHI",1998,"book1");
        Book book2 = new Book("Book","KAY",987,"ABC","ENG","TRUMPHI",1998,"book2");
        Book book3 = new Book("Book","KAY",987,"ABC","ENG","TRUMPHI",1998,"book3");

        BankAccount bankAccount1 = new BankAccount(12345, "John Doe", 1000.0, "Savings", 0.02, "2023-09-30", "Account1");
        BankAccount bankAccount2 = new BankAccount(54321, "Jane Smith", 500.0, "Checking", 0.01, "2023-09-30", "Account2");
        BankAccount bankAccount3 = new BankAccount(98765, "Bob Johnson", 2000.0, "Savings", 0.02, "2023-09-30", "Account3");

        BankAccount.DebitCard debitCard1 = bankAccount1.new DebitCard("1234-5678-9012-3456", "John Doe", "12/25", 123, "DebitCard1");
        BankAccount.DebitCard debitCard2 = bankAccount2.new DebitCard("9876-5432-1098-7654", "Jane Smith", "11/24", 456, "DebitCard2");
        BankAccount.DebitCard debitCard3 = bankAccount3.new DebitCard("1111-2222-3333-4444", "Bob Johnson", "10/23", 789, "DebitCard3");
        
        BankAccount.CreditCard creditCard1 = bankAccount1.new CreditCard("5555-6666-7777-8888", "John Doe", "03/26", 5000, "CreditCard1");
        BankAccount.CreditCard creditCard2 = bankAccount2.new CreditCard("4444-3333-2222-1111", "Jane Smith", "07/25", 3000, "CreditCard2");
        BankAccount.CreditCard creditCard3 = bankAccount3.new CreditCard("9999-8888-7777-6666", "Bob Johnson", "09/24", 1000, "CreditCard3");


    }
}