package com.interview.design.factory;

public class Test {
    public static void main(String[] args) {
        VolunteerFactory volunteerFactory = new VolunteerFactoryStudentB();
        LeiFeng leiFeng = volunteerFactory.createLeiFeng();
        leiFeng.clean();
        leiFeng.bath();
        leiFeng.cook();
    }

}
