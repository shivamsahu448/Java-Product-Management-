import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Create sample products
        Product product1 = new Product(19.99, "Lipstick", 10, "Red pigment, Shea butter", "Long-lasting matte finish",
                4.5, "Cosmetics Inc.", "BrandX", "Makeup");
        Product product2 = new Product(9.99, "Face Cream", 20, "Aloe vera, Vitamin E",
                "Hydrates and nourishes the skin",
                4.2, "SkinCare Ltd.", "BrandY", "Skincare");
        Product product3 = new Product(24.99, "Mascara", 5, "Waterproof formula", "Adds volume and length to lashes",
                4.8, "Cosmetics Inc.", "BrandX", "Makeup");
        Product product4 = new Product(12.99, "Hair Serum", 15, "Argan oil, Jojoba oil",
                "Smoothes frizz and adds shine",
                4.6, "HairCare Corp.", "BrandZ", "Haircare");
        Product product5 = new Product(7.99, "Face Mask", 30, "Charcoal, Tea tree oil",
                "Purifies and detoxifies the skin",
                4.4, "SkinCare Ltd.", "BrandY", "Skincare");
        Product product7 = new Product(19.99, "Lipstick", 10, "Red pigment, Shea butter", "Long-lasting matte finish",
                4.5, "Cosmetics Inc.", "BrandX", "Makeup");

        // Create a ProductPage and add the products
        ProductPage productPage = new ProductPage();
        productPage.addProduct(product1);
        productPage.addProduct(product2);
        productPage.addProduct(product3);
        productPage.addProduct(product4);
        productPage.addProduct(product5);
        productPage.addProduct(product7);

        while (true) {
            // ----------------------------------------------------------------------------

            System.out.println("\n    Choose the correct     ");
            System.out.println("|-----------------------------|");
            System.out.println("| 1 | Show All Products       |");
            System.out.println("| 2 | Sort by Name            |");
            System.out.println("| 3 | Sort by Price           |");
            System.out.println("| 4 | Sort by Category        |");
            System.out.println("| 5 | Search by Name          |");
            System.out.println("| 6 | Search by Category      |");
            System.out.println("| 7 | Search by Ingredient    |");
            System.out.println("| 8 | Add Products            |");
            System.out.println("| 9 | Remove  Products        |");
            System.out.println("| 10| Edit Products           |");
            System.out.println("| 11| Remove duplicate        |");
            System.out.println("| 12| Exit                    |");
            System.out.println("------------------------------");

            System.out.print("\nEnter your choice: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            switch (num) {

                case 1:
                    // Show all Products
                    List<Product> list = productPage.getProducts();
                    System.out.println("List of All Prodcts  : : ");
                    for (Product obj : list) {
                        System.out.println(obj.toString());
                    }
                    break;

                case 2:
                    productPage.sortByName();
                    System.out.println("\nSorted by name:");
                    for (Product product : productPage.getProducts()) {
                        System.out.println(product);
                    }
                    break;

                case 3:
                    productPage.sortByPrice();
                    System.out.println("Sorted by price:");
                    for (Product product : productPage.getProducts()) {
                        System.out.println(product);
                    }
                    break;

                case 4:

                    productPage.sortByCategory();
                    System.out.println("\nSorted by category:");
                    for (Product product : productPage.getProducts()) {
                        System.out.println(product);
                    }
                    break;

                case 5:
                    // Test searching name
                    System.out.println("Enter a name  to Serach : ");
                    String name = sc.next();
                    List<Product> nameResults = productPage.searchByName(name);
                    System.out.println("\nSearch results by name:");
                    for (Product product : nameResults) {
                        System.out.println(product);
                    }

                    break;

                case 6:
                    // Test searching Category
                    System.out.println("Enter a Category  to Serach : ");
                    String categry = sc.next();

                    List<Product> categoryResults = productPage.searchByCategory(categry);
                    System.out.println("\nSearch results by category:");
                    for (Product product : categoryResults) {
                        System.out.println(product);
                    }
                    break;

                case 7:

                    // Test searching Ingredient
                    System.out.println("Enter a Ingredient  to Serach : ");
                    String ingredient = sc.next();

                    List<Product> ingredientResults = productPage.searchByIngredient(ingredient);
                    System.out.println("\nSearch results by ingredient:");
                    for (Product product : ingredientResults) {
                        System.out.println(product);
                    }
                    break;

                // Add Element
                case 8:

                    System.out.println("Enter product Price  ");

                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter product  Name  ");
                    String name1 = sc.nextLine();
                    System.out.println("Enter  product quantity  ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter  product ingredient  ");
                    String Ingredient = sc.nextLine();
                    System.out.println("Enter  product description  ");
                    String description = sc.nextLine();

                    System.out.println("Enter  product rating ");
                    double rating = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter  product manufacturer  ");
                    String manufacturer = sc.nextLine();
                    System.out.println("Enter  product brand  ");
                    String brand = sc.nextLine();
                    System.out.println("Enter  product category  ");
                    String category = sc.nextLine();
                    Product product6 = new Product(price, name1, quantity, Ingredient, description, rating,
                            manufacturer, brand, category);

                    productPage.addProduct(product6);
                    break;

                case 9:
                    // remove Element
                    // System.out.print(showIndexName());
                    // List<Product> remov = productPage.getProducts();
                    System.out.println("Product name and index ");
                    int a = 0;
                    for (Product product : productPage.getProducts()) {
                        System.out.println("Index  : " + a + "  Product Name  : " + product.getName());
                        a++;
                    }
                    System.out.println("Enter The index which you  want to delete  :");
                    int indexRemove = sc.nextInt();
                    productPage.removeProduct(indexRemove);
                    break;
                case 10:

                    System.out.println("Product name and index ");
                    int b = 0;
                    for (Product product : productPage.getProducts()) {
                        System.out.println("Index  : " + b + "  Product Name  : " + product.getName());
                        b++;
                    }
                    System.out.println("Enter The index which you  want to Edit  :");
                    int indexEdit = sc.nextInt();
                    productPage.editProduct(indexEdit);

                    break;
                case 11:

                    productPage.removDup();

                    break;

                case 12:

                    return;

                default:
                    System.out.println("Invalid  Value !");
            }
            sc.nextLine();
            if (num == 12)
                break;
        }
    }
}