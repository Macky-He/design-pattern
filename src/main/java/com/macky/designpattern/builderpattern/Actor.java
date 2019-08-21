package com.macky.designpattern.builderpattern;

import lombok.Data;

/**
 * @author Macky
 * @Title class Actor
 * @Description: TODO
 * @date 2019/8/20 9:57
 */
@Data
public class Actor {
    private String type; //角色类型
    private String sex; //性别
    private String face; //脸型
    private String costume; //服装
    private String hairstyle; //发型
}
