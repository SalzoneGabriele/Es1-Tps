package es1;

public class Pizza extends Thread{
public int numeropizza=0;
public Pizza(int numeropizza){
    this.numeropizza=numeropizza;
}
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            numeropizza++;

            System.out.println(" P"+i);


        }}

    public int GetNumeroPizza(){
    return this.numeropizza;
    }
}
