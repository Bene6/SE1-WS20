package org.hbrs.se.ws20.uebung3.control;
/**
 * @author bkuelh2s
 */
import org.hbrs.se.ws20.uebung2.ContainerException;
import org.hbrs.se.ws20.uebung2.Member;
import org.hbrs.se.ws20.uebung3.persistance.PersistenceException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container {

    //CR1 Zugriff nur noch innerhalb der Klasse
    private Container(){
    }
    //Singleton Pattern
    private static Container instanz = null;
    public static Container getInstance(){
        if(instanz == null){
            instanz = new Container();
        }
        return instanz;
    }

    //Funktionale Anforderung 1
    private List <Member> liste = new ArrayList<Member>();

    //CR2
    public void store() throws PersistenceException {

    }

    public void load() throws PersistenceException {

    }



    public void addMember(Member member) throws ContainerException {
    Integer id = member.getID();
        for(Member mem : liste) {
            if(mem.getID() == id) {
                ContainerException e = new ContainerException();
                throw e;
            }
        }
    }
    //Funktionale Anforderung 2
    public String deleteMember(Integer id) {
        Member m = null;
    for(Member mem : liste) {
        if (mem.getID() == id){
            m = mem;
        }
    }
    if(m == null) {
        return "Member konnte nicht gelöscht werden";
    }
    else {
        return " Der Member mit der ID: " + id + " konnte gelöscht werden";
    }
    }

    // Funktionale Anforderung 3
    public void dump() {
        Iterator<Member> i = liste.iterator();
            while(i.hasNext()) {
                Member m = i.next();
                System.out.println("Member (id=" + m.getID() + ")");
            }
    }
    //Funktionale Anforderung 4
    public int size(){
        return liste.size();
    }

}
