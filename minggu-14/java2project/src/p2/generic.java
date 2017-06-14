/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author Arighi
 */
public class generic<vertebrata> {
    vertebrata desc;
    
    public generic(vertebrata desc) {
        this.desc = desc;
    }

    generic() {
        }

    public vertebrata getDesc() {
        return desc;
    }

    public void setDesc(vertebrata desc) {
        this.desc = desc;
    }
    
}
