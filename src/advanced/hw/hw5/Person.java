package advanced.hw.hw5;

public class Person {
    private String name;
    private int age;
    private char gender;
    private int yearOfBirth;

    public Person(String name, char gender, int yearOfBirth) {
        this.name = name;
//        this.age = age;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        if (gender == 'F' || gender == 'f') {
            return "Ms. " + name;
        } else if (gender == 'M' || gender == 'm') {
            return "Mr. " + name;
        } else {
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return 2022 - yearOfBirth;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

}
