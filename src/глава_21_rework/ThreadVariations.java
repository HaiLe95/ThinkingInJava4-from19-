package глава_21_rework;

import java.util.concurrent.*;
import static net.mindview.util.Print.*;

class InnerThread1 {

    private int countDown = 5;
    private Inner inner;

    private class Inner extends Thread {
        Inner(String name) {
            super(name);
            start();
        }

        @Override
        public void run() {
            try {
                while (true) {
                    print(this);
                    if (--countDown == 0)
                        return;
                    sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return getName() + ": " + countDown;
        }
    }

    public InnerThread1(String name) {
        inner = new Inner(name);
    }
}
    class InnerThread2 {

        private int countDown = 5;
        private Thread thread;

        public InnerThread2(String name) {
            thread = new Thread(name) {
                public void run() {
                    try {
                        while (true) {
                            print(this);
                            if (--countDown == 0)
                                return;
                            sleep(10);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public String toString() {
                    return getName() + ": " + countDown;
                }
            };
            thread.start();
        }
    }

    class InnerRunable1 {
        private int countDown = 5;
        private Inner inner;

        private class Inner implements Runnable {
            Thread thread;

            Inner(String name) {
                thread = new Thread(this, name);
                thread.start();
        }
            @Override
            public void run() {
                try {
                    while (true) {
                        print(this);
                        if(--countDown == 0) return;
                        TimeUnit.MILLISECONDS.sleep(10);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public String toString() {
                return thread.getName() + ": " + countDown;
            }
    }

    public InnerRunable1(String name) {
            inner = new Inner(name);
    }
}

class InnerRunnable2 {
    private int countDown = 5;
    private Thread thread;
    public InnerRunnable2(String name) {
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        print(this);
                        if(--countDown == 0) return;
                        TimeUnit.MILLISECONDS.sleep(10);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            public String toString() {
                return Thread.currentThread().getName() + ": " + countDown;
            }
        }, name);
        thread.start();
    }
}

class ThreadMethod {
    private int countDown = 5;
    private Thread thread;
    private String name;

    public ThreadMethod(String name) { this.name = name; }

    public void runTask() {
        if(thread == null) {
            thread = new Thread(name) {
                @Override
                public void run() {
                    try {
                        while (true) {
                            print(this);
                            if(--countDown == 0) return;
                            sleep(10);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public String toString() {
                    return getName() + ": " + countDown;
                }
            };
            thread.start();
        }
    }
}

public class ThreadVariations {
    public static void main(String[] args) {
        new InnerThread1("InnerThread 1");
        new InnerThread2("InnerThread 2");
        new InnerRunable1("InnerRunnable 1");
        new InnerRunnable2("InnerRunable 2");
        new ThreadMethod("ThreadMethod").runTask();
    }


}

