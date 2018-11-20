/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Combine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("==============================================");
            System.out.println("1.Catalogue Maintenance");
            System.out.println("2.Customer Maintenance and Invoice Payment");
            System.out.println("3.Catalogue Order");
            System.out.println("4.Pick Up and Delivery");
            System.out.println("5.Customized Flower Arrangement");
            System.out.println("6.Exit");
            System.out.println("==============================================");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    CatalogueAdd.CMmenu();
                    break;
                case 2:
                    CustomerMaintenanceAndPayment.CMPmain();
                    break;
                case 3:
                    CatOrder.COmain();
                    break;
                case 4:
                    ViewOrderListV2.VOmain();
                    break;
                case 5:
                      
                    Main.CFmain();
                    break;
            }
        } while (choice != 6);

    }

}
