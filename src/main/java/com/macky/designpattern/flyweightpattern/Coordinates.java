package com.macky.designpattern.flyweightpattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Macky
 * @Title class Coordinates
 * @Description: 坐标类（外部状态类）
 * @date 2019/8/28 17:46
 */
@Data
@AllArgsConstructor
public class Coordinates {
    private int x;
    private int y;
}
