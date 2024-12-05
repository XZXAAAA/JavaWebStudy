package pojo;

import java.util.Arrays;
import java.util.Objects;

public class person {
    private String name;
    private int age;
    private String[] hobby;
    private Dog dog;

    public person() {
    }

    public person(String name, int age, String[] hobby, Dog dog) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.deepEquals(hobby, person.hobby) && Objects.equals(dog, person.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Arrays.hashCode(hobby), dog);
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                ", dog=" + dog +
                '}';
    }
}
