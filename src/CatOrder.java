/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import catorder.Order;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Han Xin
 */
public class CatOrder {

    /**
     * @param args the command line arguments
     */
    public static void COmain() {
     int choice ;
       choice =  catalogueMenu();
        if(choice == 1){
        catalogueOrder();
        }
    }

    public static void catalogueOrder() {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        // respond
        String res = "";
        String res1 = "";
        //Array Declaration
        List<Order> arrOrder;
        List<List> orderList = new ArrayList<>();
        //Variable Declaration
        int quantity = 0;
        Date date = new Date();
        int count = 0;
        String pickUpD;
        String orderNo;
        // Date pDate = new Date();
        //Date Formatter
        //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Catalogue");
        System.out.println("1.Wedding Bouquet");
        System.out.println("2.Graduation Bouquet");
        System.out.println("3.Funeral Bouquet");
        System.out.println("4.Valentine Bouquet");
        do {
            arrOrder = new ArrayList<>();

            do {
                System.out.print("Enter the Catalogue Number: ");

//                while(!scanner.hasNext("[A-Za-z0-9 _]*[A-Za-z0-9][A-Za-z0-9 _]\\w$")){
//                     System.err.print("Sorry, please enter a proper tity again: ");
//                    scanner.next();
//                }

                orderNo = scanner.next();

                System.out.print("Enter the quantity: ");
                //Check only integer allowed to enter 
                while (!scanner.hasNext("\\d*[1-9]\\d*$")) {
                    System.err.print("Sorry, please enter a proper quantity again: ");
                    scanner.next();
                }

                quantity = scanner.nextInt();

                System.out.print("Do you want to add more item ? [Y/N] ");
                //Check only Y or N allowed to enter 
                while (!scanner.hasNext("(Y|N)|(y|n){1}$")) {
                    System.err.println("You only can choose Y or N !!!!");
                    System.out.print("Do you want to add more item ? [Y/N] ");
                    scanner.next();
                }
                res = scanner.next();

                arrOrder.add(new Order(orderNo, quantity, date));
                System.out.print("\n");
                count = 0;
            } while (res.equalsIgnoreCase("Y"));

            orderList.add(arrOrder);
            arrOrder.remove(new Order());

            System.out.print("Do you want to add more Order ? [Y/N] ");
            //Check only Y or N allowed to enter 
            while (!scanner.hasNext("(Y|N)|(y|n){1}$")) {
                System.err.println("You only can choose Y or N !!!!");
                System.out.print("Do you want to add more order ? [Y/N] ");
                scanner.next();
            }
            res1 = scanner.next();
            System.out.print("\n"
            );

        } while (res1.equalsIgnoreCase("Y"));

        int a = 0;

        for (List<Order> aaa : orderList) {
            System.out.println("=============================");
            System.out.println("            Order" + (++a));
            System.out.println("=============================");
            for (Order ooo : aaa) {

                System.out.println(ooo);
                System.out.println("-----------------------------");
            }
            System.out.println("=============================");
        }

    }
    
    
    
    public static int catalogueMenu(){
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
         System.out.println("Catalogue Order");
        System.out.println("=================");
        System.out.println("1.Make Order");
        System.out.println("2.View Order List");
        System.out.println("3.Generate Sales Order");
        System.out.println("=================");
        System.out.print("Enter your choice:");
        choice = scanner.nextInt();
        return choice;
}
}


//--------------------- PICK UP DATE ( add in line 64 )  ---------------------------------------------
//                    if (res.equalsIgnoreCase("N")) {
//                        System.out.print("Enter the pick-up date (dd/MM/yyyy): ");
//
//                        while (!scanner.hasNext("(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")) {
//
//                            System.err.print("Sorry, please enter a proper date with the format(dd/MM/yyyy) : ");
//                            scanner.next();
//                        }
//
//                        pickUpD = scanner.next();
//                        try{
//                        pDate  = formatter.parse(pickUpD);
//                       
//                        }catch(Exception ex){
//                            
//                        }
//                        
//                    }
