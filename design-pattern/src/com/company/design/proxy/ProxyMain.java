package com.company.design.proxy;


import com.company.design.singleton.B;

public class ProxyMain {
    public static void main(String[] args) {
        Browser browser = new Browser("wwww.naver.com");
        //매번 로딩이 일어남
        browser.show();
        browser.show();
        browser.show();
        browser.show();

        BrowserProxy browserProxy = new BrowserProxy("www.naver.com");
        browserProxy.show();
        browserProxy.show();
        browserProxy.show();
    }
}
