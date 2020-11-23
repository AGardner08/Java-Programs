/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M12D3;

/**
 *
 * @author class
 */
public abstract class BookCW {

    /**
     * @param args the command line arguments
     */
private String title;
private double price;
private double Fprice;
private double NFprice;

public String getTitle()    {
    return title;
}
public void setTitle(String BookTitle) {
        title = BookTitle;
}
    
//public double getPrice()    {
  //  return price;
//}
   /* public double setPrice(double BookPrice)    {
        Fprice = 24.99;
    NFprice = 37.99;
    BookPrice = Fprice;
    BookPrice= NFprice;
    return BookPrice;
    }
*/
}
