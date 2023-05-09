import java.util.Scanner;

public class SumWithExceptionHandling {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num;
                char ch;
                int positiveCount = 0;
                int negativeCount = 0;
                int zeroes = 0;
                int x = 1;
                do {
                    try {
                        do {
                            System.out.println("Enter any number");
                            num = sc.nextInt();

                            if (num > 0) {
                                positiveCount += 1;
                            } else if (num < 0) {
                                negativeCount += 1;
                            } else if (num == 0) {
                                zeroes += 1;
                            }

                            System.out.println("Do u want to continue, press y");
                            ch = sc.next().charAt(0);
                            x = 2;
                        } while (ch == 'y' || ch == 'Y');
                    }catch(Exception e){
                        System.out.println("invalid input");
                    }
                }while(x==1);


                System.out.println("no of positive numbers typed is: " + positiveCount);
                System.out.println("no of negatives numbers typed is: " +negativeCount);
                System.out.println("no of zeroes  typed is: " +zeroes);

                System.out.println("Thank you");


            }
        }
