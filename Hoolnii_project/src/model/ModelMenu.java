
package model;

import javax.swing.Icon;

public class ModelMenu {
    Icon icon;
    String menuName;
    
    public Icon geticon(){
        return icon;
    }
    public void seticon(Icon icon){
        this.icon = icon;
    }
     public String menuName(){
        return menuName;
    }
    public void setmenuName(String menuName){
        this.menuName = menuName;
    }
    public ModelMenu(Icon icon, String menuName){
        this.icon = icon;
        this.menuName = menuName;
    }
    public ModelMenu(){
        
    }
    
}
