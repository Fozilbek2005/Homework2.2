package com.company;

public class Main {

    public static void main(String[] args) {
        Phone phone = createObject(Samsung.class.getName());
        Phone Iphone = createObject(Iphone.class.getName());
        Phone Poco = createObject(Poco.class.getName());
        phone.prinr();
        Iphone.prinr();
        Poco.prinr();

    }

    public static Phone createObject(String className) {
        if (className == Samsung.class.getName()) {
            return new Samsung();
        } else if (className == Iphone.class.getName()) {
            return new Iphone();
        } else {
            return new Poco();

        }
    }
}