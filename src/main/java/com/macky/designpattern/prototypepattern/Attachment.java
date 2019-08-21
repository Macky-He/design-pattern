package com.macky.designpattern.prototypepattern;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Macky
 * @Title class Attachment
 * @Description: TODO
 * @date 2019/8/19 16:38
 */
@Data
public class Attachment implements Serializable {
    private String name;
    public void download(){
        System.out.println("下载附件，附件名为：" + name);
    }
}
