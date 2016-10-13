package com.elevator.base;


public abstract class Button {

    protected ElevatorRequest elevatorRequest;

    public abstract void placeRequest(int requestedFromFloor);

}
