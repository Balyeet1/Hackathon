package org.academiadecodigo.altcatras.service;

import org.academiadecodigo.altcatras.models.Fear;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class FearsService {

    private Map<Integer, Fear> fearsList = new HashMap();

    FearsService (){
        Fear dark = new Fear("Dark");
        Fear bugs = new Fear("Bugs");
        Fear doctors = new Fear("Doctors");
        Fear alone = new Fear("Alone");
        Fear monsters = new Fear("Monsters");

        fearsList.put(1, dark);
        fearsList.put(2, bugs);
        fearsList.put(3, doctors);
        fearsList.put(4, alone);
        fearsList.put(5, monsters);
    }

    public Map<Integer, Fear> getFears() {
        return this.fearsList;
    }
}
