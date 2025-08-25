package models;

public class Process {
    public String pid;
    public int arrivalTime, burstTime, priority;
    public int completionTime, turnaroundTime, waitingTime;

    public Process(String pid, int arrivalTime, int burstTime, int priority) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}
