package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "notebook")
public class Notebook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="notebook")
    private List<Note> notes;

    @ManyToOne
    private User user;

    public Notebook() {
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

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", notes=" + notes +
                '}';
    }
}
