import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
//        System.out.println("nhấn 0 để bắt đầu đếm  ");
//        int startTime = scanner.nextInt();
//        System.out.println("nhập 1 để dừng lại ");
        stopWatch.startTime();
        for (int i = 0; i < 100000 ; i++){
            System.out.println(i);
        }
        stopWatch.stopTime();
        System.out.println(stopWatch.getElapsedTime());
//        int endTime = scanner.nextInt();
//        if(startTime == 0 ){
//            stopWatch.startTime();
//        }
//        if(endTime == 1){
//            stopWatch.stopTime();
//            stopWatch.getElapsedTime();
//            System.out.println("thời gian đếm là : " + stopWatch.getElapsedTime());
//        }

    }
}
