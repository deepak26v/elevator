package com.elevator.base;

public class ElevatorButton extends Button {

    public void placeRequest(int requestedFromFloor) {
        elevatorRequest.addRequest(requestedFromFloor);
    }

}
