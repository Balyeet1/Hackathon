package org.academiadecodigo.altcatras.Controllers;

import org.academiadecodigo.altcatras.models.Fear;
import org.academiadecodigo.altcatras.service.FearsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
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
    @RequestMapping(method = RequestMethod.POST, value = {"/", ""})
    public ResponseEntity<?> addFear(@Valid @RequestBody Fear fear, BindingResult bindingResult, UriComponentsBuilder uriComponentsBuilder) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.fearsService.addFear(fear);

        // get help from the framework building the path for the newly created resource
        UriComponents uriComponents = uriComponentsBuilder.path("/api/fear").build();

        // set headers with the created path
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());


        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}