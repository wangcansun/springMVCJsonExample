package com.drmswt.example.service.impl;

import com.drmswt.example.model.ExampleModel;
import com.drmswt.example.service.IExampleService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by wangcan2 on 2016/5/12.
 */
@Service
public class ExampleService implements IExampleService
{
    public ExampleModel getExample()
    {
        return new ExampleModel().setId(123).setUuid(UUID.randomUUID()).setName("Wang").setValue("Can");
    }
}
