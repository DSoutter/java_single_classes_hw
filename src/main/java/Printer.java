public class Printer {

    private int sheetsLeft;
    private int printerToner;

    public Printer(int sheetsLeft, int printerToner) {
        this.sheetsLeft = sheetsLeft;
        this.printerToner = printerToner;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public int getTonerAmount() {
        return this.printerToner;
    }

    public void printSheets(int pages, int copies) {
        this.sheetsLeft = this.sheetsLeft - (pages * copies);
    }

    public void printSheetsCheck(int pages, int copies) {
        if (this.sheetsLeft >= pages * copies) {
            printSheets(pages,copies);
        }
    }
}
