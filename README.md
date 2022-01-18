# Java-Programs

In Java, Binary numerals are prefixed with a leading 0b (or 0B) (digit zero followed by char 'b')
### Following is the one method by which we can clear our console screen in JAVA

- Just add the following piece of code in your class.

``` 
       //The following line of code is used to clear the console, it uses the ANSI escape code 
       // \033 means ESC or the escape characte, 033 with [H, we can move the cursor to a specified position, 033[2J, cleans the whole screen.
       System.out.print("\033[H\033[2J");
       
       // Flushing out the remaining bytes
       System.out.flush(); 
```

We are using flush method to remove any unecessary value from our input stream and in other words we are removing any garbage value.

