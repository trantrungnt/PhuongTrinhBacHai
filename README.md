# Phương trình bậc hai
+ [Định nghĩa phương trình bậc hai](https://vi.wikipedia.org/wiki/Ph%C6%B0%C6%A1ng_tr%C3%ACnh_b%E1%BA%ADc_hai)

##Giải phương trình bậc hai
+ Nhập các hệ số a, b, c từ bàn phím
+ Giải phương trình bậc hai và hiển thị ra kết quả

```
 public void giaiPhuongTrinhBacHai(int hesoA, int hesoB, int hesoC)
    {
        double ketqua, x, delta, x1, x2;
        //Truong hop a == 0: phuong trinh bac nhat
        if(hesoA==0)
        {
            if(hesoB!=0)
            { 
                x=(double)-hesoC/hesoB; 
                System.out.println("Phuong trinh co nghiem x=" + x);            
            }
            else
                System.out.println("He so b=" + hesoB + " khong the bang 0 nen phuong trinh khong co nghiem!");
        }else
        {
            //Truong hop he so a <> 0: phuong trinh bac 2
            delta = Math.pow(hesoB, 2) - 4*hesoA*hesoC;
            
            if(delta<0)
                System.out.println("Phuong trinh vo nghiem");
            else
                if(delta==0)
                {
                    x = (double)- hesoB/(2*hesoA);
                    System.out.println("Phuong trinh co nghiem kep x1=x2=" + x);
                }
                else
                {
                    x1 = (-hesoB + Math.sqrt(delta))/(2*hesoA);
                    x2 = (-hesoB - Math.sqrt(delta))/(2*hesoA);
                    
                    System.out.println("Phuong trinh co 2 nghiem phan biet:");
                    System.out.println("x1=" + x1);
                    System.out.println("x2=" + x2);
                }
        }    
               
    }
```