package com.elevator.base;

import java.util.List;
import java.util.Random;

public class ElevatorRequest {

    private List<Integer> floorRequestList;

    public void addRequest(int requestedFromFloor) {
        if(!floorRequestList.contains(requestedFromFloor)) {
            floorRequestList.add(requestedFromFloor);
        }
    }

    public Integer getNextRequestedFloor() {
        return floorRequestList.get((new Random()).nextInt(floorRequestList.size()));
    }
}
