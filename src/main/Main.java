package main;

import models.Process;
import algorithms.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        List<Process> processes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Process P" + (i + 1));
            System.out.print("Arrival Time: ");
            int at = sc.nextInt();
            System.out.print("Burst Time: ");
            int bt = sc.nextInt();
            System.out.print("Priority (for priority scheduling): ");
            int pr = sc.nextInt();

            processes.add(new Process("P" + (i + 1), at, bt, pr));
        }

        System.out.println("\nChoose Scheduling Algorithm:");
        System.out.println("1. FCFS");
        System.out.println("2. SJF (Non-preemptive)");
        System.out.println("3. Round Robin");
        System.out.println("4. Priority (Non-preemptive)");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> new FCFS().schedule(processes);
            case 2 -> new SJF().schedule(processes);
            case 3 -> {
                System.out.print("Enter Time Quantum: ");
                int quantum = sc.nextInt();
                new RoundRobin().schedule(processes, quantum);
            }
            case 4 -> new PriorityScheduling().schedule(processes);
            default -> System.out.println("Invalid choice");
        }

        sc.close();
    }
}
