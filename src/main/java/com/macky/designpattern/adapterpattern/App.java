package com.macky.designpattern.adapterpattern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/20 13:49
 */
public class App {

    public static void main(String[] args) {
        Target target = new TargetAdapter();
        int scores[] = {84,76,50,69,90,91,88,96};
        int result[];
        int score;
        System.out.println("成绩排序结果：");
        result = target.sort(scores);

        //遍历输出成绩
        for(int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        score = target.search(result,90);
        if (score != -1) {
            System.out.println("找到成绩90。");
        }
        else {
            System.out.println("没有找到成绩90。");
        }

        System.out.println("查找成绩92：");
        score = target.search(result,92);
        if (score != -1) {
            System.out.println("找到成绩92。");
        }
        else {
            System.out.println("没有找到成绩92。");
        }
    }
}
