package Activities;
//Abstract class
abstract class Book {
 String title;

 // Abstract method
 abstract void setTitle(String s);
 
 // Concrete method
 String getTitle() {
     return title;
 }
}

//MyBook class extends the abstract class
class MyBook extends Book {
 // Implementation of the abstract method
 public void setTitle(String s) {
     title = s;
 }
}

public class Activity5 {
 public static void main(String[] args) {
     // Create object for MyBook
     Book newNovel = new MyBook();
     
     // Set title
     String title = "The Great Gatsby";
     newNovel.setTitle(title);
     
     // Print result
     System.out.println("The title is: " + newNovel.getTitle());
 }}




