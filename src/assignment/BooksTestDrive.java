package assignment;


class Books {


  private String title;
  private String author;


  public Books(String title, String author) {
    this.title = title;
    this.author = author;
  }

  String getTitle() {
    return title;
  }

  String getAuthor() {
    return author;
  }

  void setTitle(String title) {
    this.title = title;

  }

  void setAuthor(String author) {
    this.author = author;
  }

}

public class BooksTestDrive {

  public static void main(String[] args) {

    Books[] myBooks = new Books[3];

    myBooks[0] = new Books("The Grapes of Java", "bob");
    myBooks[1] = new Books("The Java Gatsby", "sue");
    myBooks[2] = new Books("The Java Cookbook", "ian");

    for (int x = 0; x < myBooks.length; x++) {
      System.out.println(myBooks[x].getTitle() + " by " + myBooks[x].getAuthor());
    }

  }

}
