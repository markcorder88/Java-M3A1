import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * M3Assignment class that takes in data from Module3-Data.txt such as product name and cost. 
 *  Then outputs product name, cost and price to the console and into a new file called Inventory.txt
 * 
 * CSC2040C00
 * @author Mark Corder S02286163
 * @date 05-Jul-2023
 */
public class M3Assignment {
    
    private String product;
    private double cost;
    private double price;
    
    public void run() throws IOException {
	
	FileReader fr = new FileReader(".\\Module3-Data.txt");
	BufferedReader br = new BufferedReader(fr);
	
	FileWriter fw = new FileWriter(".\\Inventory.txt");
	PrintWriter pw = new PrintWriter(fw);
	
	String currentLine;
	
	while((currentLine = br.readLine()) != null) {
	    setProduct(currentLine);
	    setCost(br.readLine());
	    printConsole();
	    pw.println("Product Name: " + this.product);
	    pw.println("Poduct Cost: $" + this.cost);
	    pw.println("Product Price: $" + this.price);
	    pw.println();
	    pw.flush();
	}
	
    }
    
    private void setProduct(String productName) {
	this.product = productName;
    }
    
    private void setCost(String productCost) {
	this.cost = Double.parseDouble(productCost);
	setPrice(this.cost);
    }
    
    private void setPrice(double productCost) {
	this.price = Math.round(productCost * 130) / 100.0;
    }
    
    private void printConsole() {
	System.out.println("Product Name: " + this.product);
	System.out.println("Poduct Cost: $" + this.cost);
	System.out.println("Product Price: $" + this.price);
	System.out.println("*******Successfully Retrieved*************");
    }
}
