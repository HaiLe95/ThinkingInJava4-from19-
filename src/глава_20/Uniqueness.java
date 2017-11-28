package глава_20;

/**
 * Created by Хай Ле on 23.05.2017.
 */

public @interface Uniqueness {
    Constraints contraints() default @Constraints (unique = true);
}
