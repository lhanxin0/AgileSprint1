
import combine.Flower2;
import java.util.ArrayList;
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
public class CatalogueView {
    public static void CVmain() {
        List<Flower2> flower = new ArrayList<Flower2>();
        Scanner scanner = new Scanner(System.in);
        char answer;
        
        flower.add(new Flower2("Sun Shine", "asdasdasdasd", "Bouquets", 12.20, 5));
        flower.add(new Flower2("Lover Bouquets", "asdasdasdasd", "Bouquets", 12.20, 5));
        flower.add(new Flower2("Buttercup", "asdasdasdasd", "Fresh Flower", 12.20, 5));
        flower.add(new Flower2("Cherry Blosom", "sdaqwefgwre", "Fresh Flower", 12.20, 5));
        flower.add(new Flower2("Clover", "asdiuqwheasd", "Flora", 12.20, 5));
        
        
        System.out.println("Do you want to view product details or product sales?");
        System.out.println("a(Product Details) / b(Product Sales):");
        String word = scanner.next();
        while(!word.matches("[a-bA-B, ]+"))
        {
            System.out.println("Please only enter a or b:");
            word = scanner.next();
        }
//        word = word.toUpperCase();
//        answer = word.charAt(0);
        
        if(word.equalsIgnoreCase("a")){
         for (Flower2 flowers: flower)           
            System.out.println(flowers);
        } 
        else if(word.equalsIgnoreCase("b")){ 
        int i = 1;
        System.out.println("================="); 
        System.out.println("Flower For Sales");
        System.out.println("=================");
        for (Flower2 flowers: flower)
        {    
            System.out.println( i + ")"+ flowers.getFlowername());
            i++;          
        }    
    }
    }
    
}
