/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.DB.sql;

import Logic.Objekte;

/**
 *
 * @author Alex
 */
public class NewUser {
    
    public NewUser(){
        
    }
    
    public void newUser(String name,String pw,String email){
        String query="";
        query+="INSERT INTO user (name,pw,email) VALUES (";
        query+="'"+name+"',";
        query+="'"+pw+"',";
        query+="'"+email+"');";
        System.out.println(query);
        int result = Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
}
