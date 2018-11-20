/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Chin You
 */
public class OrderClass {

    /**
     * @param args the command line arguments
     */
    private String orderNum;
    private int quantity;
    private Date date;
    private Date pickUpDate;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    
    public OrderClass(String orderNum, int quantity, Date date, Date pickUpDate) {
        this.orderNum = orderNum;
        this.quantity = quantity;
        this.date = date;
        this.pickUpDate = pickUpDate;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    @Override
    public String toString() {
        return "Order Number: " + orderNum + "\nQuantity: " + quantity + "\nDate: " + sdf.format(date) + "\nPick Up Date: " + sdf.format(pickUpDate) + "\n==============================================";
    }
    
    
}
