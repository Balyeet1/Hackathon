package org.academiadecodigo.altcatras.Controllers;

import org.academiadecodigo.altcatras.models.Fear;
import org.academiadecodigo.altcatras.service.FearsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/fear")
public class FearsController {

    private FearsService fearsService;

    @Autowired
    public void setFearsService(FearsService fearsService) {
        this.fearsService = fearsService;
    }



    @RequestMapping(method = RequestMethod.GET, value = {"/", ""})
    public ResponseEntity<Map<Integer, Fear>> listFears() {
        return new ResponseEntity<>(fearsService.getFears(), HttpStatus.OK);
    }
}