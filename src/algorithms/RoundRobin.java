package algorithms;

import models.Process;
import java.util.*;

public class RoundRobin {
    public void schedule(List<Process> processes, int quantum) {
        Queue<Process> queue = new LinkedList<>();
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        int time = 0, completed = 0;
        int totalWT = 0, totalTAT = 0;
        int[] remainingBT = new int[processes.size()];
        for (int i = 0; i < processes.size(); i++) remainingBT[i] = processes.get(i).burstTime;

        queue.add(processes.get(0));
        int i = 1;

        System.out.println("\n=== Round Robin Scheduling (q = " + quantum + ") ===");
        System.out.println("PID\tAT\tBT\tCT\tTAT\tWT");

        while (!queue.isEmpty()) {
            Process p = queue.poll();
            int idx = processes.indexOf(p);

            if (remainingBT[idx] > quantum) {
                time += quantum;
                remainingBT[idx] -= quantum;
            } else {
                time += remainingBT[idx];
                remainingBT[idx] = 0;
                p.completionTime = time;
                p.turnaroundTime = p.completionTime - p.arrivalTime;
                p.waitingTime = p.turnaroundTime - p.burstTime;

                totalWT += p.waitingTime;
                totalTAT += p.turnaroundTime;
                completed++;

                System.out.println(p.pid + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + p.completionTime + "\t" + p.turnaroundTime + "\t" + p.waitingTime);
            }

            while (i < processes.size() && processes.get(i).arrivalTime <= time) {
                queue.add(processes.get(i));
                i++;
            }

            if (remainingBT[idx] > 0) queue.add(p);
        }

        System.out.println("Average WT: " + (double) totalWT / processes.size());
        System.out.println("Average TAT: " + (double) totalTAT / processes.size());
    }
}
