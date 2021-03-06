package ca.mcgill.ecse321.eventregistration.dao;

import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@ToString
public class RegistrationManager {
    private Set<Person> persons;

    @OneToMany(cascade = {CascadeType.ALL})
    public Set<Person> getPersons() {
        return this.persons;
    }

    public void setPersons(Set<Person> personss) {
        this.persons = personss;
    }

    private Set<Registration> registrations;

    @OneToMany(cascade = {CascadeType.ALL})
    public Set<Registration> getRegistrations() {
        return this.registrations;
    }

    public void setRegistrations(Set<Registration> registrationss) {
        this.registrations = registrationss;
    }

    private Set<Event> events;

    @OneToMany(cascade = {CascadeType.ALL})
    public Set<Event> getEvents() {
        return this.events;
    }

    public void setEvents(Set<Event> eventss) {
        this.events = eventss;
    }

    private int id;

    public void setId(int value) {
        this.id = value;
    }

    @Id
    public int getId() {
        return this.id;
    }
}