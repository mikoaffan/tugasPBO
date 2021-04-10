//kegiatan 1

package tugasPBO;

import java.util.Scanner;
import java.util.InputMismatchException;

public class iniBenda {
    Scanner run = new Scanner(System.in);
    int all;

    int[] kodebarang = new int[50];
    int[] harga = new int[50];
    int[] stok = new int[50];
    int[] nilai = new int[50];
    String[] nama = new String[50];

    public iniBenda(){

    }
    public void masukkanData(){
        try{
            for(int i=0;i < all;i++){
                System.out.println("Product Number  : ");
                System.out.println("Product Name    : ");

                run.nextLine();
                kodebarang[i]=i+1;
                nama[i] = run.nextLine();

                if (nama[i].equals("0")){
                    break;
                }

                System.out.println("Product Price   : ");
                harga[i]= run.nextInt();
                System.out.println("Product Stock   : ");
                stok[i]= run.nextInt();
                nilai[i]=stok[i]*harga[i];
            }
        }catch (InputMismatchException e){
            System.out.println("You have to enter number !!! ");
            run.nextLine();
            menu();
        }
    }
    public void menu(){
        do{
            System.out.println("Input Product Number    : ");
            all = run.nextInt();

            if (all <= 0){
                System.out.println("You must entered over 0");
            }else {
                masukkanData();
            }
        }while (all <= 0);
    }
    public void getnilaidata(){
        for (int i =0; i < all; i++){
            System.out.println("Product Number  : "+kodebarang[i]);
            System.out.println("Product Name    : "+ nama[i]);
            System.out.println("Product Prize   : "+harga[i]);
            System.out.println("Product Stock   : "+stok[i]);
            System.out.println("Product Value   : "+nilai[i]);
        }
    }
}
