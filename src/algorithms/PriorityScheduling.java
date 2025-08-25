package algorithms;

import models.Process;
import java.util.*;

public class PriorityScheduling {
    public void schedule(List<Process> processes) {
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        int time = 0;
        int completed = 0;
        int totalWT = 0, totalTAT = 0;
        boolean[] done = new boolean[processes.size()];

        System.out.println("\n=== Priority (Non-preemptive) Scheduling ===");
        System.out.println("PID\tAT\tBT\tPR\tCT\tTAT\tWT");

        while (completed < processes.size()) {
            int idx = -1;
            int minPR = Integer.MAX_VALUE;

            for (int i = 0; i < processes.size(); i++) {
                if (!done[i] && processes.get(i).arrivalTime <= time && processes.get(i).priority < minPR) {
                    minPR = processes.get(i).priority;
                    idx = i;
                }
            }

            if (idx == -1) {
                time++;
                continue;
            }

            Process p = processes.get(idx);
            time += p.burstTime;
            p.completionTime = time;
            p.turnaroundTime = p.completionTime - p.arrivalTime;
            p.waitingTime = p.turnaroundTime - p.burstTime;

            totalWT += p.waitingTime;
            totalTAT += p.turnaroundTime;

            System.out.println(p.pid + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + p.priority + "\t" + p.completionTime + "\t" + p.turnaroundTime + "\t" + p.waitingTime);

            done[idx] = true;
            completed++;
        }

        System.out.println("Average WT: " + (double) totalWT / processes.size());
        System.out.println("Average TAT: " + (double) totalTAT / processes.size());
    }
}
