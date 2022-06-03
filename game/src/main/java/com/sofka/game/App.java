package com.sofka.game;

import com.sofka.game.utilities.dao.PlayerDAO;
import com.sofka.game.utilities.pojo.Player;


public class App {

    public static void main(String[] args) {

        Player player1 = new Player();
       // player1.setNamePlayer(JOptionPane.showInputDialog(null,"Ingrese el nombre:"));
        //player1.setNamePlayer("Luis");
        PlayerDAO funcionees = new PlayerDAO();
       // funcionees.addPlayer(player1);
    funcionees.listQuestion();



    }
}
