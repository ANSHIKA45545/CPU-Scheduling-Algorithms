package algorithms;

import models.Process;
import java.util.*;

public class FCFS {
    public void schedule(List<Process> processes) {
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        int time = 0;
        int totalWT = 0, totalTAT = 0;

        System.out.println("\n=== FCFS Scheduling ===");
        System.out.println("PID\tAT\tBT\tCT\tTAT\tWT");

        for (Process p : processes) {
            time = Math.max(time, p.arrivalTime);
            time += p.burstTime;
            p.completionTime = time;
            p.turnaroundTime = p.completionTime - p.arrivalTime;
            p.waitingTime = p.turnaroundTime - p.burstTime;

            totalWT += p.waitingTime;
            totalTAT += p.turnaroundTime;

            System.out.println(p.pid + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + p.completionTime + "\t" + p.turnaroundTime + "\t" + p.waitingTime);
        }

        System.out.println("Average WT: " + (double) totalWT / processes.size());
        System.out.println("Average TAT: " + (double) totalTAT / processes.size());
    }
}
