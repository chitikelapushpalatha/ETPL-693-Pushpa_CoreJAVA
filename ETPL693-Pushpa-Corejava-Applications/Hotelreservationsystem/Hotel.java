package com.evergent.corejava.Hotelreservationsystem;

import java.io.IOException;
import java.util.Scanner;

public class Hotel {

    enum BookingModule {B, C, M}
    enum AdditionalServicesModule {S, E, M}
    enum PaymentModule {T, P, M}
    enum ReportModule {I, S, M}
    enum RoomType {SINGLE, DOUBLE, SUITE}
    enum Quit{}

    static int roomRate;
    static int additionalCost;
    static int numberOfGuests;
    static int totalAmount;
    static int finalAmount;

    
    static int availableSingleRooms = 10;
    static int availableDoubleRooms = 10;
    static int availableSuites = 5;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t \t\t Welcome To HOTEL RESERVATION SYSTEM");

        while (true) {
            System.out.println("======================");
            System.out.println(" Hotel Main Menu");
            System.out.println("======================");
            System.out.println("B - Booking Module");
            System.out.println("S - Additional Services Module");
            System.out.println("P - Payment Module");
            System.out.println("R - Report Module");
            System.out.println("E - Quit");
            System.out.println("======================");
            System.out.println("Enter your Module code (B,S,P,R,E) : ");

            String module = scanner.nextLine();

            switch (module) {
                case "B":
                    System.out.println(" Booking Module");
                    System.out.println("======================");
                    System.out.println("B - Book Room");
                    System.out.println("C - Check Availability");
                    System.out.println("M - Return to Main Menu");
                    System.out.println("======================");
                    System.out.println("Enter your Module code (B,C,M) : ");

                    String bookingChoice = scanner.nextLine();

                    switch (BookingModule.valueOf(bookingChoice)) {
                        case B:
                            System.out.println("Room Types");
                            System.out.println("1 - Single Room - 100 per night");
                            System.out.println("2 - Double Room - 150 per night");
                            System.out.println("3 - Suite - 250 per night");
                            System.out.println("Enter your room type (1,2,3) : ");

                            int roomChoice = Integer.parseInt(scanner.nextLine());
                            switch (roomChoice) {
                                case 1:
                                    roomRate = 100;
                                    break;
                                case 2:
                                    roomRate = 150;
                                    break;
                                case 3:
                                    roomRate = 250;
                                    break;
                                default:
                                    System.out.println("Invalid room choice.");
                                    return;
                            }

                            System.out.println("Enter the number of nights: ");
                            int nights = Integer.parseInt(scanner.nextLine());

                            System.out.println("Enter the number of guests: ");
                            numberOfGuests = Integer.parseInt(scanner.nextLine());

                            totalAmount = roomRate * nights;
                            System.out.println("Total Room Cost for " + nights + " nights: " + totalAmount);

                            
                            switch (roomChoice) {
                                case 1:
                                    if (availableSingleRooms > 0) {
                                        availableSingleRooms--;
                                        System.out.println("Single Room booked successfully.");
                                    } else {
                                        System.out.println("No Single Rooms available.");
                                    }
                                    break;
                                case 2:
                                    if (availableDoubleRooms > 0) {
                                        availableDoubleRooms--;
                                        System.out.println("Double Room booked successfully.");
                                    } else {
                                        System.out.println("No Double Rooms available.");
                                    }
                                    break;
                                case 3:
                                    if (availableSuites > 0) {
                                        availableSuites--;
                                        System.out.println("Suite booked successfully.");
                                    } else {
                                        System.out.println("No Suites available.");
                                    }
                                    break;
                            }

                            break;

                        case C:
                            System.out.println(" Check Room Availability");
                            System.out.println("======================");
                            System.out.println("1 - Single Room");
                            System.out.println("2 - Double Room");
                            System.out.println("3 - Suite");
                            System.out.println("Enter your room type (1,2,3) : ");

                            int checkRoomChoice = Integer.parseInt(scanner.nextLine());
                            switch (checkRoomChoice) {
                                case 1:
                                    System.out.println("Available Single Rooms: " + availableSingleRooms);
                                    break;
                                case 2:
                                    System.out.println("Available Double Rooms: " + availableDoubleRooms);
                                    break;
                                case 3:
                                    System.out.println("Available Suites: " + availableSuites);
                                    break;
                                default:
                                    System.out.println("Invalid room choice.");
                                    break;
                            }
                            break;

                        case M:
                            break;
                    }
                    break;

                case "S":
                    System.out.println(" Additional Services Module");
                    System.out.println("======================");
                    System.out.println("S - Services");
                    System.out.println("E - Extra Amenities");
                    System.out.println("M - Return to Main Menu");
                    System.out.println("======================");
                    System.out.println("Enter your Module code (S,E,M) : ");

                    String servicesChoice = scanner.nextLine();

                    switch (AdditionalServicesModule.valueOf(servicesChoice)) {
                        case S:
                            System.out.println("Available Services");
                            System.out.println("1 - Car");
                            System.out.println("2 - Flight");
                            System.out.println("Enter your service choice (1,2) : ");

                            int serviceChoice = Integer.parseInt(scanner.nextLine());
                            switch (serviceChoice) {
                                case 1:
                                    additionalCost += 200;
                                    break;
                                case 2:
                                    additionalCost += 100;
                                    break;
                                default:
                                    System.out.println("Invalid service choice.");
                                    return;
                            }

                            System.out.println("Additional Cost for selected services: " + additionalCost);
                            break;

                        case E:
                            System.out.println("Extra Amenities");
                            System.out.println("1 - Extra Bed ");
                            System.out.println("2 - Room Upgrade");
                            System.out.println("Enter your amenity choice (1,2) : ");

                            int amenityChoice = Integer.parseInt(scanner.nextLine());
                            switch (amenityChoice) {
                                case 1:
                                    additionalCost += 50;
                                    break;
                                case 2:
                                    additionalCost += 100;
                                    break;
                                default:
                                    System.out.println("Invalid amenity choice.");
                                    return;
                            }

                            System.out.println("Additional Cost for selected amenities: " + additionalCost);
                            break;

                        case M:
                            break;
                    }
                    break;

                case "P":
                    System.out.println(" Payment Module");
                    System.out.println("======================");
                    System.out.println("T - Display Total Amount");
                    System.out.println("P - Make Payment");
                    System.out.println("M - Return to Main Menu");
                    System.out.println("======================");
                    System.out.println("Enter your Module code (T,P,M) : ");

                    String paymentChoice = scanner.nextLine();

                    switch (PaymentModule.valueOf(paymentChoice)) {
                        case T:
                            System.out.println("Total Amount to be Paid: " + (totalAmount + additionalCost));
                            break;

                        case P:
                            finalAmount = totalAmount + additionalCost;
                            System.out.println("Payment Processed. Total Amount Paid: " + finalAmount);
                            break;

                        case M:
                            break;
                    }
                    break;

                case "R":
                    System.out.println(" Report Module");
                    System.out.println("======================");
                    System.out.println("I - Display Invoice");
                    System.out.println("S - Display Summary");
                    System.out.println("M - Return to Main Menu");
                    System.out.println("======================");
                    System.out.println("Enter your Module code (I,S,M) : ");

                    String reportChoice = scanner.nextLine();

                    switch (ReportModule.valueOf(reportChoice)) {
                        case I:
                            System.out.println("Invoice");
                            System.out.println("==================");
                            System.out.println("Room Rate: " + roomRate);
                            System.out.println("Number of Nights: " + totalAmount / roomRate);
                            System.out.println("Number of Guests: " + numberOfGuests);
                            System.out.println("Additional Costs: " + additionalCost);
                            System.out.println("Total Amount: " + (totalAmount + additionalCost));
                            break;

                        case S:
                            System.out.println("Summary");
                            System.out.println("==================");
                            System.out.println("Room Rate: " + roomRate);
                            System.out.println("Total Room Cost: " + totalAmount);
                            System.out.println("Additional Costs: " + additionalCost);
                            System.out.println("Total Amount: " + (totalAmount + additionalCost));
                            break;

                        case M:
                            break;
                    }
                    break;

                case "E":
                    System.out.println("Exiting the system. Thank you!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input. Please enter a valid module code.");
                    break;
            }
        }
    }
}
