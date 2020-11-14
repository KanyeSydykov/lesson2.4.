public class Main {
 public static void main(String[] args) {

  Runner runner1 = new Runner("runner1");
  Runner runner2 = new Runner("runner2");
  Runner runner3 = new Runner("runner3");
  Runner runner4 = new Runner("runner4");
  Runner runner5 = new Runner("runner5");


  runner1.setRunners(runner5, runner2);
  runner2.setRunners(runner1, runner3);
  runner3.setRunners(runner2, runner4);
  runner4.setRunners(runner3, runner5);
  runner5.setRunners(runner4, runner1);

  runner1.start();
 }
