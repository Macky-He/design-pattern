package com.macky.designpattern.prototypepattern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/19 16:41
 */
public class App {
    public static void main(String[] args) {
        WeeklyLog weeklyLog_old,weeklyLog_new = null;
        weeklyLog_old = new WeeklyLog();
        Attachment attachment = new Attachment();
        weeklyLog_old.setAttachment(attachment);
        try {
            weeklyLog_new = weeklyLog_old.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("克隆失败！");
        }
        System.out.println("周报是否相同：" + (weeklyLog_new == weeklyLog_old));
        System.out.println("附件是否相同：" + (weeklyLog_new.getAttachment() == weeklyLog_old.getAttachment()));
    }
}
