package bowlinggame;

import java.util.Scanner; 
import Entidad.Bowling;

public class Program {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);
        
        do {           
            for(int i = 0; i < 3; i++) {
            System.out.println("Ingrese un nombre y sus puntos");
            
            String input = sc.nextLine();
            String [] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayers(name, points);
        }
            game.getWinner();            
        } while (true);        
    }
}