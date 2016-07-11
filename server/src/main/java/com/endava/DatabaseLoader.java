package com.endava;

import com.endava.model.MyModel;
import com.endava.services.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by rmilitaru on 7/6/2016.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ModelRepository repository;

    @Autowired
    public DatabaseLoader(ModelRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new MyModel("Message from database"));
        this.repository.save(new MyModel("Other message from database"));
    }
}