package main;


import main.personagem.inimigo.InimigoConcreto;
import main.personagem.personagens.Personagem;
import main.personagem.personagens.Personagem1;


public class App {
    public static void main(String[] args) throws InterruptedException {

        Personagem p;


        System.out.println("Personagem 1");
        p=new Personagem1(0,0);

        p.atacar();
        p.pular();
        p.correr();

        p.dano(60);
        System.out.println(p.getLife());
        System.out.println(p.getState().getClass());

        p.ganhoDeVida(60);
        System.out.println(p.getLife());
        System.out.println(p.getState().getClass());
        /*
        p.dano(555);
        System.out.println(p.getLife());
        System.out.println(p.getState().getClass());
        p.atacar();*/

        Personagem p2=new Personagem1(-5,5);

        InimigoConcreto i1=new InimigoConcreto(p2,"dudu",5,5);
        InimigoConcreto i2=new InimigoConcreto(p2,"vava",-5,-5);
        InimigoConcreto i3=new InimigoConcreto(p2,"tata",5,-5);

        p2.alterarAlerta();
        p2.alterarAlerta();

        p2.andar(1,1);
        p2.andar(1,1);
        p2.andar(1,1);
        p2.andar(1,1);
        p2.andar(1,1);
        p2.andar(1,1);
        p2.andar(1,1); p2.andar(1,1); p2.andar(1,1);
        p2.andar(0,0);



//        while(true){
//            p2.show();
//            Thread.sleep(900);
//        }

    }
}
