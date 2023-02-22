package com.MultiThreading;

class Table{
     synchronized void printTable(int n){//method not synchronized
        for(int i=1;i<=5;i++){
            System.out.println(n*i+":"+Thread.currentThread());
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

class MyThread{
    public static void main(String args[]){
        Table obj = new Table();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread1 t2=new MyThread1(obj);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
        Test5 t = new Test6();
    }
}

abstract class Test5{

}

 class Test6 extends Test5 {

}