package mx.com.tsam.model.tables;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Clase que mapea la tabla "credencialaccesos"
 * 
 * "credencialaccesos" table class map
 * 
 * @author Alembert
 *
 */
@Entity
@Table(name = "credencialaccesos")
public class CredencialAccesos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Llave primaria (Primary Key = PK)
	 * Llave foranea (Forein Key = FK)
	 */
	@Id
	@Column(name = "id_usuario_login")
	private int id_usuario_login;
	
	/**
	 * Unique value
	 */
	@Column(name = "nickname", unique = true)
	private String nickname;
	
	@Column(name = "password_sha256")
	private String password_sha256;
	
	@Column(name = "ultimo_acceso")
	private Date ultimo_acceso;
	
	@Column(name = "registro_creado")
	private Date registro_creado;
	
	@Column(name = "registro_modificado")
	private Date registro_modificado;
	
	@Column(name = "registro_habilitado")
	private boolean registro_habilitado;
	
	@OneToOne
	@PrimaryKeyJoinColumn(name = "id_usuario_login")
	private Usuarios id_usuario;
	
	/**
	 * Constructor default
	 */
	public CredencialAccesos () {
	}

	/**
	 * Constructor para ingresar un nuevo registro
	 * 
	 * Constructor to add new register row
	 * 
	 * @param id_usuario_login
	 * @param nickname
	 * @param password_sha256
	 * @param ultimo_acceso
	 * @param registro_creado
	 * @param registro_modificado
	 * @param registro_habilitado
	 */
	public CredencialAccesos(int id_usuario_login, String nickname, String password_sha256, Date ultimo_acceso,
			Date registro_creado, Date registro_modificado, boolean registro_habilitado) {
		this.id_usuario_login = id_usuario_login;
		this.nickname = nickname;
		this.password_sha256 = password_sha256;
		this.ultimo_acceso = ultimo_acceso;
		this.registro_creado = registro_creado;
		this.registro_modificado = registro_modificado;
		this.registro_habilitado = registro_habilitado;
	}

	/**
	 * @return the id_usuario_login
	 */
	public int getId_usuario_login() {
		return id_usuario_login;
	}

	/**
	 * @param id_usuario_login the id_usuario_login to set
	 */
	public void setId_usuario_login(int id_usuario_login) {
		this.id_usuario_login = id_usuario_login;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the password_sha256
	 */
	public String getPassword_sha256() {
		return password_sha256;
	}

	/**
	 * @param password_sha256 the password_sha256 to set
	 */
	public void setPassword_sha256(String password_sha256) {
		this.password_sha256 = password_sha256;
	}

	/**
	 * @return the ultimo_acceso
	 */
	public Date getUltimo_acceso() {
		return ultimo_acceso;
	}

	/**
	 * @param ultimo_acceso the ultimo_acceso to set
	 */
	public void setUltimo_acceso(Date ultimo_acceso) {
		this.ultimo_acceso = ultimo_acceso;
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
	 * @return the id_usuario
	 */
	public Usuarios getId_usuario() {
		return id_usuario;
	}

	/**
	 * @param id_usuario the id_usuario to set
	 */
	public void setId_usuario(Usuarios id_usuario) {
		this.id_usuario = id_usuario;
	}
		
}
