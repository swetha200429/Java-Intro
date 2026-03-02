class EmployeePayroll{
  public static void main(String[] args){
    String name="Ravi";
    int empId=1001;
    double basicSalary=4000;
    double hra=8000;
    double da=5000;
    double tax=3000;
    double grossSalary=basicSalary+hra+da;
    double netSalary=grossSalary-tax;
    System.out.println("Employee Name:"+name);
    System.out.println("Employee ID:"+empID);
    System.out.println("Gross ID:"+grossSalary);
    System.out.println("Net Salary:"+netSalary);
  }
}
