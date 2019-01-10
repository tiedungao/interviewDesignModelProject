package com.interview.design.state;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 15:46
 * @Description:
 */
public class CommonMethod {

    public static void main(String[] args) {
        EmergencyProject emergencyProject = new EmergencyProject();

        emergencyProject.setFinished(false);
        emergencyProject.setTime(11);
        emergencyProject.whiteState();
        emergencyProject.setTime(13);
        emergencyProject.whiteState();
        emergencyProject.setTime(15);
        emergencyProject.whiteState();
        emergencyProject.setTime(18);
        emergencyProject.whiteState();
        emergencyProject.setTime(19);
        emergencyProject.whiteState();
        emergencyProject.setTime(20);
        emergencyProject.setFinished(true);
        emergencyProject.whiteState();
    }


}
