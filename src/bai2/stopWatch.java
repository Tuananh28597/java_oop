package bai2;

public class stopWatch {
    public long startTime = 0L;
    public long endTime = 0L;
    public boolean isRunning = false;

    public stopWatch() {
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.isRunning = true;
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        this.isRunning = false;
    }

    public double getElapsedTime() {
        double elapsed;
        if (this.isRunning) {
            elapsed = (double)(System.currentTimeMillis() - this.startTime);
        } else {
            elapsed = (double)(this.endTime - this.startTime);
        }

        return elapsed;
    }
}
