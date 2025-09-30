package br.com.stockplus.main;

import br.com.stockplus.connection.ConnectionUtil;
import br.com.stockplus.graphicalInterface.WinLogin;
import org.flywaydb.core.Flyway;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
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
