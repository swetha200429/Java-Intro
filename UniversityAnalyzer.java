class Universityanalyzer{
  public static void main(String[] args){
    double totalMarks=487.75;
    int subjects=5;
    double percentage=totalMarks/subjects;
    int gradeScore=(int) percentage;
    float scholarshipAmount=gradeScore;
    scholarshipAmount=scholarshipAmount*10;
    System.out.println("Total Marks:"+totalMarks);
    System.out.println("Percentage:"+percentage);
    System.out.println("Grade Score (int):"+gradeScore);
    System.out.println("Scholarship Amount:"+scholarshipAmount);
  }
}
