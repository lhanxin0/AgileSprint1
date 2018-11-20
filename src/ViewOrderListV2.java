

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sun.jmx.remote.util.OrderClassLoaders;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chin You
 */
public class ViewOrderListV2 {

    /**
     * @param args the command line arguments
     */
    public static void VOmain() {
        // TODO code application logic here
        viewOrderList();
    }
    
    public static void viewOrderList() 
    {
        try {
            List<OrderClass> orderList = new ArrayList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse("12/11/2018");
            Date pickUpDate = sdf.parse("13/11/2018");
            Date haha = new Date();
            int count = 0;
            
            haha = sdf.parse(sdf.format(new Date()));
            
            orderList.add(new OrderClass("1", 1, date, date));
            orderList.add(new OrderClass("2", 2, date, pickUpDate));
            
            System.out.println("Displaying order list of the day");
            
            
            for(int i=0; i<orderList.size(); i++)
            {
                if(orderList.get(i).getPickUpDate().compareTo(haha) == 0)
                {
                System.out.println(orderList.get(i));
                }
                else
                    count++;
            }
            if(count == orderList.size())
            {
                System.out.println("There are no available order list today");
            }
        } catch (ParseException ex) {
            Logger.getLogger(ViewOrderListV2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
