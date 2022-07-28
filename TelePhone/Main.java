package TelePhone;

import Car2.Car;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
        public static ArrayList<TelePhone> carArrayList = new ArrayList<>();

        public static void main(String[] args) {

            while (true){
                 TelePhone telePhone = new TelePhone();
                Scanner scanner = new Scanner(in);
                System.out.println("[1] TelePhone add");
                System.out.println("[2] TelePhone list ");
                int a = scanner.nextInt();
                if (a==1){
                    System.out.print("TelePhone nomini kiriting: ");
                    String name = scanner.next();
                    System.out.print("TelePhone brandini tanlang: ");
                    String brand = scanner.next();
                    telePhone.name = name;
                    telePhone.brand = brand;
                    carArrayList.add(telePhone);
                }
                if (a==2) {
                    carArrayList.forEach(telePhone1 -> {
                        System.out.println("Nomi: "+ telePhone1.getName());
                        System.out.println("Brandi: "+ telePhone1.getBrand());
                        System.out.println(telePhone1.getLocalDateTime());
                    });
                }
                    if (carArrayList.isEmpty()){
                        System.out.println("==== Ma'lmot kiriting ====");
                    }
                }
            }
        }

