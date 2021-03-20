# Reorganize

Given a dictionary with keys of the names of employees and values that are dictionaries whose keys are the tasks and values are the hours worked on that task, return a new dictionary whose keys are the tasks and values are a dictionary whose keys are the names of the employees working on the task and values are the hours worked on that task by that employee.


Example:

- Input: {'Clark': {'task1': 8}, 'Lois': {'task1': 4, 'task2': 6}. 'Jimmy': {'task2': 2, 'task3': 2}}

- Output: {'task1': {'Clark': 8, 'Lois': 4}, 'task2': {'Lois': 6, 'Jimmy': 2}, 'task3': {'Jimmy': 3}}