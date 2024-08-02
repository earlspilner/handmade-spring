package com.ideaspace.customSpring;

import java.util.Map;

/**
 * @author Alexander Dudkin
 */
public class Application {
    public static ApplicationContext run(String packageToScan, Map<Class, Class> ifc2ImplClass) {
        JavaConfig config = new JavaConfig(packageToScan, ifc2ImplClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);
        // todo homework - init all singletons which are not lazy
        context.setFactory(objectFactory);
        return context;
    }
}
