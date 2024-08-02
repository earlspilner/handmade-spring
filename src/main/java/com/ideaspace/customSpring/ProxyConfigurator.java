package com.ideaspace.customSpring;

/**
 * @author Alexander Dudkin
 */
public interface ProxyConfigurator {
    Object replaceWithProxyIfNeeded(Object t, Class implClass);
}
