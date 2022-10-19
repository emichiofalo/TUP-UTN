/*
SQLyog Ultimate v9.02 
MySQL - 8.0.30 : Database - paises
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`paises` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `paises`;

/*Table structure for table `departamento` */

DROP TABLE IF EXISTS `departamento`;

CREATE TABLE `departamento` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `idProvincia` bigint unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_departamento` (`idProvincia`),
  CONSTRAINT `FK_departamento` FOREIGN KEY (`idProvincia`) REFERENCES `provincia` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `departamento` */

insert  into `departamento`(`id`,`nombre`,`idProvincia`) values (1,'Las Heras',1),(2,'Godoy Cruz',1),(3,'Neuquen',2),(4,'La Boca',3),(5,'San Telmo',3),(6,'NN',4),(7,'Compostela',7);

/*Table structure for table `pais` */

DROP TABLE IF EXISTS `pais`;

CREATE TABLE `pais` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `poblacion` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `pais` */

insert  into `pais`(`id`,`nombre`,`poblacion`) values (1,'Argentina',45000000),(2,'Brasil',250000000),(3,'Chile',20000000);

/*Table structure for table `provincia` */

DROP TABLE IF EXISTS `provincia`;

CREATE TABLE `provincia` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `superficie` double DEFAULT NULL,
  `nombre` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `idPais` bigint unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_provincia` (`idPais`),
  CONSTRAINT `FK_provincia` FOREIGN KEY (`idPais`) REFERENCES `pais` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `provincia` */

insert  into `provincia`(`id`,`superficie`,`nombre`,`idPais`) values (1,20000,'Mendoza',1),(2,10000,'Neuquen',1),(3,4000,'Buenos Aires',1),(4,1000,'Bombas y Bombinhas',2),(5,4000,'Sao Pablo',2),(6,5000,'Brasilia',2),(7,2000,'Santiago',3),(8,2000,'La Serena',3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
