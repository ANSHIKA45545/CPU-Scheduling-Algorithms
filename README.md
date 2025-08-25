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
javac main/Main.java models/*.java algorithms/*.java

### Run
java main.Main

```
---

### ✅ Provide Input

Enter the number of processes : _
Enter Arrival Time, Burst Time, and Priority for each process

Choose the scheduling algorithm:

1 → FCFS

2 → SJF

3 → Round Robin (will ask for quantum)

4 → Priority

---

### 🖥 Example Output (FCFS)


1. FCFS Scheduling

   <img width="628" height="541" alt="Command Prompt 8_25_2025 1_55_34 PM" src="https://github.com/user-attachments/assets/d7d23ee4-0014-42f4-bbdd-ee9f70e00d76" />

1. Priority Scheduling
<img width="539" height="537" alt="Command Prompt 8_25_2025 1_55_18 PM" src="https://github.com/user-attachments/assets/77643899-3a8c-4df7-8c8c-f70af01ab755" />
