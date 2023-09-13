# Blood Bank Availability

## Problem

Blood types in humans are determined by two antigens, `A` and `B` and Rh factor which is represented by `+` and `-`, resulting in a total of 8 different blood types:

`O-`, `O+`, `A-`, `A+`, `B-`, `B+`, `AB-`, `AB+`

If a person needs a transfusion, they have to get the blood from a selected group of blood types, otherwise their antibodies will react and the patient will face a serious infection called "Acute Haemolytic Reaction" which requires further intensive care for the patient. The blood compatibility chart is as follows:

| Blood Type | Gives | Receives |
|:----------:|:-----:|:--------:|
| `O-` | `EVERYONE` | `O-`|
| `O+` | `O+`, `A+`, `B+`, `AB+` | `O-`, `O+` |
| `A-` | `A-`, `A+`, `AB-`, `AB+` | `O-`, `A-` |
| `A+` | `A+`, `AB+` | `O-`, `O+`, `A-`, `A+` |
| `B-` | `B-`, `B+`, `AB-`, `AB+` | `O-`, `B-` |
| `B+` | `B+`, `AB+` | `O-`, `O+`, `B-`, `B+` |
| `AB-` | `AB-`, `AB+` | `O-`, `A-`, `B-`, `AB-` |
| `AB+` | `AB+` | `EVERYONE` |

Assume you work in a hospital and you are responsible for the IT infrastructure. You noticed that the Emergency Room (ER) has some problems with their communication with the blood bank. Occasionally, the ER needs specific blood types for patients, and they have to get the blood as soon as possible. However, when they call the blood bank, it takes a lot of time to get a response from them.

Luckily you know how to implement and run a program in Python where you can use lists, string inputs, and conditionals to create a program based on your needs.

We know that we have a primary blood bank located inside the hospital. In shortages, we have an agreement with a secondary blood bank close to our hospital but we prefer the primary one due to speed and lower costs.

In our program, we need to know which blood types are availbale in the primary and secondary blood banks, and what blood type is neeeded by the ER. After finding the required information, we must provide an immediate answer to the, regarding the availability of the blood typer.

Additionally, sometimes some patients require enormous amounts of transfusion, therefore our ER team must know the amount in the blood banks and whether there is a limited amount of blood for the selected blood type. The blood banks record their inventory information with a single letter as follows:
- **P**: There is plenty of this blood type.
- **S**: There is a scarce amount of this blood type.
- **I**: There is insufficient blood left for this blood tupe.

## Input

Your program must take three lines of inputs:
1. A string of length 8, symbolizing blood inventory in the primary blood bank.
2. A string of length 8, symbolizing blood inventory in the secondary blood bank.
3. The required blood type from the ER.

Both string inputs will contain the information in the following order: `O-`, `O+`, `A-`, `A+`, `B-`, `B+`, `AB-`, `AB+`

For example: `"PSIIPPSI"` means there is plenty of `O-` type, a scarce amount of `O+`, Insufficient `A-`, etc.

## Output

Output the following information based on inputs

~~~
"Blood Type" in the primary blood bank stocks is "Amount".
"Blood Type" in the secondary blood bank stocks is "Amount".
~~~

Where "Amount" is filled with one of the following:
- plenty
- scarce
- insufficient

## Reflection

We are still learning some of the basics of programming, so the capabilities of programs we can create are still fairly limited. Assuming we had the knowledge already, what are some features we could add that would make this program far more useful in the field? If multiple nurses and doctors in the same hospital are using our software simultaneously, what problems might arise due to how we've structured this program.

## Sample Executions

~~~
PRIMARY > PSPSPSPS
SECONDARY > ISISISPP
TYPE > AB-
~~~

~~~
AB- in the primary blood bank stocks is plenty.
AB- in the secondary blood bank stocks is plenty.
~~~


~~~
PRIMARY > PSIIPSPP
SECONDARY > SPSPPPII
TYPE > A-
~~~

~~~
A- in the primary blood bank stocks is insufficient.
A- in the secondary blood bank stocks is scarce.
~~~