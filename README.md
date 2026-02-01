# A0 List ADT
CSC 210: Data Structures

## General Information
Your readme should include the following information. Each student needs to submit all of this information.

Your name: Michelle Jiang

Other students you worked with, including TAs:

If anyone was particularly helpful, please give them a shoutout here!: 

## References

### References used (besides JavaDoc and course materials):
[List Java documentation](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)
[Arraylist](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
[Abstraction slides from CSC120](https://moodle.smith.edu/pluginfile.php/1900733/mod_resource/content/9/18-abstraction.pdf)
[List.size() Exceptions](https://www.boardinfinity.com/blog/listsize-in-java/)

### If you used AI at all for this assignment: How did you use it? What did this experience teach you?
None

## Reflection Questions

### What was your overall experience with this assignment? What was hardest? What was easiest?
I found writing the unit tests to be somewhat easy since it was something I had done in CSC120. I found writing the interface to be somewhat difficult--specifically the error catching (ie exceptions) and the assumptions. Overall a good first assignment. 

### What was your hardest ListADT design decision, and why?
Hardest would be the assumptions and exceptions because I wasn't sure which exceptions were common for the specific method. 

### What assumptions did you make while designing ListADT?
A ListADT object would be created using the parameter (E indicating the type of element in the list) with initial size being zero (ie empty) and initial capacity of 10. Can also initialize with specified intial capacity. As such, the initial state of the list would be new List<Type element> 
I basically took the information from the ArrayList and List classes on the JavaDoc. 