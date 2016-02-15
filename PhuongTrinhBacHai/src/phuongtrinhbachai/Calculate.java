/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongtrinhbachai;


/**
 *
 * @author TrungNT
 */
public class Calculate {
    public void giaiPhuongTrinhBacHai(int hesoA, int hesoB, int hesoC)
    {
        float ketqua, x;
        //Truong hop a == 0: phuong trinh bac nhat
        if(hesoA==0)
        {
            if(hesoB!=0)
            { 
                x=(float)-hesoC/hesoB; 
                System.out.println("Phuong trinh co nghiem x=" + x);            
            }
            else
                System.out.println("He so " + hesoB + " khong the bang 0 nen phuong trinh khong co nghiem!");
        }    
               
    }
    
}
