import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(200);
    }

    @Test
    public void hasSheetsLeft(){
        assertEquals(200,printer.getSheetsLeft());
    }

    @Test
    public void canPrintSheetsTrue(){
        printer.printSheetsCheck(20,5);
        assertEquals(100, printer.getSheetsLeft());
    }

    @Test
    public void cannotPrintSheets(){
        printer.printSheetsCheck(100,30);
        assertEquals(200, printer.getSheetsLeft());
    }
}
