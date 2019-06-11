package hello;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table
public class User{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    public String name;

    @Column
    public Integer value;

    protected User(){}
    
    public User(String name, Integer value){
        this.name = name;
        this.value = value;
    }
}