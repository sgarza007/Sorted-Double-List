//Gets user command of what they want to do with the list

import java.util.*;

public class menu {
 public static void main(String args[]) {
  SortedDoubleList list = new SortedDoubleList();
  Scanner kb = new Scanner(System.in);
  System.out.println("Hello, I am Baymax, and I am here to help  you out! We offer several different methods including: ");
  System.out.println("Creating your own list of numbers\nLocating the position of an item\nInserting an item\nDeleting an item\nDisplaying the contents\nAnd resetting your list");
  System.out.println("One thing to keep in mind is that you can have no more than 100 items per list, so please be considerate of Baymax.");
  System.out.println("We will start you off by creating a list. It is CRUCIAL that you enter items in a sorted way: from SMALLEST to GREATEST. Thank you and Enjoy.");
  list.getItems();
  System.out.println("Alrighty! Thanks for filling out the list. Baymax will now double check to make sure it is filled out, otherwise you really can't do anything");
  if (list.ListIsEmpty()) {
   System.out.println("See,Baymax doesn't trust everyone. The program will now exit. Try again!");
   System.exit(0);
  }
  System.out.println("Below is a directory of the different methods, to access them, please enter the number corresponding to each one.");
  System.out.println("1:Locating Position\n2:Inserting Item\n3:Deleting Item\n4:Display the Content\n5:Reset List\n6:Creating List After Reset\n8:Number at Position\n0:To Dismiss Baymax");
  int command = kb.nextInt();
  double newItem;
  int pos;
  do {
   switch (command) {
    case 1:
     System.out.println("You've chosen to Locate an Item. What item would you like to locate?");
     newItem = kb.nextDouble();
     list.LocateIndex(newItem);
     System.out.println("Would you like to try another method? Just type it in! If you want to see the list of commands type 7");
     command = kb.nextInt();
     break;
    case 2:
     System.out.println("You've chosen to Insert an Item. What item would you like to insert? Baymax will display the list of items: ");
     list.ShowNewItems();
     newItem = kb.nextDouble();
     list.ListInsert(newItem);
     System.out.println("Here is the modified list: ");
     list.ShowNewItems();
     System.out.println("Would you like to try another method? Just type it in! If you want to see the list of commands type 7");
     command = kb.nextInt();
     break;
    case 3:
     System.out.println("You've chosen to Delete an Item, good choice. What item would you like to delete? Baymax will display list of items: ");
     list.ShowNewItems();
     newItem = kb.nextDouble();
     list.ListDeletion(newItem);
     System.out.println("Here is the modified list: ");
     list.ShowNewItems();
     System.out.println("Would you like to try another method? Just type it in! If you want to see the list of commands type 7");
     command = kb.nextInt();
     break;
    case 4:
     System.out.println("You've chosen to Display the List of Items.");
     list.ShowNewItems();
     System.out.println("Would you like to try another method? Just type it in! If you want to see the list of commands type 7");
     command = kb.nextInt();
     break;
    case 5:
     System.out.println("You've chosen to Reset you List.");
     list.ResetList();
     System.out.println("Would you like to try another method? Just type it in! If you want to see the list of commands type 7");
     command = kb.nextInt();
     break;
    case 6:
     System.out.println("You've chosen to Create a List");
     list.getItems();
     System.out.println("Would you like to try another method? Just type it in! If you want to see the list of commands type 7");
     command = kb.nextInt();
     break;
    case 7:
     System.out.println("1:Locating Position\n2:Inserting Item\n3:Deleting Item\n4:Display the Content\n5:Reset List\n6:Creating List After Reset\n8:Number at Position\n0:To Dismiss Baymax");
     System.out.println("Would you like to try another method? Just type it in!");
     command = kb.nextInt();
     break;
    case 8:
     System.out.println("You've chosen to Locate an Item at a certain position. What position wouldyou like to know?");
     pos = kb.nextInt();
     list.getNum(pos);
     System.out.println("Would you like to try another method? Just type it in! If you want to see the list of commands type 7");
     command = kb.nextInt();


   }
  } while (command != 0);
  if (command == 0) {
   System.out.println("Baymax appreciates your time. Thanks for trying!");
   System.exit(0);
  }
 }
}
