# Sprint Challenge: Java Fundamentals

## Introduction

We have a magical "piggy bank" (a piggy bank is the traditional name of a place to store coins, bill, money). The piggy
bank is magical because it can hold unlimited amounts of money. However, you can not get the money out of it.

## Instructions

### Create a Piggy Bank

Create a collection (array, arraylist, or hashmap) to represent the piggy bank. The collection can hold money. This money
can be:

- A Dollar worth $1.00
- A Quarter worth $0.25
- A Dime worth $0.10
- A Nickel worth $0.05
- A Penny worth $0.01

Each coin object should know its value, how many of that coin is in the object, and how to print its value.

### Create the Main Program

The main program will look something like this pseudocode (remember pseudocode is not meant to be syntactically correct
but explain the algorithm):

Create collection
- piggyBank.add(new Quarter())
- piggyBank.add(new Dime())
- piggyBank.add(new Dollar(5))
- piggyBank.add(new Nickel(3))
- piggyBank.add(new Dime(7))
- piggyBank.add(new Dollar())
- piggyBank.add(new Penny(10))
- Print the contents of the Piggy Bank
    - On the console should appear:
    ````
    1 Quarter
    1 Dime
    $5
    3 Nickel
    7 Dime
    $1
    10 Penny
    ````
- Print the value of the Piggy Bank
    - On the console should appear:
    ````
    The piggy bank holds $7.3
    ````

_Note_: Do not worry about the format of the 7.2 Either 7.2 or 7.20 would be correct. Also notice that we are not concerned
with adding the S for plurals with our names of our coins.

## Build from Source

Ensure that you have Git and JDK 11.

### Get the Source Code

```` bash
git clone https://github.com/d-vail/Sprint-Challenge-Java-Fundamentals.git
cd Sprint-Challenge-Java-Fundamentals
````

### Build and Run from the Command Line

To compile and build the project use:

```` bash
./gradlew build
````

To run the application use:

```` bash
./gradlew run
````

### Import into IntelliJ IDEA

Ensure JDK 11 is configured properly in the IDE.

- _From Welcome Screen_: Import Project -> Navigate to the project directory -> 
  Select `build.gradle`
- _From the Editor_: File -> New -> Project from Existing Sources -> Navigate to
  the project directory -> Select `build.gradle`