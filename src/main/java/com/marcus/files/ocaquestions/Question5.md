###Question 5
Given:
```java
import java.util.*;
public class Sequence {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("apple");
        myList.add("carrot");
        myList.add("banana");
        myList.add(1, "plum");
        System.out.print(myList);
    }
}
```
What is the result?

A. [apple, banana, carrot, plum]
B. [apple, plum, carrot, banana]
C. [apple, plum, banana, carrot]
D. [plum, banana, carrot, apple]
E. [plum, apple, carrot, banana]
F. [banana, plum, carrot, apple]
G. Compilation fails