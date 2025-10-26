package lesson11.Classwork.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrinterServiceMain {
    public class PrinterService {
        public static void printAll(List<?> list) {
            for (Object obj : list) {
                System.out.println(obj);
            }
        }
    }
    public static void main(String[] args) {
        List<Invoice> invoices = Arrays.asList(new Invoice(14),new Invoice(15));
        List<Report> reports = Arrays.asList(new Report("satis analizi"),new Report("layihe gedisati"));
        List<Certificate> certificates = Arrays.asList(new Certificate("Rhcsa"),new Certificate("Java OCA"));
        PrinterService.printAll(invoices);
        PrinterService.printAll(reports);
        PrinterService.printAll(certificates);
    }
}
