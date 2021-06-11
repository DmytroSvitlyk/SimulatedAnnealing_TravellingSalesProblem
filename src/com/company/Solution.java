package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Solution {
    final public static float INIT_TEMP = 30.0f,
                              FINAL_TEMP = 0.5f,
                              ALPHA = 0.98f;
    final public static int STEPS = 50;

    public static Point[] cords;
    public int[] path;
    public static int[] committedPath;
    public static int size;
    public float energy;

    public Solution(int n) {
        path = new int[n];
        energy = 0;
    }

    public void initSolution() {
        for (int i = 0; i < size; i++)
            this.path[i] = i;
        tweakSolution();
        tweakSolution();
    }

    public void tweakSolution() {
        int x, y;
        Random rand = new Random();
        x = rand.nextInt(size);
        do{
            y = rand.nextInt(size);
        } while (x==y);
        for (int i = x; i < y; i++) {
            int tmp = path[i];
            path[i] = path[y-i-1];
            path[y-i-1] = tmp;
        }
    }

    public void calcEnergy() {
        int tempEnergy = 0;
        for(int i = 0; i < size; i++) {
            tempEnergy += cords[path[i]].distance(cords[path[(i+1)%size]]);
        }
        this.energy = tempEnergy;
    }

    public void printSolution() {
        System.out.println("Path: ");
        for (int i : path) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void initCords(int n) {
        cords = new Point[n];
        size = n;
        int x, y;
        Random rand = new Random();
        for (int i = 0; i < cords.length; i++) {
            x = rand.nextInt(400);
            y = rand.nextInt(440);
            cords[i] = new Point(x, y);
        }
    }

    public void commitSolution(){
        committedPath = Arrays.copyOf(path, size);
    }

    public void copySolution(Solution sol){
        this.energy = sol.energy;
        if (size >= 0)
            this.path = Arrays.copyOf(sol.path, size);
    }
}
