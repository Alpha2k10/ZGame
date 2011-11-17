/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Data;

/**
 *
 * @author Alex
 */
public class MapNumber {
    private int nr;
    private int id;
    private String name;

    public MapNumber(int id, int nr, String name){
        this.nr = nr;
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
    
    
    
}
