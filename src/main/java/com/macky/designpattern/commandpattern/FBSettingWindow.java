package com.macky.designpattern.commandpattern;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

/**
 * @author Macky
 * @Title class FBSettingWindow
 * @Description: TODO
 * @date 2019/9/3 14:07
 */
@Data
public class FBSettingWindow {
    private String title;
    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

    public FBSettingWindow(String title){
        this.title = title;
    }
    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
    }

    //显示窗口及功能键
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (Object obj : functionButtons) {
            System.out.println(((FunctionButton) obj).getName());
        }
        System.out.println("------------------------------");
    }
}
