package com.elevator.base;

public class Elevator {

    public int currentFloor;

    public ElevatorController elevatorController;

    public void moveElevator() throws InterruptedException {
        Integer nextRequest = elevatorController.readNextRequst();
        if(nextRequest == currentFloor) {
            openDoor();
            Thread.sleep(10000);
            closeDoor();
        } else if(nextRequest > currentFloor) {
            moveDown();
        } else if(nextRequest < currentFloor) {
            moveUp();
        }
    }

    public void moveUp() {
        System.out.println("Moving Up !!");
    }

    public void moveDown() {
        System.out.println("Moving down !!");
    }

    public void openDoor() {
        System.out.println("Opening door");
    }

    public void closeDoor() {
        System.out.println("Closing door");
    }
}
