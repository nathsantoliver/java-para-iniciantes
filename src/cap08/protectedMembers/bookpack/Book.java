// Torna as variáveis de instância de Book protegidas.
package cap08.protectedMembers.bookpack;

public class Book {
    // agora essas variáveis são protected.
    protected String title;
    protected String author;
    protected int pubDate;

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
