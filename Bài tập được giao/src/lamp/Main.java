package lamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lamp lamp = new Lamp(new Battery());
        lamp.getBattery().setEnergy(100);
        System.out.println("Current battery capacity: "+lamp.getBattery().getEnergy() );

        while (lamp.getBattery().getEnergy() > 0) {
            System.out.println("Choose");
            System.out.println("1.Turn on lamp");
            System.out.println("2.Turn off lamp");
            System.out.println("3.Test battery capacity");
            System.out.print("Your choose: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    if(!lamp.isOn()) {
                        lamp.setOn(true);
                        StopWatch.start();
                    }
                    break;
                case 2:

                    if (lamp.isOn()) {
                        StopWatch.stop();
                        int time = (int) (StopWatch.getElapsedTime() / 1000);
                        while (time != 0) {
                            lamp.useLamp();
                            time--;
                        }
                    }
                    lamp.setOn(false);
                    break;
                case 3:
                    if (lamp.isOn()) {
                        StopWatch.stop();
                        int time1 = (int) (StopWatch.getElapsedTime() / 1000);
                        while (time1 != 0) {
                            lamp.useLamp();
                            time1--;
                        }
                        StopWatch.start();
                    }
                    System.out.println("Energy of battery aslo: " + lamp.getBattery().getEnergy());
                    break;
            }
        }
    }
}
