package com.interview.design.factory;

public class VolunteerFactoryStudentB implements VolunteerFactory {


    @Override
    public LeiFeng createLeiFeng() {
        return new LeifengStudentB();
    }
}
