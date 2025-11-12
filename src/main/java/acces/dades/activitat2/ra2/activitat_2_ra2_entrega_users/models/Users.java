package acces.dades.activitat2.ra2.activitat_2_ra2_entrega_users.models;


import java.sql.Timestamp;

public class Users {

    
    private Long id;
    private String name;
    private String description;
    private String email;
    private String password;
    private Timestamp ultimAcces;
    private Timestamp dataCreated;
    private Timestamp dataUpdated;


    public Users(){
        
    }

    public Users(Long id, String name, String description, String email, String password, Timestamp ultimAcces,
            Timestamp dataCreated, Timestamp dataUpdated) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.email = email;
        this.password = password;
        this.ultimAcces = ultimAcces;
        this.dataCreated = dataCreated;
        this.dataUpdated = dataUpdated;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return name;
    }
    public void setNom(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescripcion(String description) {
        this.description = description;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Timestamp getUltimAcces() {
        return ultimAcces;
    }
    public void setUltimAcces(Timestamp ultimAcces) {  
        this.ultimAcces = ultimAcces;
    }
    public Timestamp getDataCreated() {
        return dataCreated;
    }
    public void setDataCreated(Timestamp dataCreated) {
        this.dataCreated = dataCreated;
    }
    public Timestamp getDataUpdated() {
        return dataUpdated;
    }
    public void setDataUpdated(Timestamp dataUpdated) {
        this.dataUpdated = dataUpdated;
    }       
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", description=" + description + ", email=" + email
                + ", password=" + password + ", ultimAcces=" + ultimAcces + ", dataCreated=" + dataCreated
                + ", dataUpdated=" + dataUpdated + "]";
    }

}
