package edu.training.les16_java_trains.main;

import java.util.ArrayList;
import edu.training.les16_java_trains.entity.Station;
import edu.training.les16_java_trains.entity.Train;
import edu.training.les16_java_trains.menu.MenuManager;

public class Main {

	public static void main(String[] args) {
	    ArrayList<Train> trains = new ArrayList<>();
	    initTrains(trains);

	    Station station = new Station(trains);
	    
	    MenuManager menuManager = new MenuManager(station);
	    menuManager.runMenu();
	}


	public static void initTrains(ArrayList<Train> trains) {
		trains.add(new Train("Москва", 123, "08:00"));
		trains.add(new Train("Санкт-Петербург", 456, "10:00"));
		trains.add(new Train("Сочи", 789, "12:00"));
		trains.add(new Train("Калининград", 234, "14:00"));
		trains.add(new Train("Новосибирск", 567, "16:00"));
	}

}