package глава_20;

/**
 * Created by Хай Ле on 22.05.2017.
 */
import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    public String name() default "";
}
