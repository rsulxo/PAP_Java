public class Exercise_1 {

    public static class InvoiceItem {

        // three instance variables
        int id;
        String description;
        int quantity;
        double unitPrice;

        // private variable bc its part of the class & it stores the total # of invoice items
        private int counter;

        // four parameter constructor to initialise all four instance variables
        public InvoiceItem(int id, String description, int quantity, double unitPrice) {
            this.id = id;
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        // returns invoice id
        int getID() {

            return this.id;
        }

        // returns invoice description
        String getDescription() {

            return this.description;
        }

        // returns the number of items in an invoice
        int getQuantity() {

            return this.quantity;
        }

        // returns the unit price
        double getUnitPrice() {

            return this.unitPrice;
        }

        // sets the number of items in an invoice(quantity)
        void setQuantity(int quantity) {

            this.quantity = quantity;
        }

        // sets the value of the unitPrice
        void setUnitPrice(double unitPrice) {

            this.unitPrice = unitPrice;
        }

        public String toString() { // returns the string representation of the object InvoiceItem
            System.out.println("InvoiceItem = " + this.id + ", Description = " + this.description + ", Quantity = " + this.quantity + ", UnitPrice = " + this.unitPrice);
            return null;
        }

    }
    // this is to test the program
    public static void main(String[] args) {

        InvoiceItem testInvoiceItem;
        testInvoiceItem = new InvoiceItem(200,"tax",2,300);
        testInvoiceItem.toString();

    }
}



