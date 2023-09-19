package Practice2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
        Author author2 = new Author("Sue Grant", "suGrant@somewhere.com", 'F');
        Author author3 = new Author("Alex Unknown", "alex@unknown.com", 'U');

        System.out.println(author1.toString());
        System.out.println(author2.toString());
        System.out.println(author3.toString());
    }
}
