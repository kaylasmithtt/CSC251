import java.util.Scanner;

public class Project_Kayla_Smith
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      //variables
      int policyNum;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      
      System.out.print("Please enter the Policy Number: ");
      policyNum = keyboard.nextInt();
      
      keyboard.nextLine();//clear the buffer
      
      System.out.print("\nPlease enter the provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      
      System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      Policy p = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight);
      System.out.print("\nPolicy Number: " + p.getPolicyNumber());
      System.out.print("\nProvider Name: " + p.getProviderName());
      System.out.print("\nPolicyholder's First Name: " + p.getFirstName());
      System.out.print("\nPolicyholder's Last Name: " + p.getLastName());
      System.out.print("\nPolicyholder's Age: " + p.getAge());
      System.out.print("\nPolicyholder's Smoking Staus: " + p.getSmokingStatus());
      System.out.print("\nPolicyholder's Height: " + p.getHeight());
      System.out.print("\nPolicyholder's Weight: " + p.getWeight());
      System.out.printf("\nPolicyholder's BMI:%.2f ", p.getBMI());
      System.out.printf("\nPolicy Price: $%.2f", p.getInsurancePolicyFee());
      

   }
}