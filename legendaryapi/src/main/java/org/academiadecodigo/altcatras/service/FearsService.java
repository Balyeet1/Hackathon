package org.academiadecodigo.altcatras.service;

import org.academiadecodigo.altcatras.models.Fear;
import org.springframework.stereotype.Service;

import java.util.HashMap;

import java.util.Map;

@Service
public class FearsService {

    private Map<Integer, Fear> fearsList = new HashMap();

    FearsService (){
        Fear dark = new Fear("dark");
        Fear bugs = new Fear("bugs");
        Fear doctors = new Fear("doctors");
        Fear alone = new Fear("alone");
        Fear monsters = new Fear("monsters");

        fearsList.put(1, dark);
        fearsList.put(2, bugs);
        fearsList.put(3, doctors);
        fearsList.put(4, alone);
        fearsList.put(5, monsters);
    }

    public int getLastIndexOf(){
        return this.fearsList.size();
    }

    public void addFear(Fear fear){
        this.fearsList.put(getLastIndexOf()+1, fear);
    }

    public Map<Integer, Fear> getFears() {
        return this.fearsList;
    }
}
