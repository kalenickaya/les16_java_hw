package edu.training.les16_java_trains.entity;

import java.util.List;

public class Station {

	private List<Train> trains;

	public Station(List<Train> trains) {
		this.trains = trains;
	}

	public void printInfoByTrainNumber(int trainNumberToFind) {
		Train foundTrain = findTrainByNumber(trainNumberToFind);
		printTrainInfo(foundTrain);
	}

	public void printTrainInfo(Train train) {
		if (train != null) {
			StringBuilder report = new StringBuilder();
			report.append("-----------------------------\n")
			.append("Номер поезда: ")
			.append(train.getTrainNumber())
			.append("\n")
			.append("Пункт назначения: ")
			.append(train.getDestination())
			.append("\n")
			.append("Время отправления: ")
			.append(train.getDepartureTime())
			.append("\n")
			.append("-----------------------------");
			System.out.println(report);
		} else {
			System.out.println("Поезд не найден.");
		}
	}

	public Train findTrainByNumber(int trainNumberToFind) {
		for (Train train : trains) {
			if (trainNumberToFind == train.getTrainNumber()) {
				return train;
			}
		}
		return null;
	}

	public void sortByTrainNumber() {
	    for (int i = 0; i < trains.size() - 1; i++) {
	        for (int j = 0; j < trains.size() - i - 1; j++) {
	            if (trains.get(j).getTrainNumber() > trains.get(j + 1).getTrainNumber()) {
	                Train temp = trains.get(j);
	                trains.set(j, trains.get(j + 1));
	                trains.set(j + 1, temp);
	            }
	        }
	    }
	}

	public void sortByDestinationAndDepartureTime() {
	    for (int i = 1; i < trains.size(); i++) {
	        Train key = trains.get(i);
	        int j = i - 1;

	        while (j >= 0 && (trains.get(j).getDestination().compareTo(key.getDestination()) > 0 ||
	                (trains.get(j).getDestination().equals(key.getDestination()) &&
	                        trains.get(j).getDepartureTime().compareTo(key.getDepartureTime()) > 0))) {
	            trains.set(j + 1, trains.get(j));
	            j = j - 1;
	        }
	        trains.set(j + 1, key);
	    }
	}

	public void printInfoForAllTrains() {
		StringBuilder report = new StringBuilder();
		report.append("-----------------------------");
		for (Train train : trains) {
			report.append("\n")
			.append("Номер поезда: ")
			.append(train.getTrainNumber())
			.append("\n")
			.append("Пункт назначения: ")
			.append(train.getDestination())
			.append("\n")
			.append("Время отправления: ")
			.append(train.getDepartureTime())
			.append("\n")
			.append("-----------------------------");		
		}
		System.out.println(report);
	}

}