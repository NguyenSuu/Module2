package blog.model;

import javax.persistence.*;

@Entity
@Table(name="blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    private String name;
    public Blog(){

    }
    public Blog(Long id,String text,String name){
        this.id=id;
        this.text=text;
        this.name=name;
    }
    @Override
    public String toString() {
        return String.format("blog[id=%d, text='%s', name='%s']", id, text, name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
