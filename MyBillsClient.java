package Client;
import  Client.Services.Classes.MyBills;
import Client.Services.BillsType;
import java.util.*;
import java.io.*;

public class MyBillsClient{

    public String[] totalExpensesPerMonth(MyBills[] Expenses){
    String[] monthName = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
                        "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
                        // to avoid repeating monthofExpense in the print statements
    boolean[] flag = { false, false, false, false, false, false, false, false, false, false, false, false };
    int counter = 0;

    for (int i = 0; i < Expenses.length; i++){
       for (int j = 0; j < 12; j++){
          if ((monthName[j].equals(Expenses[i].getMonth())) && (flag[j] == false)){
             counter++;
             flag[j] = true;
         }
         else {
             continue;
         }
     }
 }


    String[] trueMonths = new String[counter];

    int l = 0;
    for (int i = 0; i < 12; i++){
       if ((flag[i] == true)){
          trueMonths[l] = monthName[i];
          l++;
       }
    }


    double[] totalExpense = new double[counter];
    double sum = 0.0;
    int y = 0;
    int r = 0;
    for (int i = 0; i < Expenses.length; i++)
    {
       for (int j = 0; j < counter; j++)
       {
          sum = 0;
          if (trueMonths[j].equals(Expenses[i].getMonth()))
          {
             double[] totalArray = new double[Expenses[i].getNumDays()];
             totalArray = Expenses[i].getExpenses();
             for (int k = 0; k < Expenses[i].getNumDays(); k++)
             {
                sum += totalArray[k];
             }

             totalExpense[j] += sum;
          }
       }
    }

    String[] totalString = new String[counter];
    for (int i = 0; i < counter; i++){
        String formatExpenses = String.format("%.2f", totalExpense[i]);
        totalString[i] = "The total of all expenses for the month of " + trueMonths[i] + " is :" + " $" + formatExpenses;
    }
    return totalString;
}

    public static void main(String[] args) {

        try{
            File expenseFile = new File("myexpenses.txt");
            Scanner scnr = new Scanner(expenseFile);
            int counter = 0;

            while (scnr.hasNextLine()) {
                String line = scnr.nextLine();
                counter++;
            }

            String[] readFile = new String[counter];
            int position = 0;
            Scanner scanTwo = new Scanner(expenseFile);

            while (scanTwo.hasNextLine()) {
                String line = scanTwo.nextLine();
                readFile[position] = line;
                position++;
            }

            String[]  monthofExpense = new String[counter / 2];
            String[]  expense = new String[counter / 2];
            MyBills[] bills = new MyBills[counter / 2];

            String monthName = "";
            String g = "";
            int i = 0;

            for (int lineIncrement = 0; lineIncrement < counter; lineIncrement += 2){
                // This will find the first semicolon on the line and extract the strings before it
                // Since the pattern does not change, we use +=2 for each 2 lines to do this operation.
               int y = readFile[lineIncrement].indexOf(":");
               String fileLine = readFile[lineIncrement];
               g = "";
               for (int r = y + 1; r < readFile[lineIncrement].length(); r++)
               {
                  if (fileLine.charAt(r) == ':')
                  {
                     break;
                  }
                  else
                  {
                     g += fileLine.charAt(r);
                  }
               }
               monthofExpense[i] = g;
               i++;
            }

            g = "";
            int p = 0;
            for (int lineIncrement = 0; lineIncrement < counter; lineIncrement += 2)
            {
               int    y = readFile[lineIncrement].indexOf(":", readFile[lineIncrement].length() / 2);
               String fileLine = readFile[lineIncrement];
               g = "";
               for (int r = y + 1; r < readFile[lineIncrement].length(); r++)
               {
                  if (fileLine.charAt(r) == ':')
                  {
                     break;
                  }
                  else
                  {
                     g += fileLine.charAt(r);
                  }
               }
               expense[p] = g;
               p++;
            }

            int r = 0;
            for (int lineIncrement = 1; lineIncrement < counter; lineIncrement += 2){
               String fileLine = readFile[lineIncrement];
               String[] splitString = fileLine.split(",");
               double[] values = new double[splitString.length];
               for (int t = 0; t < splitString.length; t++){
                   values[t] = Double.parseDouble(splitString[t]);
               }
               bills[r] = new MyBills(monthofExpense[r], BillsType.valueOf(expense[r]),values, splitString.length);
               r++;
            }

            for (int k = 0; k < counter / 2; k++){
                System.out.println(bills[k].toString());
            }

            MyBillsClient monthExpense = new MyBillsClient();
            String[] out = monthExpense.totalExpensesPerMonth(bills);
            for (int k = 0; k < out.length; k++){
                System.out.println(out[k]);
            }
        }
        catch(IOException e){
            System.out.println("There was an error");
        }
    }
}
