class ConstantsExample{
  public static void main(String[] args){
    final double PI=3.14233;
    final double INTEREST_RATE=0.08;
    double radius=7;
    double principle=50000;
    int time=2;
    double area=PI*radius*radius;
    double interest=principle*INTEREST_RATE*time;
    System.out.println("Circle Area:"+area);
    System.out.println("Simple Interest:"+interest);
  }
}
