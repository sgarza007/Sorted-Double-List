{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf830
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 //Author:Saul Garza\
//Description: This project has several methods one can use. It is of type double and can perform different tasks within the list.\
\
\
import java.util.*;\
public class SortedDoubleList \{\
 private static final int ListSize = 100;\
 public double[] items;\
 public int numItems;\
\
 public SortedDoubleList() //Constructor\
  \{\
   numItems = 0;\
   items = new double[ListSize];\
  \}\
 public void getItems() //Ask user for the items\
  \{\
   System.out.println("How many digits would you like to enter?");\
   Scanner kb = new Scanner(System.in);\
   numItems = kb.nextInt();\
   System.out.println("Please enter " + numItems + " digits. Make sure they are in ascending order please.");\
   for (int i = 0; i < numItems; i++) \{\
    items[i] = kb.nextDouble();\
   \}\
  \}\
 public boolean ListIsEmpty() //Checks if the list is empty\
  \{\
   return (numItems == 0);\
  \}\
 public int ListLength() //Finds Out how many items are in the list\
  \{\
   return numItems;\
  \}\
 public void LocateIndex(double locItem) //Locates where an item is so user knows\
  \{\
   int flag = 0;\
   int pos = 0;\
   for (int i = 0; i <= numItems; i++) \{\
    if (items[i] == locItem) \{\
     flag = 1;\
     pos = i;\
     break;\
    \}\
   \}\
   if (flag == 1) \{\
    pos += 1;\
    System.out.println(locItem + " is located at position " + pos);\
   \} else \{\
    System.out.println("Item is not on the list");\
   \}\
  \}\
 public void getNum(int pos) //Gets item at whatever position user wants\
 throws IndexOutOfBoundsException \{\
  if (pos >= 1 && pos <= numItems) \{\
   System.out.println("The number at position " + pos + " is: " + items[pos - 1]);\
  \} else \{\
   throw new IndexOutOfBoundsException("The position is invalid");\
  \}\
 \}\
\
 private int getPosition(double newItem) //privately locates position of item being deleted or inserted\
  \{\
   int flag = 0;\
   int pos = 0;\
   int i;\
   for (i = 0; i <= numItems; i++) \{\
    if (items[i] >= newItem) \{\
     flag = 1;\
     pos = i;\
     break;\
    \}\
   \}\
   if (flag == 1) \{\
    pos = i;\
   \} else \{\
    pos = numItems;\
   \}\
   return pos;\
  \}\
 public void ListInsert(double newItem) //inserts new item\
 throws RuntimeException \{\
  int pos = 0;\
  if (numItems >= ListSize) \{\
   throw new RuntimeException("Theres more numbers than allowed");\
  \} else if (numItems == 0) \{\
   items[0] = newItem;\
  \} else \{\
   pos = getPosition(newItem);\
   for (int i = numItems; i > pos; i--) \{\
    items[i] = items[i - 1];\
   \}\
   items[pos] = newItem;\
   numItems++;\
  \}\
 \}\
 public void ListDeletion(double delItem) //deletes desired number\
  \{\
   int pos = getPosition(delItem);\
   if (items[pos] == delItem) \{\
    for (int i = pos; i < numItems; i++) \{\
     items[i] = items[i + 1];\
    \}\
    numItems--;\
   \} else \{\
    System.out.println("The item does not exist in the list");\
   \}\
\
  \}\
 public void ShowNewItems() //displays new array with insertion and or deletion\
  \{\
   for (int i = 0; i < numItems; i++) \{\
    System.out.println(items[i]);\
   \}\
  \}\
 public void ResetList() //Resets list\
  \{\
   items = new double[ListSize];\
   numItems = 0;\
  \}\
\}}