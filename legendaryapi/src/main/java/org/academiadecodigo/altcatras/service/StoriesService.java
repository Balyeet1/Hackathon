package org.academiadecodigo.altcatras.service;

import org.academiadecodigo.altcatras.models.Story;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class StoriesService {

    private String serverUrl = "http://192.168.1.118:8080/legendary/";
    private List<Story> storiesList = new LinkedList<>();

    StoriesService() {
        Story darkStories = new Story("AuthorD", serverUrl + "resources/under-my-bed.pdf", "dark");
        Story bugsStories = new Story("AuthorB", serverUrl + "resources/Do-you-wonder-why-bugs-are-good.pdf", "bugs");
        Story doctorStories = new Story("AuthorDoc", serverUrl + "resources/Doctor-Maisy.pdf", "doctors");
        Story aloneStories = new Story("AuthorAl", serverUrl + "resources/invisible_boy.pdf", "alone");
        Story monsterStories = new Story("AuthorMos", serverUrl + "resources/Go-Away-Big-Green-Monster.pdf", "monsters");

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
}