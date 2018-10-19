package com.odds.kotlin;


import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

class Fruit { }
class Apple extends Fruit { }
class Jonathan extends Apple {}
class Orange extends Fruit {}

public class Main2<T> {

    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T t) {
        value = t;
    }

    public List<? extends String> result(){
        return null;
    }

    public void param(List<? extends String> source) {

    }

    public List<? super String> result2(){
        return null;
    }

    public void param2(List<? super String> source) {

    }

    public static void test(){
        Main2<String> stringMain2 = new Main2<>();
        List<? extends String> result = stringMain2.result();
        stringMain2.param(result);

    }

    public static void main(String [] arg) {
        String s = "o/AOu4kW00djp7pXyjzHOz0DBXgDRWgz+9Dp5/Esan8ncKDo29ojAcCg/gKw\nA8ZwZGY8mqCY4q4Dq0CCYElTliujEvUVkGUA2zohQikcSqMMY5X7eAGPdbBF\nazKGHFxrJMomFhpY0AWF5wKWJyEwFs8RSGudPXY7f63/wtL6sujobAflHe65\nHvegIWtenseRtbYmhFngZcgf78ULiL3Y2XRcEI7t28Sdcaf65GBGuvM7MB2/\ntLR8joWdCDm/K1Z4dk22O5mzlbfiDZ0d22UhHgH2s06GLRH50ardP5LRnvJ1\nEXY2EFm0o/BE1k+scdi0uGXkUkxVfeUXSfdjEJRImw==";


        String encode = URLEncoder.encode(s);
        System.out.println(encode);


        test();

//        ArrayList<Fruit> list = new ArrayList<Apple>();   //error 泛型是不变类型
        Fruit [] fruits = new Apple[10];                    //数组是协变的
        fruits[0] = new Apple();
//        fruits[1] = new Orange(); //error

        ArrayList<Apple> list = new ArrayList<>();
        list.add(new Apple());
//        list.add(new Fruit());  //error
        list.add(new Jonathan());
        System.out.println(list.get(1));    //com.odds.kotlin.Jonathan@2b193f2d

        ArrayList<? super Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Jonathan());
//        apples.add(new Fruit())   //error
        System.out.println(apples.get(1));

        ArrayList<? extends Apple> apples1 = new ArrayList<>();
//        apples1.add(new Apple()); //error
//        apples1.add(new Jonathan());  //error
//        apples1.add(new Fruit()); //error




    }
}
