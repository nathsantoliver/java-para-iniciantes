// Book recodificada para acesso público.
package cap08.exPackageAccess.bookpack;

//  Book e seus membros devem ser public para serem usados por outros pacotes.
public class Book {
    private String title;
    private String author;
    private int pubDate;

    // Agora é pública.
    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    // Agora é público
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
