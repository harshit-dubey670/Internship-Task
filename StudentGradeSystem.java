package codsoftTask;

import java.util.Scanner;

public class StudentGradeSystem {
        public static void main(String[] args) {

            System.out.println("Input From the user");
            Scanner sc = new Scanner(System.in);
            int maxNum = 100;
            int totalSubject = 5;
            //Input 5 subjects marks to student(math,bio,physics,chemistry,english)
            System.out.println("Enter the marks of Maths : ");
            int maths = sc.nextInt();
            System.out.println("Enter the marks of Bio : ");
            int bio = sc.nextInt();
            System.out.println("Enter the marks of Physics : ");
            int physics = sc.nextInt();
            System.out.println("Enter the marks of Chemistry : ");
            int chemistry = sc.nextInt();
            System.out.println("Enter the marks of English : ");
            int English = sc.nextInt();

            //sum of all the marks in all subjects
            int totalMarks = maths  + bio + physics + chemistry + English;
            System.out.println("The Total Marks obtained by the user is : " + totalMarks);

            //Average percentage
            double percentage = (maths + bio + physics + chemistry + English) / totalSubject ;
            System.out.println("The Average Percentage is :" + percentage);

            //Grade Calculation
            if(percentage > 80 && percentage < 100){
                System.out.println("A");
            } else if (percentage >75 && percentage < 80) {
                System.out.println("B+");
            } else if (percentage > 65 && percentage < 75) {
                System.out.println("B");
            } else if (percentage > 55 && percentage < 65) {
                System.out.println("C+");
            } else if (percentage > 50 && percentage < 55) {
                System.out.println("C");
            } else if (percentage > 40 && percentage < 50) {
                System.out.println("D");
            } else if (percentage > 0 && percentage < 40) {
                System.out.println("F");
            } else {
            }
        }
    }

