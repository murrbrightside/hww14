package lesson14;

public class Author {
    private String lastName;
    private String firstName;
    public Author (String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;

    }
    public String getLastName(){
        return this.lastName;

    }
    public String getFirstName(){
        return this.firstName;

    }

    public String toString(){
        return "Имя " + this.firstName + " Фамилия " + this.lastName;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        else return false;
    }
    public int hashCode(){
        int result = 17;
        result = 31 * result + lastName.hashCode();
        result = 31 * result + firstName.hashCode();
        return result;
    }

}