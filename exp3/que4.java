package exp3;

import java.util.*;

class Posting {
    int courseWork;
    int AptTest;
    int TechTest;
    int interview;

    Posting(int courseWork, int AptTest, int TechTest, int interview) {
        this.courseWork = courseWork;
        this.AptTest = AptTest;
        this.TechTest = TechTest;
        this.interview = interview;

        if ((courseWork + AptTest + TechTest + interview) >= 80) {
            System.out.println("Congratulations, you are hired as Programmer. ");
        } else {
            System.out.println("Come prepared next time!");
        }
    }

    Posting(int TechTest, int interview) {
        this.TechTest = TechTest;
        this.interview = interview;

        if ((TechTest + interview) >= 85) {
            System.out.println("Congratulations, you are hired as Team Leader. ");
        } else {
            System.out.println("Come prepared next time!");
        }
    }

    Posting(int interview) {
        this.interview = interview;

        if (interview >= 90) {
            System.out.println("Congratulations, you are hired as Program Manager. ");
        } else {
            System.out.println("Come prepared next time!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        do {
            System.out.println("Post:\n1.Programmer\n2.Teamleader\n3.Program Manager");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Marks for Course Work: ");
                    int courseWork = sc.nextInt();
                    System.out.print("Marks for Aptitude Test: ");
                    int AptTest = sc.nextInt();
                    System.out.print("Marks for Tech Test: ");
                    int TechTest = sc.nextInt();
                    System.out.print("Marks for Interview: ");
                    int interview = sc.nextInt();
                    Posting post1 = new Posting(courseWork, AptTest, TechTest, interview);
                    break;
                case 2:
                    System.out.print("Marks for Tech Test: ");
                    TechTest = sc.nextInt();
                    System.out.print("Marks for Interview: ");
                    interview = sc.nextInt();
                    Posting post2 = new Posting(TechTest, interview);
                    break;
                case 3:
                    System.out.print("Marks for Interview: ");
                    interview = sc.nextInt();
                    Posting post3 = new Posting(interview);
                    break;
                default:
                    System.out.println("Check the options!");
                    break;
            }
            System.out.println("\ncontinue trying luck?\n1.continue\n2.end\n");
            cont = sc.nextInt();
        } while (cont < 2);
    }
}
