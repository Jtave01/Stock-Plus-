package br.com.stockplus.run;

import br.com.stockplus.connection.ConnectionUtil;
import br.com.stockplus.graphicalInterface.WinLogin;

import java.awt.*;
import java.sql.SQLException;

public class Run {
    public static void main(String[] args) {

        try (var connection = ConnectionUtil.getConnection()){
            System.out.println("Conectado ao banco");
        }catch (SQLException e){
            e.printStackTrace();
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WinLogin frame = new WinLogin() ;
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }

}
