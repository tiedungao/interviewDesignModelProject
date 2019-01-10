package com.interview.reflect;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.*;

/**
 * @Auther: gaoti
 * @Date: 2018/11/19 16:38
 * @Description:
 */
public class Student implements Cloneable, Serializable {
    private static final long serializableUID = -12314325643643622L;
    //姓名
    private String name;
    //年龄
    private int age;
    //成绩
    private int score;
    //班级
    private String grade;

    private Nature nature;

    public Nature getNature() {
        return nature;
    }

    public Student(String name, int age, int score, String grade, Nature nature) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.grade = grade;
        this.nature = nature;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                ", nature=" + nature +
                '}';
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(){

    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getScoreGrade() {
        if (this.score >= 90) {
            return "优秀";
        } else if (this.score >= 60) {
            return "良好";
        } else {
            return "不及格";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                score == student.score &&
                Objects.equals(name, student.name) &&
                Objects.equals(grade, student.grade) &&
                Objects.equals(nature, student.nature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score, grade, nature);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student =(Student) super.clone();
        student.nature = (Nature) nature.clone();
        return student;
    }
}
