//Provide me the Java program code for get the name, age, sub1, sub2, sub3, sub4, and sub5 
//of the five Students and find the total and average of each students and then find the topper
// of the class

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String topperName = "";
        int topperTotal = -1;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nEnter details of Student " + i);

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Subject 1 Marks: ");
            int sub1 = sc.nextInt();

            System.out.print("Enter Subject 2 Marks: ");
            int sub2 = sc.nextInt();

            System.out.print("Enter Subject 3 Marks: ");
            int sub3 = sc.nextInt();

            System.out.print("Enter Subject 4 Marks: ");
            int sub4 = sc.nextInt();

            System.out.print("Enter Subject 5 Marks: ");
            int sub5 = sc.nextInt();

            int total = sub1 + sub2 + sub3 + sub4 + sub5;
            double average = total / 5.0;

            System.out.println("Total = " + total);
            System.out.println("Average = " + average);

            if (total > topperTotal) {
                topperTotal = total;
                topperName = name;
            }
        }

        System.out.println("\n----- CLASS TOPPER -----");
        System.out.println("Topper Name = " + topperName);
        System.out.println("Topper Total Marks = " + topperTotal);

        sc.close();
    }
}