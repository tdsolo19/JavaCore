package gemvietnam.com.demo.core.unitpractice1;

import javastringmethods.IndexOf;

import java.util.ArrayList;
import java.util.Scanner;

public class Action {
    private static ArrayList val = new ArrayList();

    public static void arr() {
        val.add(scr());
        System.out.println(val);
    }

    public static void print() {
        System.out.println("1. ADD BOOK");
        System.out.println("2. Edit BOOK");
        System.out.println("3. INFO BOOK");
        System.out.println("4. Exit");
        System.out.println("Your choise [1-4]");
    }

    public static String scr() {
        Book obj = new Book();
        Scanner info = new Scanner(System.in);
        System.out.println("Nhap IdBook");
        obj.setIdBook(info.next());
        System.out.println("Nhap NameBook");
        obj.setNameBook(info.next());
        info.nextLine();
        System.out.println("Nhap PrimeBook");
        obj.setPrimeBook(info.nextDouble());
        return obj.getIdBook() + " " + obj.getNameBook()+ " " + obj.getPrimeBook();
    }


    public static void choice() {
        int i = 0;
        boolean flag = true;
        while (flag) {
            Scanner choice = new Scanner(System.in);
            i = choice.nextInt();
            switch (i) {
                case 1:

                    scr();
                       print();
                    break;

                case 2:
                    Scanner id = new Scanner(System.in);
                    String tss = id.nextLine();
                    int size = val.size();
                    for (int a = 0; a <size; a++ ) {
                        String b = (String) val.get(a);
                        if (b.contains(tss)) {
                            val.remove(a);
                            scr();
                        } else {
                            System.out.println("ID khong ton tai dau nhe");
                        }
                    }
                    print();
                    break;

                    case 3:
                         arr() ;
                        print();
                        break;
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.println("Chon can than lai di");
                        print();

                }


            }
        }

        public static void main (String[]args){

            print();
            choice();


        }
    }

