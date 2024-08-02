package com.ideaspace.customSpring;

import org.reflections.Reflections;

/**
 * @author Alexander Dudkin
 */
public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> ifc);

    Reflections getScanner();
}
