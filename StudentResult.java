class StudentResult{
  public static void main(String[] args){
    String name="Swetha";
    int rollnumber=101;
    int math=85;
    int science=90;
    int english=88;
    int computer=95;
    int social=80;
    int total=math+science+english+computer+social;
    double average=total/5.0;
    char grade;
    if(average>=90){
      grade='A';
    }
    else if(average>=75){
      grade='B';
    }
    else if(average>=60){
      grade='C';
    }
    else{
      grade='D';
    }
    System.out.println("Student Name:"+name);
    System.out.println("Roll Number:"+rollnumber);
    System.out.println("Total Marks:"+total);
    System.out.println("Average:"+average);
    System.out.println("Grade:"+grade);
  }
}
