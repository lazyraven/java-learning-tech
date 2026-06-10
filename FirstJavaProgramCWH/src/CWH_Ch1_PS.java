import java.util.Scanner;
public class CWH_Ch1_PS {
    static void main(String[] args) {

        System.out.println("Please enter total numbers");
//        Question 1
        int a = 7;
        int b =10;
        int c = 3;
        int sum = a+b+c;
        System.out.println(sum);

//        Question 2
//        int sub1 = 45;
//        int sub2 = 95;
//        int sub3 = 48;
//        int cgpa = (sub1+sub2+sub3)/30;  // wrong it'll give only integer value, but percentage we required so use float

        float sub1 = 45;
        float sub2 = 95;
        float sub3 = 48;
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println(cgpa);

//      Question 3
        System.out.println("What is your name");
           Scanner sc= new Scanner(System.in);
           String name = sc.next();
        System.out.println("Hello "+ name + " have a good day!");

//        Question 4
        System.out.println("convert kilometer to miles");
        float num1 = sc.nextFloat();
        float changeMile = num1 * 5/8;
        System.out.println(changeMile);

//        Question 5
        System.out.println("Please enter number to check, is it integer or not...");
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
        System.out.println(sc.hasNextInt());


    }
}
