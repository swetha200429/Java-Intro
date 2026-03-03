class ExamRankAnalyzer{
  public static void main(String[] args){
    int student1Marks=87;
    int student2Marks=90;
    int passMark=40;
    if(student1Marks>student2Marks){
      System.out.println("Student 1 is Topper");
    }
    else if(student1Marks<student2Marks){
      System.out.println("Student 2 is Topper");
    }
    else if(Student1Marks==student2Marks){
      System.out.println("Both have equal marks");
    }
    System.out.println("Student 1 Passed:"+(student1Marks>=passMark));
    System.out.println("Student 2 Passed:"+(student2Marks>=passMark));
  }
}
