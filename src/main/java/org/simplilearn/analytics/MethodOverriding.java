package org.simplilearn.analytics;

class AA {

    public void m1(){
        System.out.println("m1-AA");
    }
}

class BB extends AA{

    @Override
    public void m1() {
        super.m1();
        System.out.println("m1-BB");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        BB obj = new BB();
        obj.m1();
    }

}
