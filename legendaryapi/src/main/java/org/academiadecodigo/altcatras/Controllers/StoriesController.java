package org.academiadecodigo.altcatras.Controllers;

import org.academiadecodigo.altcatras.models.Story;
import org.academiadecodigo.altcatras.service.StoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/story")
public class StoriesController {

    private StoriesService storiesService;

    @Autowired
    public void setStoriesService(StoriesService storiesService) {
        this.storiesService = storiesService;
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/{fearType}"})
    public ResponseEntity<Story> getStory(@PathVariable String fearType) {
        Story story = storiesService.getStory(fearType);

        if (story == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(story, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/", ""})
    public ResponseEntity<?> addStory(@Valid @RequestBody Story story, BindingResult bindingResult, UriComponentsBuilder uriComponentsBuilder) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.storiesService.addStory(story);

        // get help from the framework building the path for the newly created resource
        UriComponents uriComponents = uriComponentsBuilder.path("/api/story").build();

        // set headers with the created path
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());


        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}