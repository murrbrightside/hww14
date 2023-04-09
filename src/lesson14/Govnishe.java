package lesson14;

public class Govnishe {
    public static void main(String[] args) {

        Book diaryOfGirl = new Book ("Ann Frank", 1945);
        Book toKillBird = new Book("Harper Lee", 1947);
        Author annFrank =  new Author("Ann", "Frank");
        Author harperLee = new Author("Harper", "Lee");
        diaryOfGirl.setYear(1950);
        System.out.println(diaryOfGirl.hashCode());

}}
