package com.capgemini.Springboot.api;

import com.capgemini.Springboot.Controller.SchipRepository;
import com.capgemini.Springboot.model.Schip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootEndpoint {
    @Autowired
    private SchipRepository mijnSchipRepository;

    @GetMapping("hallo")
    public Schip lopen() {
        System.out.println("go");
        Schip hetSchip = new Schip();
        hetSchip.naam = "Titanic";
        Schip vliegendeHollander = mijnSchipRepository.save(hetSchip);
        return vliegendeHollander;

    }


}
