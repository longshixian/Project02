package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author ADMIN
 * @date 2019/6/30 - 9:36
 *
 * 1、 IDEA中代码模板所处的位置：settings - Editor -Live Templates / Editor - General - Postfix Completion
 * 2、常用的模板
 */
public class TemplatesTest {

    //模板六：prsf：可生成private static final
    private static final Customer CUST = new Customer();

    //变形：psf：可生成public static final
    public static final int NUM  = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "china";

    //模板一：psvm
    public static void main(String[] args){

        //模板二：sout
        System.out.println("hello!");
        //变形：soutp输出方法形参 / soutm输出方法名 / soutv输出变量 / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","Amy"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            
        }
        
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //模板五：ifn
        if (list == null) {

        }

        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn / xxx.null
        if (list != null) {

        }

        if (list == null) {

        }
    }

}
