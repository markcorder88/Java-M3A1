
public class M3Assignment {
    
    private String product;
    private double cost;
    private double price;
    
    public void run() {
	setProduct("Television");
	setCost(439.65);
	printConsole();
    }
    
    private void setProduct(String productName) {
	this.product = productName;
    }
    
    private void setCost(double productCost) {
	this.cost = productCost;
	setUpdatedCost(this.cost);
    }
    
    private void setUpdatedCost(double productCost) {
	this.price = Math.round(productCost * 130) / 100.0;
    }
    
    private void printConsole() {
	System.out.println("Product Name: " + this.product);
	System.out.println("Poduct Cost: $" + this.cost);
	System.out.println("Product Price: $" + this.price);
	System.out.println("*******Successfully Retrieved*************");
    }
}
