class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    @Override
    void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear + ", Author: " + name + ", Bio: " + bio);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2020, "John Doe", "Tech Writer");
        a.displayInfo();
    }
}
