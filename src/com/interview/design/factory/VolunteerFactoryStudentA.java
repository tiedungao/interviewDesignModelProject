package com.interview.design.factory;

public class VolunteerFactoryStudentA implements VolunteerFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new LeifengStudentA();
    }
}
