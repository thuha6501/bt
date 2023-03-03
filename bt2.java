package org.example;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String user, pass;
               int dem=0;
       while (dem<=3){
           System.out.println(" nhap user");
           user = in.nextLine();
           System.out.println(" nhap pass");
           pass= in.nextLine();
           if(user.equals("admin")== true && pass.equals("admin")== true){
               System.out.println(" dang nhap thanh cong");
               break;
           }
           else {
               System.out.println(" dang nhap lai");
               dem++;

           }
           if(dem==4){
               System.out.println(" dang nhap that bai");
           }
       }
    }
}
