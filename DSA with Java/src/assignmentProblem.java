import java.util.Scanner;

public class assignmentProblem {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of Circle Problem ----->");
//       3.14*r*r;
        System.out.print("Take the radius r value is : ");
        float r = sc.nextFloat();
        double res = 3.14*r*r;
        System.out.println("Solution of the problem is : "+res);

        System.out.println("<----------Next Assignment Problem---------->");

        System.out.println("Print the Even number from 9 to 100");
        for(int i=9; i<=100; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
            else{
                continue;
            }
        }

        System.out.println();
        System.out.println("<----------Next Assignment Problem---------->");
//        r = (int)r;
        if(r>0){
            System.out.println((int)r+" is a Positive Number");
        }
        else if(r==0){
            System.out.println(r+"is a Zero Number");
        }
        else{
            System.out.println(r+"is a Negative Number");
        }


        System.out.println("<----------Next Assignment Problem---------->");

        switch((int)r){
            case 1:
                System.out.println("Today's day is Monday");
                break;
            case 2:
                System.out.println("Today's day is Tuesday");
                break;
            case 3:
                System.out.println("Today's day is Wednesday");
                break;
            case 4:
                System.out.println("Today's day is Thursday");
                break;
            case 5:
                System.out.println("Today's day is Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");
        }

        System.out.println("<----------Next Assignment Problem---------->");

        System.out.print("Enter the Number : ");
        int ly = sc.nextInt();
        if(ly%4==0 && ly%100 != 0){
            System.out.println(ly+" is a Leap Year");
        } else if (ly%400==0) {
            System.out.println(ly+" is a Leap year");
        }
        else{
            System.out.println(ly+" is Not a Leap year");
        }
    }
}
