import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        ProgrammingBook programmingBook1 = new ProgrammingBook(1, "book1", 5, "Kế Anh");
        ProgrammingBook programmingBook2 = new ProgrammingBook(2, "book2", 10, "Kế Anh");
        ProgrammingBook programmingBook3 = new ProgrammingBook(3, "book3", 20, "Kế Anh");
        FictionBook fictionBook1 = new FictionBook(4, "book4", 30, "Kế Anh", "Trinh thám");
        FictionBook fictionBook2 = new FictionBook(5, "book5", 15, "Kế Anh", "Ngôn lù");
        FictionBook fictionBook3 = new FictionBook(6, "book6", 40, "Kế Anh", "Hành động");

        long totalOfMoney = 0;
        for (int i=0;i<Book.index;i++){
            totalOfMoney += Book.list[i].price;
        }
        System.out.println("Tổng số tiền: "+totalOfMoney);

        int count = 0;
        for (int i=0;i<Book.index;i++){
            boolean isProgrammingBook = Book.list[i] instanceof  ProgrammingBook;
            if (isProgrammingBook){
                boolean isJavaBook = ((ProgrammingBook) Book.list[i]).language.equals("Java");
                if(isJavaBook){
                    count++;
                }
            }
        }
        System.out.println("Số sách Java là: " + count);
    }
 }
