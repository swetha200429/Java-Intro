class ResumeBuilder{
  public static void mainS(String[] args){
    String firstName="Swetha";
    String lastName="Rajagopal";
    String degree="B.Tech in AI and DS";
    String college="Vel Tech University";
    String skills="Java,SQL,Tableau,Python";
    String fullName=firstName+" "+lastName;
    String resumeSummary = "Hello, my name is " + fullName +
                ". I have completed " + degree +
                " from " + college +
                ". My key skills include " + skills + ".";
    System.out.println("----- RESUME SUMMARY -----");
    System.out.println(resumeSummary);
  }
}
