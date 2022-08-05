/*
SQLyog Ultimate v9.02 
MySQL - 5.6.17 : Database - BDAutoCine_Chiofalo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`BDAutoCine_Chiofalo` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci */;

USE `BDAutoCine_Chiofalo`;

/*Table structure for table `Entrada` */

DROP TABLE IF EXISTS `Entrada`;

CREATE TABLE `Entrada` (
  `entrada_id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `entrada_patente` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `entrada_funcion` int(3) unsigned NOT NULL,
  `entrada_precio` float unsigned DEFAULT NULL,
  PRIMARY KEY (`entrada_patente`,`entrada_funcion`),
  UNIQUE KEY `entrada_id` (`entrada_id`),
  KEY `FK_Entrada` (`entrada_funcion`),
  CONSTRAINT `FK_Entrada` FOREIGN KEY (`entrada_funcion`) REFERENCES `Funcion` (`funcion_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `Entrada` */

insert  into `Entrada`(`entrada_id`,`entrada_patente`,`entrada_funcion`,`entrada_precio`) values (24,'AS345OP',5,700),(37,'CVB678',5,600),(25,'ER456UI',1,700),(26,'ERT789',6,700),(33,'GH156UY',5,700),(28,'GHJ567',5,700),(29,'GHJ654',5,700),(36,'HY987XC',2,600),(34,'IO472CV',5,700),(31,'KHJ236',5,700),(32,'OJO904',5,700),(35,'TY657BN',38,700),(27,'TYU567',5,700);

/*Table structure for table `Funcion` */

DROP TABLE IF EXISTS `Funcion`;

CREATE TABLE `Funcion` (
  `funcion_id` int(3) unsigned NOT NULL AUTO_INCREMENT,
  `funcion_fecha` date NOT NULL,
  `funcion_horario` time NOT NULL,
  `funcion_parking` int(1) unsigned NOT NULL,
  `funcion_pelicula` int(3) unsigned DEFAULT NULL,
  PRIMARY KEY (`funcion_fecha`,`funcion_horario`,`funcion_parking`),
  UNIQUE KEY `funcion_id` (`funcion_id`),
  KEY `FK_Funcion_Pelicula` (`funcion_pelicula`),
  KEY `FK_Funcion_Parking` (`funcion_parking`),
  CONSTRAINT `FK_Funcion_Parking` FOREIGN KEY (`funcion_parking`) REFERENCES `Parking` (`parking_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_Funcion_Pelicula` FOREIGN KEY (`funcion_pelicula`) REFERENCES `Pelicula` (`peli_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=latin1;

/*Data for the table `Funcion` */

insert  into `Funcion`(`funcion_id`,`funcion_fecha`,`funcion_horario`,`funcion_parking`,`funcion_pelicula`) values (3,'2022-06-24','00:00:00',1,6),(4,'2022-06-24','00:00:00',2,1),(1,'2022-06-24','19:00:00',1,3),(5,'2022-06-24','19:00:00',2,4),(6,'2022-06-24','21:30:00',1,2),(7,'2022-06-24','21:30:00',2,4),(8,'2022-06-25','00:00:00',1,1),(9,'2022-06-25','00:00:00',2,6),(10,'2022-06-25','19:00:00',1,4),(2,'2022-06-25','19:00:00',2,3),(11,'2022-06-25','21:30:00',1,5),(12,'2022-06-25','21:30:00',2,2),(38,'2022-06-26','19:00:00',1,4);

/*Table structure for table `Parking` */

DROP TABLE IF EXISTS `Parking`;

CREATE TABLE `Parking` (
  `parking_id` int(1) unsigned NOT NULL AUTO_INCREMENT,
  `parking_capacidad` int(2) unsigned DEFAULT NULL,
  PRIMARY KEY (`parking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `Parking` */

insert  into `Parking`(`parking_id`,`parking_capacidad`) values (1,17),(2,10);

/*Table structure for table `Pelicula` */

DROP TABLE IF EXISTS `Pelicula`;

CREATE TABLE `Pelicula` (
  `peli_id` int(3) unsigned NOT NULL AUTO_INCREMENT,
  `peli_titulo` varchar(50) DEFAULT NULL,
  `peli_anio` int(4) unsigned DEFAULT NULL,
  `peli_director` varchar(30) DEFAULT NULL,
  `peli_genero` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`peli_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

/*Data for the table `Pelicula` */

insert  into `Pelicula`(`peli_id`,`peli_titulo`,`peli_anio`,`peli_director`,`peli_genero`) values (1,'DR STRANGE EN EL MULTIVERSO',2022,'Sam Raimi','Accion'),(2,'JURASSIC WORLD DOMINIO',2022,'Colin Trevorrow','Aventuras'),(3,'LIGHTYEAR',2022,'Angus MacLane','Animación'),(4,'MINIONS NACE UN VILLANO',2022,'Brad Ableson','Animación'),(5,'TOP GUN MAVERICK',2022,'Joseph Kosinski','Acción'),(6,'GEMELO SINIESTRO',2022,'Taneli Mustonen','Terror');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
