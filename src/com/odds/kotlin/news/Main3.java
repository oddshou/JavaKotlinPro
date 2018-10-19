package com.odds.kotlin.news;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

class Main3 {

    public static void main(String[] arg) {
//        test();
    }

//    private static void test() {
//        //1,普通泛型,内部固定item是self，可接受子类add。get返回类型self
//        List<Self> as = new ArrayList<>();
//        as.add(null);//ok
//        as.add(new Son());
//        as.add(new Self());
//        as.add(new Super());//error
//        Object as1 = as.get(0);
//        Son as2 = as.get(0);//error
//        Self as3 = as.get(0);
//        Super as4 = as.get(0);
//        //泛型赋值，类型不能兼容，成员是子类的泛型也不可以。因为泛型类型不仅会作为参数传入，还会作为返回传出
//        //那么item是Son的话不能接受Self的add(即参数传入)，son的返回时可以接受的。
//        as = new ArrayList<Super>();//error
//        as = new ArrayList<Son>();//error
//
//        //====================================================================================================================
//        //泛型类型是"？extends Self"，上界Self 不能接受赋值，只能赋值给其他变量
//        //那么上界 Self，意味着Self及其父类都可以接受它，add方法它作为形参不能接受任意参数
//        //get方法它作为返回值可以被Self及其父类接受
//        List<? extends Self> a = new ArrayList<>();
//        a.add(new Son());//error
//        a.add(new Self());//error
//        a.add(new Super());//error
//        a.add(null);
//        Self s1 = a.get(0);
//        Super s2 = a.get(0);
//        Son s3 = a.get(0); //error
//        //--------------------------------------
//        List<? extends Self> a2a = new ArrayList<Super>();
//        List<? extends Self> a2b = new ArrayList<Son>();
//        a2b.add(new Son());//error
//        a2b.add(new Self());//error
//        a2b.add(new Super());//error
//        a2b.add(null);
//        Self s21 = a2b.get(0);
//        Super s22 = a2b.get(0);
//        Son s23 = a2b.get(0); //error
//
//        //====================================================================================================================
//        //泛型类型是"？super Self"，下界Self，也就是说至少都是Self，可以接受self以下传参给他
//        //add方法它作为形参能接受self以下参数
//        //get方法它作为返回值没有上界，无法被接受
//        List<? super Self> b = new ArrayList<>();
//        b.add(null);
//        b.add(new Son());
//        b.add(new Self());
//        b.add(new Super());
//        Object o1 = b.get(0);
//        Son o2 = b.get(0);//error
//        Self o3 = b.get(0);//error
//        Super o4 = b.get(0);//error
//        //--------------------------------------
//        List<? super Self> b2b = new ArrayList<Son>();
//        List<? super Self> b2 = new ArrayList<Super>();
//        b2.add(null);
//        b2.add(new Son());
//        b2.add(new Self());
//        b2.add(new Super());//error
//        Object o21 = b2.get(0);
//        Son o22 = b2.get(0);//error
//        Self o23 = b2.get(0);//error
//        Super o24 = b2.get(0);//error
//    }
}
class Super{}
class Self extends Super{}
class Son extends Self{}

class Fruit{ }
class Apple extends Fruit { }
class Jonathan2 extends Apple {}
