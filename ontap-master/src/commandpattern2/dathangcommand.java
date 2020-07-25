/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern2;

/**
 *
 * @author tophu
 */
public class dathangcommand extends ICommand{
    
    CThoadon product;
    receiver store;

    public dathangcommand(CThoadon product, receiver store) {
        this.product = product;
        this.store = store;
    }

    public CThoadon getProduct() {
        return product;
    }
    
    @Override
    public void excute() {
        store.inthongtin(product);
        super.thanhtien = store.thanhtien(product);
    }

    @Override
    public void unexcute() {
        store.huy(product);
    }    
}
