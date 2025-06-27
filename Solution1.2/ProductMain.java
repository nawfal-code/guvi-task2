package com.guvi.task2;
import java.util.Scanner;
public class ProductMain {
    public static void main(String[] args) {
        //a.accept five product information from user and store in array
        String pid;
        double price;
        double quantity;
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + (i + 1));
            System.out.println("Enter the product Id:");
            pid = sc.nextLine();                           //S01 S02 S03 S04 S05
            System.out.println("Enter the product Price:");
            price = sc.nextDouble();                       //500 400 300 200 100
            System.out.println("Enter the product quantity:");
            quantity = sc.nextDouble();                    //1    1   1   1   2
            sc.nextLine();
            products[i] = new Product(pid, price, quantity);   //S01,500,1.........S05,100,2
                                                               //    [0]              [4]       Stored
        }

        //b.Find the Product ID of products which has the highest price.
        double max = Integer.MIN_VALUE;
        String maxid="";
        for (int i = 0; i < products.length; i++) {
            if (products[i].price > max) {
                max = products[i].price;   //500
                maxid=products[i].pid;     //S01
            }
        }
        System.out.println("the highest price of product is "+maxid); //S01

        System.out.println("Total amount spent for all product is "+totalAmountSpent(products)+" Rupees");//1600.0
    }

 //c.create method with products array argument and return  the total amount of all product
    public static double totalAmountSpent(Product[] products) {
        double TotalAmount =0;
        for (int i = 0; i < products.length; i++) {
            TotalAmount =TotalAmount+ (products[i].price * products[i].quantity);
        }
        return TotalAmount;
    }
}