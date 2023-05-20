package map;

import java.util.HashMap;
import java.util.Map;

public class Books {

    int id;
    String name,author,publisher;
    int quantity;

    public Books(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        /*
        //Create a class to store details of the books such as id,
    // name author of a book, publisher, quantity etc. and use HashMap to get each entry
         */


        Books b1 = new Books(101,"Let us C", "Yashwant Kanetkar", "BPB", 8);
        Books b2 = new Books(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Books b3 = new Books(103,"Operating System","Galvin","Wiley",6);
        Books b4 = new Books(104,"Data Structure", "Yashwant Kanetkar", "BPB", 8);

        Map<Integer,Books> bookList=new HashMap<>();
        bookList.put(1,b1);
        bookList.put(2,b2);
        bookList.put(3,b3);
        bookList.put(4,b4);

        System.out.println("bookList = " + bookList);

        for(Map.Entry<Integer,Books> w:bookList.entrySet()){
            System.out.println("w.getKey() = " + w.getKey());
            System.out.println();
            System.out.println("w.getValue() = " + w.getValue());
            System.out.println();
            System.out.println("w = " + w);
        }

    }
}
