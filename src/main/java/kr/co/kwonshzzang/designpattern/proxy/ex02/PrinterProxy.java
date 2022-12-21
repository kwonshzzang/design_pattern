package kr.co.kwonshzzang.designpattern.proxy.ex02;

public class PrinterProxy implements Printable {
    private String name;   //이름
    private Printer real;   //본인

    public PrinterProxy() {

    }

    public PrinterProxy(String name) {
        this.name =name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if(real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if(real == null) {
            real = new Printer(name);
        }
    }
}
