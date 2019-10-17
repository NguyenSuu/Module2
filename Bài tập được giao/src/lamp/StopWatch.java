package lamp;

public class StopWatch {
    private static long startTime;
    private static long endTime;

    public StopWatch(){
    }
    public static long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public static long start(){
        StopWatch.startTime=System.currentTimeMillis();
        return startTime;
    }
    public static long stop(){
        endTime=System.currentTimeMillis();
        return endTime;
    }
    public static long getElapsedTime(){
        return endTime-startTime;
    }
}
