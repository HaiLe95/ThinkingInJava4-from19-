package глава_21_rework;

import java.io.IOException;

public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract  int next();
    public void cancel() { canceled = true; }
    public boolean isCanceled() { return  canceled; }
}
