class EmailValidator{
  public static void main(String[] args){
    String email="swetha@gmail.com";
    boolean hasAt=email.contains("@");
    boolean validDomain=email.endsWith(".com");
    String username="";
    String domain="";
    if(hasAt){
      int atIndex=email.indexOf("@");
      username=email.substring(0,atIndex);
      domain=email.substring(atIndex+1);
    }
    System.out.println("Email:"+email);
    System.out.println("Contains '@':"+hasAt);
    System.out.println("Valid .com domain:"+validDomain);
    System.out.println("Username:"+username);
    System.out.println("Domain:"+domain);
    if(hasAt && validDomain){
      System.out.println("Status: Valid Email Address");
    }
    else{
      System.out.println("Status: Invalid Email Address");
    }
  }
}
