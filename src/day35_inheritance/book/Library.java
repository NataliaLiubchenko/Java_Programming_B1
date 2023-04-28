package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {
        Book book =new Book();
        //this book object can reach 6 instances
        EBook ebook =new EBook();
        //thes ebook object can reach 6 instance var from super class and 2 instance var and one instance method from its own class and one instance method
        ebook.size = 20;
        ebook.pages = 1035;
        ebook.title = "Soft skills";
        ebook.author = "Nadir";
        ebook.read();
        AudioBook abook = new AudioBook();
        abook.duration = 2.4;
        abook.narrator = "Morgan Freeman";
        abook.title = "Java";
        abook.author = "James Gosling";
        abook.listen();
    }
}
