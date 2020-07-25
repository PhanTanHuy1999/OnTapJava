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
public abstract class ICommand {
    int thanhtien;

    public int getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }
    
    public abstract void excute();
    public abstract void unexcute();
}
