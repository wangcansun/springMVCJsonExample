package com.drmswt.example.model;

import java.util.UUID;

/**
 * Created by wangcan2 on 2016/5/12.
 */
public class ExampleModel
{
    private int id;

    private UUID uuid;

    private String name;

    private String value;

    public int getId()
    {
        return id;
    }

    public ExampleModel setId(int id)
    {
        this.id = id;
        return this;
    }

    public UUID getUuid()
    {
        return uuid;
    }

    public ExampleModel setUuid(UUID uuid)
    {
        this.uuid = uuid;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public ExampleModel setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getValue()
    {
        return value;
    }

    public ExampleModel setValue(String value)
    {
        this.value = value;
        return this;
    }
}
