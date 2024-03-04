package project.springproject.reto5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    public Cliente(String nombre, Long total, String estado){
        this.nombre = nombre;
        this.estado = estado;
        this.total = total;
    }

    public Cliente(){

    }

    @Id
    @Column(name = "id")
    private Long id = null;
    @Column(name = "nombre")
    private String nombre = null;
    @Column(name = "total")
    private Long total = 0L;
    @Column(name = "estado")
    private String estado = "activo";
}
