package codes.recursive.cnms.user.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "guid")
    @Column(name = "id", unique = true, nullable = false)
    private String id;

    @Column(name = "first_name")
    @NotNull
    @Size(max=50)
    private String firstName;

    @Column(name = "last_name")
    @NotNull
    @Size(max=50)
    private String lastName;

    @Column(name = "username")
    @NotNull
    @Size(max=50)
    private String username;

    @Column(name = "password")
    @NotNull
    @Size(max=50)
    private String password;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @Column(name = "created_on")
    private Date createdOn = new Date();

    public User() {

    }

    public User(String id, String firstName, String lastName, String username, String password) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setUsername(username);
        this.setPassword(password);
        this.setCreatedOn(createdOn);
    }

    public User(String firstName, String lastName, String username, String password) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setUsername(username);
        this.setPassword(password);
        this.setCreatedOn(createdOn);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() { return password;}

    public void setPassword(String password) { this.password = password; }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}