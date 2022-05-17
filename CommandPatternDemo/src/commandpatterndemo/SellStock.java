/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatterndemo;

/**
 *
 * @author Nicolas Sá de Souza
 */
public class SellStock implements Order{
    private Stock abcStock;
    
    public SellStock(Stock abcStock){
       this.abcStock = abcStock;
    }
    
    public void execute(){
       abcStock.sell();
    }
}
