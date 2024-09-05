import java.util.ArrayList;
import java.util.Scanner;

public class PestManagementSystem {
    private ArrayList<Crop> crops = new ArrayList<>();
    private ArrayList<Pest> pests = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PestManagementSystem system = new PestManagementSystem();
        system.run();
    }

    public void run() {
        int option;
        do {
            System.out.println("\nPest Management System");
            System.out.println("1. Add Crop");
            System.out.println("2. Add Pest");
            System.out.println("3. View Crops");
            System.out.println("4. View Pests");
            System.out.println("5. Update Pest Treatment");
            System.out.println("6. Delete Crop/Pest");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> addCrop();
                case 2 -> addPest();
                case 3 -> viewCrops();
                case 4 -> viewPests();
                case 5 -> updatePestTreatment();
                case 6 -> deleteCropOrPest();
                case 7 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option, try again.");
            }
        } while (option != 7);
    }

    // Method to add crop
    private void addCrop() {
        System.out.println("Enter Crop ID:");
        int cropId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Crop Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Crop Type:");
        String type = scanner.nextLine();
        System.out.println("Enter Crop Season:");
        String season = scanner.nextLine();

        crops.add(new Crop(cropId, name, type, season));
        System.out.println("Crop added successfully!");
    }

    // Method to add pest
    private void addPest() {
        System.out.println("Enter Pest ID:");
        int pestId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Pest Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Affected Crops:");
        String affectedCrops = scanner.nextLine();
        System.out.println("Enter Pest Treatment:");
        String treatment = scanner.nextLine();
        System.out.println("Enter Treatment Schedule:");
        String treatmentSchedule = scanner.nextLine();

        pests.add(new Pest(pestId, name, affectedCrops, treatment, treatmentSchedule));
        System.out.println("Pest added successfully!");
    }

    // Method to view crops
    private void viewCrops() {
        if (crops.isEmpty()) {
            System.out.println("No crops available.");
        } else {
            for (Crop crop : crops) {
                System.out.println(crop);
            }
        }
    }

    // Method to view pests
    private void viewPests() {
        if (pests.isEmpty()) {
            System.out.println("No pests available.");
        } else {
            for (Pest pest : pests) {
                System.out.println(pest);
            }
        }
    }

    // Method to update pest treatment schedule
    private void updatePestTreatment() {
        System.out.println("Enter Pest ID to update treatment schedule:");
        int pestId = scanner.nextInt();
        scanner.nextLine();

        for (Pest pest : pests) {
            if (pest.getPestId() == pestId) {
                System.out.println("Enter new treatment schedule:");
                String newSchedule = scanner.nextLine();
                pest.setTreatmentSchedule(newSchedule);
                System.out.println("Treatment schedule updated!");
                return;
            }
        }
        System.out.println("Pest not found!");
    }

    // Method to delete crop or pest
    private void deleteCropOrPest() {
        System.out.println("1. Delete Crop");
        System.out.println("2. Delete Pest");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter Crop ID to delete:");
            int cropId = scanner.nextInt();
            crops.removeIf(crop -> crop.getCropId() == cropId);
            System.out.println("Crop deleted.");
        } else if (choice == 2) {
            System.out.println("Enter Pest ID to delete:");
            int pestId = scanner.nextInt();
            pests.removeIf(pest -> pest.getPestId() == pestId);
            System.out.println("Pest deleted.");
        } else {
            System.out.println("Invalid option.");
        }
    }
}
