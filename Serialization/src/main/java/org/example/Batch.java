package org.example;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Batch implements Serializable
{
    private static final long serialVersionID=10L;
    private int batchId;
    private String batchName;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private void Batch(){}

    public void setBatchId(int batchId)
    {
        this.batchId = batchId;
    }

    public void setBatchName(String batchName){
        this.batchName=batchName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getBatchId() {
        return batchId;
    }

    public String getBatchName(){
        return batchName;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Batch(int batchId, String batchName,String description, LocalDate startDate, LocalDate endDate) {
        this.batchId = batchId;
        this.batchName=batchName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchId=" + batchId +
                ", batchName='" + batchName + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
