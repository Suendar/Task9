TASK 9

1.write a program to check whether a given string is a palindrome or not using for loop and if else statement

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrome(String str) {
 
        str = str.toLowerCase();
        
 
        str = str.replaceAll("\\s+", "");
        
 
        String reversedString = "";
        
 
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        
           if (str.equals(reversedString)) {
            return true;
        } else {
            return false;
        }
    }
}


2. Write a program that reads in a string from the user and uses a loop to reverse the order of the characters in the string then output the reversed string

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        String reversedString = reverseString(inputString);
        
        System.out.println("Reversed string: " + reversedString);
        
        scanner.close();
    }
    
    public static String reverseString(String str) {
 
        StringBuilder reversed = new StringBuilder();
        
         for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
           return reversed.toString();
    }
}

3.Write a program to print the given below pattern. 

public class NumberPattern {
    public static void main(String[] args) {
        int num = 1;
        int row = 4;
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

5. Anna University Grading System

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks scored by the student: ");
        int marks = scanner.nextInt();
        
        
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Input");
        } else {
             
            char grade;
            if (marks >= 90 && marks <= 100) {
                grade = 'A';
            } else if (marks >= 80 && marks <= 89) {
                grade = 'B';
            } else if (marks >= 70 && marks <= 79) {
                grade = 'C';
            } else if (marks >= 60 && marks <= 69) {
                grade = 'D';
            } else if (marks >= 50 && marks <= 59) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            System.out.println("Grade: " + grade);
        }
        
        scanner.close();
    }
}

6.Write a program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June, November-December]. Note: Use the switch construct.


import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the room rent per day: ");
        double roomRent = scanner.nextDouble();
        
        System.out.print("Enter the number of days stayed in the hotel: ");
        int daysStayed = scanner.nextInt();
        
        double totalTariff;
        
              switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                roomRent *= 1.2; // Increasing room rent by 20%
                break;
            default:
                break;
        }
        
        totalTariff = roomRent * daysStayed;
        
        System.out.printf("Hotel tariff: %.2f", totalTariff);
        
        scanner.close();
    }
}


7.Write a program to calculate the largest number among three numbers.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        
        double largest = num1; 
        
        if (num2 > largest) {
            largest = num2;
        }
        
        
        if (num3 > largest) {
            largest = num3;
        }
        
        System.out.println("The largest number is: " + largest);
        
        scanner.close();
    }
}


