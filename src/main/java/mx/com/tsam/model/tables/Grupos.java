package mx.com.tsam.model.tables;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clase que mapea la tabla grupo
 * 
 * "grupo" table class map
 * 
 * @author Alembert
 *
 */
@Entity
@Table(name = "grupos")
public class Grupos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Llave primaria (Primary Key = PK)
	 */
	@Id
	@Column(name = "id_grupo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_grupo;
	
	@Column(name = "nombre_grupo")
	private String nombre_grupo;
	
	@Column(name = "descripcion_grupo")
    private String descripcion_grupo;
    
	@Column(name = "registro_creado")
	private Date registro_creado;
	
	@Column(name = "registro_modificado")
    private Date registro_modificado;
	
	@Column(name = "registro_habilitado")
    private boolean registro_habilitado;
	
	/**
	 * Asociación con la tabla Usuarios 
	 */
	@OneToOne(mappedBy = "grupos", cascade = CascadeType.ALL)
	private Usuarios usuario;

	/**
	 * Constructor default
	 */
	public Grupos() {
	}
	
	/**
	 * Constructor para ingresar un nuevo registro
	 * 
	 * Constructor to add new register row
	 * 
	 * @param nombre_grupo
	 * @param descripcion_grupo
	 * @param registro_creado
	 * @param registro_modificado
	 * @param registro_habilitado
	 */
	public Grupos(String nombre_grupo, String descripcion_grupo, Date registro_creado, Date registro_modificado, boolean registro_habilitado) {
        this.nombre_grupo = nombre_grupo;
        this.descripcion_grupo = descripcion_grupo;
        this.registro_creado = registro_creado;
        this.registro_modificado = registro_modificado;
        this.registro_habilitado = registro_habilitado;
    }
	
	/**
	 * Constructor para ingresar un nuevo registro con llave primaria
	 * 
	 * Constructor to add new register row with primary key
	 * 
	 * @param nombre_grupo
	 * @param descripcion_grupo
	 * @param registro_creado
	 * @param registro_modificado
	 * @param registro_habilitado
	 */
	public Grupos(int id_grupo, String nombre_grupo, String descripcion_grupo, Date registro_creado, Date registro_modificado, boolean registro_habilitado) {
        this.id_grupo = id_grupo;
		this.nombre_grupo = nombre_grupo;
        this.descripcion_grupo = descripcion_grupo;
        this.registro_creado = registro_creado;
        this.registro_modificado = registro_modificado;
        this.registro_habilitado = registro_habilitado;
    }

	/**
	 * @return the id_grupo
	 */
	public int getId_grupo() {
		return id_grupo;
	}

	/**
	 * @param id_grupo the id_grupo to set
	 */
	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
	}

	/**
	 * @return the nombre_grupo
	 */
	public String getNombre_grupo() {
		return nombre_grupo;
	}

	/**
	 * @param nombre_grupo the nombre_grupo to set
	 */
	public void setNombre_grupo(String nombre_grupo) {
		this.nombre_grupo = nombre_grupo;
	}

	/**
	 * @return the descripcion_grupo
	 */
	public String getDescripcion_grupo() {
		return descripcion_grupo;
	}

	/**
	 * @param descripcion_grupo the descripcion_grupo to set
	 */
	public void setDescripcion_grupo(String descripcion_grupo) {
		this.descripcion_grupo = descripcion_grupo;
	}

	/**
	 * @return the registro_creado
	 */
	public Date getRegistro_creado() {
		return registro_creado;
	}

	/**
	 * @param registro_creado the registro_creado to set
	 */
	public void setRegistro_creado(Date registro_creado) {
		this.registro_creado = registro_creado;
	}

	/**
	 * @return the registro_modificado
	 */
	public Date getRegistro_modificado() {
		return registro_modificado;
	}

	/**
	 * @param registro_modificado the registro_modificado to set
	 */
	public void setRegistro_modificado(Date registro_modificado) {
		this.registro_modificado = registro_modificado;
	}

	/**
	 * @return the registro_habilitado
	 */
	public boolean isRegistro_habilitado() {
		return registro_habilitado;
	}

	/**
	 * @param registro_habilitado the registro_habilitado to set
	 */
	public void setRegistro_habilitado(boolean registro_habilitado) {
		this.registro_habilitado = registro_habilitado;
	}
	
	/**
	 * @return the usuario
	 */
	public Usuarios getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

}
