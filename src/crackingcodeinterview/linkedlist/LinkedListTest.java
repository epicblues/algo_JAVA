package crackingcodeinterview.linkedlist;

public class LinkedListTest {


  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();

    list.add("hello");
    list.add("baka");

    list.add("muyaho");

    list.removeByIndex(1);

    System.out.println(list.get(1)); // muyaho

  }

}
