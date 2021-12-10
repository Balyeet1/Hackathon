package org.academiadecodigo.altcatras.service;

import org.academiadecodigo.altcatras.Fears;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class FearsService {

    private Map<Integer, Fears> fearsList = new HashMap<>();

    FearsService (){
        Fears dark = new Fears("Dark", 1);
        Fears bugs = new Fears("Bugs", 2);
        Fears doctors = new Fears("Doctors", 3);
        Fears alone = new Fears("Alone", 4);
        Fears monsters = new Fears("Monsters", 5);

        fearsList.put(1, dark);
        fearsList.put(2, bugs);
        fearsList.put(3, doctors);
        fearsList.put(4, alone);
        fearsList.put(5, monsters);
    }

    public Map<Integer, Fears> getFearsList() {
        return fearsList;
    }


}
