package org.wu.practice2;


public class Person {
    private String name;
    private Integer age;
    private Integer times;

    public Person() {
        super();
    }

    public Person(String name, Integer age, Integer times) {
        super();
        this.name = name;
        this.age = age;
        this.times = times;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTimes(){ return times;}

    public void setTimes(Integer times) { this.times = times; }
}