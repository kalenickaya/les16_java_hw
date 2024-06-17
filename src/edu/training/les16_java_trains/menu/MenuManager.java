package edu.training.les16_java_trains.menu;

import java.util.Scanner;

import edu.training.les16_java_trains.entity.Station;

public class MenuManager {
    private Station station;

    public MenuManager(Station station) {
        this.station = station;
    }

    public void runMenu() {
        Scanner sc = new Scanner(System.in);
        int action = 0;

        while (action != 5) {
            System.out.println(buildMenu());
            System.out.print("> ");

            if (sc.hasNextInt()) {
                action = sc.nextInt();

                switch (action) {
                    case 1:
                        station.printInfoForAllTrains();
                        System.out.println();
                        break;
                    case 2:
                        boolean validInput = false;
                        while (!validInput) {
                            System.out.print("Введите номер поезда для вывода информации о нем:\n> ");
                            if (sc.hasNextInt()) {
                                int trainNumberToFind = sc.nextInt();
                                station.printInfoByTrainNumber(trainNumberToFind);
                                System.out.println();
                                validInput = true;
                            } else {
                                System.out.println("Ошибка ввода. Пожалуйста, введите целое число.\n");
                                sc.next();
                            }
                        }
                        break;
                    case 3:
                        station.sortByTrainNumber();
                        System.out.println("Список поездов отсортирован по номерам.\n");
                        break;
                    case 4:
                        station.sortByDestinationAndDepartureTime();
                        System.out.println("Список поездов отсортирован по месту назначения и времени отправления.\n");
                        break;
                    case 5:
                        System.out.println("Хорошего дня! :)");
                        break;
                    default:
                        System.out.println("Неверный ввод. Пожалуйста, выберите действие от 1 до 5.\n");
                }

            } else {
                System.out.println("Ошибка ввода.\n");
                sc.next();
            }
        }
        sc.close();
    }

    private StringBuilder buildMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Введите:\n")
        .append("1 - чтобы вывести информацию о всех поездах.\n")
        .append("2 - чтобы вывести информацию о поезде по его номеру.\n")
        .append("3 - чтобы отсортировать поезда по их номерам.\n")
        .append("4 - чтобы отсортировать поезда по пункту назначения и времени отправления.\n")
        .append("5 - чтобы завершить выполнение программы.\n");
        return menu;
    }
    
}
