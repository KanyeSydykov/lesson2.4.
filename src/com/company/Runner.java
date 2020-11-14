package com.company;

public class Runner extends Thread {

    private Runner runnerBefore;
    private Runner runnerAfter;

    public Runner(String name) {
        super(name);
    }

    public void setRunners(Runner runnerBefore, Runner runnerAfter) {
        this.runnerBefore = runnerBefore;
        this.runnerAfter = runnerAfter;
    }

    @Override
    public synchronized void run() {
        try {
            System.out.println(getName() + " берет палочку");
            if (getName().equals("runner5")) {
                System.out.println(getName() + " бежит к финишу");
                System.out.println(getName() + " бежит к " + runnerBefore.getName());
                sleep(5000);
            } else {
                System.out.println(getName() + " бежит к " + runnerAfter.getName());
                sleep(5000);
                runnerAfter.start();
                runnerAfter.join();//repeat before 5th    narrow hall
            }
            System.out.println(getName() + " берет палочку");
            if (!getName().equals("runner1")) {
                System.out.println(getName() + " бежит к " + runnerBefore.getName());
                sleep(5000);
            } else
                System.out.println("забег окончен");

        } catch (Exception ignore) {
        }
    }
}
