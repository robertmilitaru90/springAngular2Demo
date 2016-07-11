package com.endava.services;

import com.endava.model.MyModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rmilitaru on 7/6/2016.
 */
public interface ModelRepository  extends CrudRepository<MyModel, Long> {

}
