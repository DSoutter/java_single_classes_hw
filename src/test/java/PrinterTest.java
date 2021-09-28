import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(200, 1000);
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

    @Test
    public void hasTonerProperty(){
        assertEquals(1000, printer.getTonerAmount());
    }

    @Test
    public void tonerVolumeStaysTheSame(){
        printer.printSheetsCheck(100,30);
        assertEquals(1000, printer.getTonerAmount());
    }

    @Test
    public void tonerVolumeDecreases(){
        printer.printSheetsCheck(20,5);
        assertEquals(900, printer.getTonerAmount());
    }
}
