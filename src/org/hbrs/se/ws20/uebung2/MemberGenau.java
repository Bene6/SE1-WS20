package org.hbrs.se.ws20.uebung2;
/**
 * @author bkuelh2s
 */

public class MemberGenau implements Member {
    private Integer id = null;

    public MemberGenau(){
        this.id = id;
    }

    @Override
    public Integer getID() {
        return this.id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Member (id=" + id + ")";
    }
}
