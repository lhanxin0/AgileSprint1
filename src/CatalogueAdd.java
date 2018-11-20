
import combine.Flower2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CatalogueAdd {
    
    public static void CMmenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Catalogue Maintenance");
        System.out.println("==================================");
        System.out.println("1.Add Product");
        System.out.println("2.View Catalogue");
        
        System.out.print("Enter your Choice: ");
        int choice = scanner.nextInt();
        switch ( choice ){
            case 1 : 
                CAmain();
                break;
            case 2 : 
                CatalogueView.CVmain();
                break;
        }
        
        
    }
    public static void CAmain() {
        List<Flower2> flower = new ArrayList<Flower2>();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String result = "";
        String name, description, type;
        double price;
        int amount = 0;
        boolean error = false;
        int id = 1111;
        do
        {
            System.out.print("Product ID: ");            
            System.out.print("P" + id);
            id ++;
            System.out.print("\n");
            
            System.out.print("Enter new product name: "); 
            name = scanner.next(); 
            while(!name.matches("[a-zA-Z, ]+")){
                System.out.println("Please do not leave blank!");
                System.out.print("Enter new product name: "); 
                name = scanner.next();
            }
                               
            System.out.print("Enter product description: ");
            description = scanner.next();
            while(!description.matches("[a-zA-Z1-9, ]+")){
                System.out.println("Please do not leave blank!");
                System.out.print("Enter product description: "); 
                description = scanner.next();
            }
            
            System.out.print("Enter product type: ");
            type = scanner.next();
            while(!type.matches("[a-zA-Z, ]+")){
                System.out.println("Please do not leave blank!");
                System.out.print("Enter product type: "); 
                type = scanner.next();
            }
            
            System.out.print("Enter product price: RM ");
            while(!scanner.hasNext("\\s*(?=.*[1-9])\\d*(?:\\.\\d{1,2})?\\s*$")){                
                scanner.next();
                System.out.print("Invalid input. Please input again. \n");
                System.out.print("Enter product price: RM ");
            }
            price = scanner.nextDouble();
            
            System.out.print("Enter product amount: ");           
            while(!scanner.hasNextInt() || !scanner.hasNext("[0-9]*")){                
                scanner.next();
                System.out.print("Invalid input. Please input again. \n");
                System.out.print("Enter product amount: ");
            }
            amount = scanner.nextInt();  
            
            flower.add(new Flower2(name, description, type, price, amount));
           
            
            System.out.println("Do you want to add another new product(y/n)?");
            while (!scanner.hasNext("(Y|N)|(y|n){1}$")) {
                System.err.println("You only can choose Y or N !!!!");
                scanner.next();
            }
            result = scanner.next();
        }while(result.equalsIgnoreCase("Y"));
        for (Flower2 flowers: flower)           
            System.out.println(flowers);
    }
}


