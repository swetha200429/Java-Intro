class UniversityAdmission{
  public static void main(String[] args){
    String studentName="Swetha";
    int age=19;
    double gpa=9.0;
    boolean isEligible;
    char grade;
    if(gpa>=9){
      grade='A';
    }
    else if(gpa>=8){
      grade='B';
    }
    else{
      grade='C';
    }
    isEligible=gpa>=8.0;
    System.out.println("Student Name:"+studentName);
    System.out.println("Age:"+age);
    System.out.println("GPA:"+gpa);
    System.out.println("Grade:"+grade);
    system.out.println("Eligible for Admission:"+isEligible);
  }
}
