package homework5;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {
    //    private static AtomicInteger ai;
    private static int CARS_COUNT;

//    static {
//        ai = new AtomicInteger(0);
//    }

    private Race race;
    private int speed;
    private String name;
    private CyclicBarrier barrier;
    private ArrayBlockingQueue<Car> finished;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier barrier, ArrayBlockingQueue<Car> finished) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.barrier = barrier;
        this.finished = finished;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            barrier.await();
            barrier.await();

            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }

//            if (ai.incrementAndGet() == 1) {
//                System.out.println(name + " WIN !!!");
//            }
            finished.put(this);

            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
