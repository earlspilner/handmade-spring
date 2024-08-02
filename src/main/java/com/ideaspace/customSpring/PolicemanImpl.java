package com.ideaspace.customSpring;

import javax.annotation.PostConstruct;

/**
 * @author Alexander Dudkin
 */
public class PolicemanImpl implements Policeman {

    @InjectByType
    private Recommendator recommendator;

    @PostConstruct
    public void init() {
        System.out.println(recommendator.getClass());
    }

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("пиф паф, бах бах, кыш, кыш");
    }
}
