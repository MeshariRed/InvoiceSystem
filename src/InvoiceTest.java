package JavaInvoice.src;

public class InvoiceTest {
    public static void main(String[] args) {
        
        Invoice invoice = new Invoice("1FDC4E", "Car", 10, 500);
        
        System.out.println("-----------------------------\nThe invoice before changing : \n-----------------------------\n");
        System.out.println("The part of number : " + invoice.getTheNumber());
        System.out.println("The part of description : " + invoice.getTheDescription());
        System.out.println("The sold : " + invoice.getTheQuantity());
        System.out.println("The price is : " + invoice.getThePricePreItem());
        System.out.println("The invoice amount : " +invoice.getTheInvoiceAmount());
        
        invoice.setTheNumber("6EDO4T");
        invoice.setTheDescription("Toys");
        invoice.setTheQuantity(1000);
        invoice.setThePricePreItem(100);
        
        System.out.println("\n----------------------------\nThe invoice after changing : \n----------------------------\n");
        System.out.println("The part of number : " + invoice.getTheNumber());
        System.out.println("The part description : " + invoice.getTheDescription());
        System.out.println("The sold : " + invoice.getTheQuantity());
        System.out.println("The price is : " + invoice.getThePricePreItem());
        System.out.println("The invoice amount : " + invoice.getTheInvoiceAmount()+"\n");
    }
}