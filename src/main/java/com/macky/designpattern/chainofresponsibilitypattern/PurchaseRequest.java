package com.macky.designpattern.chainofresponsibilitypattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Macky
 * @Title class PurchaseRequest
 * @Description: TODO
 * @date 2019/9/2 16:02
 */
@Data
@AllArgsConstructor
public class PurchaseRequest {
    private double amount;
    private int number;
    private String purpose;
}
