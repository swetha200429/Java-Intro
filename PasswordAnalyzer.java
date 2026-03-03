class PasswordAnalyzer{
  public static void main(String[] args){
    String password="Swetha@123";
    boolean hasUpper=false;
    boolean hasDigit=false;
    boolean hasSpecial=false;
    for(inti=0;i<password.length();i++){
      char ch=password.charAt(i);
      if(Character.isUpperCase(ch)){
        hasUpper=true;
      }
      else if(Character.isDigit(ch)){
        hasDigit=true;
      }
      else if(!Character.isLetterOrDigit(ch)){
        hasSpecial=true;
      }
    }
    System.out.println("Has Uppercase:"+hasUpper);
    System.out.println("Has Digit:"+hasDigit);
    System.out.println("Has Special Character:"+hasSpecial);
  }
}
