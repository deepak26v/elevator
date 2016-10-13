package com.elevator.base;

public class ElevatorController {

    public ElevatorRequest elevatorRequest;

    public Integer readNextRequst() {
        return elevatorRequest.getNextRequestedFloor();
    }
}
