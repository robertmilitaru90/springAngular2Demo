package com.endava.web.controller;

import com.endava.model.MyModel;
import com.endava.services.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rmilitaru on 7/5/2016.
 */
@RestController
@CrossOrigin()
public class MyController {

    @Autowired
    private ModelRepository repository;

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public @ResponseBody List<MyModel> getDummy(){

        List<MyModel> myModels= (List<MyModel>) repository.findAll();


        return myModels;
    }

}
