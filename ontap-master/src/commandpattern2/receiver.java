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
public class receiver {
    public int thanhtien(CThoadon product)
    {
        return product.getSoluong() * product.getDongia();
    }
    
    public void inthongtin(CThoadon product)
    {
        System.out.println("\nThông tin sản phẩm: " + product.getTen()
        + ", giá: " + product.getDongia() + ", số lượng mua: " + product.getSoluong());
    }
    
    public void huy(CThoadon product)
    {
        System.out.println("Đã hủy " + product.getTen() +" ra khỏi đơn hàng!");
    }
}
