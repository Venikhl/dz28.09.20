package org.step.spring;

import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AnimalWorld {
}
