package mx.com.tsam.model.tables;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clase que mapea la tabla "catalogocontenidos"
 * 
 * "catalogocontenidos" table class map
 * 
 * @author Alembert
 *
 */
@Entity
@Table(name = "catalogocontenidos")
public class CatalogoContenidos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Llave primaria (Primary Key = PK)
	 */
	@Id
	@Column(name = "id_catalogo_contenido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_catalogo_contenido;
	
	/**
	 * Asociación con la tabla Catalogos
	 * Llave foranea (Forein Key = FK)
	 */
	@ManyToOne
	@JoinColumn(name = "id_catalogo")
	private Catalogos id_catalogo;
	
	@Column(name = "nombre_objeto")
	private String nombre_objeto;
	
	@Column(name = "descripcion_objeto")
	private String descripcion_objeto;
	
	@Column(name = "registro_creado")
	private Date registro_creado;
	
	@Column(name = "registro_modificado")
	private Date registro_modificado;
	
	@Column(name = "registro_habilitado")
	private boolean registro_habilitado;
	
	/**
	 * Asociación con la tabla Usuarios
	 */
	@OneToOne(mappedBy = "catalogocontenidos", cascade = CascadeType.ALL)
	private Usuarios usuario;
	
	/**
	 * Constructor default
	 */
	public CatalogoContenidos() {
	}

	/**
	 * Constructor para ingresar un nuevo registro
	 * 
	 * Constructor to add new register row
	 * 
	 * @param nombre_objeto
	 * @param descripcion_objeto
	 * @param registro_creado
	 * @param registro_modificado
	 * @param registro_habilitado
	 */
	public CatalogoContenidos(String nombre_objeto, String descripcion_objeto,
			Date registro_creado, Date registro_modificado, boolean registro_habilitado) {
		this.nombre_objeto = nombre_objeto;
		this.descripcion_objeto = descripcion_objeto;
		this.registro_creado = registro_creado;
		this.registro_modificado = registro_modificado;
		this.registro_habilitado = registro_habilitado;
	}
	
	/**
	 * Constructor para ingresar un nuevo registro con llave primaria
	 * 
	 * Constructor to add new register row with primary key
	 * 
	 * @param id_catalogo_contenido
	 * @param nombre_objeto
	 * @param descripcion_objeto
	 * @param registro_creado
	 * @param registro_modificado
	 * @param registro_habilitado
	 */
	public CatalogoContenidos(int id_catalogo_contenido, String nombre_objeto, String descripcion_objeto,
			Date registro_creado, Date registro_modificado, boolean registro_habilitado) {
		this.id_catalogo_contenido = id_catalogo_contenido;
		this.nombre_objeto = nombre_objeto;
		this.descripcion_objeto = descripcion_objeto;
		this.registro_creado = registro_creado;
		this.registro_modificado = registro_modificado;
		this.registro_habilitado = registro_habilitado;
	}

	/**
	 * @return the id_catalogo_contenido
	 */
	public int getId_catalogo_contenido() {
		return id_catalogo_contenido;
	}

	/**
	 * @param id_catalogo_contenido the id_catalogo_contenido to set
	 */
	public void setId_catalogo_contenido(int id_catalogo_contenido) {
		this.id_catalogo_contenido = id_catalogo_contenido;
	}

	/**
	 * @return the id_catalogo
	 */
	public Catalogos getId_catalogo() {
		return id_catalogo;
	}

	/**
	 * @param id_catalogo the id_catalogo to set
	 */
	public void setId_catalogo(Catalogos id_catalogo) {
		this.id_catalogo = id_catalogo;
	}
	
	/**
	 * @return the nombre_objeto
	 */
	public String getNombre_objeto() {
		return nombre_objeto;
	}

	/**
	 * @param nombre_objeto the nombre_objeto to set
	 */
	public void setNombre_objeto(String nombre_objeto) {
		this.nombre_objeto = nombre_objeto;
	}

	/**
	 * @return the descripcion_objeto
	 */
	public String getDescripcion_objeto() {
		return descripcion_objeto;
	}

	/**
	 * @param descripcion_objeto the descripcion_objeto to set
	 */
	public void setDescripcion_objeto(String descripcion_objeto) {
		this.descripcion_objeto = descripcion_objeto;
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
