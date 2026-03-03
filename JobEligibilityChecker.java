class JobEligibilityChecker{
  public static void main(String[] args){
    int age=23;
    boolean degreeCompleted=true;
    int experience=3;
    boolean blacklisted=false;
    boolean eligible=age>=21 && degreeCompleted && experience>=2 && !blacklisted;
    System.out.println("Candidate Eligible:"+eligible);
  }
}
