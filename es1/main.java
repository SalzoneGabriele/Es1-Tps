package es1;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Cliente c1=new Cliente("c1",0);
        Cliente c2=new Cliente("c2",0);
        c1.start();
        c2.start();
    }


}
