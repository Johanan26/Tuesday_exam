package atu.ie;

import java.util.Scanner;
import java.lang.String;
public class Employee {

    public static void main(String[] args) {

        String Name;
        int pps;
        String employmentType;
        String gender;
        int age;

public void getEmployeeInput() {
            System.out.println("Enter Name:");
            this.Name = Scanner.nextLine();
            System.out.println("Enter pps:");
            this.pps = Scanner.nextLine();
            System.out.println("Enter Employment Type:");
            this.employmentType = Scanner.nextLine();
            System.out.println("Enter Gender:");
            this.gender = Scanner.nextLine();
            System.out.println("Enter age:");
            this.age = Scanner.nextLine();
        }

       while(true){

            try{
    if(age < 16 || age > 66 && Name< value.lenght(3) || Name > value.lenght(25) && pps != value.lenght(11) && gender != man || women|| non binary){
        throw new IllegalArgumentException("Invalid Age: Age must be over 16 and less than 66.");
    }

    System.out.println("Enter age:");
    if(myage < 16 || myage > 66) {
        System.out.println("you Enterd" + myage);
        break;
    }
    else {
        System.out.println("not valid number");
    }
                }
            catch (IllegalArgumentException e){
                System.out.println("Error:" + e.getMessage());
            }
            }

        }

    }
}
