# A0 Tests

Use the table below to describe your test cases. Each row should describe one test.

| Test name | Setup (steps) | Operation | Expected result | Exception? |
| --- | --- | --- | --- | --- |
| Example: get on empty list | Create empty list | get(0) | n/a | IndexOutOfBoundsException |
| Add item to list | Create empty list with type Integer | ListADT.add(0) | list size += 1 and has value 0 | n/a |
| Add incorrect type item to list | Create an empty list with type int / Using the same list as before | ListADT.add("zero") | n/a | RuntimeException | 
| Query size of list | using same list as before | ListADT.size() | 1 | n/a |
| Query size of null list | create null list | ListADT.size() | n/a | NullPointerException | 
| Get index 0 | create list with type int and add 0, 1, 2 | ListADT.get(0) | 0 | n/a | 
| Get index of empty list | create empty list | ListADT.get(0) | n/a | RuntimeException | 
| Get index = size | create list with type int and add 0, 1, 2 | ListADT.get(ListADT.size()) | n/a | RuntimeException | 
| Get index = size-1 | create list with type int and add 0, 1, 2 | ListADT.get(ListADT.size()-1) | 3 | n/a |
| Remove from empty list | create empty list | ListADT.remove(0) | n/a | RuntimeException | 
| Remove index 0 | create list with type int and add 0, 1, 2 | ListADT.remove(0) | ListADT = [1, 2] | n/a | 
| Remove index = size | create list with type int and add 0, 1, 2 | ListADT.remove(ListADT.size()) | n/a | RuntimeException | 
| Remove index = size-1 | create list with type int and add 0, 1, 2 | ListADT.remove(ListADT.size()-1) | ListADT = [0, 1] | n/a | 