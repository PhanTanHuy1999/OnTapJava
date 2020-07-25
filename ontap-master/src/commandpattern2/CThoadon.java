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
public class CThoadon {
    String ten;
    int soluong;
    int dongia;

    public CThoadon(String ten, int soluong, int dongia) {
        this.ten = ten;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    
    
}
