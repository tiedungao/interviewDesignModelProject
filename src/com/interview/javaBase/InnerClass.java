package com.interview.javaBase;

/**
 * @Auther: gaoti
 * @Date: 2018/11/20 16:21
 * @Description:
 */
public class InnerClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InnerClass(String name){
        this.name = name;
    }

    class Student {
        private String sex;

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public Student(String sex) {
            this.sex = sex;
        }

        public void say(){
            System.out.println("Hello");
        }

    }

    static class Country{
        private String nature;

        public String getNature() {
            return nature;
        }

        public void setNature(String nature) {
            this.nature = nature;
        }

        public Country(String nature){
            this.nature = nature;
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass("gao");
        InnerClass.Student student = innerClass.new Student("female");
        student.say();
        Country country = new Country("汉族");
        InnerClass.Country country1 = new InnerClass.Country("回族");
        People people = new People(22);
        people.queryAge();
    }
}

 class People{
    private int age;

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public People(int age){
        this.age = age;
     }

     public void queryAge(){
         System.out.println(this.age);
     }

 }
