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
   mutator (setter) method
   @param num the policy number
   */
   public void setPolicyNumber(int num)
   {
      policyNum = num;
   }

   
   /**
   accessor (getter) method
   @return the policy number
   */
   public int getPolicyNumber()
   {
      return policyNum;
   }
   
   /**
   mutator (setter) method
   @param num the policy number
   */
   public void setProviderName(String name)
   {
      providerName = name;
   }

   
   /**
   accessor (getter) method
   @return the provider's name
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   mutator (setter) method
   @param num the policy number
   */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }

   
   /**
   accessor (getter) method
   @return the policyholder's first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   
   /**
   mutator (setter) method
   @param num the policy number
   */
   public void setLastName(String lName)
   {
      lastName = lName;
   }

   
   /**
   accessor (getter) method
   @return the policyholder's last name
   */
   public String getLastName()
   {
      return lastName;
   }
   
   
   /**
   mutator (setter) method
   @param num the policy number
   */
   public void setAge(int a)
   {
      age = a;
   }

   
   /**
   accessor (getter) method
   @return the policy holder's age
   */
   public int getAge()
   {
      return age;
   }
   
   
   /**
   mutator (setter) method
   @param num the policy number
   */
   public void setSmokingStatus(String ss)
   {
      smokingStatus = ss;
   }

   
   /**
   accessor (getter) method
   @return the policyholder's smoking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   
   /**
   mutator (setter) method
   @param num the policy number
   */
   public void setHeight(double h)
   {
      height = h;
   }

   
   /**
   accessor (getter) method
   @return the policyholder's height
   */
   public double getHeight()
   {
      return height;
   }
   
   
   /**
   mutator (setter) method
   @param num the policy number
   */
   public void setWeight(double w)
   {
      weight = w;
   }

   
   /**
   accessor (getter) method
   @return the policyholder's weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
   method for getting the policyholder's BMI
   @return the policyholder's BMI
   */
   public double getBMI()
   {
      double BMI = (weight * 703.0 ) / (height * height );
      return BMI;
   }
   
   /**
   method that calculates price of the insurance policy
   @return the price of the insurance policy
   */
   
   public double getInsurancePolicyFee()
   {
      double insurance = 600;
      double currentBMI;
      
      if(age > 50)
         insurance += 75;
      if(smokingStatus.equalsIgnoreCase("smoker"))
         insurance += 100;
      currentBMI = getBMI(); 
      if(currentBMI > 35)
         insurance += ( currentBMI - 35 ) * 20;
           
      return insurance;
   }

   
}