package com.own.myhello;

public class Mythread extends Thread {
    @Override
    public void run() {
        try {
            int i = 0;
            while (i < 1000000) {
                System.out.println("正在运行的线程名称：" + i + "\t" + this.currentThread().getName() + " 开始");
                Thread.sleep(2000);    //延时1秒
                System.out.println("正在运行的线程名称：" + i + "\t" + this.currentThread().getName() + " 结束");
                i += 1;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
