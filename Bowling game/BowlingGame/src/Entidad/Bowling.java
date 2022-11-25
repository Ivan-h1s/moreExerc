package Entidad;

import java.util.HashMap;

public class Bowling {
    
    HashMap <String, Integer> players;

    public Bowling() {
        players = new HashMap<>();
    }
    
    public void addPlayers(String name, int p) {
        players.put(name, p);
    }
    
    public void getWinner() {
        String winner = "";
        
        String [] nameArr = new String[players.size()];
        nameArr = players.keySet().toArray(nameArr);
        
        int max = 0;
        for (String x : nameArr) {
            if(players.get(x) > max) {
                winner = x;
                max = players.get(x);
            }
        }
        System.out.println("El ganador es "+ winner);
    }
}