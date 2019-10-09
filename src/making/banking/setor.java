/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package making.banking;

import javax.swing.JOptionPane;

/**
 *
 * @author H4NS
 */
public class setor {
    
private int saldo;
public void menabung(int bal , int s){
    if (s%100!=0)
     JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi ","Transaksi Gagal",0);
    else if (s<50000)
        JOptionPane.showMessageDialog(null,"HARAP BIASAKAN MEMBACA","EROR",0);
    else if(s>=50000){
        
        saldo = bal+s;
        JOptionPane.showMessageDialog(null,"Saldo Anda Saat Ini Sebesar : "+ saldo);
        
    }}
public int getsaldo(){
    return saldo;
            }

}

  