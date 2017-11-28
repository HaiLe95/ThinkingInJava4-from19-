package глава_20;

/**
 * Created by Хай Ле on 25.05.2017.
 */

import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
    public String value();
}
