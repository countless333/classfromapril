package april4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class class3 {

    public static void main(String[] args) {
        // 스레드 풀 생성
        ExecutorService es = Executors.newFixedThreadPool(5);

        // 작업 스레드 등록
        es.execute(new SumThread1());
        es.execute(new SumThread2());

        // 스레드 풀 종료
        es.shutdown();

        try {
            // 모든 작업이 완료될 때까지 대기
            if (!es.awaitTermination(5, TimeUnit.SECONDS)) {
                // 모든 작업이 완료되지 않은 경우 강제 종료
                es.shutdownNow();
            }
        } catch (InterruptedException e) {
            // 현재 스레드를 중단하고 인터럽트 상태를 유지
            Thread.currentThread().interrupt();
        }
    }
}

class SumThread1 extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("스레드 1번의 현재 sum : " + sum + " 현재 i : " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("shutdown now 호출");
                break;
            }
        }
    }
}

class SumThread2 extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 30; i <= 40; i++) {
            sum += i;
            System.out.println("스레드 2번의 현재 sum : " + sum + " 현재 i : " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("shutdown now 호출");
                break;
            }
        }
    }
}