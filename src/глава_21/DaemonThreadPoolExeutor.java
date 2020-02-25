package глава_21;

import net.mindview.util.DaemonThreadFactory;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DaemonThreadPoolExeutor extends ThreadPoolExecutor{
    public DaemonThreadPoolExeutor() {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(),
        new DaemonThreadFactory());
    }
}
