package org.example;

import java.io.Serializable;

public class Trainee implements Serializable
{
    private static final long serialVersionID=10L;
    private  int traineeId;
    private String traineeName;
    private String traineeLocation;
    private Batch batch;

    public void Trainee(){}

    public int getTraineeId() {
        return traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public String getTraineeLocation() {
        return traineeLocation;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public void setTraineeLocation(String traineeLocation) {
        this.traineeLocation = traineeLocation;
    }

    public Trainee(int traineeId, String traineeName, String traineeLocation,Batch batch) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.traineeLocation = traineeLocation;
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "traineeId=" + traineeId +
                ", traineeName='" + traineeName + '\'' +
                ", traineeLocation='" + traineeLocation + '\'' +
                ", batch=" + batch +
                '}';
    }
}
