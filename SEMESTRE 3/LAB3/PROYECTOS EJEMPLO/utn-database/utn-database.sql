/*
SQLyog Community Edition- MySQL GUI v8.12 
MySQL - 5.1.73-community : Database - utn
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`utn` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `utn`;

/*Table structure for table `articulo` */

DROP TABLE IF EXISTS `articulo`;

CREATE TABLE `articulo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fechaAlta` datetime DEFAULT NULL,
  `codigo` varchar(50) DEFAULT NULL,
  `denominacion` varchar(255) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `publicado` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codigo` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=16384 DEFAULT CHARSET=latin1;

/*Data for the table `articulo` */


/*Table structure for table `articulo_copy` */

DROP TABLE IF EXISTS `articulo_copy`;

CREATE TABLE `articulo_copy` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fechaAlta` datetime DEFAULT NULL,
  `codigo` varchar(50) DEFAULT NULL,
  `denominacion` varchar(255) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `publicado` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codigo` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `articulo_copy` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;