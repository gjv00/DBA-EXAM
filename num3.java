import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of newly hired male employees: ");
        int newlyHiredMales = scanner.nextInt();
        System.out.print("Enter the number of newly hired female employees: ");
        int newlyHiredFemales = scanner.nextInt();

        System.out.print("Enter the number of male employees in permanent position: ");
        int permanentMales = scanner.nextInt();
        System.out.print("Enter the number of female employees in permanent position: ");
        int permanentFemales = scanner.nextInt();

        System.out.print("Enter the number of male employees resigned: ");
        int resignedMales = scanner.nextInt();
        System.out.print("Enter the number of female employees resigned: ");
        int resignedFemales = scanner.nextInt();

        int totalNewlyHired = newlyHiredMales + newlyHiredFemales;
        int totalPermanent = permanentMales + permanentFemales;
        int totalResigned = resignedMales + resignedFemales;

        int totalEmployees = totalPermanent - totalResigned;

        double percentageNewlyHiredMales = (newlyHiredMales * 100.0) / totalNewlyHired;
        double percentageNewlyHiredFemales = (newlyHiredFemales * 100.0) / totalNewlyHired;
        double percentagePermanentMales = (permanentMales * 100.0) / totalPermanent;
        double percentagePermanentFemales = (permanentFemales * 100.0) / totalPermanent;
        double percentageResignedMales = (resignedMales * 100.0) / totalResigned;
        double percentageResignedFemales = (resignedFemales * 100.0) / totalResigned;

        System.out.println("\nEmployee Statistics:");
        System.out.println("Total newly hired employees: " + totalNewlyHired);
        System.out.println("Total permanent employees: " + totalPermanent);
        System.out.println("Total resigned employees: " + totalResigned);
        System.out.println("Percentage of newly hired males: " + percentageNewlyHiredMales + "%");
        System.out.println("Percentage of newly hired females: " + percentageNewlyHiredFemales + "%");
        System.out.println("Percentage of males in permanent position: " + percentagePermanentMales + "%");
        System.out.println("Percentage of females in permanent position: " + percentagePermanentFemales + "%");
        System.out.println("Percentage of resigned males: " + percentageResignedMales + "%");
        System.out.println("Percentage of resigned females: " + percentageResignedFemales + "%");

        scanner.close();
    }
}
