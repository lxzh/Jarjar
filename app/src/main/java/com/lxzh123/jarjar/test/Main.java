package com.lxzh123.jarjar.test;

/**
 * description $
 * author      Created by lxzh
 * date        2021/1/9
 */
public class Main {
    public static void main(String[] args) {
        args = new String[]{"process","app/libs/rule.txt","app/libs/jarjar-1.4.1.jar","app/libs/jarjar-1.4.1_repack.jar"};
        try {
            com.tonicsystems.jarjar.Main.main(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
