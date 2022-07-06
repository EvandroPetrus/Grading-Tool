import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Variables declaration
        // Accepted teacherID == 1550
        int teacherID ;
        String teacherName = "Alana";
        int errorTry;
        String supportNumber = "0800-1212-3232";
        int printChoice;
        String acadSit;
        // Data input

        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the grade system. Please input your ID, Teacher.");

        // Logging in

        teacherID = read.nextInt();
        if (teacherID == 1550) {
            System.out.print("Succesfully signed in. Welcome, "+teacherName+" !\n");
        }

        // Error treating

        else {
            while (teacherID != 1550) {
                System.out.println("Wrong or not registered input. Please contact support or try again.");
                System.out.println("Would you like to try again?\n 1 = Yes 2 = No\n");
                errorTry = read.nextInt();
                if (errorTry == 1) {
                    System.out.println("Please input your ID again. Error will result in program termination");
                    teacherID = read.nextInt();
                    if (teacherID == 1550) {
                        System.out.print("Succesfully signed in. Welcome, Alana!\n");
                    } else {
                        System.out.println("Program terminated. Two wrong answers in a row\n Please contact support at " + supportNumber+ " for further assistance.");
                        break;
                    }
                }
                if (errorTry == 2) {
                    System.out.println("Program terminated, invalid ID input.");
                    break;
                }
            }

        }

        // Interface

        System.out.println("===================================");
        System.out.println("      Alumni Grading System"); // furtherly referred as AGS
        System.out.println("===================================");

        Alumni alumni1 = new Alumni();
        Grade grade1 = new Grade();
        finalGrade finalGrade1 = new finalGrade();

        System.out.println("Please input the alumni first name.");
        alumni1.setNameAlumni(read.next());

        System.out.println("Please inform the year of "+alumni1.getNameAlumni()+".");
        alumni1.setYearAlumni(read.nextInt());

        System.out.println("Please set the first grade for "+alumni1.getNameAlumni()+".");
        grade1.setGrade1(read.nextDouble());

        System.out.println("Please set the second grade for "+alumni1.getNameAlumni()+".");
        grade1.setGrade2(read.nextDouble());

        finalGrade1.setGradeMed((grade1.getGrade1() + grade1.getGrade2()) /2);

        System.out.println("Do you want to print "+alumni1.getNameAlumni()+"'s detailed grade information?\n"+"Yes = 1\nNo = 2\n");
        printChoice = read.nextInt();
        if (printChoice == 1){
            System.out.print(alumni1.getNameAlumni()+ "'s grade information:\n"+"Year: "+ alumni1.getYearAlumni()+"\n First grade: "+ grade1.getGrade1()+"\n Second grade: "+grade1.getGrade2());
            System.out.println("\n Final grade: "+ finalGrade1.getGradeMed());
            if(finalGrade1.getGradeMed() >= 7){
                acadSit = "Approved";
            }
            else {
                acadSit = "Disapproved";
            }
            System.out.println("Academic situation: "+ acadSit+".");
        }
        else {
            System.out.println("Thanks for using AGS!");
        }
    }
}