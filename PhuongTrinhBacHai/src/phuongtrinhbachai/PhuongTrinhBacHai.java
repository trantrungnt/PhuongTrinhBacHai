/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongtrinhbachai;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author TrungNT
 */
public class PhuongTrinhBacHai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        
        try
        {
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Giai phuong trinh bac 2: a*x*x + b*x + c = 0");
            System.out.println("Nhap cac he so cua phuong trinh:\n");
            System.out.print("a=");
            a = Integer.parseInt(oBufferedReader.readLine());
            System.out.print("b=");
            b = Integer.parseInt(oBufferedReader.readLine());
            System.out.print("c=");
            c = Integer.parseInt(oBufferedReader.readLine());
            
            Calculate oCalculate = new Calculate();
            oCalculate.giaiPhuongTrinhBacHai(a, b, c);
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}
