interface Drawable {
    void draw();
}

interface Printable {
    void print();
}

class Document implements Drawable, Printable {

    public void draw() {
        System.out.println("Drawing the document");
    }

    public void print() {
        System.out.println("Printing the document");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Document d = new Document();

        d.draw();
        d.print();
    }
}
