package com.kgfsl.eventapp;
import java.util.Set;
import javax.persistence.*;

//import antlr.collections.List;

@Entity
public class Agenda2 {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long aId;

    
	@ManyToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name = "eventId", updatable = false, insertable = true)
    @JoinTable(
        name = "EVENT_AGENDA",
        joinColumns = @JoinColumn(name = "EVENTID"),
        inverseJoinColumns = @JoinColumn(name = "AGENDAID")
)
	private Set<Event> event;
	

    public Agenda2() {
        super();
	}
    public Long getaId() {
		return aId;
	}

	public void setaId(Long agendaId) {
		this.aId = agendaId;
	}

	public Set<Event> setEvent() {
		return event;}
    }
        

      
//  	@JoinColumn(name = "agendaId", updatable = false, insertable = true)
//  private Agenda agenda;

//  public void setAgenda(Agenda agenda) {
//    this.agenda = agenda;}

    
	
		
