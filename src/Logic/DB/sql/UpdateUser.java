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
public class UpdateUser {
    
    public UpdateUser(){
        
    }
    
    public void updateUser(int id,String name,String pw,String email){
        String query="";
        query+="UPDATE user SET name='"+name+"',";
        query+="pw='"+pw+"',";
        query+="email='"+email+"' ";
        query+="WHERE id="+id+";";
        System.out.println(query);
        int result = Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
    
    public void updateName(int id,String name){
        String query="";
        query+="UPDATE user SET name='"+name+"'";
        query+="WHERE id="+id+";";
        System.out.println(query);
        int result = Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
    
    public void updatePw(int id, String pw){
        String query="";
        query+="UPDATE user SET pw='"+pw+"'";
        query+="WHERE id="+id+";";
        System.out.println(query);
        int result = Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    } 
    
    public void updateEmail(int id, String email){
        String query="";
        query+="UPDATE user SET email='"+email+"' ";
        query+="WHERE id="+id+";";
        System.out.println(query);
        int result = Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    } 
}
