package mx.com.tsam.model.tables;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase que mapea la tabla "catalogos"
 * 
 * "catalogos" table class map
 * 
 * @author Alembert
 *
 */
@Entity
@Table(name = "catalogos")
public class Catalogos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Llave primaria (Primary Key = PK)
	 */
	@Id
	@Column(name = "id_catalogos")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_catalogos;
	
	@Column(name = "nombre_catalogo")
    private String nombre_catalogo;
    
	@Column(name = "descripcion_catalogo")
	private String descripcion_catalogo;
	
	@Column(name = "registro_creado")
    private Date registro_creado;
	
	@Column(name = "registro_modificado")
    private Date registro_modificado;
	
	@Column(name = "registro_habilitado")
    private boolean registro_habilitado;

	/**
	 * Asociación con la tabla CatalogoContenidos 
	 */
	@OneToMany(mappedBy = "catalogos", cascade = CascadeType.ALL)
	private Set<CatalogoContenidos> catalogoContenido;
	
	/**
	 * Constructor default
	 */
	public Catalogos() {
	}

	/**
	 * Constructor para ingresar un nuevo registro
	 * 
	 * Constructor to add new register row
	 * 
	 * @param nombre_catalogo
	 * @param descripcion_catalogo
	 * @param registro_creado
	 * @param registro_modificado
	 * @param registro_habilitado
	 */
	public Catalogos(String nombre_catalogo, String descripcion_catalogo, Date registro_creado,
			Date registro_modificado, boolean registro_habilitado) {
		this.nombre_catalogo = nombre_catalogo;
		this.descripcion_catalogo = descripcion_catalogo;
		this.registro_creado = registro_creado;
		this.registro_modificado = registro_modificado;
		this.registro_habilitado = registro_habilitado;
	}
	
	/**
	 * Constructor para ingresar un nuevo registro con llave primaria
	 * 
	 * Constructor to add new register row with primary key
	 * 
	 * @param id_catalogos
	 * @param nombre_catalogo
	 * @param descripcion_catalogo
	 * @param registro_creado
	 * @param registro_modificado
	 * @param registro_habilitado
	 */
	public Catalogos(int id_catalogos, String nombre_catalogo, String descripcion_catalogo, Date registro_creado,
			Date registro_modificado, boolean registro_habilitado) {
		this.id_catalogos = id_catalogos;
		this.nombre_catalogo = nombre_catalogo;
		this.descripcion_catalogo = descripcion_catalogo;
		this.registro_creado = registro_creado;
		this.registro_modificado = registro_modificado;
		this.registro_habilitado = registro_habilitado;
	}

	/**
	 * @return the id_catalogos
	 */
	public int getId_catalogos() {
		return id_catalogos;
	}

	/**
	 * @param id_catalogos the id_catalogos to set
	 */
	public void setId_catalogos(int id_catalogos) {
		this.id_catalogos = id_catalogos;
	}

	/**
	 * @return the nombre_catalogo
	 */
	public String getNombre_catalogo() {
		return nombre_catalogo;
	}

	/**
	 * @param nombre_catalogo the nombre_catalogo to set
	 */
	public void setNombre_catalogo(String nombre_catalogo) {
		this.nombre_catalogo = nombre_catalogo;
	}

	/**
	 * @return the descripcion_catalogo
	 */
	public String getDescripcion_catalogo() {
		return descripcion_catalogo;
	}

	/**
	 * @param descripcion_catalogo the descripcion_catalogo to set
	 */
	public void setDescripcion_catalogo(String descripcion_catalogo) {
		this.descripcion_catalogo = descripcion_catalogo;
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
	 * Obtención de información con base en la asociación 1 : N - Uno a Mucho (One to Many)
	 * @return the catalogoContenido
	 */
	public Set<CatalogoContenidos> getCatalogoContenido() {
		return catalogoContenido;
	}

	/**
	 * @param catalogoContenido the catalogoContenido to set
	 */
	public void setCatalogoContenido(Set<CatalogoContenidos> catalogoContenido) {
		this.catalogoContenido = catalogoContenido;
	}
	
}
