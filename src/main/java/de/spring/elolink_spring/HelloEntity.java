package de.spring.elolink_spring;

public class HelloEntity {

    private String name;

    public String getName() {
        return name;
    }

    public HelloEntity(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
