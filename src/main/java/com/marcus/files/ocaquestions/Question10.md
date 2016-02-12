###Question 10
Given:
```java
3. public class Ouch {
4.   static int ouch = 7;
5.   public static void main(String[] args) {
6.      new Ouch().go(ouch);
7.      System.out.print(" " + ouch);
8.   }
9.   void go(int ouch) {
10.     ouch++;
11.     for(int ouch = 3; ouch < 6; ouch++)
12.     ;
13.     System.out.print(" " + ouch);
14.  }
15. }
```
**What is the result?**
A. 5 7
B. 5 8
C. 8 7
D. 8 8
E. Compilation fails
F. An exception is thrown at runtime