package input;

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        int id,price;
        String title, description, category;

        Scanner input = new Scanner(System.in);

        System.out.print("ID: ");
        id = input.nextInt();
        System.out.print("Title: ");
        title = input.nextLine();
        System.out.println("Price: ");
        price = input.nextInt();
        System.out.print("Description: ");
        description = input.nextLine();
        System.out.print("Category: ");
        category = input.nextLine();

        System.out.println("ID => " + id);
        System.out.println("Title => " + title);
        System.out.println("Price => " + price);
        System.out.println("Decription => " + description);
        System.out.println("Category => " + category);

        
    }

}
