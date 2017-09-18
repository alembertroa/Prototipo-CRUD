/*
Navicat MariaDB Data Transfer

Source Server         : local
Source Server Version : 100126
Source Host           : localhost:3306
Source Database       : prototipo

Target Server Type    : MariaDB
Target Server Version : 100126
File Encoding         : 65001

Date: 2017-09-18 09:30:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for catalogocontenidos
-- ----------------------------
DROP TABLE IF EXISTS `catalogocontenidos`;
CREATE TABLE `catalogocontenidos` (
  `id_catalogo_contenido` int(11) NOT NULL AUTO_INCREMENT,
  `id_catalogo` int(11) NOT NULL,
  `nombre_objeto` varchar(50) NOT NULL,
  `descripcion_objeto` varchar(100) NOT NULL,
  `registro_creado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_modificado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_habilitado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_catalogo_contenido`),
  KEY `id_catalogo` (`id_catalogo`),
  CONSTRAINT `catalogocontenidos_ibfk_1` FOREIGN KEY (`id_catalogo`) REFERENCES `catalogos` (`id_catalogos`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of catalogocontenidos
-- ----------------------------
INSERT INTO `catalogocontenidos` VALUES ('1', '1', 'C.', 'Ciudadana (o)', '2017-09-17 18:52:33', '2017-09-17 18:52:33', '1');
INSERT INTO `catalogocontenidos` VALUES ('2', '1', 'Ing.', 'Ingeniera (o)', '2017-09-17 18:52:51', '2017-09-17 18:52:51', '1');
INSERT INTO `catalogocontenidos` VALUES ('3', '1', 'Lic.', 'Licenciada (o)', '2017-09-17 18:53:10', '2017-09-17 18:53:10', '1');
INSERT INTO `catalogocontenidos` VALUES ('4', '1', 'Dr.', 'Doctor (a)', '2017-09-17 18:53:34', '2017-09-17 18:53:34', '1');
INSERT INTO `catalogocontenidos` VALUES ('5', '2', 'Obj1', 'Objeto 1', '2017-09-17 18:53:50', '2017-09-17 18:53:50', '1');
INSERT INTO `catalogocontenidos` VALUES ('6', '2', 'Obj2', 'Objeto 2', '2017-09-17 18:53:59', '2017-09-17 18:53:59', '1');
INSERT INTO `catalogocontenidos` VALUES ('7', '3', 'Tres', 'Tres', '2017-09-17 18:54:15', '2017-09-17 18:54:15', '1');

-- ----------------------------
-- Table structure for catalogos
-- ----------------------------
DROP TABLE IF EXISTS `catalogos`;
CREATE TABLE `catalogos` (
  `id_catalogos` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_catalogo` varchar(50) NOT NULL,
  `descripcion_catalogo` varchar(100) NOT NULL,
  `registro_creado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_modificado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_habilitado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_catalogos`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of catalogos
-- ----------------------------
INSERT INTO `catalogos` VALUES ('1', 'Titulo', 'Titulo obtenido por la persona', '2017-09-17 18:37:49', '2017-09-17 18:37:49', '1');
INSERT INTO `catalogos` VALUES ('2', 'Otro', 'Otro catalogo', '2017-09-17 18:50:06', '2017-09-17 18:50:06', '1');
INSERT INTO `catalogos` VALUES ('3', 'Otro mas', 'Otro catalogo mas', '2017-09-17 18:50:48', '2017-09-17 18:50:48', '1');
INSERT INTO `catalogos` VALUES ('4', 'Otro mas mas', 'Otro catalogo mas mas', '2017-09-17 18:51:56', '2017-09-17 18:51:56', '1');

-- ----------------------------
-- Table structure for credencialaccesos
-- ----------------------------
DROP TABLE IF EXISTS `credencialaccesos`;
CREATE TABLE `credencialaccesos` (
  `id_usuario_login` int(11) NOT NULL,
  `nickname` varchar(50) NOT NULL,
  `password_sha256` varchar(255) NOT NULL,
  `ultimo_acceso` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_creado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_modificado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_habilitado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_usuario_login`),
  UNIQUE KEY `nickname` (`nickname`) USING BTREE,
  CONSTRAINT `credencialaccesos_ibfk_1` FOREIGN KEY (`id_usuario_login`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of credencialaccesos
-- ----------------------------

-- ----------------------------
-- Table structure for grupos
-- ----------------------------
DROP TABLE IF EXISTS `grupos`;
CREATE TABLE `grupos` (
  `id_grupo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_grupo` varchar(20) NOT NULL,
  `descripcion_grupo` varchar(100) NOT NULL,
  `registro_creado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_modificado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_habilitado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_grupo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grupos
-- ----------------------------

-- ----------------------------
-- Table structure for menugrupos
-- ----------------------------
DROP TABLE IF EXISTS `menugrupos`;
CREATE TABLE `menugrupos` (
  `id_menu_grupo` int(11) NOT NULL AUTO_INCREMENT,
  `id_grupo` int(11) NOT NULL,
  `id_sistema_modulo` int(11) NOT NULL,
  `registro_creado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_modificado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_habilitado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_menu_grupo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menugrupos
-- ----------------------------

-- ----------------------------
-- Table structure for sistemamodulos
-- ----------------------------
DROP TABLE IF EXISTS `sistemamodulos`;
CREATE TABLE `sistemamodulos` (
  `id_sistema_modulo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_modulo` varchar(50) NOT NULL,
  `descripcion_modulo` varchar(100) NOT NULL,
  `registro_creado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_modificado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_habilitado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_sistema_modulo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sistemamodulos
-- ----------------------------

-- ----------------------------
-- Table structure for usuarios
-- ----------------------------
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(255) NOT NULL,
  `apellido_paterno` varchar(255) NOT NULL,
  `apellido_materno` varchar(255) NOT NULL,
  `genero` enum('Femenino','Masculino') NOT NULL,
  `id_catalogo_titulo` int(11) NOT NULL,
  `id_grupo` int(11) NOT NULL,
  `telefono1` varchar(20) NOT NULL,
  `telefono2` varchar(20) DEFAULT NULL,
  `correo1` varchar(50) NOT NULL,
  `correo2` varchar(50) DEFAULT NULL,
  `registro_creado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_modificado` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_habilitado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_usuario`),
  KEY `id_grupo` (`id_grupo`),
  KEY `id_catalogo_titulo` (`id_catalogo_titulo`),
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`id_grupo`) REFERENCES `grupos` (`id_grupo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `usuarios_ibfk_2` FOREIGN KEY (`id_catalogo_titulo`) REFERENCES `catalogocontenidos` (`id_catalogo_contenido`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usuarios
-- ----------------------------
SET FOREIGN_KEY_CHECKS=1;
