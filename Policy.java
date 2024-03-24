public class Policy
{
   //instance fields
   private int policyNum;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   //no-arg constructor
   public Policy()
   {
      policyNum = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
      
   }
   
   /**
   Constructor that accepts arguments
   @param num the policy number
   @param name the provider name
   @param fName the policyholder's first name
   @param lName the policyholder's last name
   @param a the policyholder's age
   @param ss the Policyholder’s Smoking Status
   @param h the plicyholder's height
   @param w the policyholder's weight
   */
   public Policy(int num, String name, String fName, String lName, int a, String ss, double h, double w)
   {
      policyNum = num;
      providerName = name;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = ss;
      height = h;
      weight = w;
   }
   
   /**
   accessor (getter) method
   @return the ppolicy number
   */
   public void getPolicyNumber()
   {
      return policyNum;
   }
   
   /**
   accessor (getter) method
   @return the provider's name
   */
   public void getProviderName()
   {
      return providerName;
   }
   
   /**
   accessor (getter) method
   @return the policyholder's first name
   */
   public void getFirstName()
   {
      return firstName;
   }
   
   /**
   accessor (getter) method
   @return the policyholder's last name
   */
   public void getLastName()
   {
      return lastName;
   }
   
   /**
   accessor (getter) method
   @return the policy holder's age
   */
   public void getAge()
   {
      return age;
   }
   
   /**
   accessor (getter) method
   @return the policyholder's smoking status
   */
   public void getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   accessor (getter) method
   @return the policyholder's height
   */
   public void getHeight()
   {
      return height;
   }
   
   /**
   accessor (getter) method
   @return the policyholder's weight
   */
   public void getWeight()
   {
      return weight;
   }
   
   /**
   method for getting the policyholder's BMI
   @return the policyholder's BMI
   */
   public double getBMI()
   {
      double BMI = (weight * 703 ) / (height * height );
      return BMI;
   }
   
   /**
   method that calculates price of the insurance policy
   @return the price of the insurance policy
   */
   
   public double getInsurancePolicy()
   {
      double insurance = 600;
      
      if(age > 50)
         insurance += 75;
      if(smokingStatus.equalsIgnoresCase("smoker"))
         insurance += 100;
      if(BMI > 35)
         insurance += ( BMI – 35 ) * 20;
           
      
   }

   
}