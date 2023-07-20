package com.stackroute.oops;

/*
Class is having 3 fields name, modelName and type.
Type varies for different vehicles.
eg. Car is of type sedan, sports...
Bike is of type cruiser, sports...
 */
public abstract class AbstractManufacturer {

    public String name;
    public String modelName;

    public String type;

    public void setName(String name)
    {
        this.name=name;
    }

    public void setModelName(String modelName)
    {
        this.modelName=modelName;
    }

    public void setType(String type)
    {
        this.type=type;
    }
    public String getModelName()
    {
        return this.modelName;
    }

    public String getType()
    {
        return this.type;
    }

    public String getName()
    {
        return this.name;
    }

    public abstract String getManufacturerInformation();
}
