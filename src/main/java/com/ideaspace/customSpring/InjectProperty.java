package com.ideaspace.customSpring;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Alexander Dudkin
 */
@Retention(RUNTIME)
public @interface InjectProperty {
    String value() default "";
}
