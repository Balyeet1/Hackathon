package org.academiadecodigo.altcatras;

import org.academiadecodigo.altcatras.service.FearsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import java.util.Map;


@RestController
@RequestMapping("/api/fear")
public class FearsController {

    private FearsService fearsService;

    @Autowired
    public void setFearsService(FearsService fearsService) {
        this.fearsService = fearsService;
    }

    /**
     * Retrieves the API name and version
     *
     * @return the response
     */



    @RequestMapping(method = RequestMethod.GET, value = {"/", ""})
    public ResponseEntity<Map<Integer, Fears>> listFears() {
        return new ResponseEntity<>(fearsService.getFearsList(), HttpStatus.OK);
    }
}