package com.atguigu.cn.net;

/**
 * @Classname MatchTest
 * @Description TODO
 * @Date 2020/5/30 9:44
 * @Created by 86153
 */
public class MatchTest {
    public static void main(String[] args) {
        int i = 10;
        switch (i) {
            default :
                System.out.println("other number");
                //break;
            case 10 :
                System.out.println("10");
                //break;
            case 20 :
                System.out.println("20");
                //break;
        }

    }
}
