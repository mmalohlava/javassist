package test4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class JIRA209API {
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD, ElementType.METHOD})
    public @interface JIRA209Anno {
        Class<? extends Bar> bar() default Bar.class;
    }
    interface Bar {
        public void run();
    }
}
