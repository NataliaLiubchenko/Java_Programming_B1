package day39_a_polymorphism.book;

public class JavaTextBook extends EBook {
    boolean fun;
    @Override
    public void read() {
        System.out.println("Reading");

    }

    @Override
    public void download() {
        System.out.println("Downloading");

    }

    @Override
    public void open() {
        System.out.println("Opening");

    }
}
