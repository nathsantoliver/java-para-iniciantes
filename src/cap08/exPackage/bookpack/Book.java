// Demonstração breve dos pacotes.
package cap08.exPackage.bookpack;   // Esse arquivo faz parte do pacote bookpack

class Book {        //  Book faz parte de bookpack
    private String title;
    private String author;
    private int pubDate;

    Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
