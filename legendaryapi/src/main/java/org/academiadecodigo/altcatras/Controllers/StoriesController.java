package org.academiadecodigo.altcatras.Controllers;

import org.academiadecodigo.altcatras.models.Story;
import org.academiadecodigo.altcatras.service.StoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
}