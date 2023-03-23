package assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Requirements for collection type:
Duplicate Strings may be required
Key value pair not required
Insert and delete method required
"Natural" sorting required
Simple implementation
Choose arrayList
 */

public class App {

  public static void main(String[] args) {

    ArrayList<String> textArrayList = new ArrayList<String>();

    Scanner myObj = new Scanner(System.in);
    String name;

    do {
      System.out.println(
          "Pls enter the set of names one by one:\n [or type exit to end the App]\n");
      name = myObj.nextLine();
      System.out.println(name.toString());
      if (!name.equals("exit")) {
        textArrayList.add(name);
      }
    } while (!name.equals("exit"));

    Collections.sort(textArrayList);
    System.out.println("arrayList" + ": " + textArrayList);
  }
}