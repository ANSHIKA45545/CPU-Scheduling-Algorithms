# ⚡ CPU Scheduling Algorithms in Java

An implementation of popular CPU scheduling algorithms (FCFS, SJF, Round Robin, and Priority Scheduling) using Java.  
The program allows users to enter the number of processes, Arrival Time, Burst Time, and Priority through the terminal and calculates Completion Time (CT), Turnaround Time (TAT), and Waiting Time (WT).

---

## ✨ Features

✅ Supports 4 Scheduling Algorithms:
- First Come First Serve (FCFS) – Non-preemptive  
- Shortest Job First (SJF) – Non-preemptive  
- Round Robin – Preemptive with user-defined time quantum  
- Priority Scheduling – Non-preemptive  

✅ User-defined Number of Processes 

✅ Interactive input for:
- Arrival Time (AT)
- Burst Time (BT)
- Priority (for Priority Scheduling)

✅ Calculates and displays:
- Completion Time (CT)
- Turnaround Time (TAT)
- Waiting Time (WT)
- Average WT & TAT

---

▶ How to Run

### Clone the Repository
```bash
git clone https://github.com/your-username/cpu-scheduling-java.git
cd cpu-scheduling-java/src

### Compile
```bash
javac main/Main.java models/*.java algorithms/*.java

### Run
```bash
java main.Main

---
n
