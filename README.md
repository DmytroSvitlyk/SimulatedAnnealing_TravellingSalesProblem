This program use Simulated Annealing Algorithm for solving Travelling Salesman Problem.</br>
The goal of the task is to pave the shortest path between N cities.</br>
Program creates window and places N random points on it. Then you can click "Calculate" button to get resust of algorithm.</br>
To change number of cities, just change N value in Main.java.</br>
For big values if N (>200?(not tested)) you may need to change some constants of algorithm in Solution.java:</br>
&nbsp;&nbsp;&nbsp;&nbsp;- INIT_TEMP - "temperature" of the system at start of algorithm;</br>
&nbsp;&nbsp;&nbsp;&nbsp;- FINAL_TEMP - after reaching this "temperature" algorithm stops;</br>
&nbsp;&nbsp;&nbsp;&nbsp;- ALPHA - temperature reducing factor (0 < ALPHA < 1);</br>
&nbsp;&nbsp;&nbsp;&nbsp;- STEPS - steps per one iteration of algorithm;</br>
At screenshot you can see result of program for 20 cities:</br></br>
<img src="https://user-images.githubusercontent.com/72920051/121742501-91ba1380-cb08-11eb-9b88-6f164d27acb9.png" alt = "image" width = 300/>
<img src="https://user-images.githubusercontent.com/72920051/121742582-b1e9d280-cb08-11eb-8eea-8ec6f951851f.png" alt = "image" width = 300/>
