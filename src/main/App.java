package main;


import main.personagem.personagens.Personagem;
import main.personagem.personagens.Personagem1;


public class App {
    public static void main(String[] args) throws InterruptedException {
        View g = new View();
        g.jogar(g);

        Personagem p;


        System.out.println("Personagem 1");
        p=new Personagem1(0,0);

/*
        p.atacar();
        p.pular();
        p.correr();

        p.dano(60);
        System.out.println(p.getLife());
        System.out.println(p.getState().getClass());

        p.ganhoDeVida(60);
        System.out.println(p.getLife());
        System.out.println(p.getState().getClass());
//
//        p.dano(555);
//        System.out.println(p.getLife());
//        System.out.println(p.getState().getClass());
//        p.atacar();

        Personagem p2=new Personagem1(-5,5);

        Inimigo i1=new Inimigo("dudu",5,5);
        Inimigo i2=new Inimigo("vava",-5,-5);
        Inimigo i3=new Inimigo("tata",5,-5);

        p2.addObserver(i1);
        p2.addObserver(i2);
        p2.addObserver(i3);

        p2.andar(0,0);
        p2.andar(0,0);
        p2.andar(0,0);p2.andar(0,0);p2.andar(0,0);p2.andar(0,0);p2.andar(0,0);p2.andar(0,0);p2.andar(0,0);p2.andar(0,0);p2.andar(0,0);
        p2.show();
//        p2.andar(1,1);
//        p2.andar(1,1);
//        p2.andar(1,1);
//        p2.andar(1,1);
//        p2.andar(1,1);
//        p2.andar(1,1);
//        p2.andar(1,1);
//        p2.andar(1,1);
//        p2.andar(0,0);



//        while(true){
//            p2.show();
//            Thread.sleep(900);
//        }
*/
    }
}
