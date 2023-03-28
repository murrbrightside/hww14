package lesson14;

public class Book {
    private String author;
    private int year;
    public Book(String author, int year){
        this.author = author;
        this.year = year;
    }
    public String getAuthor(){
        return this.author;

    }
    public int getYear(){
        return this.year;

    }
    public void setYear(int year){
        this.year = year;
    }
    public String toString(){
        return "" + "Автор " + author + " год " + year;
    }
    public int hashCode(){
        int result = 17;
        result = 31 * result + author.hashCode();
        result = 31 * result + year;
        return result;
    }
}
