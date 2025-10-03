package br.com.stockplus.graphicalInterface.controllClasse;

import br.com.stockplus.entity.UsuarioEntity;

public class SessionManneger {
    private static UsuarioEntity usuarioLogado;
    public static void login(UsuarioEntity user){
        usuarioLogado = user;
    }

    public static boolean isAdmin(){
        return usuarioLogado != null && usuarioLogado.getRole().getId() == 1;
    }
}
