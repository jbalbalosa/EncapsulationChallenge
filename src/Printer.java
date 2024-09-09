package PACKAGE_NAME;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int addToner(int tonerAmount){
        //tonerLevel += tonerAmount;

        if(tonerLevel + tonerAmount < 0 || tonerLevel + tonerAmount > 100){
            return -1;
        } else {
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
    }

    public int printPages(int pages){
        double sheets = 0;
        if(this.duplex){
            sheets = Math.round ((double)pages / 2);
            this.pagesPrinted += sheets;
            return (int)sheets;

        } else{
            this.pagesPrinted += pages;
            return  pages;
        }
    }
}

