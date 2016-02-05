### Question 4
Given:
```java

class Fork {
    public static void main(String[] args) {
        if(args.length == 1 | args[1].equals("test")) {
        System.out.println("test case");
        } else {
        System.out.println("production " + args[0]);
        }
    }
}
```
And the command-line invocation:
```
java Fork live2
```
What is the result?

A. test case
B. production live2
C. test case live2
D. Compilation fails
E. An exception is thrown at runtime