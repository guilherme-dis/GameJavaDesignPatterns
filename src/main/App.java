package main;


public class App {
    public static void main(String[] args) throws InterruptedException {

        View g = new View();
        g.jogar(g);
//
//
//        //instanciar objetos da cadeia
//        Saque saque100 = new Saque100();//inicio da cadeia
//
//        //criar cadeia – encadear os objetos da cadeia
//        saque100.setSucessor(null);
//
//        //processar saques
//        saque100.processaSaque(575);System.out.println();
//        saque100.processaSaque(175);System.out.println();
//        saque100.processaSaque(123);System.out.println();
//        saque100.processaSaque(155);System.out.println();
//        saque100.processaSaque(931);System.out.println();

//        Escudos escudo50 = new Escudo50();
//        Escudos escudo25 = new Escudo25();
//        escudo50.setSucessor(escudo25);
//        escudo25.setSucessor(null);
//
//        Personagem p=new Personagem1(0,0);
//        p.setEscudo(escudo50);
//        p.dano(55);
//        p.dano(5);
//        p.dano(5);
//        p.dano(70);
//        p.dano(5);
//        //p.escudoDano(50);
//        //p.escudoDano(80);
//        System.out.println(p.getLife());;
//        System.out.println(p.getState());
/*
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
