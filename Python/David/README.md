# Schedule

## Overview

Upon completion of this assignment, you should be able to run file a6_in_action.py, which demonstrate how your code might be used: it creates a class roster, and then a personal schedule, and then tries adding courses to that personal schedule.

## Schedule Class

The Schedule class is used to represent both individual schedules and course rosters. Because of the latter application, one is allowed to add conflicting courses to an arbitrary Schedule via the add() method.  

The warnings attribute simulates messages that might be passed to interested parties when, for example, a Course is rescheduled. You may find the following observations useful when you work with a Schedule’s dictionary attribute courses.  

If d is a dictionary whose keys are strings and whose values are Course objects, then:
- You can write for-loops over d, and the loop variable will be assigned each key of d in turn.
- d.values() returns a list of the values stored in d.

## StudentSchedule Class

A StudentSchedule is a special kind of Schedule that doesn’t allow a Course to be added to it if that addition would cause a time conflict — instead, a warning is generated. This Python class thus overrides the add() method of Schedule. But it can inherit all the other Schedule methods as is, so there are no other methods defined within this subclass!

## Course Class

As stated in file schedule.py, Course objects must have attributes name and in_schedules, but you will add more attributes and methods, and even Python classes as you see fit to identify and handle time conflicts. Attribute in_schedules tracks which Schedules a given Course is part of, so that if the Course gets rescheduled, all those Schedules can be updated, or at least warned.
