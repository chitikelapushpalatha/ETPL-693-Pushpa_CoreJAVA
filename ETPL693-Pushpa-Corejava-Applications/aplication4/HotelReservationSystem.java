package com.evergent.corejava.pushpa.aplication4;
import java.util.Scanner;

public class HotelReservationSystem extends ExitClass implements ModulesInterface {
    private int roomCost = 100; // Cost per room
    private int extraServiceCost = 0;
    private int totalCost = 0;
    private int numberOfRooms = 0;
    private boolean amenitiesPurchased = false;
    private boolean ServicesPurchased = false;

    public void bookingModule() {
        Scanner sc = new Scanner(System.in);
        String option;

        System.out.println("Booking Module");
        System.out.println("======================");
        System.out.println("B - Book Room");
        System.out.println("C - Check Availability");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Module code (B, C, M) : ");
        option = sc.nextLine().toUpperCase();

        switch (option) {
            case "B":
                System.out.println("Enter the number of rooms to book:");
                numberOfRooms = Integer.parseInt(sc.nextLine());
                totalCost += numberOfRooms * roomCost;
                System.out.println("Successfully booked " + numberOfRooms + " rooms. Total cost is Rs " + totalCost);
                break;

            case "C":
                System.out.println("Total rooms available: " + (100 - numberOfRooms)); // Assume 100 is total capacity
                break;

            case "M":
                // Return to main menu
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    public void additionalServicesModule() {
        Scanner sc = new Scanner(System.in);
        String option;

        System.out.println("Additional Services Module");
        System.out.println("======================");
        System.out.println("S - Services");
        System.out.println("E - Extra Amenities");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Module code (E, M) : ");
        option = sc.nextLine().toUpperCase();

        switch (option) {
        case "S":
        	System.out.println("Services");
            System.out.println("1 - Car - Rs 50");
            System.out.println("2 - Flight - Rs 100");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
            case 1:
            	extraServiceCost += 100;
            	break;
            case 2:
            	extraServiceCost += 2000;
            	break;
            }
            	ServicesPurchased = true;
                System.out.println("Additional services cost: Rs " + extraServiceCost);
                break;
            
        	
            case "E":
                System.out.println("Extra Amenities");
                System.out.println("1 - Extra bed - Rs 50");
                System.out.println("2 - Room upgrade(AC) - Rs 100");
                System.out.println("Enter your choice (1, 2) : ");
                int choice1 = Integer.parseInt(sc.nextLine());

                switch (choice1) {
                    case 1:
                        extraServiceCost += 50;
                        break;
                    case 2:
                        extraServiceCost += 100;
                        break;
                    default:
                        System.out.println("Invalid choice. No amenities added.");
                        break;
                }
                amenitiesPurchased = true;
                System.out.println("Additional services cost: Rs " + extraServiceCost);
                break;

            case "M":
                // Return to main menu
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    public void paymentModule() {
        Scanner sc = new Scanner(System.in);
        String option;

        System.out.println("Payment Module");
        System.out.println("======================");
        System.out.println("T - Display Total Amount");
        System.out.println("P - Make Payment");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Module code (T, P, M) : ");
        option = sc.nextLine().toUpperCase();

        switch (option) {
            case "T":
                System.out.println("Total Amount to be Paid: Rs " + (totalCost + extraServiceCost));
                break;

            case "P":
                System.out.println("Making payment of Rs " + (totalCost + extraServiceCost));
                totalCost = 0;
                extraServiceCost = 0;
                numberOfRooms = 0;
                amenitiesPurchased = false;
                System.out.println("Payment completed.");
                break;

            case "M":
                // Return to main menu
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

   final  public void reportModule() {
        System.out.println("Report Module");
        System.out.println("======================");
        System.out.println("Generating report...");
        System.out.println("Total Cost for Rooms: Rs " + (numberOfRooms * roomCost));
        System.out.println("Additional Services Cost: Rs " + extraServiceCost);
        System.out.println("Total Amount: Rs " + (totalCost + extraServiceCost));
        System.out.println("Number of Rooms Booked: " + numberOfRooms);
        System.out.println("Amenities Purchased: " + (amenitiesPurchased ? "Yes" : "No"));
    }

    @Override
    public void exitModule() {
        System.out.println("Exiting the system...");
        System.exit(0);
    }

    public static void main(String[] args) {
    	FirstImpl fi=new FirstImpl();
        HotelReservationSystem system = new HotelReservationSystem();
        Scanner sc = new Scanner(System.in);
        String option;

        while (true) {
            System.out.println("======================");
            System.out.println("Hotel Reservation System");
            System.out.println("======================");
            System.out.println("B - Booking Module");
            System.out.println("A - Additional Services Module");
            System.out.println("P - Payment Module");
            System.out.println("R - Report Module");
            System.out.println("E - Exit Module");
            System.out.println("======================");
            System.out.println("Enter your Module code (B, A, P, R, E) : ");
            option = sc.nextLine().toUpperCase();

            switch (option) {
                case "B":
                    system.bookingModule();
                    break;
                case "A":
                    system.additionalServicesModule();
                    break;
                case "P":
                    system.paymentModule();
                    break;
                case "R":
                    system.reportModule();
                    break;
                case "E":
                    system.exitModule();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
