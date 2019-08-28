package com.macky.designpattern.flyweightpattern;
import	java.util.HashMap;

/**
 * @author Macky
 * @Title class IgoChessmanFactory
 * @Description: TODO
 * @date 2019/8/28 17:51
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static HashMap map;
    private IgoChessmanFactory(){
        map = new HashMap();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();
        map.put("b",black);
        map.put("w",white);
    }

    public static IgoChessmanFactory getInstance() {
         return instance;
    }
    public IgoChessman getIgoChessman(String color){
        return (IgoChessman) map.get(color);
    }
}
