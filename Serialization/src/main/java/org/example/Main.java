package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        Batch batch=new Batch(101,"Java FSD","August Batch",
                LocalDate.of(2022,8,12),LocalDate.of(2023,12,30));
        Trainee trainee=new Trainee(1,"Anu Poly","Trivandrum",batch);

        Trainee a=null;
        try{
            TraineeIO traineeIO=new TraineeIO();
            traineeIO.serialize(trainee);
            a=traineeIO.Deserialization();
            System.out.println(a);
        }
        catch (Exception e)
        {
            throw new RuntimeException();
        }
    }
}
