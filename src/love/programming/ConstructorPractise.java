package love.programming;

public class ConstructorPractise {

    public String bookGenre;
    public String bookName;
    public int pagesNum;

    public ConstructorPractise(){
        this("bookGenre","bookName",6);

    }

    public ConstructorPractise(String bGenre){
        bGenre = bGenre;
        System.out.println(bGenre);
    }

    public ConstructorPractise(String bGenre, String bookName){
//        this();
        this.bookGenre = bGenre;
        this.bookName = bookName;
        System.out.println(bGenre + bookName);
    }

    public ConstructorPractise(String bookGenre, String bookName, int pagesNum){
        bookGenre = bookGenre;
        this.bookName = bookName;
        this.pagesNum = pagesNum;
        System.out.println(bookGenre + bookName + pagesNum);



    }

}
