package org.academiadecodigo.altcatras.service;

import org.academiadecodigo.altcatras.Fears;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class FearsService {

    private List<Fears> fearsList = new LinkedList<>();

    FearsService (){
        Fears dark = new Fears("Dark", 1);
        Fears bugs = new Fears("Bugs", 2);
        Fears doctors = new Fears("Doctors", 3);
        Fears alone = new Fears("Alone", 4);
        Fears monsters = new Fears("Monsters", 5);

        fearsList.add(dark);
        fearsList.add(bugs);
        fearsList.add(doctors);
        fearsList.add(alone);
        fearsList.add(monsters);
    }

    public List<Fears> getFearsList() {
        return this.fearsList;
    }


}
