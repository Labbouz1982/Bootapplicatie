package com.capgemini.Springboot.Controller;

import com.capgemini.Springboot.model.Schip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SchipRepository extends CrudRepository <Schip, Long> {




}
