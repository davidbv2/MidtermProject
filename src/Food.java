/**
 * Created by Grand Circus Student on 7/31/2017.
 */
public class Food {
    private String foodName;
    private String categoryName;
    private double price;
    private String description;
    private int quantity;

    public Food(String foodName, String categoryName, double price, String description, int quantity) {
        this.foodName = foodName;
        this.categoryName = categoryName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

