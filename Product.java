class Product {
    private double price;
    private String name;
    private int quantity;
    private String ingredient;
    private String description;
    private double rating;
    private String manufacturer;
    private String brand;
    private String category;

    // Constructor
    public Product(double price, String name, int quantity, String ingredient, String description, double rating,
            String manufacturer, String brand, String category) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.ingredient = ingredient;
        this.description = description;
        this.rating = rating;
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.category = category;
    }

    // Getters and Setters price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters and Setters name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters and Setters Quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getters and Setters Ingredien
    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    // Getters and Setters Description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getters and Setters Rating
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Getters and Setters Manufacturrer
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Getters and Setters Brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getters and Setters Category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {

        System.out.println("-----------Product  Details--------------");
        String str = " Price        :- " + price + "\n" +
                " name         :- " + name + "\n" +
                " quantity     :- " + quantity + "\n" +
                " ingredient   :- " + ingredient + "\n" +
                " description  :- " + description + "\n" +
                " rating       :- " + rating + "\n" +
                " manufacturer :- " + manufacturer + "\n" +
                " brand        :- " + brand + "\n" +
                " category     :- " + category + "\n";
        // " index :-" +

        return str;

    }

    public boolean equals(Product p1) {
        if (name.equalsIgnoreCase(p1.getName()) && ingredient.equalsIgnoreCase(p1.getIngredient())
                && description.equalsIgnoreCase(p1.getDescription())
                && manufacturer.equalsIgnoreCase(p1.getManufacturer()) && brand.equalsIgnoreCase(p1.getBrand())
                && category.equalsIgnoreCase(p1.getCategory()) && price == (p1.getPrice())
                && quantity == p1.getQuantity() && rating == p1.getRating()) {
            return true;
        }
        return false;

    }

}
