package student;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        student stu1 = new student();
        student stu2 = new student();
        Scanner s = new Scanner(System.in);

        String name;
        int score;
        while (true) {
            System.out.print("Enter name for the first student (min 1 letter): ");
            name = s.nextLine();
            stu1.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s> ", i, stu1.getName());
                score = s.nextInt();
                stu1.setScore(i, score);
            }
            String errormsg = stu1.validateData();
            if (errormsg == null) {
                break;

            } else {
                System.out.println(errormsg);
                s.nextLine();
            }
        }
        s.nextLine();
        System.out.println("\n---------------------\n");
        while (true) {
            System.out.println("Enter name for secound student: ");
            name = s.nextLine();
            stu2.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s> ", i, stu1.getName());
                score = s.nextInt();
                stu2.setScore(i, score);
            }
            String errormsg = stu1.validateData();
            if (errormsg == null) {
                break;

            } else {
                System.out.println(errormsg);
                s.nextLine();
            }
        }

        System.out.println("\n---------------------\n");
        System.out.println(stu1);
        System.out.println(stu2);
        if(stu1.getHighScore()>stu2.getHighScore()){
            System.out.format("%s had the highest score\n ",stu1.getName());
        }
        else if(stu2.getHighScore()>stu1.getHighScore()){
            System.out.format("%s had the highest score\n ",stu2.getName());
        }
        else System.out.println("Both Students Had the Same highest score\n");
        
        if(stu1.getAverage()>stu2.getAverage()){
            System.out.format("%s had the highest average\n ",stu1.getName());
        }
        else if(stu2.getAverage()>stu1.getAverage()){
            System.out.format("%s had the highest average\n ",stu2.getName());
        }
        else System.out.println("Both Students Had the Same average\n");

    }

}
