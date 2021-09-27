public class Printer {

    private int sheetsLeft;

    public Printer(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
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
