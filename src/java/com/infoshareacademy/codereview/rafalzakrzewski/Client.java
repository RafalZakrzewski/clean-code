package java.com.infoshareacademy.codereview.rafalzakrzewski;

public class Client {
    private String imie;
    private String surname;
    private Long age;

    public String getName() {
        return imie;
    }

    public void setName(String name) {
        this.imie = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
