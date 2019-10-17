package buildstopwatch;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
    }
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public long start(){
        startTime=System.currentTimeMillis();
        return startTime;
    }
    public long stop(){
        endTime=System.currentTimeMillis();
        return endTime;
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }
}
