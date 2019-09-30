package client;
import superclass.Order;
import subclass.Repeated;
import java.util.*;
import java.io.*;

public class OrderClient{
    Vector<Order> oneTime = new Vector<Order>();
    Vector<Repeated> repeated = new Vector<Repeated>();
    Order once;
    Repeated repeat;

    public void addOrder(String order){
        String[] newOrder = order.split(",");
        if (newOrder.length == 5) {
            once = new Order(newOrder[1], newOrder[2], newOrder[3], Integer.parseInt(newOrder[4]));
            oneTime.add(once);
        }
        else{
            repeat = new Repeated(newOrder[1], newOrder[2], newOrder[3], Integer.parseInt(newOrder[4]), Integer.parseInt(newOrder[5]), newOrder[6]);
            repeated.add(repeat);
        }
    }
    public int re(int orderID) {
        int x = -1;
        for (int i = 0; i < repeated.size(); ++i) {
            if (repeated.get(i).getOrderID() == orderID){
                x = i;
                break;
            }
        }
        return x;
    }

    public int oneT(int orderID) {
        int x = -1;
        for (int i = 0; i < oneTime.size(); ++i) {
            if (oneTime.get(i).getOrderID() == orderID) {
                x = i;
                break;
            }
        }
        return x;
    }
    // public void removeOrder(int orderID){
    //     if (once(orderID) > 1000) {
    //         oneTime.remove(once(orderID));
    //     }
    //     else{
    //         repeated.remove(rep(orderID));
    //     }
    //
    // }
    public Vector <Order> sortOneTime(Vector<Order> sortedOrder) {
        int min;
        for (int i = 0; i < oneTime.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < oneTime.size(); j++) {
                String[] slash1 = sortedOrder.get(j).getOrderDate().split("/");
                String[] slash2 = sortedOrder.get(min).getOrderDate().split("/");
                if (Integer.parseInt(slash1[2]) < Integer.parseInt(slash2[2])) {
                    min = j;
                }
            }
            Order sort = sortedOrder.get(min);
            sortedOrder.set(min, sortedOrder.get(i));
            sortedOrder.set(i, sort);

        }
        return sortedOrder;

    }
    public Vector <Repeated> sortRepeated(Vector<Repeated> sortedOrder) {
        int min;
        for (int i = 0; i < repeated.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < repeated.size(); j++) {
                String[] slash1 = sortedOrder.get(j).getOrderDate().split("/");
                String[] slash2 = sortedOrder.get(min).getOrderDate().split("/");
                if (Integer.parseInt(slash1[2]) < Integer.parseInt(slash2[2])) {
                    min = j;
                }
            }
            Repeated sort = sortedOrder.get(min);
            sortedOrder.set(min, sortedOrder.get(i));
            sortedOrder.set(i, sort);

        }
        return sortedOrder;

    }


    public static void main(String[] args) {
        Scanner scan;
        String str;
        OrderClient client = new OrderClient();
        Order once;
        Repeated repeat;

        try {
            File orderFile = new File("orders.txt");
            scan = new Scanner(orderFile);
            while (scan.hasNextLine()) {
                str = scan.nextLine();
                String[] data = str.split(",");
                for (int i = 0; i < data.length; i++) {
                    if (data.length == 5) {
                        once = new Order(data[1], data[2], data[3], Integer.parseInt(data[4]));
                        client.oneTime.add(once);
                    }
                    else{
                        repeat = new Repeated(data[1], data[2], data[3], Integer.parseInt(data[4]), Integer.parseInt(data[5]), data[6]);
                        client.repeated.add(repeat);
                    }
                }
                // orderData = new Order();
            }

        } catch(Exception e) {
            System.out.println("File cannot be read");
        }

        String option1, add, cusID;
        int remove;
        scan = new Scanner(System.in);
        while(true){
            System.out.println("Select an option:");
            System.out.println("Type \"A\" to add an order");
            System.out.println("Type \"D\" to delete an order");
            System.out.println("Type \"L\" to list all orders for a particular customer ID");
            System.out.println("Type \"Q\" to quit");

            option1 = scan.nextLine();
            switch (option1) {
                case "A":
                    System.out.println("Add an order: ");
                    add = scan.nextLine();
                    client.addOrder(add);
                    break;
                case "D":
                    System.out.println("Enter Order to be deleted: ");
                    remove = scan.nextInt();
                    if (client.oneT(remove) >= 1000) {
                        System.out.println("Deleted order: ");
                        System.out.println(client.oneTime.get(client.oneT(remove)).toString());
                        client.oneTime.remove(client.oneT(remove));
                    } else {
                        System.out.println("Deleted order: ");
                        System.out.println(client.repeated.get(client.re(remove)).toString());
                        client.repeated.remove(client.re(remove));
                    }
                    break;
                case "L":
                    System.out.println("Enter Customer ID: ");
                    client.oneTime = client.sortOneTime(client.oneTime);
                    client.repeated = client.sortRepeated(client.repeated);
                    cusID = scan.nextLine();
                    for (int i = 0; i < client.oneTime.size(); ++i) {
                        if (client.oneTime.get(i).getCustomerID().equals(cusID)) {
                            System.out.println(client.oneTime.elementAt(i).toString());
                        }
                    }
                    for (int i = 0; i < client.repeated.size(); ++i) {
                        if (client.repeated.get(i).getCustomerID().equals(cusID)) {
                            System.out.println(client.repeated.elementAt(i).toString());
                        }
                    }
                    break;
                case "Q":
                    System.exit(0);
            }
        }
    }
}
