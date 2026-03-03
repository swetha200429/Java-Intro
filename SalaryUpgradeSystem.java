class SalaryUpgradeSystem{
  public static void main(String[] args){
    int baseSalary=30000;
    long yearlyBonus=baseSalary;
    float adjustedSalary=yearlyBonus;
    double finalSalary=adjustedSalary;
    finalSalary+=15000.75;
    System.out.println("Base Salary(int):"+baseSalary);
    System.out.println("Yearly Bonus(long):"+yearlyBonus);
    System.out.println("Adjusted Salary(float):"+adjustedSalary);
    System.out.println("Final Salary(double):"+finalSalary);
  }
}
