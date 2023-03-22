package assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*
Requirements for collection type:
Duplicates [keys] not needed
Key value pair
Get and put methods
Speed is more important than memory usage
key based alpha ordering not required
Indexing not required
 */
public class App {

  public static void main(String[] args) {

    Map<String, Integer> textMap = new HashMap<String, Integer>();

    Scanner myObj = new Scanner(System.in);
    System.out.println("Pls enter a string:\n");
    String name = myObj.nextLine();

    for (int i = 0; i < name.length(); i++) {
      if (!textMap.containsKey(name.substring(i, 1 + i))) {
        textMap.put(name.substring(i, 1 + i), 1);

      } else {
        textMap.put(name.substring(i, 1 + i), textMap.get(name.substring(i, 1 + i)) + 1);
      }
    }
    System.out.println(name + ": " + textMap);
  }
}
