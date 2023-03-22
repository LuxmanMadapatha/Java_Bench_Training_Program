package assignment6;

import java.util.LinkedList;
import java.util.Scanner;

/*
Requirements for collection type:
Key value pair not required
Insert and delete method required
Linked list type data structure
 */

public class App {

  public static void main(String args[]) {

    LinkedList<String> ll = new LinkedList<String>();

    ll.add("StationA");
    ll.add("StationB");
    ll.add("StationC");
    ll.add("StationD");
    ll.add("StationE");
    ll.add("StationF");

    System.out.println("List of stations and their indices");
    for (int x = 0; x < ll.size(); x++) {

      System.out.println(x + ": " + ll.get(x));
    }

    Scanner myObj = new Scanner(System.in);
    System.out.println("\nPls enter the start index [station]");
    int start = myObj.nextInt();

    System.out.println("Pls enter the end index [station]");
    int end = myObj.nextInt();

    if (start < end) {

      for (int x = start; x <= end; x++) {

        if (x < end) {
          System.out.print((x) + ":" + ll.get(x) + " -> ");
        } else {
          System.out.print((x) + ":" + ll.get(x));
        }


      }
    }
    if (start > end) {

      int y = 0;
      for (int i = end; i <= start; i++) {
        if (i < start) {
          System.out.print((start - y) + ":" + ll.get(start - y) + " -> ");
        } else {
          System.out.print((start - y) + ":" + ll.get(start - y));
        }
        y += 1;
      }

    }
  }
}


