package com.interview.design.prototype;

import java.util.Objects;

public abstract class Resume implements Cloneable {
    private String name;
    private int age;
    private String sex;

    private String workExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", workExperience='" + workExperience + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || this.getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return age == resume.getAge() &&
                Objects.equals(name, resume.getName()) &&
                Objects.equals(sex, resume.getSex()) &&
                Objects.equals(workExperience, resume.getWorkExperience());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, workExperience);
    }

    public abstract Prototype clone();

}
