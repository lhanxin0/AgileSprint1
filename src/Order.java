/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catorder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hanxin
 */
public class Order {
    private String orderNum;
    private int quantity;
   private Date date;

   
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public Order() {
        
    }



    public Order(String orderNum, int quantity, Date date) {
        this.orderNum = orderNum;
        this.quantity = quantity;
        this.date = date;
    }

    

    public String getOrderNum() {
        return orderNum;
    }

    public int getQuantity() {
        return quantity;
    }



    public Date getDate() {
        return date;
    }



    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "\nOrder Num = " + orderNum + "\nQuantity=" + quantity + "\n" + "Order Date= "
                + formatter.format(date);
    }

  
   
    
}
//------------------------------------- PICK UP DATE ----------------------------------------------

// private Date pickUpDate;

//    public Order(String orderNum, int quantity, Date date, Date pickUpDate) {
//        this.orderNum = orderNum;
//        this.quantity = quantity;
//        this.date = date;
//        this.pickUpDate = pickUpDate;
//    }

//    public Date getPickUpDate() {
//        return pickUpDate;
//    }

//    public void setPickUpDate(Date pickUpDate) {
//        this.pickUpDate = pickUpDate;
//    }