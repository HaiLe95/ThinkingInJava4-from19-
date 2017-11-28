package глава_20;

/**
 * Created by Хай Ле on 23.05.2017.
 */

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {
     boolean primaryKey() default false;
     boolean allowNull() default true;
     boolean unique() default false;
}
