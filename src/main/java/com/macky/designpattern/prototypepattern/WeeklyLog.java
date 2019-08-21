package com.macky.designpattern.prototypepattern;

import lombok.Data;

import java.io.*;

/**
 * @author Macky
 * @Title class WeeklyLog
 * @Description: TODO
 * @date 2019/8/19 16:40
 */
@Data
public class WeeklyLog implements Serializable {
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLog) ois.readObject();
    }
}
