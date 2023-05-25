package com.company.design.aop;

import com.company.design.proxy.Html;
import com.company.design.proxy.IBrowser;

public class AopBrowser implements IBrowser {
    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;


    @Override
    public Html show() {
        before.run();
        if (html == null) {
            this.html = new Html(url);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("AopBrowser html loading from :" + url);
        }
        after.run();
        System.out.println("AopBrowser html cache:" + url);
        return this.html;
    }

    public AopBrowser(String url, Runnable before, Runnable after){
        this.url = url;
        this.before =before;
        this.after = after;
    }
}
