package com.adamcardoso.cursomc.services;

import com.adamcardoso.cursomc.security.UserSS;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserService {

    // retorna um usuário que estiver logado no sistema
    public static UserSS authenticated(){
        try{
            return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            return null;
        }
    }
}
