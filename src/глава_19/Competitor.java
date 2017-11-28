package глава_19;

/**
 * Created by Хай Ле on 20.05.2017.
 */
public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
