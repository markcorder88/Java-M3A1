import java.io.IOException;

/**
 * This is the main entry point to the M3Assignment class that takes in data from Module3-Data.txt such as product name
 *  and cost. Then outputs product name, cost and price to the console and into a new file called Inventory.txt
 * 
 * CSC2040C00
 * @author Mark Corder S02286163
 * @date 05-Jul-2023
 */
public class MainM3Assignment {

    public static void main(String[] args) throws IOException {
	
	M3Assignment myM3Assignment = new M3Assignment();
	myM3Assignment.run();
    }

}
