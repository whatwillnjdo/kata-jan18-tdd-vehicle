# kata-jan18-tdd-vehicle
  * Practice TDD & Pair Programming
  * Difficult Level - Intermediate

# This kata focuses on:
  * Test Driven Development (TDD)
  * JAVA concepts: Inheritance

# Rules for the kata:
  * Use the “RED – GREEN – REFACTOR” principle.
  * Try NOT to read ahead; complete the steps one-by-one as ordered.
  * Make sure that you have both positive and negative test cases.
  * Keep test coverage 100%
  
# Problem
    In this Kata we will be looking at the concept of Inheritance with the example of Vehicles on 
    how they can share their behaviours and states. 
    The challenge is to figure out where to place the fields and methods in each of the classes.
    For Eg:
      Vehicle -> Cars         -> Lexus, OutLander
              -> Motorcycle   -> Yahama
              
# STAGE 1:
  1. Create a class Vehicle.
  2. Create appropriate test to getName() and getSize()
  3. Create appropriate test to getCurrentVelocity() and getCurrentDirection().
  4. Create three methods in Vehicle steer(int direction), move(int velocity, int direction) and stop()
  
            class Vehicle {                                                                      
            //Method to add direction to the current direction
            void steer(int direction) { }
            //Method to add velocity to currentVelocity and direction to currentDirection.
            void move(int velocity, int direction) { }
            //Method to change the currentVelocity to zero
            void stop() { }
            }                                                                                                                                     
  
  # STAGE 2:
  1. Create a class Car.
  2. A Car has these list of features name, size, wheels, doors, gears, isManual.
  3. Create a field currentGear and initialize to 1. Write appropriate test to get the initial currentGear.
  4. Create two methods in Vehicle changeGear(int currentGear) and changeVelocity(int speed, int direction)
  
            class Car {                                                                      
            //Method to set or change the currentGear to the value passed
            void changeGear(int currentGear) { }
            //This Method is a special one which will to add speed to currentVelocity and direction to currentDirection.
            void changeVelocity(int speed, int direction) { }
            } 
            
# STAGE 3:
  1. Create a class Lexus.
  2. A Car has these list of features name, size, wheels, doors, gears, isManual.
  3. Create a field currentGear and initialize to 1. Write appropriate test to get the initial currentGear.
  4. Create two methods in Vehicle changeGear(int currentGear) and changeVelocity(int speed, int direction)
  
            class Car {                                                                      
            //Method to set or change the currentGear to the value passed
            void changeGear(int currentGear) { }
            //This Method is a special one which will to add speed to currentVelocity and direction to currentDirection.
            void changeVelocity(int speed, int direction) { }
            }             
