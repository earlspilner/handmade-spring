package com.ideaspace.customSpring;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alexander Dudkin
 */
public class Main {
    public static void main(String[] args) {
//        CoronaDesinfector desinfector = ObjectFactory.getInstance().createObject(CoronaDesinfector.class);
        ApplicationContext context = Application.run("com.ideaspace.customSpring", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDesinfector desinfector = context.getObject(CoronaDesinfector.class);
        desinfector.start(new Room());
    }
}
