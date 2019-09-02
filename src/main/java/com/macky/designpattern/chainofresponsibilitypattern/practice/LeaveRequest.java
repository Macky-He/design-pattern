package com.macky.designpattern.chainofresponsibilitypattern.practice;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Macky
 * @Title class LeaveRequest
 * @Description: TODO
 * @date 2019/9/2 16:54
 */
@Data
@AllArgsConstructor
public class LeaveRequest {
    private int number;//请假天数
    private String name;//请假人
}
