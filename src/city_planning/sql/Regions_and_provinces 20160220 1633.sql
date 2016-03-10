-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.15


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema db_city_planning
--

CREATE DATABASE IF NOT EXISTS db_city_planning;
USE db_city_planning;

--
-- Definition of table `provinces`
--

DROP TABLE IF EXISTS `provinces`;
CREATE TABLE `provinces` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `provinces`
--

/*!40000 ALTER TABLE `provinces` DISABLE KEYS */;
INSERT INTO `provinces` (`id`,`region`,`region_id`,`province`) VALUES 
 (6,'Luzon REGION I (Ilocos Region)','2','Ilocos Norte Province'),
 (7,'Luzon REGION I (Ilocos Region)','2','Ilocos Sur Province'),
 (8,'Luzon REGION I (Ilocos Region)','2','La Union Province'),
 (9,'Luzon REGION I (Ilocos Region)','2','Pangasinan Province'),
 (10,'Luzon REGION II (Cagayan Valley)','3','Batanes Province'),
 (11,'Luzon REGION II (Cagayan Valley)','3','Cagayan Province'),
 (12,'Luzon REGION II (Cagayan Valley)','3','Isabela Province'),
 (13,'Luzon REGION II (Cagayan Valley)','3','Nueva Vizcaya Province'),
 (14,'Luzon REGION II (Cagayan Valley)','3','Quirino Province'),
 (15,'Luzon REGION III (Central Luzon)','4','Aurora Province'),
 (16,'Luzon REGION III (Central Luzon)','4','Bataan Province'),
 (17,'Luzon REGION III (Central Luzon)','4','Bulacan Province'),
 (18,'Luzon REGION III (Central Luzon)','4','Nueva Ecija Province'),
 (19,'Luzon REGION III (Central Luzon)','4','Pampanga Province'),
 (20,'Luzon REGION III (Central Luzon)','4','Tarlac Province'),
 (21,'Luzon REGION III (Central Luzon)','4','Zambales Province');
INSERT INTO `provinces` (`id`,`region`,`region_id`,`province`) VALUES 
 (22,'Luzon REGION IV-A (CALABARZON)','5','Batangas Province'),
 (23,'Luzon REGION IV-A (CALABARZON)','5','Cavite Province'),
 (24,'Luzon REGION IV-A (CALABARZON)','5','Laguna Province'),
 (25,'Luzon REGION IV-A (CALABARZON)','5','Quezon Province'),
 (26,'Luzon REGION IV-A (CALABARZON)','5','Rizal Province'),
 (27,'REGION IV-B (MIMAROPA)','6','Marinduque Province'),
 (28,'REGION IV-B (MIMAROPA)','6','Mindoro Occidental Province'),
 (29,'REGION IV-B (MIMAROPA)','6','Mindoro Oriental Province'),
 (30,'REGION IV-B (MIMAROPA)','6','Palawan Province'),
 (31,'REGION IV-B (MIMAROPA)','6','Romblon Province');
/*!40000 ALTER TABLE `provinces` ENABLE KEYS */;


--
-- Definition of table `regions`
--

DROP TABLE IF EXISTS `regions`;
CREATE TABLE `regions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `regions`
--

/*!40000 ALTER TABLE `regions` DISABLE KEYS */;
INSERT INTO `regions` (`id`,`region`) VALUES 
 (1,'National Capital Region (NCR)'),
 (2,'Luzon REGION I (Ilocos Region)'),
 (3,'Luzon REGION II (Cagayan Valley)'),
 (4,'Luzon REGION III (Central Luzon)'),
 (5,'Luzon REGION IV-A (CALABARZON)'),
 (6,'REGION IV-B (MIMAROPA)'),
 (7,'REGION V (Bicol Region)'),
 (8,'REGION VI (Western Visayas)'),
 (9,'REGION VII (Central Visayas)'),
 (10,'REGION VIII (Eastern Visayas)'),
 (11,'REGION IX (Zamboanga Peninsula)'),
 (12,'REGION X (Northern Mindanao)'),
 (13,'REGION XI (Davao Region)'),
 (14,'REGION XII (Soccsksargen)'),
 (15,'REGION XIII (CARAGA)'),
 (16,'Luzon REGION XIV Cordillera Administrative Region (CAR)'),
 (17,'REGION XV - Autonomous Region in Muslim Mindanao (ARMM)'),
 (18,'Region XVIII - NIR - Negros Island Region');
/*!40000 ALTER TABLE `regions` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
