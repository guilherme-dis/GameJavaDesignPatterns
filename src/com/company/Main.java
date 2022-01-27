package com.company;

import com.company.personagens.personagens.Personagem;
import com.company.personagens.personagens.Personagem1;
import com.company.personagens.personagens.Personagem2;
import com.company.personagens.personagens.Personagem3;
import com.company.personagens.poderes.Raio;
import com.company.personagens.poderes.Tiro;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*View g = new View();
        g.jogar(g);


*/
        Personagem p1 = new Personagem1("jorje mano kkkkk", 1, 1);
        Personagem p2 = new Personagem2("teclado", 1, 1);
        Personagem p3 = new Personagem3("mouse", 1, 1);
        System.out.println("Personagem 1");
        //p1.ganharLife(50);

        //System.out.println(p1.atacar());
//        System.out.println(p1.correr());
//        System.out.println(p1.pular());


//        p1.setAtacar(new Raio(p1.getAtacar()));
//        p1.setAtacar(new Tiro(p1.getAtacar()));
//        p1.setAtacar(new SuperChute(p1.getAtacar()));
//        System.out.println();
//        p1.perderLife(60);

        System.out.println(p1.atacar());
        p1.setAtacar(new Raio(p1.getAtacar()));
        p1.setAtacar(new Tiro(p1.getAtacar()));
        System.out.println(p1.atacar());
        //System.out.println(p1.atacar());
//        System.out.println(p1.getState());
//        System.out.println(p1.getLife());
//        System.out.println(p1.atacar());


        //System.out.println(p1.atacar());

        /*
        System.out.println("Personagem 2");
        p2.atacar();
        p2.correr();
        p2.pular();
        System.out.println();
        System.out.println("Personagem 3");
        p3.atacar();
        p3.correr();
        p3.pular();

        System.out.println("--------------------------");
        p1.setAtacar(new AtaqueFraco());
        p1.atacar();
        System.out.println("----------------");
        System.out.println(p1.getState());
        System.out.println(p1.getLife());
        p1.perderLife(50);
        System.out.println(p1.getLife());
        System.out.println(p1.getState());
        p1.atacar();
        p1.ganharLife(80);
        p1.atacar();
        p1.perderLife(110);
        System.out.println(p1.getState());
        System.out.println(p1.getLife());
        p1.ganharLife(50);
        System.out.println(p1.atacar());*/


//        p1=new Tiro(p1);
//        p1=new Raio(p1);
//        p1=new SuperChute(p1);
//        System.out.println(p1.getCusto());
//        System.out.println(p1.custo);


    }
}
