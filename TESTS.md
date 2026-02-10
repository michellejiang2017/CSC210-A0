# A0 Tests

Use the table below to describe your test cases. Each row should describe one test.

| Test name | Setup (steps) | Operation | Expected result | Exception? |
| --- | --- | --- | --- | --- |
| Example: get on empty list | Create empty list | get(0) | n/a | IndexOutOfBoundsException |
| Add item to list at index zero | Create empty list with type Integer | ListADT.add(0, 0) | list size += 1 and has value 0 | n/a |
| Add item to list at index = size | Create empty list with type Integer and add 0, 1 | ListADT.add(2, 2) | list size = 3 and has elements 0, 1, 2 | n/a |
| Add item to list at negative index | Create empty list with type Integer | ListADt.add(-1, 0) | n/a | IndexOutOfBoundsException |
| Query size of list | using same list as before | ListADT.size() | 1 | n/a |
| Get index 0 | create list with type Integer and add 0, 1, 2 | ListADT.get(0) | 0 | n/a | 
| Get index of empty list | create empty list | ListADT.get(0) | n/a | IndexOutOfBoundsException | 
| Get negative index of list | create empty list | ListADT.get(-1) | n/a | IndexOutOfBoundsException | 
| Get index = size | create list with type Integer and add 0, 1, 2 | ListADT.get(ListADT.size()) | n/a | IndexOutOfBoundsException | 
| Get index = size-1 | create list with type Integer and add 0, 1, 2 | ListADT.get(ListADT.size()-1) | 2 | n/a |
| Remove from empty list | create empty list | ListADT.remove(0) | n/a | IndexOutOfBoundsException | 
| Remove index 0 | create list with type Integer and add 0, 1, 2 | ListADT.remove(0) | ListADT = [1, 2] | n/a | 
| Remove index = size | create list with type Integer and add 0, 1, 2 | ListADT.remove(ListADT.size()) | n/a | IndexOutOfBoundsException | 
| Remove index = size-1 | create list with type Integer and add 0, 1, 2 | ListADT.remove(ListADT.size()-1) | ListADT = [0, 1] | n/a | 