package com.drmswt.example.web.controller;

import com.drmswt.example.service.IExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wangcan2 on 2016/5/11.
 */
@Controller
@RequestMapping("/")
public class ExampleController
{
    @Autowired
    private IExampleService exampleService;

    @RequestMapping(method = RequestMethod.GET)
    public void getExample(Model model)
    {
        model.addAttribute(exampleService.getExample());
    }
}
