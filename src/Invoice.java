package JavaInvoice.src;

public class Invoice {

    // To Make The Default Value Is Not Accessible To Change This Value
    private String theNumber;
    private String theDescription;
    private int theQuantity;
    private double pricePreItem;

    // To Print The Default Value In Your Screen Before Change
    public Invoice(String theNumber, String theDescription, int theQuantity, double pricePreItem) {
        this.theNumber = theNumber;
        this.theDescription = theDescription;
        this.theQuantity = theQuantity;
        this.pricePreItem = pricePreItem;
    }

    // To Set The Number
    public void setTheNumber(String theNumber) {
        this.theNumber = theNumber;
    }

    // To Receive The Number
    public String getTheNumber() {
        return theNumber;
    }

    // To Set The Description
    public void setTheDescription(String theDescription) {
        this.theDescription = theDescription;
    }

    // To Receive The Description
    public String getTheDescription() {
        return theDescription;
    }

    // To Set The Quantity
    public void setTheQuantity(int theQuantity) {
        if (theQuantity > 0) {
            this.theQuantity = theQuantity;
        } else {
            this.theQuantity = 0;
        }
    }

    // To Receive The Quantity
    public int getTheQuantity() {
        return theQuantity;
    }

    // To Set The Price
    public void setThePricePreItem(double pricePreItem) {
        if (pricePreItem > 0) {
            this.pricePreItem = pricePreItem;
        } else {
            this.pricePreItem = 0;
        }
    }

    // To Receive The Price
    public double getThePricePreItem() {
        return pricePreItem;
    }

    // To Show Your Invoice Amount
    public double getTheInvoiceAmount() {
        return pricePreItem * theQuantity;
    }
}

