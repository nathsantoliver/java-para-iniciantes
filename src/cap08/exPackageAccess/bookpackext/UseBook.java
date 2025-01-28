// Esta classe está no ppacote bookpackext.
package cap08.exPackageAccess.bookpackext;

// Usa a classe Boook a partir de bookpack.
class UseBook {
    public static void main(String[] args) {
        cap08.exPackageAccess.bookpack.Book books[] = new cap08.exPackageAccess.bookpack.Book[5];

        books[0] = new cap08.exPackageAccess.bookpack.Book("Java: A Beginner's Guide", "Schildt", 2014);
        books[1] = new cap08.exPackageAccess.bookpack.Book("Java: The Complete Reference", "Schildt", 2014);
        books[2] = new cap08.exPackageAccess.bookpack.Book("The Art of Java", "Schildt and Holmes", 2003);
        books[3] = new cap08.exPackageAccess.bookpack.Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new cap08.exPackageAccess.bookpack.Book("On the Road", "Kerouac", 1955);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
