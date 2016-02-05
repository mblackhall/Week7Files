###Question 3

Given:
```java
3.public class Tenor extends Singer {
4.   public static String sing() { return "fa"; }
5.   public static void main(String[] args) {
6.    Tenor t = new Tenor();
7.    Singer s = new Tenor();
8.    System.out.println(t.sing() + " " + s.sing());
9.    }
10. }
11 class Singer { public static String sing() { return "la"; }}

```
What is the result?
A. fa fa
B. fa la
C. la la
D. Compilation fails
E. An exception is thrown at runtime