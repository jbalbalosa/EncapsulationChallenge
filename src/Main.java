public class Main {
    public static void main(String[] args) {
        System.out.println("Encapsulation Challenge!");


        Printer printer = new Printer(25, true);

        printer.addToner(25);
        System.out.println("Toner Level is " + printer.getTonerLevel() +"%");
        System.out.println("Calculated sheets: " + printer.printPages(13));
        System.out.println("Pages printed " + printer.getPagesPrinted());
        System.out.println("Calculated sheets: " + printer.printPages(26));
        System.out.println("Pages printed " + printer.getPagesPrinted());
        if (printer.isDuplex()){
            System.out.println("It's a duplex printer");
        }
    }
}
