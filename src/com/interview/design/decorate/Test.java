package com.interview.design.decorate;

import com.interview.design.decorate.impl.DecorateByJacket;
import com.interview.design.decorate.impl.DecorateByPants;
import com.interview.design.decorate.impl.DecorateByShoes;
import com.interview.design.decorate.impl.DecorateBySneaker;

public class Test {

    public static void main(String[] args) {
        Person person = new Person("gao");

        Decorate decorate = new Decorate();
        DecorateByShoes decorateByShoes = new DecorateByShoes();
        DecorateByPants decorateByPants = new DecorateByPants();
        DecorateByJacket decorateByJacket = new DecorateByJacket();
        DecorateBySneaker decorateBySneaker = new DecorateBySneaker();

        decorate.setDecorate(person);
        decorateByJacket.setDecorate(person);
        decorateByPants.setDecorate(decorateByJacket);
        decorateByShoes.setDecorate(decorateByPants);
        decorateBySneaker.setDecorate(decorateByShoes);

        decorateBySneaker.show();

    }

}
