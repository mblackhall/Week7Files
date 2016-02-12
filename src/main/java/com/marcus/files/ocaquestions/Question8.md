###Question 8

Given:
```java
4. public class SpecialOps {
5.  public static void main(String[] args) {
6.      String s = "";
7.      boolean b1 = true;
8.      boolean b2 = false;
9.      if(( b2 = false ) | (21%5) > 2) s += "x";
10      if ( b1 || (b2 == true) )  s += "y";
11.     if(b2 == true) s += "z";
12.     System.out.println(s);
13.     }
14. }
```
**Which are true? (Choose all that apply.)**
A. Compilation fails
B. x will be included in the output
C. y will be included in the output
D. z will be included in the output
E. An exception is thrown at runtime