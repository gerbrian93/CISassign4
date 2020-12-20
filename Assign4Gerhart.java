/*
Name: Brian Gerhart
CSU ID: 2741107
CIS 265: Assignment 4
Description: This program Asks the user for more students to add to an initialized ArrayList. Once the
parameters are entered by the user the student object is created and stored inside the list. Once the 
user is done inputting students, the arraylist is converted into an array of size studentList.size().
Then i utilized code my code from assignment 3 to search the array for the inputted ID. 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Assign4Gerhart {

   public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
    String name;
    int idNum;
    float gpa;
    boolean isTransfer;
    String college;
   

    ArrayList<Student2> studentList = new ArrayList<>();//initialze arraylist 
while (true) {
  
    System.out.println("Do you have another Student to add?(Y or N)");
    char choice = input.next().charAt(0);
     //nested if, else if, else statements will prompt us to create student objects.       
           if (choice == 'Y' || choice == 'y') {
              
              System.out.println("Undergraduate or Graduate? (U for undergrad, G for grad)"); 
              char choice2 = input.next().charAt(0);
               if (choice2 == 'U' || choice2 == 'u') {
               //input fields for undergrad
               System.out.print("Name: ");
                  input.nextLine();
                  name = input.nextLine();
               System.out.print("ID: ");
                  idNum = input.nextInt();
               System.out.print("GPA: ");
                  gpa = input.nextFloat();
               System.out.print("Transfer student?: ");
               isTransfer = input.nextBoolean();
               System.out.println("");
              //creates undergraduate object
               UndergradStudent student = new UndergradStudent(name, idNum, gpa, isTransfer);
               studentList.add(student);//stores undergraduate object in studentList
                                   
               }
               else if (choice2 == 'G' || choice2 == 'g') {
               //input fields for grad
                System.out.print("Name: ");
                   input.nextLine();
                   name = input.nextLine();
               System.out.print("ID: ");
                   idNum = input.nextInt();
                System.out.print("GPA: ");
                   gpa = input.nextFloat();
                System.out.print("College for undergrad?: ");
                  input.nextLine();
                  college = input.nextLine();
                  System.out.println("");
               //creates gradstudent object
               GradStudent student = new GradStudent(name, idNum, gpa, college);
               studentList.add(student);//stores gradstudent object in list
               
               }
               else {
               System.out.println("Please enter U or G");
               
            }}
            else if (choice == 'N' || choice == 'n') {
                break; //breaks out of while loop once N or n is selected
            } 
            else {
               System.out.println("please enter Y or N");
            }
     }//close while
    Student2[] newList = new Student2[studentList.size()];//initalize array
     newList = studentList.toArray(newList);   //convert objects of arraylist into array
         while(true) {//the rest of the code in main method and method below is from assignment 3 
     
         System.out.print("Enter a student ID. (enter -1 to see the list, or 0 to quit). ");
         int id_ = input.nextInt();
   
          checkList(newList, id_);                                     
          if(id_ == -1) {
            for (int i = 0; i < newList.length; i++) {
              newList[i].printStudent();
          }}
            
   if (id_ == 0)
   break;
        }
   System.out.println("Goodbye!");
    }
    
    
    
          public static void checkList(Student2 newList[],int id_) {
               boolean match = false;
               for (int i = 0; i < newList.length; i++) {
                 if (id_ == newList[i].getID()) { 
                     newList[i].printStudent();
                     match = true; 
                     break;
                    } else if (id_ == 0 || id_ == -1) {
                     match = true;
                     break;
                    } else {
                     match = false;
                    }
               }
                  if (match == false) 
                  System.out.println("Student "+id_+" not found!");

     
         }  

}

