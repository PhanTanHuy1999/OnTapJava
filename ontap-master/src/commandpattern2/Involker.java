/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern2;

import java.util.ArrayList;

/**
 *
 * @author tophu
 */
public class Involker {
    ArrayList<ICommand> Done = new ArrayList<>();
    ArrayList<ICommand> Undo = new ArrayList<>();

    public Involker() {
    }
    
    public void addcommand(ICommand cmd)
    {
        this.Done.add(cmd);
    }
    
    public void undo()
    {
        if(this.Done.isEmpty())
        {
            System.out.println("Không còn lệnh để hủy! ");
        }
        else
        {
            this.Undo.add(Done.get(Done.size() - 1));
            Done.remove(Done.size()-1);
        }
    }
    
    public void redo()
    {
        if(this.Undo.isEmpty())
        {
            System.out.println("Đã hoàn lại hết các lệnh! ");
        }
        else
        {
            this.Done.add(Undo.get(Undo.size() - 1));
            Undo.remove(Undo.size()-1);
        }
    }
    
    public void ExcuteAll()
    {
        int tongtien = 0;
        for(ICommand cmd: this.Done)
        {
            cmd.excute();
            tongtien += cmd.getThanhtien();
        }
        System.out.println("\nTổng tiền cần thanh toán: " + tongtien);
    }
}
