
package sesi6;

import java.util.Scanner;

/**
 *
 * @author Dila
 */
public class Main {
    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        System.out.println("Silakan pilih laptop yang akan anda coba! \n1.Macbook \n2.Lenovo \n3.Toshiba \nPilihan anda : ");
        String milih = pilih.nextLine();

        if(milih.equals("MacBook")){
            Laptop m2 = new MacBook();
            LaptopUser mark = new LaptopUser(m2);
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.print("Apa yang akan anda lakukan? \n1.ON \n2.OFF \n3.UP \n4.DOWN \n5.Done \nOpsi apa yang anda pilih: ");
                String input = in.nextLine();
                if(input.equals("Done")){
                    System.out.println("Aku sudah selesai menggunakan laptop");
                    break;
                }
                pakaiLaptop(mark, input);
            }
        }

        else if(milih.equals("Lenovo")){
            Laptop thinkpad = new Lenovo();
            LaptopUser mark = new LaptopUser(thinkpad);
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.print("Apa yang ingin anda lakukan? \n1.ON \n2.OFF \n3.UP \n4.DOWN \n5.Done \nOpsi apa yang anda pilih: ");
                String input = in.nextLine();
                if(input.equals("Done")){
                    System.out.println("Aku sudah selesai menggunakan laptop");
                    break;
                }
                pakaiLaptop(mark, input);
            }
        }

        else if(milih.equals("Toshiba")){
            Laptop dynabook = new Toshiba();
            LaptopUser mark = new LaptopUser(dynabook);
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.print("Apa yang ingin anda lakukan? \n1.ON \n2.OFF \n3.UP \n4.DOWN \n5.Done \nOpsi apa yang anda pilih: ");
                String input = in.nextLine();
                if(input.equals("Done")){
                    System.out.println("Aku sudah selesai menggunakan laptop");
                    break;
                }
                pakaiLaptop(mark, input);
            }
        }


    }
    
    public static void pakaiLaptop(LaptopUser laptop, String input){
        if(input.equals("ON")){
            laptop.turnOnLaptop();
        }
        else if(input.equals("OFF")){
            laptop.turnOffLaptop();
        }
        else if(input.equals("UP")){
            laptop.makeLaptopLouder();
        }
        else if(input.equals("DOWN")){
            laptop.makeLaptopSilence();
        } 
    }
}
