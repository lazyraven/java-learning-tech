//import java.util.Scanner;
//public class CWH_06_Que {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter total numbers");
//        int totalMarks = sc.nextInt();
//        System.out.println("Numbers on subject");
//        int sub1 = sc.nextInt();
//        int sub2 = sc.nextInt();
//        int sub3 = sc.nextInt();
//        int sub4 = sc.nextInt();
//        int sub5 = sc.nextInt();
//
//        int subSum = sub1+sub2+sub3+sub4+sub5;
//        System.out.println(subSum);
//
//        float percentageNum = subSum * 100 / totalMarks;
//        System.out.println("Total Percentage Of CBSE Students");
//        System.out.println(percentageNum);
//    }
//}

//float is fruitful for decimal number calculate , so use float
import java.util.Scanner;

public class CWH_06_Que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float total = 500;
//        float total = 80;

        System.out.println("Enter marks for 5 subjects:");

        System.out.print("English: ");
        float a = sc.nextFloat();

        System.out.print("Mathematics: ");
        float b = sc.nextFloat();

        System.out.print("Physics: ");
        float c = sc.nextFloat();

        System.out.print("Chemistry: ");
        float d = sc.nextFloat();

        System.out.print("C++: ");
        float e = sc.nextFloat();

        float sum = a + b + c + d + e;
        System.out.println("Your total marks is: " + sum);

        float percentage = (sum / total) * 100;
        System.out.printf("Marks Percentage is: %.2f%%\n", percentage);

        sc.close(); // Close the scanner to avoid resource leaks
    }
}