import java.util.*;

public class ProductPage {
    private List<Product> products;

    public ProductPage() {
        products = new ArrayList<>();
    }

    // add method
    public void addProduct(Product product) {
        products.add(product);
    }

    // remove method

    public void removeProduct(int indexRemove) {
        try {
            products.remove(indexRemove);
        } catch (Exception e) {
            System.out.println("Please Enter valid index ");
        }

    }
    // Edit product

    public void editProduct(int indexEdit) {

        try {
            System.out.println(products.get(indexEdit));
            System.out.println("What you want to edit :");
            System.out.println("1  == price  ");
            System.out.println("2  == name  ");
            System.out.println("3  == quantity  ");
            System.out.println("4  == ingredient  ");
            System.out.println("5  == description  ");
            System.out.println("6  == manufacturer  ");
            System.out.println("7  == brand  ");
            System.out.println("8  == category  ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter new  price :-");
                    double newprice = sc.nextDouble();
                    products.get(indexEdit).setPrice(newprice);

                    System.out.println(products.get(indexEdit));
                    // products.setPrice(newprice);
                    break;
                // ------------------------------------------------------------------------------
                case 2:
                    System.out.println("Enter new  name  :-");
                    sc.nextLine();
                    String newName = sc.nextLine();
                    // products.setPrice(newprice);
                    products.get(indexEdit).setName(newName);

                    System.out.println(products.get(indexEdit));

                    break;
                // ----------------------------
                case 3:
                    System.out.println("Enter new Quantity  ");
                    int newquantity = sc.nextInt();
                    products.get(indexEdit).setQuantity(newquantity);

                    System.out.println(products.get(indexEdit));
                    // products.setPrice(newprice);
                    break;

                case 4:
                    System.out.println("Enter new ingredient :- ");
                    sc.nextLine();
                    String newingredient = sc.nextLine();

                    products.get(indexEdit).setIngredient(newingredient);

                    System.out.println(products.get(indexEdit));
                    // products.setPrice(newprice);
                    break;

                case 5:
                    System.out.println("Enter new rating :- ");
                    sc.nextLine();
                    String newdescription = sc.nextLine();
                    products.get(indexEdit).setDescription(newdescription);

                    System.out.println(products.get(indexEdit));
                    // products.setPrice(newprice);
                    break;

                case 6:
                    System.out.println("Enter new manufacture ;- ");
                    sc.nextLine();
                    String newmanufacturer = sc.nextLine();
                    products.get(indexEdit).setManufacturer(newmanufacturer);

                    System.out.println(products.get(indexEdit));
                    // products.setPrice(newprice);
                    break;

                case 7:
                    System.out.println("Enter new brand :- ");
                    sc.nextLine();
                    String newbrand = sc.nextLine();
                    products.get(indexEdit).setBrand(newbrand);

                    System.out.println(products.get(indexEdit));
                    // products.setPrice(newprice);
                    break;

                case 8:
                    System.out.println("Enter new category :- ");
                    sc.nextLine();
                    String newcategory = sc.nextLine();
                    products.get(indexEdit).setCategory(newcategory);

                    System.out.println(products.get(indexEdit));
                    // products.setPrice(newprice);
                    break;

            }
        } catch (Exception e) {
            System.out.println("Please Enter valid index ");
        }

    }

    // sort method By price
    public void sortByPrice() {
        Collections.sort(products, new ProductComparatorByPrice());
    }

    // sort by name
    public void sortByName() {
        Collections.sort(products, new ProductComparatorByName());
    }

    // sort by Category
    public void sortByCategory() {
        Collections.sort(products, new ProductComparatorByCategory());
    }

    // short by price

    class ProductComparatorByPrice implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());
        }
    }

    // short by name
    class ProductComparatorByName implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareToIgnoreCase(p2.getName());
        }
    }

    // short by Category
    class ProductComparatorByCategory implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getCategory().compareToIgnoreCase(p2.getCategory());
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    // serch
    int flag = 0;

    public List<Product> searchByName(String term) {
        List<Product> results = new ArrayList<>();

        for (Product product : products) {
            if (product.getName().toLowerCase().contains(term.toLowerCase())) {
                results.add(product);
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Result Not Found");
        }
        return results;
    }

    public List<Product> searchByCategory(String term) {
        List<Product> results = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().toLowerCase().contains(term.toLowerCase())) {
                results.add(product);
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Result Not Found");
        }
        return results;
    }

    public List<Product> searchByIngredient(String term) {
        List<Product> results = new ArrayList<>();
        for (Product product : products) {
            if (product.getIngredient().toLowerCase().contains(term.toLowerCase())) {
                results.add(product);
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Result Not Found");
        }
        return results;
    }

    public void removes(Product p1) {
        Iterator<Product> itr = products.iterator();

        while (itr.hasNext()) {
            if (itr.next().equals(p1)) {
                itr.remove();
            }

        }

    }

    public void removDup() {
        List<Product> uniProDuct = new ArrayList<>();
        for (Product p1 : products) {
            uniProDuct.add(p1);
        }
        products.clear();

        for (Product p2 : uniProDuct) {
            removes(p2);
            addProduct(p2);
        }

    }

}