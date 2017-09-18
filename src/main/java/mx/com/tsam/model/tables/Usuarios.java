package mx.com.tsam.model.tables;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clase que mapea la tabla "usuarios"
 * 
 * "usuario" table class map
 * 
 * @author Alembert
 *
 */
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Llave primaria (Primary Key = PK)
	 */
	@Id
	@Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "apellido_paterno")
	private String apellido_paterno;
	
	@Column(name = "apellido_materno")
	private String apellido_materno;
	
	@Column(name = "genero")
	private String genero;
	
	/**
	 * Asociación con la tabla CatalogosContenidos
	 * Llave foranea (Forein Key = FK)
	 */
	@OneToOne
	@JoinColumn(name = "id_catalogo_titulo")
	private CatalogoContenidos id_catalogo_titulo;
	
	/**
	 * Asociación con la tabla Grupos
	 * Llave foranea (Forein Key = FK)
	 */
	@OneToOne
	@JoinColumn(name = "id_grupo")
	private Grupos id_grupo;
	
	@Column(name = "telefono1")
	private String telefono1;
	
	@Column(name = "telefono2")
	private String telefono2;
	
	@Column(name = "correo1")
	private String correo2;
	
	@Column(name = "registro_creado")
	private Date registro_creado;
	
	@Column(name = "registro_modificado")
	private Date registro_modificado;
	
	@Column(name = "registro_habilitado")
	private boolean registro_habilitado;
	
	/**
	 * Constructor default
	 */
	public Usuarios() {
	}
	
	/**
	 * Constructor para ingresar un nuevo registro
	 * 
	 * Constructor to add new register row
	 * 
	 * @param nombres
	 * @param apellido_paterno
	 * @param apellido_materno
	 * @param genero
	 * @param telefono1
	 * @param telefono2
	 * @param correo2
	 * @param registro_creado
	 * @param registro_modificado
	 * @param registro_habilitado
	 */
	public Usuarios(String nombres, String apellido_paterno, String apellido_materno, String genero,
			String telefono1, String telefono2, String correo2, Date registro_creado, Date registro_modificado,
			boolean registro_habilitado) {
		this.nombres = nombres;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.genero = genero;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.correo2 = correo2;
		this.registro_creado = registro_creado;
		this.registro_modificado = registro_modificado;
		this.registro_habilitado = registro_habilitado;
	}

	/**
	 * Constructor para ingresar un nuevo registro con llave primaria
	 * 
	 * Constructor to add new register row with primary key
	 * 
	 * @param id_usuario
	 * @param nombres
	 * @param apellido_paterno
	 * @param apellido_materno
	 * @param genero
	 * @param telefono1
	 * @param telefono2
	 * @param correo2
	 * @param registro_creado
	 * @param registro_modificado
	 * @param registro_habilitado
	 */
	public Usuarios(int id_usuario, String nombres, String apellido_paterno, String apellido_materno, String genero,
			String telefono1, String telefono2, String correo2, Date registro_creado, Date registro_modificado,
			boolean registro_habilitado) {
		this.id_usuario = id_usuario;
		this.nombres = nombres;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.genero = genero;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.correo2 = correo2;
		this.registro_creado = registro_creado;
		this.registro_modificado = registro_modificado;
		this.registro_habilitado = registro_habilitado;
	}

	/**
	 * @return the id_usuario
	 */
	public int getId_usuario() {
		return id_usuario;
	}

	/**
	 * @param id_usuario the id_usuario to set
	 */
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellido_paterno
	 */
	public String getApellido_paterno() {
		return apellido_paterno;
	}

	/**
	 * @param apellido_paterno the apellido_paterno to set
	 */
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	/**
	 * @return the apellido_materno
	 */
	public String getApellido_materno() {
		return apellido_materno;
	}

	/**
	 * @param apellido_materno the apellido_materno to set
	 */
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the id_catalogo_titulo
	 */
	public CatalogoContenidos getId_catalogo_titulo() {
		return id_catalogo_titulo;
	}

	/**
	 * @param id_catalogo_titulo the id_catalogo_titulo to set
	 */
	public void setId_catalogo_titulo(CatalogoContenidos id_catalogo_titulo) {
		this.id_catalogo_titulo = id_catalogo_titulo;
	}

	/**
	 * @return the id_grupo
	 */
	public Grupos getId_grupo() {
		return id_grupo;
	}

	/**
	 * @param id_grupo the id_grupo to set
	 */
	public void setId_grupo(Grupos id_grupo) {
		this.id_grupo = id_grupo;
	}

	/**
	 * @return the telefono1
	 */
	public String getTelefono1() {
		return telefono1;
	}

	/**
	 * @param telefono1 the telefono1 to set
	 */
	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	/**
	 * @return the telefono2
	 */
	public String getTelefono2() {
		return telefono2;
	}

	/**
	 * @param telefono2 the telefono2 to set
	 */
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	/**
	 * @return the correo2
	 */
	public String getCorreo2() {
		return correo2;
	}

	/**
	 * @param correo2 the correo2 to set
	 */
	public void setCorreo2(String correo2) {
		this.correo2 = correo2;
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
	
}
