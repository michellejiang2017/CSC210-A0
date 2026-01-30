# A0 Tests

Use the table below to describe your test cases. Each row should describe one test.

| Test name | Setup (steps) | Operation | Expected result | Exception? |
| --- | --- | --- | --- | --- |
| Example: get on empty list | Create empty list | get(0) | n/a | IndexOutOfBoundsException |
| Add item to list | Create empty list with type Integer | ListADT.add(0) | list size += 1 and has value 0 | n/a |
| Add incorrect type item to list | Create an empty list with type int / Using the same list as before | ListADT.add("zero") | n/a | RuntimeError | 
| Query size of list | using same list as before | ListADT.size() | 1 | n/a |
| Query size of null list | create null list | ListADT.size() | n/a | NullPointerException | 


// Wait but aren't you supposed to set up...first? 