# Sean

## Sprnt Logs

Write three functions pertaining to sprnt logs

### Reorg

Given a dictionary with keys of the names of employees and values that are dictionaries whose keys are the tasks and values are the hours worked on that task, return a new dictionary whose keys are the tasks and values are a dictionary whose keys are the names of the employees working on the task and values are the hours worked on that task by that employee.


Example:

- Input: {'Clark': {'task1': 8}, 'Lois': {'task1': 4, 'task2': 6}. 'Jimmy': {'task2': 2, 'task3': 2}}

- Output: {'task1': {'Clark': 8, 'Lois': 4}, 'task2': {'Lois': 6, 'Jimmy': 2}, 'task3': {'Jimmy': 3}}

### Add Sprnt

Given two dictionaries whose keys are the tasks and values are a dictionary whose keys are the names of the employees working on the task and values are the hours worked on that task by that employee, return a new dictionary that combines the two dictionaries by summing the hours worked by each employee on each task.

Example:

- Input: {'task1': {'Jack': 5, 'Rae': 8, 'Nancy': 3}, 'task2': {'Rae': 10, 'Nancy': 2, 'Victoria': 7}, 'task3': {'Frank': 4, 'Nancy': 4, 'Victoria': 3}}, {'task1': {'Leila': 8, 'Hannah': 6}, 'task3': {'Leila': 2, 'Frank': 5, 'Rae': 5}, 'task2': {'Frank': 1, 'Hannah': 4}}

- Output: {'task1': {'Jack': 5, 'Rae': 8, 'Nancy': 3, 'Leila': 8, 'Hannah': 6}, 'task2': {'Rae': 10, 'Nancy': 2, 'Victoria': 7, 'Frank': 1, 'Hannah': 4}, 'task3': {'Frank': 9, 'Nancy': 4, 'Victoria': 3, 'Leila': 2, 'Rae': 5}}

### Add n Logs

Given a list of dictionaries whose keys are the names of employees and values that are dictionaries whose keys are the tasks and values are the hours worked on that task, return a dictionary that combines all employee logs in the list and whose keys are the tasks and values are a dictionary whose keys are the names of the employees working on the task and values are the hours worked on that task by that employee. The add_n_logs function should use the map and reduce functions as well as the `add_sprnt` and `reorg` functions you've already written.

- Input: [{'Jack': {'task1': 5}, 'Rae': {'task1': 8, 'task2': 10}, 'Frank': {'task3': 4}, 'Nancy': {'task2': 2, 'task1': 3, 'task3': 4}, 'Victoria': {'task2': 7, 'task3': 3}}, {'Leila': {'task1': 8, 'task3': 2}, 'Frank': {'task3': 5, 'task2': 1}, 'Rae': {'task3': 5}, 'Hannah': {'task1': 6, 'task2': 4}}, {'Tom': {'task4': 12}, 'Ann': {'task1': 7, 'task3': 3}, 'Jack': {'task2': 10, 'task4': 3}}, {'Leila': {'task4': 5}, 'Victoria': {'task1': 3, 'task3': 6}, 'Ron': {'task2': 8, 'task1': 5}, 'Nancy': {'task3': 4, 'task2': 3, 'task1': 2, 'task4': 1}}]

-Output: {'task1': {'Jack': 5, 'Rae': 8, 'Nancy': 5, 'Leila': 8, 'Hannah': 6, 'Ann': 7, 'Victoria': 3, 'Ron': 5}, 'task2': {'Rae': 10, 'Nancy': 5, 'Victoria': 7, 'Frank': 1, 'Hannah': 4, 'Jack': 10, 'Ron': 8}, 'task3': {'Frank': 9, 'Nancy': 8, 'Victoria': 9, 'Leila': 2, 'Rae': 5, 'Ann': 3}, 'task4': {'Tom': 12, 'Jack': 3, 'Leila': 5, 'Nancy': 1}}


## Unzip

Given a list of tuples whose elements are as follows - a number, a string and a dictionary - return a tuple of 3 lists, where the first is a list of the number from each tuple, the second is a list of the string from each tuple, and the third is a list of the dictionary from each tuple.

You should not use for loops or list comprehension, use higher-order functions (filter, map or reduce).

Example:

- Input: `[(1,"a",{1:"a"}),(2,"b",{2:"b"}),(3,"c",{3:"c"}),(4,"d",{4:"d"})]`

- Output: `([1, 2, 3, 4], ['a', 'b', 'c', 'd'], [{1: 'a'}, {2: 'b'}, {3: 'c'}, {4: 'd'}])`