package org.academiadecodigo.altcatras.service;

import org.academiadecodigo.altcatras.models.Story;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class StoriesService {

    private String serverUrl = "http://127.0.0.1:8080/legendary/";
    private List<Story> storiesList = new LinkedList<>();

    StoriesService() {
        Story darkStories = new Story("AuthorD", "Ramdom/pathD", "dark");
        Story bugsStories = new Story("AuthorB", "Ramdom/pathB", "bugs");
        Story doctorStories = new Story("AuthorDoc", serverUrl + "resources/Doctor-Maisy.pdf", "doctors");
        Story aloneStories = new Story("AuthorAl", "resources/", "alone");
        Story monsterStories = new Story("AuthorMos", "Ramdom/pathMos", "monsters");

        storiesList.add(darkStories);
        storiesList.add(bugsStories);
        storiesList.add(doctorStories);
        storiesList.add(aloneStories);
        storiesList.add(monsterStories);
    }

    public Story getStory(String fearType) {
        for (Story story : storiesList) {
            if (story.getFearType().equals(fearType)) {
                return story;
            }
        }
        return null;
    }
    public void addStory(Story story){
        storiesList.add(story);
    }
}