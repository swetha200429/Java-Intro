import java.util.ArrayList;
class LibrarySystem{
  public static void main(String[] args){
    String libraryName="City Library";
    String[] bookCategories={"Fiction","Science","Technology"};
    ArrayList<String> books=new ArrayList<>();
    books.add("java Programming");
    books.add("Data Structures");
    books.add("Artificial Intelligence");
    System.out.println("Library:"+libraryName);
    System.out.println("Categories:");
    for(String category:bookCategories){
      System.out.println("-"+category);
    }
    System.out.println("Books Available:");
    for(String book:books){
      System.out.println("-"+book);
    }
  }
}
