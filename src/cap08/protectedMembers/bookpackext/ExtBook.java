// Demonstra protected
package cap08.protectedMembers.bookpackext;

class ExtBook extends cap08.protectedMembers.bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    // Estas instruções estão corretas porque subclasses podem acessar
    // um membro protegido
    public String getTitle() {
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String a) {
        author = a;
    }

    public int getPubDate() {
        return pubDate;
    }
    public void setPubDate(int d) {
        pubDate = d;
    }
}
