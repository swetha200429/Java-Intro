class HospitalRecord{
  public static void main(String[] args){
    int patientId=1001;
    String patientName="Swetha";
    byte age=22;
    float weight=55.5f;
    double height=1.65;
    char bloodGroup='O';
    boolean isAdmitted=true;
    double bmi=weight/(height*height);
    System.out.println("---- PATIENT RECORD ----");
    System.out.println("ID:"+patientId);
    System.out.println("Name:"+patientName);
    System.out.println("Age:"+age);
    System.out.println("Blood Group:"+bloodGroup);
    System.out.println("Admitted:"+isAdmitted);
    System.out.println("BMI:"+bmi);
  }
}
  
