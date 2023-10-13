package es1;

public class Cliente extends Thread{

    public String nome;
    public int counter=0;
    public Cliente(String nome,int counter){
        this.nome=nome;
        this.counter=counter;
    }
    @Override
    public void run(){
        while(true) {

            System.out.println(nome+" ha preso una pizza");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        }
    }

