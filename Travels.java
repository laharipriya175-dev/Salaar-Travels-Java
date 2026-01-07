import java.util.Scanner;

public class Travels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int select;
        float cartime;
        float biketime;
        float vantime;
        double ADHAR;
        double LICENCE;
        System.out.println("WELCOME TO SALAAR TRAVELLS");
        System.out.println("Available Vehicals we have:");
        System.out.println("1:CARS");
        System.out.println("2:BIKES");
        System.out.println("3:VANS");
        System.out.println("enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("we have different models of cars");

                System.out.println("Please enter How long time do you need the vehicle for a ride?");
                cartime = sc.nextFloat();
                if (cartime <= 5) {
                    System.out.println("RENT:3000");
                } else if (cartime <= 12) {
                    System.out.println("RENT:10000");
                } else {
                    System.out.println("RENT:20000");
                }
                System.out.println("please select which model car do you want");
                System.out.println("1:EXTER");
                System.out.println("2:BREEZA");
                System.out.println("3:ERTIGA");
                System.out.println("4:NEXON");
                System.out.println("5:SWIFT");
                select = sc.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("YOUR SELECTED CAR IS EXTER");
                        break;
                    case 2:
                        System.out.println("YOUR SELECTED CAR IS BREEZA ");
                        break;
                    case 3:
                        System.out.println("YOUR SELECTED CAR IS ERTIGA ");
                        break;
                    case 4:
                        System.out.println("YOUR SELECTED CAR IS NEXON ");
                        break;
                    case 5:
                        System.out.println("YOUR SELECTED CAR IS SWIFT ");
                        break;

                    default:
                        System.out.println("Invalid selection");
                        break;

                }
                break;

            case 2:
                System.out.println("we have different models of bikes");
                System.out.println("Please enter How long time do you need the vehicle for a ride?");
                vantime = sc.nextFloat();
                if (vantime <= 5) {
                    System.out.println("RENT:2000");
                } else if (vantime <= 12) {
                    System.out.println("RENT:8000");
                } else {
                    System.out.println("RENT:15000");
                }
                System.out.println("please select which model bike do you want");
                System.out.println("1:ACTIVA");
                System.out.println("2:PULSER");
                System.out.println("3:ROYEL ENFIELD");
                System.out.println("4:DUKE");
                System.out.println("5:APACHE");
                select = sc.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("YOUR SELECTED bike IS ACTIVA");
                        break;
                    case 2:
                        System.out.println("YOUR SELECTED Cbike IS PULSER ");
                        break;
                    case 3:
                        System.out.println("YOUR SELECTED bikeIS ROYEL ENFIELD ");
                        break;
                    case 4:
                        System.out.println("YOUR SELECTED bike IS DUKE ");
                        break;
                    case 5:
                        System.out.println("YOUR SELECTED bike IS APACHE ");
                        break;

                    default:
                        System.out.println("Invalid selection");
                        break;
                }
                break;
            case 3:
                System.out.println("we have different models of VANS");
                System.out.println("Please enter How long time do you need the vehicle for a ride?");
                biketime = sc.nextFloat();
                if (biketime <= 5) {
                    System.out.println("rent:5000");
                } else if (biketime <= 12) {
                    System.out.println("rent:10000");
                } else {
                    System.out.println("15000");
                }
                System.out.println("please select which model VAN do you want");
                System.out.println("1:MINIVANS");
                System.out.println("2:TOYOTA INNOVA");
                System.out.println("3:MERCEDES SPRINTER");
                System.out.println("4:TEMPO TRAVELLERS");
                System.out.println("5:COMBI VANS");
                select = sc.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("YOUR SELECTED CAR IS MINIVANS");
                        break;
                    case 2:
                        System.out.println("YOUR SELECTED CAR IS TOYOTA INNOVA ");
                        break;
                    case 3:
                        System.out.println("YOUR SELECTED CAR IS MERCEDES SPRINTER ");
                        break;
                    case 4:
                        System.out.println("YOUR SELECTED CAR IS TEMPO TRAVELLERS ");
                        break;
                    case 5:
                        System.out.println("YOUR SELECTED CAR IS COMBI VANS ");
                        break;

                    default:
                        System.out.println("Invalid selection");
                        break;
                }
        }
        System.out.println("PLEASE PROVIDE UR ADHAR CARD NUMBER");
        ADHAR = sc.nextDouble();
        System.out.println("PLEASE PROVIDE UR LICENCE NO");
        LICENCE = sc.nextDouble();

        System.out.println("This is ur final booking details");
        System.out.println("slected vehical: " + choice);
        System.out.println("ur adhar card no: " + ADHAR);
        System.out.println("ur licence no: " + LICENCE);

    }

}
