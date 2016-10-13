package com.elevator.base;

public class FloorButton extends Button {

    public void placeRequest(int requestedFromFloor) {
        elevatorRequest.addRequest(requestedFromFloor);
    }
}
