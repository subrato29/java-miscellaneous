# enum

What is `enum`
```
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. 
Note that they should be in uppercase letters:

```

Why Java Enums?
```
In Java, enum was introduced to replace the use of int constants.

```

```
Suppose we have used a collection of int constants.

class Size {
   public final static int SMALL = 1;
   public final static int MEDIUM = 2;
   public final static int LARGE = 3;
   public final static int EXTRALARGE = 4;
}

```

```
Here, the problem arises if we print the constants. It is because only the number is printed which might not be helpful.

So, instead of using int constants, we can simply use enums. For example,

enum Size {
   SMALL, MEDIUM, LARGE, EXTRALARGE
}

```