import java.util.Scanner;
public class DailySalesClient {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int X = 1;
        boolean y = false;

        System.out.print("Enter the number of days (if you enter invalid data, then 10 days will be assumed) : ");
        int days = scan.nextInt();

        if (days == 0) {
            days = 10;
        }

        DailySales salary = new DailySales(days);



        System.out.println("Now entering the sales data");

        System.out.print("Enter the day (If you want to quit, enter a negative number and you will quit) ");
        int day = scan.nextInt();

        System.out.println();

        if (day >= 1) {
            y = true;
            System.out.print("Enter the sales for day " + day + ": ");
            int sales = scan2.nextInt();
            int i = day;
            salary.SalesData[i] = sales;
            System.out.println("Successfully added the data!");

            System.out.println();

            System.out.println("Sales Data: ");

            for (int x = 0; x < salary.SalesData.length; x++) {
                System.out.println("Day " + x + " : " + salary.SalesData[x]);
          }
            ++i;
        }

            while (y) {
                System.out.print("Enter the day (If you want to quit, enter a negative number) ");
                day = scan.nextInt();


                if (day >= 1) {
                    System.out.print("Enter the sales for day " + day + ": ");
                    int sales2 = scan2.nextInt();
                    int i2 = day;
                    salary.SalesData[i2] = sales2;
                    System.out.println("Successfully added the data!");

                    System.out.println();

                    System.out.println("Sales Data: ");


                    for (int x2 = 0; x2 < salary.SalesData.length; x2++) {
                        System.out.println("Day " + x2 + " : " + salary.SalesData[x2]);
                    }
                    ++i2;

                }

                else {
                    System.exit(0);
                }
            }


        }

    }
