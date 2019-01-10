package com.interview.design.state;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 15:52
 * @Description:
 */
public class EmergencyProject {
    private int time = 0;
    private Boolean finished = false;

    public void setTime(int time) {
        this.time = time;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public void whiteState(){
        if(time < 12){
            System.out.println("上午时间，好好工作");
        }else if(time < 14){
            System.out.println("中午时间，好好工作");
        }else if(time < 17){
            System.out.println("下午时间，好好工作");
        }else if(time >17 ) {
            if (finished) {
                System.out.println("当前时间" + time + ",下班回家了");
            } else {
                if (time < 21) {
                    System.out.println("加班到了" + time + "点了，困死了");
                }else{
                    System.out.println("太晚了，睡着了");
                }
            }
        }
    }
}
