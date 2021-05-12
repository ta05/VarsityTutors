# Student

Implement the Student class which includes the following method development:  

1. Implement an accessor **getAverage** that can return the average of the grades in the record.  
2. Implement an accessor **getName** that can return the name of the calling student.  
3. Implement the **toString** method that can return the letter grade "A"-"F". The grading is based on the following Numeric-to-letter scale:
    - A: [90 - 100]
    - B: [80 - 90)
    - C: [65 - 80)
    - D: [60 - 65)
    - F: [0 - 60)  
4. Implement the **compareTo** that uses an Object type variable as the parameter, but can accept a Student object as an argument. It returns an integer(-1, 1 or 0) to indicate whether the average of this object is less than, greater than or equal to that of the parameter.