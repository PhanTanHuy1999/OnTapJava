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
public class commandmain {
    public static void main(String[] args) {
        receiver store = new receiver();
        ICommand cmd1 = new dathangcommand(new CThoadon("CPU", 2, 300),store);
        
        ICommand cmd2 = new dathangcommand(new CThoadon("RAM", 5, 200),store);
        
        ICommand cmd3 = new dathangcommand(new CThoadon("USB", 1, 150),store);
        
        Involker giohang = new Involker();
        
        giohang.addcommand(cmd1);
        giohang.addcommand(cmd2);
        giohang.addcommand(cmd3);
        giohang.ExcuteAll();
        
        System.out.println("\nKiểm tra lệnh undo: ");
        giohang.undo();
        giohang.ExcuteAll();
    }
}
