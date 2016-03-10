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
-- Definition of table `achievements`
--

DROP TABLE IF EXISTS `achievements`;
CREATE TABLE `achievements` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `achievement` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `achievements`
--

/*!40000 ALTER TABLE `achievements` DISABLE KEYS */;
/*!40000 ALTER TABLE `achievements` ENABLE KEYS */;


--
-- Definition of table `assets`
--

DROP TABLE IF EXISTS `assets`;
CREATE TABLE `assets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `asset` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assets`
--

/*!40000 ALTER TABLE `assets` DISABLE KEYS */;
INSERT INTO `assets` (`id`,`asset`) VALUES 
 (1,'Artwork'),
 (2,'Automobile'),
 (3,'Checking account'),
 (4,'Collectibles Electronics Insurance'),
 (5,'Jewelry'),
 (6,'Investment accounts'),
 (7,'Retirement account'),
 (8,'Savings account'),
 (9,'Financial Institution Accounts'),
 (10,'Financial Institution Accounts'),
 (11,'Regular Checking Accounts'),
 (12,'Stocks and mutual funds'),
 (13,'Business equity'),
 (14,'Vehicles'),
 (15,'Home Value'),
 (16,'Car Value'),
 (17,'Rental Property'),
 (18,'Other real estate'),
 (19,'Other Financial Assets'),
 (20,'Other interest-earning assets');
/*!40000 ALTER TABLE `assets` ENABLE KEYS */;


--
-- Definition of table `barangays`
--

DROP TABLE IF EXISTS `barangays`;
CREATE TABLE `barangays` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `barangay` varchar(100) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `region_id` int(11) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  `is_default` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=215 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barangays`
--

/*!40000 ALTER TABLE `barangays` DISABLE KEYS */;
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (1,'Bio-os',462,'Amlan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (2,'Jantianon',462,'Amlan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (3,'Jugno',462,'Amlan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (4,'Mag-abo',462,'Amlan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (5,'Poblacion',462,'Amlan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (6,'Silab',462,'Amlan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (7,'Tambojangin',462,'Amlan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (8,'Tandayag',462,'Amlan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (9,'Ambus',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (10,'Anibong',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (11,'Atabay',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (12,'Awa-an',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (13,'Ban-ban',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (14,'Calagcalag',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (15,'Candana-ay',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (16,'Carol-an',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (17,'Gomentoc',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (18,'Inacban',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (19,'Iniban',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (20,'Jandalamanon',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (21,'Kilaban',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (22,'Lamigan',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (23,'Maaslum',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (24,'Mabato',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (25,'Manogtong',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (26,'Nabhang',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (27,'Poblacion',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (28,'Tambo',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (29,'Tampocon I',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (30,'Tampocon II',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (31,'Tibyawan',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (32,'Tiguib',463,'Ayungon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (33,'Buntis',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (34,'Buntod',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (35,'Calangag',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (36,'Combado',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (37,'Doldol',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (38,'Isugan',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (39,'Liptong',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (40,'Lutao',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (41,'Magsuot',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (42,'Malabago',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (43,'Mampas',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (44,'North Poblacion',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (45,'Sacsac',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (46,'San Miguel',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (47,'South Poblacion',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (48,'Sulodpan',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (49,'Timbanga',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (50,'Timbao',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (51,'Tubod',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (52,'West Poblacion',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (53,'Barangay I (Pob.)',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (54,'Barangay II (Pob.)',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (55,'Basak',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (56,'Bi¤ohon',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (57,'Cabanlutan',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (58,'Calasga-an',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (59,'Cambagahan',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (60,'Cambaguio',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (61,'Cambanjao',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (62,'Cambuilao',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (63,'Canlargo',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (64,'Capi¤ahan',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (65,'Consolacion',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (66,'Dansulan',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (67,'Hangyad',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (68,'La Paz',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (69,'Lo-oc',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (70,'Lonoy',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (71,'Mabunao',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (72,'Manlipac',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (73,'Mansangaban',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (74,'Okiot',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (75,'Olympia',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (76,'Panala-an',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (77,'Panam-angan',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (78,'Rosario',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (79,'Sab-ahan',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (80,'San Isidro',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (81,'Katacgahan (Tacgahan)',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (82,'Tagpo',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (83,'Talungon',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (84,'Tamisu',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (85,'Tamogong',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (86,'Tangculogan',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (87,'Valencia',465,'Bais',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (88,'Actin',466,'Basay',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (89,'Bal-os',466,'Basay',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (90,'Bongalonan',466,'Basay',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (91,'Cabalayongan',466,'Basay',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (92,'Cabatuanan',466,'Basay',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (93,'Linantayan',466,'Basay',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (94,'Maglinao',466,'Basay',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (95,'Nagbo-alao',466,'Basay',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (96,'Olandao',466,'Basay',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (97,'Poblacion',466,'Basay',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (98,'Ali-is',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (99,'Banaybanay',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (100,'Banga',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (101,'Villasol (Bato)',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (102,'Boyco (Poblacion)',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (103,'Bugay',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (104,'Cansumalig',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (105,'Dawis',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (106,'Kalamtukan',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (107,'Kalumboyan',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (108,'Malabugas',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (109,'Mandu-ao',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (110,'Maninihon',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (111,'Minaba',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (112,'Nangka',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (113,'Narra',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (114,'Pagatban',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (115,'San Jose',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (116,'San Miguel',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (117,'San Roque',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (118,'Suba (poblacion)',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (119,'Tabuan',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (120,'Tayawan',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (121,'Tinago (poblacion)',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (122,'Ubos (poblacion)',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (123,'Villareal',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (124,'San Isidro',467,'Bayawan',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (125,'Atotes',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (126,'Batangan',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (127,'Bulod',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (128,'Cabcaban',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (129,'Cabugan',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (130,'Camudlas',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (131,'Canluto',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (132,'Danao',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (133,'Danawan',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (134,'Domolog',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (135,'Malaga',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (136,'Manseje',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (137,'Matobato',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (138,'Nagcasunog',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (139,'Nalundan',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (140,'Pangalaycayan',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (141,'Pe¤ahan',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (142,'Poblacion (Payabon)',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (143,'Salong',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (144,'Tagaytay',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (145,'Tinaogan',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (146,'Tubod',468,'Bindoy',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (147,'Bayog',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (148,'Binalbagan',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (149,'Bucalan (East Budlasan)',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (150,'Linothangan',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (151,'Lumapao',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (152,'Malaiba',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (153,'Masulog',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (154,'Panubigan',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (155,'Mabigo (Poblacion - Canla-on City)',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (156,'Pula',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (157,'Budlasan (West Budlasan)',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (158,'Aquino',469,'Canlaon',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (159,'Apo Island',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (160,'Anhawan',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (161,'Bagacay',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (162,'Baslay',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (163,'Batuhon Dacu',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (164,'Batuhon Dacu',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (165,'Boloc-boloc',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (166,'Bulak',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (167,'Bunga',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (168,'Casile',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (169,'Libjo',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (170,'Lipayo',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (171,'Maayongtubig',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (172,'Mag-aso',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (173,'Magsaysay',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (174,'Malongcay Dacu',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (175,'Masaplod Norte',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (176,'Masaplod Sur',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (177,'Panubtuban',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (178,'Panubtuban',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (179,'Poblacion II',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (180,'Poblacion III',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (181,'Tugawe',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (182,'Tunga-tunga',470,'Dauin',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (183,'Bagacay',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (184,'Bajumpandan',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (185,'Balugo',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (186,'Banilad',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (187,'Bantayan',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (188,'Batinguel',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (189,'Bu¤ao',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (190,'Cadawinonan',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (191,'Calindagan',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (192,'Camanjac',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (193,'Candau-ay',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (194,'Cantil-e',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (195,'Daro',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (196,'Junob',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (197,'Looc',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (198,'Mangnao-Canal',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (199,'Motong',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (200,'Piapi',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (201,'Barangay 1 (Tinago)',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (202,'Barangay 2 (Upper Lukewright)',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (203,'Barangay 3 (Business District))',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (204,'Barangay 4 (Rizal Boulevard)',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (205,'Barangay 5 (Silliman Area)',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (206,'Barangay 6 (Cambagroy)',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (207,'Barangay 7 (Mangga)',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',1),
 (208,'Barangay 8 (Cervantes Extension)',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
INSERT INTO `barangays` (`id`,`barangay`,`city_id`,`city`,`province_id`,`province`,`region_id`,`region`,`is_default`) VALUES 
 (209,'Pulantubig',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (210,'Tabuc-tubig',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (211,'Taclobo',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (212,'Talay',471,'Dumaguete',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (213,'Balayagmanok',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0),
 (214,'Banilad',464,'Bacong',46,'Negros Oriental Province',9,'VISAYAS REGION VI (WESTERN VISAYAS)',0);
/*!40000 ALTER TABLE `barangays` ENABLE KEYS */;


--
-- Definition of table `basic_needs`
--

DROP TABLE IF EXISTS `basic_needs`;
CREATE TABLE `basic_needs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `basic_needs` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `basic_needs`
--

/*!40000 ALTER TABLE `basic_needs` DISABLE KEYS */;
INSERT INTO `basic_needs` (`id`,`basic_needs`) VALUES 
 (1,'Rice'),
 (2,'Water'),
 (3,'Corn'),
 (4,'Meat/Fish/Eggs'),
 (5,'Milk'),
 (6,'Fruit/Vegetables'),
 (7,'Toiletries/Soap/Shampoo'),
 (8,'Root-crops'),
 (9,'Clothing/Shoes'),
 (10,'Cosmetics'),
 (11,'Cigarettes'),
 (12,'Soft drinks'),
 (13,'Hard Drinks'),
 (14,'Newspaper/Magazine'),
 (15,'Kerosene'),
 (16,'Bio gas '),
 (17,'Transportation'),
 (18,'Fuel/Gas/Wood/Kerosene '),
 (19,'Others'),
 (20,'pang chix');
/*!40000 ALTER TABLE `basic_needs` ENABLE KEYS */;


--
-- Definition of table `bathroom_types`
--

DROP TABLE IF EXISTS `bathroom_types`;
CREATE TABLE `bathroom_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bathroom_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bathroom_types`
--

/*!40000 ALTER TABLE `bathroom_types` DISABLE KEYS */;
INSERT INTO `bathroom_types` (`id`,`bathroom_type`) VALUES 
 (1,'Inside'),
 (3,'Outside (Built)'),
 (4,'Outside (makeshift)'),
 (5,'None');
/*!40000 ALTER TABLE `bathroom_types` ENABLE KEYS */;


--
-- Definition of table `building_types`
--

DROP TABLE IF EXISTS `building_types`;
CREATE TABLE `building_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `building_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `building_types`
--

/*!40000 ALTER TABLE `building_types` DISABLE KEYS */;
INSERT INTO `building_types` (`id`,`building_type`) VALUES 
 (1,'Apartment block'),
 (2,'Asylum'),
 (3,'Condominium'),
 (4,'Dormitory'),
 (5,'Duplex'),
 (6,'House - see List of house types'),
 (7,'Nursing home'),
 (8,'Townhouse'),
 (9,'Villa'),
 (10,'Bungalow');
/*!40000 ALTER TABLE `building_types` ENABLE KEYS */;


--
-- Definition of table `businesses`
--

DROP TABLE IF EXISTS `businesses`;
CREATE TABLE `businesses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `business` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `mailing_address` varchar(100) DEFAULT NULL,
  `business_type` varchar(100) DEFAULT NULL,
  `contact_no` varchar(100) DEFAULT NULL,
  `remarks` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `businesses`
--

/*!40000 ALTER TABLE `businesses` DISABLE KEYS */;
INSERT INTO `businesses` (`id`,`business`,`address`,`mailing_address`,`business_type`,`contact_no`,`remarks`) VALUES 
 (1,NULL,NULL,NULL,'Online Business',NULL,NULL),
 (2,NULL,NULL,NULL,'Franchise',NULL,NULL),
 (3,NULL,NULL,NULL,'Home Based business',NULL,NULL),
 (4,NULL,NULL,NULL,'Independent contractor',NULL,NULL),
 (5,NULL,NULL,NULL,'Importer',NULL,NULL),
 (6,NULL,NULL,NULL,'Exporter',NULL,NULL),
 (7,NULL,NULL,NULL,'Sole traders',NULL,NULL),
 (8,NULL,NULL,NULL,'Partnership',NULL,NULL),
 (9,NULL,NULL,NULL,'Private companies/Family Business',NULL,NULL),
 (10,NULL,NULL,NULL,'Public companies',NULL,NULL),
 (11,NULL,NULL,NULL,'Limited liability ',NULL,NULL);
/*!40000 ALTER TABLE `businesses` ENABLE KEYS */;


--
-- Definition of table `certifications`
--

DROP TABLE IF EXISTS `certifications`;
CREATE TABLE `certifications` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `certification` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `certifications`
--

/*!40000 ALTER TABLE `certifications` DISABLE KEYS */;
INSERT INTO `certifications` (`id`,`certification`) VALUES 
 (1,'Data Encoder Eligibility'),
 (2,'National Certificate'),
 (3,'Civil Service Eligibility'),
 (4,'Certificate of Competency'),
 (5,'Subprof Eligibility'),
 (6,'National Career Readiness Certificate (NCRC)'),
 (7,'Certified Production Technician'),
 (8,'Manufacturing Technician Certification'),
 (9,'National Institute for Metalworking Skills Certication'),
 (10,'Others');
/*!40000 ALTER TABLE `certifications` ENABLE KEYS */;


--
-- Definition of table `cities`
--

DROP TABLE IF EXISTS `cities`;
CREATE TABLE `cities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  `region_id` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3664 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cities`
--

/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (1,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Adam'),
 (2,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Bacarra'),
 (3,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Badoc'),
 (4,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Bangui'),
 (5,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Banna(Espiritu)'),
 (6,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Batac'),
 (7,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Burgos'),
 (8,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Carasi'),
 (9,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Currimao'),
 (10,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Dingras'),
 (11,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Dumalneg'),
 (12,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Laoag'),
 (13,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Marcos');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (14,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Nueva Era'),
 (15,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Pagudpud'),
 (16,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Paoay'),
 (17,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Pasuquin'),
 (18,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Piddig'),
 (19,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Pinili'),
 (20,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','San Nicolas'),
 (21,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Sarrat'),
 (22,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Solsona'),
 (23,6,'Ilocos Norte Province','Luzon REGION I (Ilocos Region)','2','Vintar'),
 (24,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Alilem'),
 (25,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Banayoyo'),
 (26,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Bantay');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (27,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Burgos'),
 (28,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Cabugao'),
 (29,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Candon'),
 (30,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Caoayan'),
 (31,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Cervantes'),
 (32,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Galimuyod'),
 (33,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','gregorio Del Pilar'),
 (34,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Lidlidda'),
 (35,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Magsingal'),
 (36,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Nagbukel'),
 (37,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Narvacan'),
 (38,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Quirino'),
 (39,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Salcedo');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (40,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','San Emilio'),
 (41,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','San Esteban'),
 (42,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','San Eldefonso'),
 (43,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','San Juan'),
 (44,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','San Vicente'),
 (45,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Santa'),
 (46,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Santa Catalina'),
 (47,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Santa Cruz'),
 (48,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Santa Lucia'),
 (49,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Santa MAria'),
 (50,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Santiago'),
 (51,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Santo Dimingo'),
 (52,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Sigay');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (53,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Sinait'),
 (54,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Sugpon'),
 (55,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Suyo'),
 (56,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Tagudin'),
 (57,7,'Ilocos Sur Province','Luzon REGION I (Ilocos Region)','2','Vigan'),
 (58,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Agoo'),
 (59,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Aringay'),
 (60,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Bacnotan'),
 (61,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Bagulin'),
 (62,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Balaoan'),
 (63,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Bangar'),
 (64,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Bauang'),
 (65,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Burgos');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (66,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Caba'),
 (67,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Luna'),
 (68,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Naguilian'),
 (69,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Pugo'),
 (70,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Rosario'),
 (71,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','San Fernando'),
 (72,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','San Gabriel'),
 (73,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','San Juan'),
 (74,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Santo Tomas'),
 (75,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Santol'),
 (76,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Sudipen'),
 (77,8,'La Union Province','Luzon REGION I (Ilocos Region)','2','Tubao'),
 (78,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Agno');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (79,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Aguilar'),
 (80,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Alaminos'),
 (81,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Alcala'),
 (82,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Anda'),
 (83,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Asingan'),
 (84,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Balungao'),
 (85,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Bani'),
 (86,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Basista'),
 (87,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Bautista'),
 (88,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Bayambang'),
 (89,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Binalonan'),
 (100,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Binmaley'),
 (101,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Bolinao');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (102,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Bugallon'),
 (103,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Burgos'),
 (104,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Calasiao'),
 (105,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Dagupan'),
 (106,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Dasol'),
 (107,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Infanta'),
 (108,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Labrador'),
 (109,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Laoac'),
 (110,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Lingayen'),
 (111,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Mabini'),
 (112,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Malasiqui'),
 (113,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Manaoag'),
 (114,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Mangaldan');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (115,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Mangatarem'),
 (116,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Mapandan'),
 (117,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Natividad'),
 (118,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Pozorrubio'),
 (119,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Rosales'),
 (120,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','San Carlos'),
 (121,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','San Fabian'),
 (122,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','San Jacinto'),
 (123,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','San Manuel'),
 (124,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','San Nicolas'),
 (125,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','San Quintin'),
 (126,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Santa Barbara'),
 (127,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Santa Maria');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (128,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Santo Tomas'),
 (129,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Sison'),
 (130,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Sual'),
 (131,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Tayug'),
 (132,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Umingan'),
 (133,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Urbiztondo'),
 (134,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Urbaneta'),
 (135,9,'Pangasinan Province','Luzon REGION I (Ilocos Region)','2','Villasis'),
 (136,10,'Batanes Province','Luzon REGION II (Cagayan Valley)','3','Basco'),
 (137,10,'Batanes Province','Luzon REGION II (Cagayan Valley)','3','Itbayat'),
 (138,10,'Batanes Province','Luzon REGION II (Cagayan Valley)','3','Ivana'),
 (139,10,'Batanes Province','Luzon REGION II (Cagayan Valley)','3','Mahatao'),
 (140,10,'Batanes Province','Luzon REGION II (Cagayan Valley)','3','Sabtang');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (141,10,'Batanes Province','Luzon REGION II (Cagayan Valley)','3','Uyugan'),
 (142,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Abulug'),
 (143,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Alcala'),
 (144,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Allacapan'),
 (145,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Amulung'),
 (146,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Appari'),
 (147,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Baggao'),
 (148,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Ballesteros'),
 (149,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Buguey'),
 (150,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Calayan'),
 (151,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Camalaniugan'),
 (152,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Claveria'),
 (153,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Enrile');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (154,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Gattaran'),
 (155,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Gonzaga'),
 (156,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Iguig'),
 (157,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Lal-Lo'),
 (158,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Lasam'),
 (159,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Pamplona'),
 (160,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Pe¤ablanca'),
 (161,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Piat'),
 (162,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Rizal'),
 (163,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Sanchez-Mira'),
 (164,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Santa Ana'),
 (165,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Santa Praxedes'),
 (166,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Santa Teresita');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (167,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Santo Ni¤o'),
 (168,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Solana'),
 (169,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Tuao'),
 (170,11,'Cagayan Province','Luzon REGION II (Cagayan Valley)','3','Tuguegarao'),
 (171,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Alicia'),
 (172,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Angadana'),
 (173,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Aurora'),
 (174,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Benito'),
 (175,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Soliven'),
 (176,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Burgos'),
 (177,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Cabagan'),
 (178,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Cabatuan'),
 (179,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Cauayan');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (180,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Cordon'),
 (181,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Delfin ALbano'),
 (182,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Dinapigue'),
 (183,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Divilacan'),
 (184,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Echague'),
 (185,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Gamu'),
 (186,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Jones'),
 (187,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Ilagan'),
 (188,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Luna '),
 (189,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Macanacon'),
 (190,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Mallig'),
 (191,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Naguilian '),
 (192,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Palanan ');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (193,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Quezon'),
 (194,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Quirino'),
 (195,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Ramon'),
 (196,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Reinan Mercedes'),
 (197,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Roxas'),
 (198,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','San Agustin'),
 (199,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','San Guillermo'),
 (200,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','San Isidro'),
 (201,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','San Manuel'),
 (202,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','San Mariano'),
 (203,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','San Mateo'),
 (204,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','San Pablo'),
 (205,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Santa Maria');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (206,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Santo Tomas'),
 (207,12,'Isabela Province','Luzon REGION II (Cagayan Valley)','3','Tumauini'),
 (208,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Alfonso Casta¤eda'),
 (209,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Ambaguio'),
 (210,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Aritao'),
 (211,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Bagabag'),
 (212,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Bambang'),
 (213,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Bayombong'),
 (214,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Diadi'),
 (215,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Dupax del Norte'),
 (216,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Dupax del Sur'),
 (217,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Kasibu');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (218,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Kayapa'),
 (219,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Quezon'),
 (220,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Santa Fe'),
 (221,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Solano'),
 (222,13,'Nueva Vizcaya Province','Luzon REGION II (Cagayan Valley)','3','Villaverde'),
 (223,14,'Quirino Province','Luzon REGION II (Cagayan Valley)','3','Aglipay'),
 (224,14,'Quirino Province','Luzon REGION II (Cagayan Valley)','3','Cabarraguis'),
 (225,14,'Quirino Province','Luzon REGION II (Cagayan Valley)','3','Diffun'),
 (226,14,'Quirino Province','Luzon REGION II (Cagayan Valley)','3','Maddela'),
 (227,14,'Quirino Province','Luzon REGION II (Cagayan Valley)','3','Nagtipuna'),
 (228,14,'Quirino Province','Luzon REGION II (Cagayan Valley)','3','Saguday'),
 (229,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Altavas'),
 (230,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Balete');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (231,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Banga'),
 (232,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Batan'),
 (233,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Buruanga'),
 (234,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Ibajay'),
 (235,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Kalibo'),
 (236,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Lezo'),
 (237,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Libacao'),
 (238,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Madalag'),
 (239,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Makato'),
 (240,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Malay'),
 (241,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Malinao'),
 (242,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Nabas'),
 (243,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','New Washington');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (244,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Numancia'),
 (245,38,'Aklan Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Tangalan'),
 (246,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Anini-y'),
 (247,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Barbaza'),
 (248,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Belison'),
 (249,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Bugasong'),
 (250,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Caluya'),
 (251,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Culasi'),
 (252,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Hamtic'),
 (253,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Laua-an'),
 (254,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Libertad'),
 (255,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Pandan'),
 (256,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Patnongon');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (257,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','San Jose de Buenavista'),
 (258,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','San Remigio'),
 (259,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Sebaste'),
 (260,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Sibalom'),
 (261,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Tibiao'),
 (262,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Tobias Fornier'),
 (263,39,'Antique Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Valderrama'),
 (264,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Cuartero'),
 (265,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Dao'),
 (266,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Dumalag'),
 (267,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Dumarao'),
 (268,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Ivisan');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (269,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Jamindan'),
 (270,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Maayon'),
 (271,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Mambusao'),
 (272,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Panay'),
 (273,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Panitan'),
 (274,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Pilar'),
 (275,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Pontevedra'),
 (276,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','President Roxas'),
 (277,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Roxas City'),
 (278,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Sapian'),
 (279,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Sigma'),
 (280,40,'Capiz Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Tapaz'),
 (281,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Ajuy');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (282,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Alimodian'),
 (283,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Anilao'),
 (284,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Badiangan'),
 (285,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Balasan'),
 (286,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Banate'),
 (287,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Barotac Nuevo'),
 (288,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Barotac Viejo'),
 (289,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Batad'),
 (290,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Bingawan'),
 (291,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Cabatuan'),
 (292,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Calinog'),
 (293,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Carles'),
 (294,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Conception');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (295,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Dingle'),
 (296,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Due¤as'),
 (297,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Dumangas'),
 (298,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Estancia'),
 (299,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Guimbal'),
 (300,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Igbaras'),
 (301,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Iloilo City'),
 (302,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Janiuay'),
 (303,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Lambunao'),
 (304,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Leganes'),
 (305,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Lemery'),
 (306,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Leon'),
 (307,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Maasin');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (308,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Miagao'),
 (309,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Mina'),
 (310,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','New Lucena'),
 (311,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Oton'),
 (312,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Passi'),
 (313,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Pavia'),
 (314,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Pototan'),
 (315,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','San Dionisio'),
 (316,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','San Enrique'),
 (317,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','San Joaquin'),
 (318,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','San Miguel'),
 (319,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','San Rafael'),
 (320,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Santa Barabara');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (321,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Sara'),
 (322,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Tigbauan'),
 (323,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Tubungan'),
 (324,41,'Iloilo Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Zarraga'),
 (325,42,'Guimaras Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Buenavista'),
 (326,42,'Guimaras Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Jordan'),
 (327,42,'Guimaras Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Nueva Valencia'),
 (328,42,'Guimaras Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','San Lorenzo'),
 (329,42,'Guimaras Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Sibunag'),
 (330,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Bacolod'),
 (331,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Bago'),
 (332,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Binalbagan');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (333,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Cadiz'),
 (334,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Calatrava'),
 (335,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Candoni'),
 (336,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Cauayan'),
 (337,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Enrique B. Magalona'),
 (338,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Escalante'),
 (339,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Himamaylan'),
 (340,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Hinigaran'),
 (341,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Hinoba-an'),
 (342,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Ilog'),
 (343,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Isabela');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (344,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Kabankalan'),
 (345,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','La Carlota'),
 (346,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','La Castellana'),
 (347,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Manapla'),
 (348,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Moises Padilla'),
 (349,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Murcia'),
 (350,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Pontevedra'),
 (351,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Pulunpandan'),
 (352,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Sagay'),
 (353,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Salavador Benedicto'),
 (354,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','San Carlos');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (355,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','San Enrique'),
 (356,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Silay'),
 (357,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Sipalay'),
 (358,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Talisay'),
 (359,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Toboso'),
 (360,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Valladolid'),
 (361,43,'Negros Occidental Province','VISAYAS REGION VI (WESTERN VISAYAS)','8','Victorias'),
 (362,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Alburquerque'),
 (363,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Alicia'),
 (364,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Anda'),
 (367,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Bilar'),
 (368,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Buenavista');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (369,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Calape'),
 (370,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Candijay'),
 (371,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Carmen'),
 (372,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Catigbian'),
 (373,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Clarin'),
 (374,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Corella'),
 (375,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Cortes'),
 (376,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Dagohoy'),
 (377,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Danao'),
 (378,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Dauis'),
 (379,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Dimiao'),
 (380,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Duero'),
 (381,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Garcia Hernandez');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (382,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Getafe'),
 (383,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Guindulman'),
 (384,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Inabanga'),
 (385,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Jagna'),
 (386,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Lila'),
 (387,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Loay'),
 (388,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Loboc'),
 (389,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Loon'),
 (390,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Mabini'),
 (391,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Maribojoc'),
 (392,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Panglao'),
 (393,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Pilar'),
 (394,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','President Carlos P. Garcia');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (395,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Sagbayan'),
 (396,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','San Isidro'),
 (397,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','San Miguel'),
 (398,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Sevilla'),
 (399,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Sierra'),
 (400,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Sierra Bullones'),
 (401,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Sikatuna'),
 (402,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Tagbilaran'),
 (403,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Talibon'),
 (404,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Trinidad'),
 (405,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Tubigon'),
 (406,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Ubay'),
 (407,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Valencia');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (408,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Alcantara'),
 (409,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Alcoy'),
 (410,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Alegria'),
 (411,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Aloguinsan'),
 (412,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Argao'),
 (413,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Asturias'),
 (414,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Badian'),
 (415,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Balamban'),
 (416,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Bantayan'),
 (417,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Barili'),
 (418,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Bogo'),
 (419,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Boljoon'),
 (420,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Borbon');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (421,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Carcar'),
 (422,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Carmen'),
 (423,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Catmon'),
 (424,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Cebu City'),
 (425,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Compostela'),
 (426,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Consolacion'),
 (427,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Cordova'),
 (428,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Daanbantayan'),
 (429,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Dalaguete'),
 (430,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Danao'),
 (431,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Dumanjug'),
 (432,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Ginatilan'),
 (433,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Lapu-Lapu');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (434,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Liloan'),
 (435,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Madridejos'),
 (436,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Nagtipuna'),
 (437,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Malabuyoc'),
 (438,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Mandaue'),
 (439,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Madellin'),
 (440,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Minglanilla'),
 (441,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Moalboal'),
 (442,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Naga'),
 (443,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Oslob'),
 (444,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Pilar'),
 (445,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Pinamungajan'),
 (446,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Poro');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (447,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Ronda'),
 (448,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Samboan'),
 (449,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','San Fernando'),
 (450,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','San Francisco'),
 (451,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','San Remigio'),
 (452,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Santa Fe'),
 (453,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Santander'),
 (454,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Sibonga'),
 (455,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Sogod'),
 (456,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Tabogon'),
 (457,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Tabuelan'),
 (458,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Talisay'),
 (459,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Toledo');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (460,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Tuburan'),
 (461,45,'Cebu Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Tudela'),
 (462,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Amlan'),
 (463,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Ayungon'),
 (464,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Bacong'),
 (465,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Bais'),
 (466,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Basay'),
 (467,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Bayawan'),
 (468,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Bindoy'),
 (469,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Canlaon'),
 (470,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Dauin'),
 (471,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Dumaguete');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (472,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Guihulngan'),
 (473,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Jimalalud'),
 (474,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','La Libertad'),
 (475,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Mabinay'),
 (476,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Manjuyod'),
 (477,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Pamplona'),
 (478,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','San Jose'),
 (479,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Santa Catalina'),
 (480,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Siaton'),
 (481,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Sibulan'),
 (482,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Tanjay');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (483,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Tayasan'),
 (484,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Valencia'),
 (485,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Vallerhermoso'),
 (486,46,'Negros Oriental Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Zamboanguita'),
 (487,47,'Siquijor Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Enrique Villanueva'),
 (489,47,'Siquijor Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Larena'),
 (490,47,'Siquijor Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Lazi'),
 (491,47,'Siquijor Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Maria'),
 (492,47,'Siquijor Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','San Juan'),
 (493,47,'Siquijor Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Siquijor'),
 (494,48,'Biliran Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Ameria'),
 (495,48,'Biliran Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Biliran');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (496,48,'Biliran Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Cabucgayan'),
 (497,48,'Biliran Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Caibiran'),
 (498,48,'Biliran Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Culaba'),
 (499,48,'Biliran Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Kawayan'),
 (500,48,'Biliran Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Maripipi'),
 (501,48,'Biliran Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Naval'),
 (502,49,'Eastern Samar Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Nagtipuna'),
 (503,50,'Leyte Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Nagtipuna'),
 (504,51,'Northern Samar Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Nagtipuna'),
 (505,52,'Samar (Western) Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Nagtipuna'),
 (506,53,'Southern Leyte Province','VISAYAS REGION VI (WESTERN VISAYAS)','10','Nagtipuna'),
 (3651,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Anteque');
INSERT INTO `cities` (`id`,`province_id`,`province`,`region`,`region_id`,`city`) VALUES 
 (3652,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Batuan'),
 (3661,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Baclayon'),
 (3662,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Baliliyan'),
 (3663,44,'Bohol Province','VISAYAS REGION VI (WESTERN VISAYAS)','9','Bien Unido');
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;


--
-- Definition of table `citizenships`
--

DROP TABLE IF EXISTS `citizenships`;
CREATE TABLE `citizenships` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `citizenship` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `citizenships`
--

/*!40000 ALTER TABLE `citizenships` DISABLE KEYS */;
INSERT INTO `citizenships` (`id`,`citizenship`) VALUES 
 (1,'Filipino');
/*!40000 ALTER TABLE `citizenships` ENABLE KEYS */;


--
-- Definition of table `communication_types`
--

DROP TABLE IF EXISTS `communication_types`;
CREATE TABLE `communication_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `communication_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `communication_types`
--

/*!40000 ALTER TABLE `communication_types` DISABLE KEYS */;
INSERT INTO `communication_types` (`id`,`communication_type`) VALUES 
 (1,'Television'),
 (6,'Radio'),
 (16,'Mobile Phone'),
 (19,'Fixed Phone'),
 (20,'Postal Address'),
 (21,'Email Address');
/*!40000 ALTER TABLE `communication_types` ENABLE KEYS */;


--
-- Definition of table `cooking_lighting_types`
--

DROP TABLE IF EXISTS `cooking_lighting_types`;
CREATE TABLE `cooking_lighting_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cooking_lighting_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cooking_lighting_types`
--

/*!40000 ALTER TABLE `cooking_lighting_types` DISABLE KEYS */;
INSERT INTO `cooking_lighting_types` (`id`,`cooking_lighting_type`) VALUES 
 (1,'Fuel/Power'),
 (2,'Electricity'),
 (3,'Gas'),
 (4,'Paraffin(Lantern)'),
 (5,'Paraffin(Tadooba)'),
 (6,'Candle Wax'),
 (7,'Firewood'),
 (8,'Cow Dung or Gas(reeds)'),
 (9,'Charcoal');
/*!40000 ALTER TABLE `cooking_lighting_types` ENABLE KEYS */;


--
-- Definition of table `disabilities`
--

DROP TABLE IF EXISTS `disabilities`;
CREATE TABLE `disabilities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `disability` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `disabilities`
--

/*!40000 ALTER TABLE `disabilities` DISABLE KEYS */;
INSERT INTO `disabilities` (`id`,`disability`) VALUES 
 (1,'Asthma (or other breathing problems)'),
 (2,'Blindness (& partial blindness)'),
 (3,'Deafness (& partial deafness)'),
 (4,'Diabetes'),
 (5,'Dizziness/Balance problems'),
 (6,'Epilepsy'),
 (7,'General Hearing Difficulty'),
 (8,'Mobility Problems'),
 (9,'Neurological Problems'),
 (10,'Paralysis'),
 (11,'Physical Weakness'),
 (12,'Speech Problems'),
 (13,'Seizures'),
 (14,'Age-Related Cognitive Decline'),
 (15,'Autism'),
 (16,'Depression'),
 (17,'Dyslexia'),
 (18,'Bipolar Disorder'),
 (19,'Emotionally Overwhelmed'),
 (20,'Panic Attacks'),
 (21,'Post Traumatic Stress Disorder (PTSD)'),
 (22,'Separation Anxiety'),
 (23,'Social Phobia'),
 (24,'Stress Problems'),
 (25,' mental retardation'),
 (26,'organic brain syndrome'),
 (27,' Specific Learning Disabilities');
/*!40000 ALTER TABLE `disabilities` ENABLE KEYS */;


--
-- Definition of table `disposal_methods`
--

DROP TABLE IF EXISTS `disposal_methods`;
CREATE TABLE `disposal_methods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `disposal_method` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `disposal_methods`
--

/*!40000 ALTER TABLE `disposal_methods` DISABLE KEYS */;
INSERT INTO `disposal_methods` (`id`,`disposal_method`) VALUES 
 (1,'Skip Bin'),
 (2,'Pit'),
 (3,'Heap'),
 (4,'Garden'),
 (5,'Burning');
/*!40000 ALTER TABLE `disposal_methods` ENABLE KEYS */;


--
-- Definition of table `educational_statuses`
--

DROP TABLE IF EXISTS `educational_statuses`;
CREATE TABLE `educational_statuses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `educational_status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `educational_statuses`
--

/*!40000 ALTER TABLE `educational_statuses` DISABLE KEYS */;
INSERT INTO `educational_statuses` (`id`,`educational_status`) VALUES 
 (1,'Never attended'),
 (2,'Left School'),
 (3,'Nursery'),
 (4,'Primary'),
 (5,'Post Primary'),
 (6,'Secondary'),
 (7,'Post Secondary'),
 (8,'A diploma course'),
 (9,'University'),
 (10,'Apprenticeship'),
 (11,'College Graduate'),
 (12,'Masterals');
/*!40000 ALTER TABLE `educational_statuses` ENABLE KEYS */;


--
-- Definition of table `floor_types`
--

DROP TABLE IF EXISTS `floor_types`;
CREATE TABLE `floor_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `floor_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `floor_types`
--

/*!40000 ALTER TABLE `floor_types` DISABLE KEYS */;
INSERT INTO `floor_types` (`id`,`floor_type`) VALUES 
 (1,'Concrete/Stone'),
 (4,'Bricks'),
 (5,'Cement screed'),
 (6,'Rammed earth'),
 (7,'Wood');
/*!40000 ALTER TABLE `floor_types` ENABLE KEYS */;


--
-- Definition of table `household_assets`
--

DROP TABLE IF EXISTS `household_assets`;
CREATE TABLE `household_assets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `qty` double DEFAULT NULL,
  `assets` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_assets`
--

/*!40000 ALTER TABLE `household_assets` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_assets` ENABLE KEYS */;


--
-- Definition of table `household_consumptions`
--

DROP TABLE IF EXISTS `household_consumptions`;
CREATE TABLE `household_consumptions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `consumption_date` date DEFAULT NULL,
  `items` text,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_consumptions`
--

/*!40000 ALTER TABLE `household_consumptions` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_consumptions` ENABLE KEYS */;


--
-- Definition of table `household_expenditures`
--

DROP TABLE IF EXISTS `household_expenditures`;
CREATE TABLE `household_expenditures` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `expenditure_date` date DEFAULT NULL,
  `fuel_expenses` double DEFAULT NULL,
  `internet_services` double DEFAULT NULL,
  `medical_expenses` double DEFAULT NULL,
  `cigarretes` double DEFAULT NULL,
  `hobbies_clubs` double DEFAULT NULL,
  `load_expenses` double DEFAULT NULL,
  `electric_gas_expenses` double DEFAULT NULL,
  `books_newspapers_expenses` double DEFAULT NULL,
  `gambling` double DEFAULT NULL,
  `personal_care` double DEFAULT NULL,
  `misc` double DEFAULT NULL,
  `alcohol` double DEFAULT NULL,
  `vacation` double DEFAULT NULL,
  `water_bill` double DEFAULT NULL,
  `cable_services` double DEFAULT NULL,
  `social_obligations` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_expenditures`
--

/*!40000 ALTER TABLE `household_expenditures` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_expenditures` ENABLE KEYS */;


--
-- Definition of table `household_member_competence_certificates`
--

DROP TABLE IF EXISTS `household_member_competence_certificates`;
CREATE TABLE `household_member_competence_certificates` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `household_member_no` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `certificate` varchar(255) DEFAULT NULL,
  `rating` varchar(255) DEFAULT NULL,
  `issued_by` varchar(255) DEFAULT NULL,
  `date_issued` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_member_competence_certificates`
--

/*!40000 ALTER TABLE `household_member_competence_certificates` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_competence_certificates` ENABLE KEYS */;


--
-- Definition of table `household_member_educational_backgrounds`
--

DROP TABLE IF EXISTS `household_member_educational_backgrounds`;
CREATE TABLE `household_member_educational_backgrounds` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `household_member_no` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `educational_status` varchar(255) DEFAULT NULL,
  `name_of_school` varchar(255) DEFAULT NULL,
  `achievements` varchar(255) DEFAULT NULL,
  `highest_grade` double DEFAULT NULL,
  `year_graduated` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_member_educational_backgrounds`
--

/*!40000 ALTER TABLE `household_member_educational_backgrounds` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_educational_backgrounds` ENABLE KEYS */;


--
-- Definition of table `household_member_employment_status`
--

DROP TABLE IF EXISTS `household_member_employment_status`;
CREATE TABLE `household_member_employment_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `household_member_no` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `employment_status` int(11) DEFAULT NULL,
  `employment_type` varchar(255) DEFAULT NULL,
  `unemployment_type` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `work_position` varchar(255) DEFAULT NULL,
  `work_description` varchar(255) DEFAULT NULL,
  `is_looking_for_work` int(11) DEFAULT NULL,
  `ofw_business_name` varchar(255) DEFAULT NULL,
  `ofw_business_address` varchar(255) DEFAULT NULL,
  `ofw_mailing_address` varchar(255) DEFAULT NULL,
  `ofw_type_of_business` varchar(255) DEFAULT NULL,
  `ofw_financial_assistance_amount` double DEFAULT NULL,
  `ofw_country` varchar(255) DEFAULT NULL,
  `ofw_job` varchar(255) DEFAULT NULL,
  `ofw_reason_for_migration` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_member_employment_status`
--

/*!40000 ALTER TABLE `household_member_employment_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_employment_status` ENABLE KEYS */;


--
-- Definition of table `household_member_health_statuses`
--

DROP TABLE IF EXISTS `household_member_health_statuses`;
CREATE TABLE `household_member_health_statuses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `household_member_no` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `is_seing_a_doctor` int(11) DEFAULT NULL,
  `health_status` int(11) DEFAULT NULL,
  `name_of_doctor` varchar(255) DEFAULT NULL,
  `disabilities` varchar(255) DEFAULT NULL,
  `level_of_disability` varchar(255) DEFAULT NULL,
  `cause_of_disability` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_member_health_statuses`
--

/*!40000 ALTER TABLE `household_member_health_statuses` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_health_statuses` ENABLE KEYS */;


--
-- Definition of table `household_member_licenses`
--

DROP TABLE IF EXISTS `household_member_licenses`;
CREATE TABLE `household_member_licenses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `household_member_no` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `expiry` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_member_licenses`
--

/*!40000 ALTER TABLE `household_member_licenses` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_licenses` ENABLE KEYS */;


--
-- Definition of table `household_member_medications`
--

DROP TABLE IF EXISTS `household_member_medications`;
CREATE TABLE `household_member_medications` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `household_member_no` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `prescription` varchar(255) DEFAULT NULL,
  `dosage` varchar(255) DEFAULT NULL,
  `medication_date_started` date DEFAULT NULL,
  `medication_date_ended` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_member_medications`
--

/*!40000 ALTER TABLE `household_member_medications` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_medications` ENABLE KEYS */;


--
-- Definition of table `household_member_prefered_works`
--

DROP TABLE IF EXISTS `household_member_prefered_works`;
CREATE TABLE `household_member_prefered_works` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `household_member_no` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `work` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_member_prefered_works`
--

/*!40000 ALTER TABLE `household_member_prefered_works` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_prefered_works` ENABLE KEYS */;


--
-- Definition of table `household_member_skills`
--

DROP TABLE IF EXISTS `household_member_skills`;
CREATE TABLE `household_member_skills` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `household_member_no` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `ps_teaching` int(11) DEFAULT NULL,
  `ps_negotiating` int(11) DEFAULT NULL,
  `ps_diverting` int(11) DEFAULT NULL,
  `ps_persuading` int(11) DEFAULT NULL,
  `ps_promoting` int(11) DEFAULT NULL,
  `ps_selling` int(11) DEFAULT NULL,
  `ps_leading` int(11) DEFAULT NULL,
  `ps_speaking` int(11) DEFAULT NULL,
  `ps_serving` int(11) DEFAULT NULL,
  `ps_helping` int(11) DEFAULT NULL,
  `ps_encouraging` int(11) DEFAULT NULL,
  `ps_motivating` int(11) DEFAULT NULL,
  `ds_coordinating` int(11) DEFAULT NULL,
  `ds_analyzing` int(11) DEFAULT NULL,
  `ds_planning` int(11) DEFAULT NULL,
  `ds_compiling` int(11) DEFAULT NULL,
  `ds_computing` int(11) DEFAULT NULL,
  `ds_recording` int(11) DEFAULT NULL,
  `ds_checking` int(11) DEFAULT NULL,
  `ds_researching` int(11) DEFAULT NULL,
  `ds_testing` int(11) DEFAULT NULL,
  `ds_comparing` int(11) DEFAULT NULL,
  `ds_tabulating` int(11) DEFAULT NULL,
  `ds_posting` int(11) DEFAULT NULL,
  `ds_copying` int(11) DEFAULT NULL,
  `ts_machine_work` int(11) DEFAULT NULL,
  `ts_setting_up` int(11) DEFAULT NULL,
  `ts_assembling` int(11) DEFAULT NULL,
  `ts_operating` int(11) DEFAULT NULL,
  `ts_driving` int(11) DEFAULT NULL,
  `ts_repairing` int(11) DEFAULT NULL,
  `ts_manipulating` int(11) DEFAULT NULL,
  `ts_materials_handling` int(11) DEFAULT NULL,
  `ts_producing` int(11) DEFAULT NULL,
  `ts_inspecting` int(11) DEFAULT NULL,
  `ts_warehousing` int(11) DEFAULT NULL,
  `ts_building` int(11) DEFAULT NULL,
  `ts_precision_working` int(11) DEFAULT NULL,
  `ts_restoring` int(11) DEFAULT NULL,
  `ts_feeding` int(11) DEFAULT NULL,
  `is_implementing` int(11) DEFAULT NULL,
  `is_synthesizing` int(11) DEFAULT NULL,
  `is_interpreting` int(11) DEFAULT NULL,
  `is_instruction` int(11) DEFAULT NULL,
  `is_speculating` int(11) DEFAULT NULL,
  `is_anticipating` int(11) DEFAULT NULL,
  `is_inventing` int(11) DEFAULT NULL,
  `is_discovering` int(11) DEFAULT NULL,
  `is_predicting` int(11) DEFAULT NULL,
  `is_theorizing` int(11) DEFAULT NULL,
  `is_innovating` int(11) DEFAULT NULL,
  `is_expressing` int(11) DEFAULT NULL,
  `is_organizing` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_member_skills`
--

/*!40000 ALTER TABLE `household_member_skills` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_skills` ENABLE KEYS */;


--
-- Definition of table `household_member_vocational_experiences`
--

DROP TABLE IF EXISTS `household_member_vocational_experiences`;
CREATE TABLE `household_member_vocational_experiences` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `household_member_no` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `name_of_training` varchar(255) DEFAULT NULL,
  `certificate_received` varchar(255) DEFAULT NULL,
  `skills_required` varchar(255) DEFAULT NULL,
  `name_of_school` varchar(255) DEFAULT NULL,
  `period_of_training` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_member_vocational_experiences`
--

/*!40000 ALTER TABLE `household_member_vocational_experiences` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_vocational_experiences` ENABLE KEYS */;


--
-- Definition of table `household_member_work_experiences`
--

DROP TABLE IF EXISTS `household_member_work_experiences`;
CREATE TABLE `household_member_work_experiences` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `household_member_no` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `company_address` varchar(255) DEFAULT NULL,
  `work_position` varchar(255) DEFAULT NULL,
  `work_description` varchar(255) DEFAULT NULL,
  `work_started` date DEFAULT NULL,
  `work_ended` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_member_work_experiences`
--

/*!40000 ALTER TABLE `household_member_work_experiences` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_work_experiences` ENABLE KEYS */;


--
-- Definition of table `household_members`
--

DROP TABLE IF EXISTS `household_members`;
CREATE TABLE `household_members` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `household_member_no` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `marital_status` varchar(255) DEFAULT NULL,
  `bday` date DEFAULT NULL,
  `occupancy_years` double DEFAULT NULL,
  `height` varchar(255) DEFAULT NULL,
  `weight` varchar(255) DEFAULT NULL,
  `birth_place` varchar(255) DEFAULT NULL,
  `present_address` varchar(255) DEFAULT NULL,
  `relation_to_household` varchar(255) DEFAULT NULL,
  `religion` varchar(255) DEFAULT NULL,
  `citizenship` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `blood_type` varchar(255) DEFAULT NULL,
  `languages_spoken` varchar(255) DEFAULT NULL,
  `is_registered_voter` int(11) DEFAULT NULL,
  `voters_id_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_members`
--

/*!40000 ALTER TABLE `household_members` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_members` ENABLE KEYS */;


--
-- Definition of table `household_positions`
--

DROP TABLE IF EXISTS `household_positions`;
CREATE TABLE `household_positions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `household_position` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `household_positions`
--

/*!40000 ALTER TABLE `household_positions` DISABLE KEYS */;
INSERT INTO `household_positions` (`id`,`household_position`) VALUES 
 (1,'Head'),
 (2,'Spouse'),
 (3,'Son/Daughter'),
 (4,'Grand Child'),
 (5,'Step Child'),
 (6,'Parent of Head or Spouse'),
 (7,'Nephew/Niece'),
 (8,'Other relatives'),
 (9,'Kasambahay');
/*!40000 ALTER TABLE `household_positions` ENABLE KEYS */;


--
-- Definition of table `households`
--

DROP TABLE IF EXISTS `households`;
CREATE TABLE `households` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `household_no` varchar(255) DEFAULT NULL,
  `occupancy_types` varchar(255) DEFAULT NULL,
  `tenure` varchar(255) DEFAULT NULL,
  `is_occupant_owns_the_land` int(11) DEFAULT NULL,
  `is_occupant_owns_the_bldg` int(11) DEFAULT NULL,
  `monthly_rental` double DEFAULT NULL,
  `drainage_system_concern` varchar(255) DEFAULT NULL,
  `street_maintenance_concern` varchar(255) DEFAULT NULL,
  `garbage_collection_concern` varchar(255) DEFAULT NULL,
  `fire_protection_concern` varchar(255) DEFAULT NULL,
  `police_protection_concern` varchar(255) DEFAULT NULL,
  `ambulance_service_concern` varchar(255) DEFAULT NULL,
  `livelihood_programs_concern` varchar(255) DEFAULT NULL,
  `adolescent_pregnancy_rate` varchar(255) DEFAULT NULL,
  `child_abuse_rating` varchar(255) DEFAULT NULL,
  `crime_rating` varchar(255) DEFAULT NULL,
  `domestic_violence_rating` varchar(255) DEFAULT NULL,
  `drug_abuse_rating` varchar(255) DEFAULT NULL,
  `hunger_rating` varchar(255) DEFAULT NULL,
  `environmental_contamination_rating` varchar(255) DEFAULT NULL,
  `health_disparities_rating` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `households`
--

/*!40000 ALTER TABLE `households` DISABLE KEYS */;
/*!40000 ALTER TABLE `households` ENABLE KEYS */;


--
-- Definition of table `houses`
--

DROP TABLE IF EXISTS `houses`;
CREATE TABLE `houses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `region_id` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `barangay_id` varchar(255) DEFAULT NULL,
  `purok` varchar(255) DEFAULT NULL,
  `purok_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `house_no` varchar(255) DEFAULT NULL,
  `no_of_rooms` int(11) DEFAULT NULL,
  `bldg_types` varchar(255) DEFAULT NULL,
  `bldg_permit` varchar(255) DEFAULT NULL,
  `toilet_types` varchar(255) DEFAULT NULL,
  `compartments` varchar(255) DEFAULT NULL,
  `bathroom_types` varchar(255) DEFAULT NULL,
  `waste_disposal_methods` varchar(255) DEFAULT NULL,
  `kitchen_types` varchar(255) DEFAULT NULL,
  `trans_types` varchar(255) DEFAULT NULL,
  `construction_roof_types` varchar(255) DEFAULT NULL,
  `construction_wall_types` varchar(255) DEFAULT NULL,
  `construction_floor_types` varchar(255) DEFAULT NULL,
  `construction_communication_types` varchar(255) DEFAULT NULL,
  `lighting_fuels` varchar(255) DEFAULT NULL,
  `cooking_fuels` varchar(255) DEFAULT NULL,
  `water_sources` varchar(255) DEFAULT NULL,
  `drinking_water_source_distance` double DEFAULT NULL,
  `nearest_water_source_distance` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `houses`
--

/*!40000 ALTER TABLE `houses` DISABLE KEYS */;
/*!40000 ALTER TABLE `houses` ENABLE KEYS */;


--
-- Definition of table `kitchen_types`
--

DROP TABLE IF EXISTS `kitchen_types`;
CREATE TABLE `kitchen_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kitchen_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kitchen_types`
--

/*!40000 ALTER TABLE `kitchen_types` DISABLE KEYS */;
INSERT INTO `kitchen_types` (`id`,`kitchen_type`) VALUES 
 (1,'Inside'),
 (2,'Outside (built)'),
 (3,'Outside (makeshift)'),
 (4,'None');
/*!40000 ALTER TABLE `kitchen_types` ENABLE KEYS */;


--
-- Definition of table `marital_statuses`
--

DROP TABLE IF EXISTS `marital_statuses`;
CREATE TABLE `marital_statuses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `marital_status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marital_statuses`
--

/*!40000 ALTER TABLE `marital_statuses` DISABLE KEYS */;
/*!40000 ALTER TABLE `marital_statuses` ENABLE KEYS */;


--
-- Definition of table `professions`
--

DROP TABLE IF EXISTS `professions`;
CREATE TABLE `professions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `profession` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1930 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `professions`
--

/*!40000 ALTER TABLE `professions` DISABLE KEYS */;
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (3,'Abbot Abbess'),
 (4,'Acater'),
 (5,'Accipitary'),
 (6,'Accomptant'),
 (7,'Accoucheur  Accoucheuse'),
 (8,'Accountant'),
 (9,'Accoutre'),
 (10,'Accoutrement Maker'),
 (11,'Ackerman'),
 (12,'Actor  Actress'),
 (13,'Actuary'),
 (14,'Administrator'),
 (15,'Adventurer Archaeologist'),
 (16,'Aerospace Engineer'),
 (17,'Agent'),
 (18,'Agriculturist'),
 (19,'Air Traffic Controller'),
 (20,'Airman'),
 (21,'Alabasterer'),
 (22,'Alchemist'),
 (23,'Ale Conner'),
 (24,'Ale Draper'),
 (25,'Ale Taster'),
 (26,'Ale Tunner'),
 (27,'Alewife'),
 (28,'Alienist'),
 (29,'All Spice'),
 (30,'Almoner'),
 (31,'Almsman'),
 (32,'Alnager'),
 (33,'Amanuensis'),
 (34,'Amber Cutter'),
 (35,'Anaesthetist'),
 (36,'Anchor Smith'),
 (37,'Anchorite Anchoress'),
 (38,'Anchorman'),
 (39,'Animal Trainer'),
 (40,'Animator'),
 (41,'Ankle Beater'),
 (42,'Annatto Maker'),
 (43,'Anthropologist'),
 (44,'Antigropelos Maker'),
 (45,'Antiquarian'),
 (46,'Anvil Smith'),
 (47,'Apiariana'),
 (48,'Apothecary');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (49,'Apprentice'),
 (50,'Apronman'),
 (51,'Aquavita Seller'),
 (52,'Arbalestier'),
 (53,'Arbiter'),
 (54,'Archaeologist'),
 (55,'Archbishop'),
 (56,'Archer'),
 (57,'Archiator'),
 (58,'Architect'),
 (59,'Archivist'),
 (60,'Argolet'),
 (61,'Arkwright'),
 (62,'Armiger'),
 (63,'Armorer'),
 (64,'Army Reservist'),
 (65,'Army Scout'),
 (66,'Arpenteur'),
 (67,'Art Deco Designer Or Architect'),
 (68,'Artificer'),
 (69,'Artisan'),
 (70,'Artist'),
 (71,'Ashman'),
 (72,'Assay Master'),
 (73,'Assayer'),
 (74,'Astrobiologist'),
 (75,'Astrologer'),
 (76,'Astronaut'),
 (77,'Astronomer'),
 (78,'Athletic Trainer'),
 (79,'Attendent'),
 (80,'Auger Maker'),
 (81,'Aulnager'),
 (82,'Aurifaber'),
 (83,'Aurifex'),
 (84,'Author'),
 (85,'Automobile Salesman'),
 (86,'Automotive Mechanic'),
 (87,'Avenator'),
 (88,'Aviation Pioneer'),
 (89,'Avowry'),
 (90,'Axle Tree Turner'),
 (91,'Babysitter'),
 (92,'Back\'us Boy'),
 (93,'Backmaker'),
 (94,'Backster'),
 (95,'Badger'),
 (96,'Badgy Fiddler');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (97,'Bagger'),
 (98,'Bagman'),
 (99,'Bagniokeeper'),
 (100,'Bailiff'),
 (101,'Bairman'),
 (102,'Baker'),
 (103,'Balancemaker'),
 (104,'Balancer'),
 (105,'Baler'),
 (106,'Ballad Monger'),
 (107,'Ballast Heaver'),
 (108,'Baller Up'),
 (109,'Band Filer'),
 (110,'Bandit'),
 (111,'Bandito'),
 (112,'Bandster'),
 (113,'Bang Beggar'),
 (114,'Bank Robber'),
 (115,'Bank Teller'),
 (116,'Banker'),
 (117,'Banks Man'),
 (118,'Banqueter'),
 (119,'Barber-Chirurgeon - See The Barber'),
 (120,'Barber'),
 (121,'Bard'),
 (122,'Bargeman'),
 (123,'Barkeeper'),
 (124,'Barker'),
 (125,'Barkman'),
 (126,'Barm Brewer'),
 (127,'Barrel Filer'),
 (128,'Barrister'),
 (129,'Bartender (See Also The Bartender)'),
 (130,'Bartoner'),
 (131,'Baseball Player'),
 (132,'Basil Worker'),
 (133,'Basketmaker'),
 (134,'Basketman'),
 (135,'Bassoonist'),
 (136,'Bath Attendent'),
 (137,'Bather (Profession)'),
 (138,'Bathing Machine Proprietor'),
 (139,'Batman'),
 (140,'Battledore Maker'),
 (141,'Bawd');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (142,'Baxter'),
 (143,'Bayweaver'),
 (144,'Beadle'),
 (145,'Beamster'),
 (146,'Bear-Ward'),
 (147,'Bearleader'),
 (148,'Beauty Queen'),
 (149,'Beauty Therapist'),
 (150,'Beaver'),
 (151,'Bedder'),
 (152,'Bedman'),
 (153,'Bedweaver'),
 (154,'Beekeeper'),
 (155,'Beer Seller'),
 (156,'Beerbrewer'),
 (157,'Beeskepmaker'),
 (158,'Beggar'),
 (159,'Beguine'),
 (160,'Bell Founder'),
 (161,'Bell Hanger'),
 (162,'Bell Ringer'),
 (163,'Bellfounder'),
 (164,'Bellhop'),
 (165,'Bellmaker'),
 (166,'Bellman'),
 (167,'Bellowfarmer'),
 (168,'Bellows Maker'),
 (169,'Belly Builder'),
 (170,'Bender'),
 (171,'Berner'),
 (172,'Besom Maker'),
 (173,'Bibliothecary'),
 (174,'Bid-Stand'),
 (175,'Biddy'),
 (176,'Bill Poster'),
 (177,'Billier'),
 (178,'Binder'),
 (179,'Biologist'),
 (180,'Bird Boy'),
 (181,'Bird Catcher'),
 (182,'Birds Nest Seller'),
 (183,'Bishop'),
 (184,'Black Borderer'),
 (185,'Blacking Maker'),
 (186,'Blacksmith-Armorer'),
 (187,'Blacksmith'),
 (188,'Bladesmith');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (189,'Bleacher'),
 (190,'Blemmere'),
 (191,'Block Maker'),
 (192,'Block Printer'),
 (193,'Blockcutter'),
 (194,'Bloodletter'),
 (195,'Bloomer'),
 (196,'Blower (Glass)'),
 (197,'Blower (Smith)'),
 (198,'Blower (Textile)'),
 (199,'Bluestocking'),
 (200,'Bluffer'),
 (201,'Boarding Officer'),
 (202,'Boardwright'),
 (203,'Boatman'),
 (204,'Boatswain'),
 (205,'Boatwright'),
 (206,'Bobber (Fisherman)'),
 (207,'Bobber (Metalworker)'),
 (208,'Bocher'),
 (209,'Bodeys Maker'),
 (210,'Bodger'),
 (211,'Bodyguard'),
 (212,'Bodyservant'),
 (213,'Boiler Plater'),
 (214,'Boilermaker'),
 (215,'Bolter'),
 (216,'Bondager'),
 (217,'Bondman'),
 (218,'Bone Button Turner'),
 (219,'Bone Lace Maker'),
 (220,'Bone Picker'),
 (221,'Bonecarver'),
 (222,'Bonesetter'),
 (223,'Boniface'),
 (224,'Book Guilder'),
 (225,'Bookbinder'),
 (226,'Bookkeeper'),
 (227,'Bookprinter'),
 (228,'Bookseller'),
 (229,'Boonmaster'),
 (230,'Boot Closer'),
 (231,'Boot-Catcher'),
 (232,'Bootbinder'),
 (233,'Boothaler');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (234,'Boothman'),
 (235,'Bootlegger'),
 (236,'Borlera'),
 (237,'Botanist'),
 (238,'Botcher'),
 (239,'Bottelier'),
 (240,'Bottle Boy'),
 (241,'Bouncer'),
 (242,'Bounty Hunter'),
 (243,'Bowler'),
 (244,'Bowlman'),
 (245,'Bowman'),
 (246,'Bowyer'),
 (247,'Brabener'),
 (248,'Brachygrapher'),
 (249,'Brakesman'),
 (250,'Brasiator'),
 (251,'Brass Cutter'),
 (252,'Brass Finisher'),
 (253,'Brass Founder'),
 (254,'Brayer'),
 (255,'Brazier (Occupation)'),
 (256,'Brazier'),
 (257,'Breach Maker'),
 (258,'Breechesmaker'),
 (259,'Brewer'),
 (260,'Brewster'),
 (261,'Brickburner'),
 (262,'Bricker'),
 (263,'Bricklayer'),
 (264,'Brickmaker'),
 (265,'Brickman'),
 (266,'Bridewell Keeper'),
 (267,'Bridgeman'),
 (268,'Brightsmith'),
 (269,'Broad Cooper'),
 (270,'Broadcloth Weaver'),
 (271,'Broderer'),
 (272,'Brogger'),
 (273,'Broiderer'),
 (274,'Bronzefounder'),
 (275,'Broom Dasher'),
 (276,'Broom Squire'),
 (277,'Broom-Dasher'),
 (278,'Browderer'),
 (279,'Brownsmith'),
 (280,'Brushbinder');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (281,'Buck Washer'),
 (282,'Buckle Maker'),
 (283,'Buckle Tongue Maker'),
 (284,'Bucklesmith'),
 (285,'Buffoon'),
 (286,'Builder'),
 (287,'Bullwhacker'),
 (288,'Bumboat Man'),
 (289,'Bunter'),
 (290,'Burglar'),
 (291,'Burgomaster'),
 (292,'Burler'),
 (293,'Burlesque Performer'),
 (294,'Burmaiden'),
 (295,'Buryeman'),
 (296,'Busheler'),
 (297,'Business'),
 (298,'Businessman'),
 (299,'Busker'),
 (300,'Buss Maker'),
 (301,'Butcher'),
 (302,'Butler'),
 (303,'Butner'),
 (304,'Button Burnisher'),
 (305,'Buttonmaker'),
 (306,'Cab Driver'),
 (307,'Cabbie'),
 (308,'Cabinetmaker'),
 (309,'Cad'),
 (310,'Caddy Butcher'),
 (311,'Cadger'),
 (312,'Cainer'),
 (313,'Calciner'),
 (314,'Calculator (Profession)'),
 (315,'Calender'),
 (316,'Calligrapher'),
 (317,'Cambist'),
 (318,'Cambric Maker'),
 (319,'Cameraman'),
 (320,'Camerist'),
 (321,'Camp Cook'),
 (322,'Camp Counsellor'),
 (323,'Camp Follower'),
 (324,'Campaner'),
 (325,'Canadian Mountie'),
 (326,'Canaller'),
 (327,'Candler');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (328,'Candy Man'),
 (329,'Caner'),
 (330,'Cannoneer'),
 (331,'Cannonsmith'),
 (332,'Canon'),
 (333,'Canter'),
 (334,'Canting Caller'),
 (335,'Cantor'),
 (336,'Canvaser'),
 (337,'Canvasser'),
 (338,'Cape Merchant'),
 (339,'Caper'),
 (340,'Captain Of The Guard'),
 (341,'Captain'),
 (342,'Car Designer'),
 (343,'Carder'),
 (344,'Cardinal'),
 (345,'Cardiologist'),
 (346,'Cardmaker (Playing Cards)'),
 (347,'Cardmaker (Wooler)'),
 (348,'Cardmaker'),
 (349,'Carman'),
 (350,'Carnifex'),
 (351,'Carpenter-Joiner'),
 (352,'Carpenter'),
 (353,'Carriage Driver'),
 (354,'Cart Wheeler'),
 (355,'Carter'),
 (356,'Carter'),
 (357,'Cartier'),
 (358,'Cartographer'),
 (359,'Cartoonist'),
 (360,'Cartwright'),
 (361,'Cartwright'),
 (362,'Carver'),
 (363,'Cashier'),
 (364,'Castor'),
 (365,'Castrator'),
 (366,'Catchpole'),
 (367,'Cathar Perfect'),
 (368,'Cattle Baron'),
 (369,'Cattle Jobber'),
 (370,'Cattle Rustler (See Also The Rustler)'),
 (371,'Caulker'),
 (372,'Cavalry Officer');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (373,'Cbdo (Chief Business Development Officer)'),
 (374,'Cdo (Chief Design Officer)'),
 (375,'Ceiler'),
 (376,'Cellarer'),
 (377,'Cellarman'),
 (378,'Cellist'),
 (379,'Ceo (Chief Executive Officer)'),
 (380,'Cfo (Chief Financial Officer)'),
 (381,'Chafferer'),
 (382,'Chainmaker'),
 (383,'Chaise Maker'),
 (384,'Chaloner'),
 (385,'Chamberlain'),
 (386,'Chambermaid'),
 (387,'Chambermaster'),
 (388,'Chancellor'),
 (389,'Chandler'),
 (390,'Chantry Priest'),
 (391,'Chanty Man'),
 (392,'Chapeler'),
 (393,'Chaplain'),
 (394,'Chapman'),
 (395,'Charcoal Burner'),
 (396,'Charcoalburner'),
 (397,'Charlatan'),
 (398,'Charwoman'),
 (399,'Chaser'),
 (400,'Chauffeur'),
 (401,'Cheese Monger'),
 (402,'Cheesemaker'),
 (403,'Chef'),
 (404,'Chemical Technologist'),
 (405,'Chemist'),
 (406,'Chicken Butcher'),
 (407,'Chief Of Police'),
 (408,'Chiffonier'),
 (409,'Chimney Sweep'),
 (410,'Chinese Launderer'),
 (411,'Chirurgeon'),
 (412,'Chronologist'),
 (413,'Church Usher'),
 (414,'Cio (Chief Information Officer)');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (415,'Circuit Judge'),
 (416,'Circuit Preacher'),
 (417,'Circus Performer'),
 (418,'Civil Engineer'),
 (419,'Civil Servant'),
 (420,'Claim Jumper'),
 (421,'Clarinetist'),
 (422,'Clark'),
 (423,'Cleaner'),
 (424,'Clerk'),
 (425,'Clicker'),
 (426,'Clockmaker'),
 (427,'Clod-Hopper'),
 (428,'Clogger'),
 (429,'Clothier'),
 (430,'Clouter'),
 (431,'Clower'),
 (432,'Cmo (Chief Marketing Officer)'),
 (433,'Coach'),
 (434,'Coachmaker'),
 (435,'Coachman'),
 (436,'Coal Heaver'),
 (437,'Coalman'),
 (438,'Coaly'),
 (439,'Coast Guard'),
 (440,'Cobbler'),
 (441,'Cobbler'),
 (442,'Cockfeeder'),
 (443,'Codman'),
 (444,'Cogmen'),
 (445,'Coillor'),
 (446,'Coiner'),
 (447,'Coistsell'),
 (448,'Collar Maker'),
 (449,'College Co-Ed'),
 (450,'Collier'),
 (451,'Colporteur'),
 (452,'Columnist'),
 (453,'Combmaker'),
 (454,'Comedian'),
 (455,'Company Secretary'),
 (456,'Compasssmith'),
 (457,'Composer'),
 (458,'Computer Programmer'),
 (459,'Con Man'),
 (460,'Concierge'),
 (461,'Conductor (Music)');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (462,'Coney Catcher'),
 (463,'Confectioner'),
 (464,'Confectionery'),
 (465,'Conman'),
 (466,'Connor'),
 (467,'Constable'),
 (468,'Construction Engineer'),
 (469,'Construction Worker'),
 (470,'Consul'),
 (471,'Consultant'),
 (472,'Contract Killer'),
 (473,'Contractor'),
 (474,'Cook'),
 (475,'Cooper'),
 (476,'Copeman'),
 (477,'Coper'),
 (478,'Coppersmith'),
 (479,'Copyist'),
 (480,'Corder'),
 (481,'Cordwainer'),
 (482,'Cork Cutter'),
 (483,'Corn Cutter'),
 (484,'Coroner'),
 (485,'Correctional Officer'),
 (486,'Corrector'),
 (487,'Corsetier'),
 (488,'Cosmetologist'),
 (489,'Cosmonaut'),
 (490,'Costermonger'),
 (491,'Costermonger'),
 (492,'Costume Designer'),
 (493,'Cotyler'),
 (494,'Couper'),
 (495,'Couranteer'),
 (496,'Courier'),
 (497,'Court Jester'),
 (498,'Court Reporter'),
 (499,'Court Wizard'),
 (500,'Courtesan'),
 (501,'Courtier'),
 (502,'Cowboy'),
 (503,'Cowgirl'),
 (504,'Cowherd'),
 (505,'Cowper'),
 (506,'Cowpoke'),
 (507,'Cpa (Certified Public Accountant)'),
 (508,'Cracker Boy');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (509,'Craftiman'),
 (510,'Craftsman'),
 (511,'Craftswoman'),
 (512,'Cramer'),
 (513,'Crate Man'),
 (514,'Creative Engineering'),
 (515,'Criminal'),
 (516,'Crimpet Maker'),
 (517,'Critic'),
 (518,'Crocker'),
 (519,'Crofter'),
 (520,'Crookmaker'),
 (521,'Cropper'),
 (522,'Crossbowman'),
 (523,'Crowner'),
 (524,'Cryptographer'),
 (525,'Cryptozoologist'),
 (526,'Crystallographer'),
 (527,'Cto (Chief Technology Officer)'),
 (528,'Curate'),
 (529,'Curator'),
 (530,'Curer'),
 (531,'Currier'),
 (532,'Custodian'),
 (533,'Customs Officer'),
 (534,'Cutler'),
 (535,'Cutpurse'),
 (536,'Dairymaid'),
 (537,'Dairyman'),
 (538,'Damster'),
 (539,'Dancer'),
 (540,'Dapifer'),
 (541,'Database Administrator (Dba)'),
 (542,'Day Laborer'),
 (543,'Dean'),
 (544,'Decoyman'),
 (545,'Deep Cover Agent'),
 (546,'Delver'),
 (547,'Delver'),
 (548,'Dentist'),
 (549,'Deputy (Law Enforcement)'),
 (550,'Deputy (Parliamentary)'),
 (551,'Dermatologist'),
 (552,'Designer'),
 (553,'Detective');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (554,'Determined Homesteader'),
 (555,'Diamantaire'),
 (556,'Dictator'),
 (557,'Dietician'),
 (558,'Diker'),
 (559,'Dilettante'),
 (560,'Diplomat'),
 (561,'Director'),
 (562,'Disc Jockey'),
 (563,'Dish Thrower'),
 (564,'Dish Turner'),
 (565,'Disher'),
 (566,'Dispatcher'),
 (567,'Distiller'),
 (568,'Ditcher'),
 (569,'Diver (Criminal)'),
 (570,'Diver'),
 (571,'Dock Labourer'),
 (572,'Dock Master'),
 (573,'Docker'),
 (574,'Doctor Of Medicine'),
 (575,'Doctor'),
 (576,'Dog Breaker'),
 (577,'Dog Leech'),
 (578,'Dog Trainer'),
 (579,'Dog Walker'),
 (580,'Domainer'),
 (581,'Domesman'),
 (582,'Domestic Worker'),
 (583,'Dominatrix'),
 (584,'Door-Keeper'),
 (585,'Doorman'),
 (586,'Dowser'),
 (587,'Draftsman'),
 (588,'Drainer'),
 (589,'Dramatist'),
 (590,'Dramaturg'),
 (591,'Draper'),
 (592,'Drawer'),
 (593,'Drayman'),
 (594,'Dresser'),
 (595,'Dressmaker'),
 (596,'Drill Instructor'),
 (597,'Driver'),
 (598,'Drover'),
 (599,'Drummer'),
 (600,'Drycooper'),
 (601,'Drysalter');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (602,'Drywaller'),
 (603,'Dude Ranch Cowboy'),
 (604,'Duffer'),
 (605,'Dung Carter'),
 (606,'Dustman'),
 (607,'Dyer'),
 (608,'Earer'),
 (609,'Ecologist'),
 (610,'Economist'),
 (611,'Editor'),
 (612,'Educationalist'),
 (613,'Educator'),
 (614,'Eggler'),
 (615,'Egyptologist'),
 (616,'Electrical Engineer'),
 (617,'Electrician'),
 (618,'Elevator Mechanic'),
 (619,'Elymaker'),
 (620,'Embalmer'),
 (621,'Embosser'),
 (622,'Embroiderer'),
 (623,'Emperor'),
 (624,'Empresario'),
 (625,'Emptor'),
 (626,'Engine Driver'),
 (627,'Engineer'),
 (628,'Engraver'),
 (629,'Entomologist'),
 (630,'Entrepreneur'),
 (631,'Enumerator'),
 (632,'Environmental Scientist'),
 (633,'Eremite'),
 (634,'Ergonomist'),
 (635,'Escort'),
 (636,'Essence Peddler'),
 (637,'Estimator'),
 (638,'Etcher'),
 (639,'Ethnologist'),
 (640,'Ethologist'),
 (641,'Evangelist'),
 (642,'Exchequer'),
 (643,'Exciseman'),
 (644,'Executioner'),
 (645,'Executive'),
 (646,'Exobiologist'),
 (647,'Exotic Dancer'),
 (648,'Explorer');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (649,'Expressman'),
 (650,'Exterminator'),
 (651,'Extra'),
 (652,'Eyer'),
 (653,'Fabricshearer'),
 (654,'Factor'),
 (655,'Factory Worker'),
 (656,'Fagetter'),
 (657,'Falconer'),
 (658,'Famulus'),
 (659,'Fanner'),
 (660,'Farmer'),
 (661,'Farrier'),
 (662,'Fashion Designer'),
 (663,'Fashioner'),
 (664,'Father'),
 (665,'Fbi Agent'),
 (666,'Fbi Special Agent'),
 (667,'Feather-Beater'),
 (668,'Feather-Dresser'),
 (669,'Featherman'),
 (670,'Feller'),
 (671,'Fellmonger'),
 (672,'Felter'),
 (673,'Feltmaker'),
 (674,'Fence (Criminal)'),
 (675,'Fence Viewer'),
 (676,'Fence'),
 (677,'Ferrer'),
 (678,'Ferryman'),
 (679,'Fewterer'),
 (680,'Fewtrer'),
 (681,'Fiddler'),
 (682,'Fighter Pilot'),
 (683,'Film Director'),
 (684,'Film Producer'),
 (685,'Financial Adviser'),
 (686,'Financial Manager'),
 (687,'Financier'),
 (688,'Fire Marshal'),
 (689,'Fire Safety Officer'),
 (690,'Firefighter'),
 (691,'First Mate'),
 (692,'Fish Fag'),
 (693,'Fisherman'),
 (694,'Fishmonger');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (695,'Fitter'),
 (696,'Flavorist'),
 (697,'Flax Dresser'),
 (698,'Flesher'),
 (699,'Fleshmonger'),
 (700,'Fletcher'),
 (701,'Flight Attendant'),
 (702,'Flight Instructor'),
 (703,'Floater'),
 (704,'Floor Manager'),
 (705,'Florist'),
 (706,'Fluffer'),
 (707,'Flusherman'),
 (708,'Flutist'),
 (709,'Flying Stationer'),
 (710,'Fogger'),
 (711,'Food Critic'),
 (712,'Fool'),
 (713,'Foot-Boy'),
 (714,'Foot-Maiden'),
 (715,'Footballer'),
 (716,'Footman'),
 (717,'Footpad'),
 (718,'Foreman'),
 (719,'Forensic Pathologist'),
 (720,'Forestaller'),
 (721,'Forester'),
 (722,'Forger'),
 (723,'Former Film Star'),
 (724,'Fortune Teller'),
 (725,'Forty Niner'),
 (726,'Fossetmaker'),
 (727,'Foundryman'),
 (728,'Fowler'),
 (729,'Frame Spinner'),
 (730,'Freibauer'),
 (731,'Fresco Painter'),
 (732,'Friar'),
 (733,'Fringemaker'),
 (734,'Fripperer'),
 (735,'Friseur'),
 (736,'Fruiterer'),
 (737,'Fruitestere'),
 (738,'Fruitier'),
 (739,'Fueller'),
 (740,'Fulker'),
 (741,'Fuller');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (742,'Furbisher'),
 (743,'Furner'),
 (744,'Furniture Maker'),
 (745,'Furrier'),
 (746,'Fustian Weaver'),
 (747,'G-Man'),
 (748,'Gaffer'),
 (749,'Gambler (See Also The Gambler)'),
 (750,'Game Designer'),
 (751,'Gamekeeper'),
 (752,'Gangrel'),
 (753,'Gangster'),
 (754,'Ganneker'),
 (755,'Gaoler'),
 (756,'Garcion'),
 (757,'Gardener'),
 (758,'Gastroenterologist'),
 (759,'Gater'),
 (760,'Gatward'),
 (761,'Gaunter'),
 (762,'Gelder'),
 (763,'Gemcutter'),
 (764,'Genealogist'),
 (765,'General'),
 (766,'Gentleman\'s Gentleman'),
 (767,'Geographer'),
 (768,'Geologist'),
 (769,'Geometer'),
 (770,'Geophysicist'),
 (771,'Gilder'),
 (772,'Gillie'),
 (773,'Ginour'),
 (774,'Girdler'),
 (775,'Glass Seller'),
 (776,'Glassblower'),
 (777,'Glasspainter'),
 (778,'Glazier'),
 (779,'Glover'),
 (780,'Goatherd'),
 (781,'Goldbeater'),
 (782,'Goldsmith'),
 (783,'Gong Farmer'),
 (784,'Goose Herd'),
 (785,'Goose Herder'),
 (786,'Government Agent'),
 (787,'Governor'),
 (788,'Grace Wife');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (789,'Graffer'),
 (790,'Grainer'),
 (791,'Grammarian'),
 (792,'Granger'),
 (793,'Graphic Artist'),
 (794,'Graphic Designer'),
 (795,'Gravedigger'),
 (796,'Graver'),
 (797,'Graverobber'),
 (798,'Grazier'),
 (799,'Greengrocer'),
 (800,'Greensmith'),
 (801,'Grenadier'),
 (802,'Grinder (Occupation)'),
 (803,'Grinder'),
 (804,'Grocer'),
 (805,'Groom'),
 (806,'Guardian Ad Litem'),
 (807,'Guardsman'),
 (808,'Guide'),
 (809,'Guild Master'),
 (810,'Guitarist'),
 (811,'Gummer'),
 (812,'Gumshoe Detective'),
 (813,'Gun Moll'),
 (814,'Gunner'),
 (815,'Gunslinger'),
 (816,'Gunsmith'),
 (817,'Gunstocker'),
 (818,'Gynecologist'),
 (819,'Haberdasher'),
 (820,'Hacker'),
 (821,'Hackner'),
 (822,'Hackney Man'),
 (823,'Hairdresser'),
 (824,'Hairweaver'),
 (825,'Halberdier'),
 (826,'Hand Woman'),
 (827,'Handyman'),
 (828,'Harberdasher'),
 (829,'Harbourmaster'),
 (830,'Harlot'),
 (831,'Harness Maker'),
 (832,'Harper'),
 (833,'Harpist'),
 (834,'Hatcheler'),
 (835,'Hatmaker');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (836,'Hatter'),
 (837,'Hawker'),
 (838,'Hay Merchant'),
 (839,'Haymonger'),
 (840,'Hayward'),
 (841,'Headmaster'),
 (842,'Headmistress'),
 (843,'Hedger'),
 (844,'Heelmaker'),
 (845,'Henchman'),
 (846,'Herald'),
 (847,'Herbalist'),
 (848,'Herder'),
 (849,'Hermit'),
 (850,'Herpetologist'),
 (851,'Hetheleder'),
 (852,'Hewer'),
 (853,'Higger'),
 (854,'Highwayman'),
 (855,'Hind'),
 (856,'Hired Gun'),
 (857,'Historian'),
 (858,'Historiographer'),
 (859,'Hit Man'),
 (860,'Hobbler'),
 (861,'Hobo'),
 (862,'Hod'),
 (863,'Hodman'),
 (864,'Hoggard'),
 (865,'Homoeopath'),
 (866,'Hooper'),
 (867,'Horner'),
 (868,'Horner'),
 (869,'Horse Coper'),
 (870,'Horse Courser'),
 (871,'Horse Leech'),
 (872,'Horse Rustler (See Also The Rustler)'),
 (873,'Horse Trainer'),
 (874,'Horse-Capper'),
 (875,'Horseleech'),
 (876,'Hosier'),
 (877,'Hosteler'),
 (878,'Hostler'),
 (879,'Hotel Manager'),
 (880,'House Joiner'),
 (881,'Housewife'),
 (882,'Housewright'),
 (883,'Hoyman'),
 (884,'Huckster');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (885,'Hunter Trapper'),
 (886,'Hunter'),
 (887,'Huntsman'),
 (888,'Hurdle Maker'),
 (889,'Husbandman'),
 (890,'Iceman'),
 (891,'Icthyologist'),
 (892,'Illuminator'),
 (893,'Illusionist'),
 (894,'Illustrator'),
 (895,'Importer'),
 (896,'Indian Chief'),
 (897,'Industrial Engineer'),
 (898,'Industrialist'),
 (899,'Infirmarian'),
 (900,'Information Designer'),
 (901,'Information Technologist'),
 (902,'Inker'),
 (903,'Innholder'),
 (904,'Innkeeper'),
 (905,'Instructor'),
 (906,'Intelligencer'),
 (907,'Intendant'),
 (908,'Interfactor'),
 (909,'Interior Designer'),
 (910,'Interpreter'),
 (911,'Interrogator'),
 (912,'Intrepid Merchant'),
 (913,'Inventor'),
 (914,'Investigator'),
 (915,'Investment Banker'),
 (916,'Investment Broker'),
 (917,'Iron Smith'),
 (918,'Ironmaster'),
 (919,'Ironmonger'),
 (920,'Ironworker'),
 (921,'Ivorist'),
 (922,'Ivory Worker'),
 (923,'Jack'),
 (924,'Jacksmith'),
 (925,'Jagger'),
 (926,'Jailer'),
 (927,'Jakes-Farmer'),
 (928,'Janitor');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (929,'Jazz Musician'),
 (930,'Jester'),
 (931,'Jeweler'),
 (932,'Jewler'),
 (933,'Jobber'),
 (934,'Jobmaster'),
 (935,'Jockey'),
 (936,'Joiner'),
 (937,'Joiner'),
 (938,'Jongleur'),
 (939,'Journalist'),
 (940,'Journeyman'),
 (941,'Jouster'),
 (942,'Judge'),
 (943,'Juggler'),
 (944,'Jurist'),
 (945,'Karate Master'),
 (946,'Kedger'),
 (947,'Keelman'),
 (948,'Kempster'),
 (949,'Kiddier'),
 (950,'Kinesiologist'),
 (951,'King'),
 (952,'Knacker'),
 (953,'Knapper'),
 (954,'Kneller'),
 (955,'Knifeman'),
 (956,'Knifesmith'),
 (957,'Knight'),
 (958,'Knockknobbler'),
 (959,'Knoller'),
 (960,'Laborer'),
 (961,'Lacemaker'),
 (962,'Laceman'),
 (963,'Lacewoman'),
 (964,'Lady\'s Maid'),
 (965,'Lady'),
 (966,'Lagger'),
 (967,'Lampwright'),
 (968,'Lancier'),
 (969,'Land Waiter'),
 (970,'Landed Gentry'),
 (971,'Landlady'),
 (972,'Landlord'),
 (973,'Lands Jobber'),
 (974,'Landsman'),
 (975,'Lanternmaker'),
 (976,'Lapidary'),
 (977,'Laster'),
 (978,'Latoner'),
 (979,'Lattener');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (980,'Launderer'),
 (981,'Laundress'),
 (982,'Lavendar'),
 (983,'Law Enforcement Agent'),
 (984,'Law Enforcement'),
 (985,'Lawyer'),
 (986,'Leadworker'),
 (987,'Leather Dresser'),
 (988,'Leatherer'),
 (989,'Lecturer'),
 (990,'Leech'),
 (991,'Legerdemainist'),
 (992,'Leightonward'),
 (993,'Lensgrinder'),
 (994,'Level Designer'),
 (995,'Librarian'),
 (996,'Librettist'),
 (997,'Lifeguard'),
 (998,'Lighter Man'),
 (999,'Lighterman'),
 (1000,'Lighthouse Keeper'),
 (1001,'Lighting Technician'),
 (1002,'Limner'),
 (1003,'Lineman'),
 (1004,'Linen-Armorer'),
 (1005,'Linen-Draper'),
 (1006,'Linener'),
 (1007,'Linenspinner'),
 (1008,'Liner'),
 (1009,'Linguist'),
 (1010,'Link Boy'),
 (1011,'Link Man'),
 (1012,'Linkerman'),
 (1013,'Lister'),
 (1014,'Litster'),
 (1015,'Loan Officer'),
 (1016,'Lobbyist'),
 (1017,'Loblolly Boy'),
 (1018,'Lock Keeper'),
 (1019,'Locksmith'),
 (1020,'Lodesman'),
 (1021,'Longshoreman'),
 (1022,'Loresman'),
 (1023,'Lorimer'),
 (1024,'Lumberjack');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1025,'Lungs (Alchemy)'),
 (1026,'Lutemaker'),
 (1027,'Lutenist'),
 (1028,'Luthier'),
 (1029,'Lyricist'),
 (1030,'Machinist'),
 (1031,'Maderer'),
 (1032,'Magistrate'),
 (1033,'Magnate'),
 (1034,'Maid'),
 (1035,'Maidservant'),
 (1036,'Mail Carrier'),
 (1037,'Mailer'),
 (1038,'Mailmaker'),
 (1039,'Mailman'),
 (1040,'Make-Up Artist'),
 (1041,'Malemaker'),
 (1042,'Malemaker'),
 (1043,'Malender'),
 (1044,'Malster'),
 (1045,'Management Consultant'),
 (1046,'Management'),
 (1047,'Manager'),
 (1048,'Manciple'),
 (1049,'Mangle Keeper'),
 (1050,'Manicurist'),
 (1051,'Mantuamaker'),
 (1052,'Manufacturer'),
 (1053,'Mapmaker'),
 (1054,'Mapper'),
 (1055,'Marine Biologist'),
 (1056,'Marine'),
 (1057,'Mariner'),
 (1058,'Market Gardener'),
 (1059,'Marler'),
 (1060,'Marleywoman'),
 (1061,'Marshal'),
 (1062,'Martial Artist'),
 (1063,'Mason'),
 (1064,'Massage Therapist'),
 (1065,'Masseur'),
 (1066,'Masseuse'),
 (1067,'Master Builder'),
 (1068,'Master Mariner'),
 (1069,'Master Of Ceremony (Mc)');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1070,'Master Of Hounds'),
 (1071,'Master Of The Revels'),
 (1072,'Master Of The Rolls'),
 (1073,'Master'),
 (1074,'Matador'),
 (1075,'Matchet Forger'),
 (1076,'Mathematician'),
 (1077,'Meader'),
 (1078,'Mealman'),
 (1079,'Meat Butcher'),
 (1080,'Mechanic'),
 (1081,'Mechanician'),
 (1082,'Mediator'),
 (1083,'Medic'),
 (1084,'Medical Biller'),
 (1085,'Medical Transcriptionist'),
 (1086,'Medicine Man'),
 (1087,'Medicine Peddler'),
 (1088,'Medicine'),
 (1089,'Meistersinger'),
 (1090,'Melder'),
 (1091,'Menage-Man'),
 (1092,'Mercator'),
 (1093,'Mercenary'),
 (1094,'Mercer'),
 (1095,'Merchant Taylor'),
 (1096,'Merchant'),
 (1097,'Mesmerist'),
 (1098,'Messenger'),
 (1099,'Metalman'),
 (1100,'Meterer'),
 (1101,'Metropolitan Bishop'),
 (1102,'Midshipman'),
 (1103,'Midwife'),
 (1104,'Military Officer'),
 (1105,'Militia'),
 (1106,'Milkmaid'),
 (1107,'Milkman'),
 (1108,'Miller'),
 (1109,'Milleress'),
 (1110,'Milliner'),
 (1111,'Millwright'),
 (1112,'Miner'),
 (1113,'Miniaturist');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1114,'Minister'),
 (1115,'Minnesinger'),
 (1116,'Minstrel'),
 (1117,'Minter'),
 (1118,'Mintmaster'),
 (1119,'Mirrorer'),
 (1120,'Missionary'),
 (1121,'Mixer'),
 (1122,'Model'),
 (1123,'Modeller'),
 (1124,'Molecatcher'),
 (1125,'Money-Schrivener'),
 (1126,'Moneychanger'),
 (1127,'Moneyer'),
 (1128,'Moneylender'),
 (1129,'Monk Or Nun'),
 (1130,'Mortgage Broker'),
 (1131,'Moulder'),
 (1132,'Mountaineer'),
 (1133,'Mudlark'),
 (1134,'Muffin Man'),
 (1135,'Muleskinner'),
 (1136,'Muleteer'),
 (1137,'Multurer'),
 (1138,'Mummer'),
 (1139,'Muralist'),
 (1140,'Music Teacher'),
 (1141,'Musician'),
 (1142,'Musiker'),
 (1143,'Musketeer'),
 (1144,'Mustarder'),
 (1145,'Nailmaker'),
 (1146,'Nakerer'),
 (1147,'Nanny'),
 (1148,'Napier'),
 (1149,'Natural Philosopher'),
 (1150,'Navigator'),
 (1151,'Navigator'),
 (1152,'Necessary Woman'),
 (1153,'Necker'),
 (1154,'Nedeller'),
 (1155,'N‚gociant'),
 (1156,'Negotiator'),
 (1157,'Netmaker'),
 (1158,'Netter'),
 (1159,'Newscaster');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1160,'Night Auditor'),
 (1161,'Night Magistrate'),
 (1162,'Night Soilman'),
 (1163,'Nightwalker'),
 (1164,'Nimgimmer'),
 (1165,'Nob-Thatcher'),
 (1166,'Noble'),
 (1167,'Nobleman'),
 (1168,'Notary'),
 (1169,'Novelist'),
 (1170,'Numerologist'),
 (1171,'Numismatist'),
 (1172,'Nun . Effectively A Female Monk'),
 (1173,'Nurse'),
 (1174,'Nursemaid'),
 (1175,'Oboist'),
 (1176,'Obstetrician'),
 (1177,'Occupational Therapist'),
 (1178,'Occupier'),
 (1179,'Odontologist'),
 (1180,'Oil Merchant'),
 (1181,'Oilmaker'),
 (1182,'Oilman'),
 (1183,'Old-Clothes Dealer'),
 (1184,'Olitor'),
 (1185,'Oncologist'),
 (1186,'Operator'),
 (1187,'Ophthalmologist'),
 (1188,'Optician'),
 (1189,'Optometrist'),
 (1190,'Oracle'),
 (1191,'Orderly'),
 (1192,'Ordinary Keeper'),
 (1193,'Ordinary Seaman'),
 (1194,'Orfever'),
 (1195,'Organizer'),
 (1196,'Ornithologist'),
 (1197,'Ostiary'),
 (1198,'Ostler'),
 (1199,'Ostreger'),
 (1200,'Otorhinolaryngologist'),
 (1201,'Out-Crier'),
 (1202,'Outlaw');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1203,'Owler'),
 (1204,'Oynter'),
 (1205,'Oyster Raker'),
 (1206,'Oysterer'),
 (1207,'Packer'),
 (1208,'Packman'),
 (1209,'Painter'),
 (1210,'Paintress'),
 (1211,'Paleontologist'),
 (1212,'Paling Man'),
 (1213,'Palmer'),
 (1214,'Pan Smith'),
 (1215,'Panter'),
 (1216,'Paperer (Needlemaking)'),
 (1217,'Papermaker'),
 (1218,'Paralegal'),
 (1219,'Paramedic'),
 (1220,'Parapsychologist'),
 (1221,'Parchmenter'),
 (1222,'Pardoner'),
 (1223,'Parish Priest'),
 (1224,'Park Ranger'),
 (1225,'Parker'),
 (1226,'Parole Officer'),
 (1227,'Passage Keeper'),
 (1228,'Pasteler'),
 (1229,'Pastor'),
 (1230,'Pastrycook'),
 (1231,'Patent Attorney'),
 (1232,'Patent Examiner'),
 (1233,'Pathologist'),
 (1234,'Pattenmaker'),
 (1235,'Paver'),
 (1236,'Pavior'),
 (1237,'Pavyler'),
 (1238,'Pawnbroker'),
 (1239,'Peager'),
 (1240,'Peasant'),
 (1241,'Pedaile'),
 (1242,'Peddler'),
 (1243,'Pediatrician'),
 (1244,'Pedologist (Soil)'),
 (1245,'Pelterer'),
 (1246,'Perchemear'),
 (1247,'Percussionist');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1248,'Peregrinator'),
 (1249,'Perfumer'),
 (1250,'Perfumer'),
 (1251,'Periwig Maker'),
 (1252,'Personal Trainer'),
 (1253,'Peruker'),
 (1254,'Perukier'),
 (1255,'Pessoner'),
 (1256,'Peterman'),
 (1257,'Pettifogger'),
 (1258,'Petty Chapman'),
 (1259,'Pew Opener'),
 (1260,'Pewterer'),
 (1261,'Pharmacist'),
 (1262,'Pharmaopoeist'),
 (1263,'Philanthropist'),
 (1264,'Philologist'),
 (1265,'Philosopher'),
 (1266,'Philosophical Instrument Maker'),
 (1267,'Photographer'),
 (1268,'Photojournalist'),
 (1269,'Physical Therapist'),
 (1270,'Physician Assistant'),
 (1271,'Physician'),
 (1272,'Physicist'),
 (1273,'Physiognomist'),
 (1274,'Physiotherapist'),
 (1275,'Pianist (See Also The Piano Player)'),
 (1276,'Piano Tuner'),
 (1277,'Picaroon'),
 (1278,'Pickpocket'),
 (1279,'Pie Seller'),
 (1280,'Piece Broker'),
 (1281,'Pigmaker'),
 (1282,'Pigman'),
 (1283,'Pikelet Maker'),
 (1284,'Pikeman'),
 (1285,'Pikeman'),
 (1286,'Piker'),
 (1287,'Pilgrim'),
 (1288,'Pill Box Lidder');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1289,'Piller'),
 (1290,'Pilot (Aviation)'),
 (1291,'Pilot (Shipping)'),
 (1292,'Pilot'),
 (1293,'Pinder'),
 (1294,'Piner'),
 (1295,'Pinkertons Agent'),
 (1296,'Pinmaker'),
 (1297,'Pinner Up'),
 (1298,'Pinner'),
 (1299,'Pioneer (Siege)'),
 (1300,'Pioneer (See Also The Pioneer)'),
 (1301,'Piper'),
 (1302,'Pirate'),
 (1303,'Pissprophet'),
 (1304,'Pitman'),
 (1305,'Plain Worker'),
 (1306,'Plaiter'),
 (1307,'Planker'),
 (1308,'Plasterer'),
 (1309,'Plattner'),
 (1310,'Player (Actor)'),
 (1311,'Playwright'),
 (1312,'Plough Jogger'),
 (1313,'Plowman'),
 (1314,'Plowright'),
 (1315,'Plumassier  Plumer'),
 (1316,'Plumber'),
 (1317,'Plumbum Man'),
 (1318,'Plumer'),
 (1319,'Poacher'),
 (1320,'Podiatrist'),
 (1321,'Poet'),
 (1322,'Pointer'),
 (1323,'Pointer'),
 (1324,'Poleman'),
 (1325,'Poleturner'),
 (1326,'Police Detective'),
 (1327,'Police Inspector'),
 (1328,'Police Officer'),
 (1329,'Police'),
 (1330,'Politician'),
 (1331,'Ponderator'),
 (1332,'Pony Express Rider'),
 (1333,'Pope');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1334,'Pornstar'),
 (1335,'Portable Soup Maker'),
 (1336,'Porter'),
 (1337,'Post Rider'),
 (1338,'Postillion'),
 (1339,'Pot Boy'),
 (1340,'Pot Mender'),
 (1341,'Potato Badger'),
 (1342,'Potboy'),
 (1343,'Potter Carrier'),
 (1344,'Potter'),
 (1345,'Pouch Maker'),
 (1346,'Poulter'),
 (1347,'Poynter'),
 (1348,'Presenter'),
 (1349,'President'),
 (1350,'Press Officer'),
 (1351,'Prestidigitator'),
 (1352,'Pricker'),
 (1353,'Priest'),
 (1354,'Primate (Religion)'),
 (1355,'Prince'),
 (1356,'Princess'),
 (1357,'Principal'),
 (1358,'Printer (Profession)'),
 (1359,'Printer'),
 (1360,'Private Detective'),
 (1361,'Privycleaner'),
 (1362,'Probation Officer'),
 (1363,'Proctologist'),
 (1364,'Procurator'),
 (1365,'Professional Athelete'),
 (1366,'Professional Dominant'),
 (1367,'Professor'),
 (1368,'Programmer'),
 (1369,'Project Manager'),
 (1370,'Proofreader'),
 (1371,'Prophet'),
 (1372,'Prospector'),
 (1373,'Prostitute'),
 (1374,'Psychiatrist'),
 (1375,'Psychodramatist');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1376,'Psychologist'),
 (1377,'Public Relations Officer'),
 (1378,'Public Speaker'),
 (1379,'Publican'),
 (1380,'Publisher'),
 (1381,'Pugger'),
 (1382,'Pulleymaker'),
 (1383,'Pumbum'),
 (1384,'Pumpmaker'),
 (1385,'Purse Maker'),
 (1386,'Purser'),
 (1387,'Pursuivant'),
 (1388,'Quack'),
 (1389,'Quarrier'),
 (1390,'Quarryman'),
 (1391,'Quartermaster'),
 (1392,'Quiller'),
 (1393,'Quilter'),
 (1394,'Quister'),
 (1395,'Radio Journalist'),
 (1396,'Radio Personality'),
 (1397,'Radiographer'),
 (1398,'Radiologist'),
 (1399,'Rag And Bone Man'),
 (1400,'Rag Cutter'),
 (1401,'Rag Gatherer'),
 (1402,'Rag Man'),
 (1403,'Ragpicker'),
 (1404,'Railroad Baron'),
 (1405,'Railroad Brakeman'),
 (1406,'Railroad Conductor'),
 (1407,'Railroad Engineer'),
 (1408,'Railroad Laborer (See Also Chinese Laborer)'),
 (1409,'Railroad Stoker'),
 (1410,'Raker'),
 (1411,'Ranch Hand'),
 (1412,'Rancher'),
 (1413,'Rat Catcher'),
 (1414,'Ratoner'),
 (1415,'Rattlewatch'),
 (1416,'Real Estate Broker');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1417,'Real Estate Developer'),
 (1418,'Real Estate Investor'),
 (1419,'Reaper'),
 (1420,'Receptionist'),
 (1421,'Record Producer'),
 (1422,'Rectifier'),
 (1423,'Redsmith'),
 (1424,'Reedmaker'),
 (1425,'Reeve'),
 (1426,'Referee'),
 (1427,'Refuse Collector'),
 (1428,'Registrar'),
 (1429,'Religion'),
 (1430,'Reporter'),
 (1431,'Research Assistant'),
 (1432,'Researcher'),
 (1433,'Respiratory Therapist'),
 (1434,'Restaurateur'),
 (1435,'Retail Clerk'),
 (1436,'Retailer'),
 (1437,'Revenuer'),
 (1438,'Rigger'),
 (1439,'Ripper'),
 (1440,'Riverboat Pilot'),
 (1441,'Riverman'),
 (1442,'Riveter'),
 (1443,'Rodeo Rider'),
 (1444,'Rodman'),
 (1445,'Roofer'),
 (1446,'Ropemaker'),
 (1447,'Roper'),
 (1448,'Rover'),
 (1449,'Rugmaker'),
 (1450,'Rugman'),
 (1451,'Rugweaver'),
 (1452,'Runner'),
 (1453,'Rustler'),
 (1454,'Sacristan'),
 (1455,'Saddle Tree Maker'),
 (1456,'Saddler'),
 (1457,'Sage'),
 (1458,'Sailmaker'),
 (1459,'Sailor'),
 (1460,'Saloon Girl'),
 (1461,'Saloon Owner');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1462,'Saloonist'),
 (1463,'Saltboiler'),
 (1464,'Salter'),
 (1465,'Sandesman'),
 (1466,'Sanitation Worker'),
 (1467,'Sapper'),
 (1468,'Sartor'),
 (1469,'Saucier'),
 (1470,'Sawbones'),
 (1471,'Sawyer'),
 (1472,'Saxophonist'),
 (1473,'Say Weaver'),
 (1474,'Sayer'),
 (1475,'Scabbard Maker'),
 (1476,'Scavelman'),
 (1477,'School Superintendent'),
 (1478,'Schoolmarm'),
 (1479,'Schoolmaster'),
 (1480,'Schrimpschonger'),
 (1481,'Scientist'),
 (1482,'Scout'),
 (1483,'Screenwriter'),
 (1484,'Scribe'),
 (1485,'Scribe'),
 (1486,'Scrimer'),
 (1487,'Scripture Reader'),
 (1488,'Scrivener'),
 (1489,'Scrutineer'),
 (1490,'Scullery Maid'),
 (1491,'Scullion'),
 (1492,'Sculptor'),
 (1493,'Scythesmith'),
 (1494,'Sea Captain'),
 (1495,'Sealer'),
 (1496,'Seamstress'),
 (1497,'Searcher'),
 (1498,'Second Mate'),
 (1499,'Secret Service Agent'),
 (1500,'Secretary General'),
 (1501,'Secretary'),
 (1502,'Security Guard'),
 (1503,'Seedsman'),
 (1504,'Semi Lorer'),
 (1505,'Sempstress');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1506,'Senator'),
 (1507,'Seneschal'),
 (1508,'Seo (Search Engine Optimizer)'),
 (1509,'Serf'),
 (1510,'Sergeant-At-Arms'),
 (1511,'Sergeant'),
 (1512,'Servant'),
 (1513,'Sewster'),
 (1514,'Sex Worker'),
 (1515,'Sexologist'),
 (1516,'Sexton'),
 (1517,'Shanty-Man'),
 (1518,'Sharecropper'),
 (1519,'Shearer'),
 (1520,'Sheargrinder'),
 (1521,'Shearman'),
 (1522,'Sheath Maker'),
 (1523,'Sheepman'),
 (1524,'Sheepshearer'),
 (1525,'Shepherd'),
 (1526,'Shepster'),
 (1527,'Sheriff Officer'),
 (1528,'Sheriff (See Also The Sheriff)'),
 (1529,'Shill'),
 (1530,'Shingler'),
 (1531,'Ship Master'),
 (1532,'Ship Provisioner'),
 (1533,'Ship\'s Captain'),
 (1534,'Shipchandler'),
 (1535,'Shipwright'),
 (1536,'Shoe-Finder'),
 (1537,'Shoe-Wiper'),
 (1538,'Shoemaker'),
 (1539,'Shoesmith'),
 (1540,'Shop Assistant'),
 (1541,'Shop Keeper'),
 (1542,'Shoresman'),
 (1543,'Shrager'),
 (1544,'Shrieve'),
 (1545,'Shrimper'),
 (1546,'Siege Engineer'),
 (1547,'Siever'),
 (1548,'Silk Throwster');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1549,'Silk-Carder'),
 (1550,'Silk-Dresser'),
 (1551,'Silk-Dyer'),
 (1552,'Silk-Maker'),
 (1553,'Silk-Mercer'),
 (1554,'Silk-Snatcher'),
 (1555,'Silkmaid'),
 (1556,'Silversmith'),
 (1557,'Singer'),
 (1558,'Skald'),
 (1559,'Skepper'),
 (1560,'Skinker'),
 (1561,'Skinner'),
 (1562,'Slater'),
 (1563,'Sleeper'),
 (1564,'Sleuth'),
 (1565,'Slop Seller'),
 (1566,'Smelter'),
 (1567,'Smith'),
 (1568,'Smuggler'),
 (1569,'Snake Oil Salesman'),
 (1570,'Snobber'),
 (1571,'Snobscat'),
 (1572,'Snow Warden'),
 (1573,'Snuffer Maker'),
 (1574,'Soapboiler'),
 (1575,'Social Bandit'),
 (1576,'Social Worker'),
 (1577,'Socialite'),
 (1578,'Software Engineer'),
 (1579,'Soil Scientist'),
 (1580,'Sojourner Clothier'),
 (1581,'Soldier'),
 (1582,'Solicitor'),
 (1583,'Sommelier'),
 (1584,'Sonographer'),
 (1585,'Sortor'),
 (1586,'Sound Engineer'),
 (1587,'Souter'),
 (1588,'Spallier'),
 (1589,'Speakeasy Employee'),
 (1590,'Spearman'),
 (1591,'Special Agent'),
 (1592,'Spectaclesmaker'),
 (1593,'Speech Therapist');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1594,'Sperviter'),
 (1595,'Spice Merchant'),
 (1596,'Spicer'),
 (1597,'Spinner'),
 (1598,'Spinster'),
 (1599,'Splitter'),
 (1600,'Spooner'),
 (1601,'Sportsman'),
 (1602,'Spurrer'),
 (1603,'Spurrier'),
 (1604,'Spy'),
 (1605,'Squire'),
 (1606,'Stablehand'),
 (1607,'Stabler'),
 (1608,'Stainer'),
 (1609,'Stampman'),
 (1610,'Stapler'),
 (1611,'Starship Captain'),
 (1612,'Stationary Tender'),
 (1613,'Stationer'),
 (1614,'Statistician'),
 (1615,'Stay Maker'),
 (1616,'Steersman'),
 (1617,'Stenographer'),
 (1618,'Step Boy'),
 (1619,'Stevedore'),
 (1620,'Steward'),
 (1621,'Stewsman'),
 (1622,'Stillroom'),
 (1623,'Stitcher'),
 (1624,'Stockinger'),
 (1625,'Stoker'),
 (1626,'Stone Cutter'),
 (1627,'Stone Picker'),
 (1628,'Stone Worker'),
 (1629,'Stonecarver'),
 (1630,'Stonecutter'),
 (1631,'Stonemason'),
 (1632,'Stoner'),
 (1633,'Stonewarden'),
 (1634,'Storyteller'),
 (1635,'Straw Joiner'),
 (1636,'Streaker (Mortuary)'),
 (1637,'Street Artist'),
 (1638,'Street Cleaner');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1639,'Street Musician'),
 (1640,'Street Sweeper'),
 (1641,'Street Vendor'),
 (1642,'Strikebreaker'),
 (1643,'Stringer'),
 (1644,'Stripper'),
 (1645,'Structural Engineer'),
 (1646,'Student'),
 (1647,'Stuffgownsman'),
 (1648,'Stunt Double'),
 (1649,'Stunt Performer'),
 (1650,'Sucksmith'),
 (1651,'Summoner (Law)'),
 (1652,'Supervisor'),
 (1653,'Surgeon'),
 (1654,'Surveyor'),
 (1655,'Sutler'),
 (1656,'Swain'),
 (1657,'Swamper'),
 (1658,'Sweep'),
 (1659,'Swimmer'),
 (1660,'Swineherd'),
 (1661,'Switchboard Operator'),
 (1662,'Sword Cutler'),
 (1663,'Swordsmith'),
 (1664,'System Administrator'),
 (1665,'Systems Analyst'),
 (1666,'Tabler'),
 (1667,'Tailor'),
 (1668,'Tallow Chandler'),
 (1669,'Tallowchandler'),
 (1670,'Tally-Clerk'),
 (1671,'Tallyman'),
 (1672,'Tankard Bearer'),
 (1673,'Tanner'),
 (1674,'Taper Weaver'),
 (1675,'Tapester'),
 (1676,'Tapestrymaker'),
 (1677,'Tapicer'),
 (1678,'Tapiser'),
 (1679,'Tapper'),
 (1680,'Tapster'),
 (1681,'Tasseler'),
 (1682,'Tavern Keeper');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1683,'Taverner'),
 (1684,'Tawer'),
 (1685,'Tax Collector'),
 (1686,'Tax Lawyer'),
 (1687,'Taxicab Driver'),
 (1688,'Taxidermist'),
 (1689,'Taxonomist'),
 (1690,'Tea Lady'),
 (1691,'Teacher'),
 (1692,'Teamster'),
 (1693,'Technical Writer'),
 (1694,'Technician'),
 (1695,'Technologist'),
 (1696,'Telegraph Operator'),
 (1697,'Telegraphist'),
 (1698,'Telephone Operator'),
 (1699,'Tennis Player'),
 (1700,'Tenter'),
 (1701,'Test Developer'),
 (1702,'Test Pilot'),
 (1703,'Thacker'),
 (1704,'Thatcher'),
 (1705,'Barber'),
 (1706,'Theatre Director'),
 (1707,'Theologian'),
 (1708,'Theologist'),
 (1709,'Therapist'),
 (1710,'Thimbler'),
 (1711,'Thimblerigger'),
 (1712,'Thonger'),
 (1713,'Threadmaker'),
 (1714,'Thresher'),
 (1715,'Throwster'),
 (1716,'Tickney Man'),
 (1717,'Tide Gauger'),
 (1718,'Tide Waiter'),
 (1719,'Tiemaker'),
 (1720,'Tile Maker'),
 (1721,'Tile-Burner'),
 (1722,'Tile-Theeker'),
 (1723,'Tiler'),
 (1724,'Tiller'),
 (1725,'Tillerman'),
 (1726,'Tillman');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1727,'Tiltmaker'),
 (1728,'Time Police'),
 (1729,'Timekeeper'),
 (1730,'Times Ironer'),
 (1731,'Tinctor'),
 (1732,'Tinker'),
 (1733,'Tinner'),
 (1734,'Tinsmith'),
 (1735,'Tinter'),
 (1736,'Tipper'),
 (1737,'Tippler'),
 (1738,'Tipstaff'),
 (1739,'Tirewoman'),
 (1740,'Tobacco Spinner'),
 (1741,'Toll Keeper'),
 (1742,'Toller'),
 (1743,'Tollgate Keeper'),
 (1744,'Tonsor'),
 (1745,'Tool And Die Maker'),
 (1746,'Tool Helver'),
 (1747,'Toolmaker'),
 (1748,'Topman'),
 (1749,'Topsman'),
 (1750,'Town Crier'),
 (1751,'Town Marshal'),
 (1752,'Trademark Attorney'),
 (1753,'Trader'),
 (1754,'Tradesman'),
 (1755,'Trainer (Business)'),
 (1756,'Tramper'),
 (1757,'Trampler'),
 (1758,'Tranqueter'),
 (1759,'Transit Planner'),
 (1760,'Translator'),
 (1761,'Tranter'),
 (1762,'Trapper'),
 (1763,'Traunter'),
 (1764,'Treasurer'),
 (1765,'Treen Maker'),
 (1766,'Treenail Maker'),
 (1767,'Trenchermaker'),
 (1768,'Trencherman'),
 (1769,'Trobairitz'),
 (1770,'Troubadour'),
 (1771,'Truchman');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1772,'Truck Driver'),
 (1773,'Trugger'),
 (1774,'Tubber'),
 (1775,'Tubedrawer'),
 (1776,'Tumbler'),
 (1777,'Tunist'),
 (1778,'Turner'),
 (1779,'Turnkey'),
 (1780,'Tutor'),
 (1781,'Tyler'),
 (1782,'Typefounder'),
 (1783,'Typist'),
 (1784,'Ufologist'),
 (1785,'Undercover Agent'),
 (1786,'Undertaker'),
 (1787,'Underwriter'),
 (1788,'Unemployed'),
 (1789,'Unguentary'),
 (1790,'Upholder'),
 (1791,'Upholsterer'),
 (1792,'Upright Worker'),
 (1793,'Urchin'),
 (1794,'Urologist'),
 (1795,'Us Marshal'),
 (1796,'Userer'),
 (1797,'Usher'),
 (1798,'Vaginarius'),
 (1799,'Valet'),
 (1800,'Vaquero'),
 (1801,'Vatman'),
 (1802,'Verge Maker'),
 (1803,'Verger'),
 (1804,'Verrier'),
 (1805,'Verser'),
 (1806,'Veterinarian'),
 (1807,'Vibraphonist'),
 (1808,'Vicar'),
 (1809,'Victualler'),
 (1810,'Video Editor'),
 (1811,'Video Game Developer'),
 (1812,'Viking'),
 (1813,'Vintager'),
 (1814,'Vintner'),
 (1815,'Violinist'),
 (1816,'Violist'),
 (1817,'Virginal Player'),
 (1818,'Vulcan (Profession)');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1819,'Waferer'),
 (1820,'Waferer'),
 (1821,'Wagoner'),
 (1822,'Wainwright'),
 (1823,'Waiter'),
 (1824,'Waitman'),
 (1825,'Waitress'),
 (1826,'Wakeman'),
 (1827,'Walker'),
 (1828,'Waller'),
 (1829,'Wantcatcher'),
 (1830,'Warden'),
 (1831,'Warder'),
 (1832,'Warper (Boating)'),
 (1833,'Warper (Weaving)'),
 (1834,'Warrener'),
 (1835,'Washman'),
 (1836,'Watch Finisher'),
 (1837,'Watchmaker'),
 (1838,'Watchman'),
 (1839,'Water Baliff'),
 (1840,'Water Carrier'),
 (1841,'Water Gilder'),
 (1842,'Water Leader'),
 (1843,'Waterman'),
 (1844,'Waterseller'),
 (1845,'Wattle Hurdle Maker'),
 (1846,'Wattler'),
 (1847,'Waxchandler'),
 (1848,'Way Man'),
 (1849,'Way-Maker'),
 (1850,'Weaponsmith'),
 (1851,'Weatherman'),
 (1852,'Weatherspy'),
 (1853,'Weaver'),
 (1854,'Web Designer'),
 (1855,'Web Developer'),
 (1856,'Webber'),
 (1857,'Webster'),
 (1858,'Wedding Planner'),
 (1859,'Weeder'),
 (1860,'Weeper'),
 (1861,'Weigher'),
 (1862,'Weirkeeper'),
 (1863,'Welder'),
 (1864,'Wellmaster');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1865,'Wellsinker'),
 (1866,'Wellwright'),
 (1867,'Western Union Man'),
 (1868,'Wet Glover'),
 (1869,'Wet Nurse'),
 (1870,'Wetter'),
 (1871,'Whacker'),
 (1872,'Whaler'),
 (1873,'Wharfinger'),
 (1874,'Wheeler'),
 (1875,'Wheelwright'),
 (1876,'Wherryman'),
 (1877,'Whipcord Maker'),
 (1878,'Whipper In'),
 (1879,'Whit Cooper'),
 (1880,'White Limer'),
 (1881,'Whitear'),
 (1882,'Whitener'),
 (1883,'Whitening Roll Maker'),
 (1884,'Whiter Tawer'),
 (1885,'Whitesmith'),
 (1886,'Whitewing'),
 (1887,'Whittawer'),
 (1888,'Wigmaker'),
 (1889,'Wild West Outlaw'),
 (1890,'Willow Plaiter'),
 (1891,'Winder'),
 (1892,'Windster'),
 (1893,'Wine Seller'),
 (1894,'Winemaker'),
 (1895,'Wiredrawer'),
 (1896,'Witch'),
 (1897,'Wizard'),
 (1898,'Wood Cutter'),
 (1899,'Wood Reeve'),
 (1900,'Wood Seller'),
 (1901,'Woodbreaker'),
 (1902,'Woodcarver'),
 (1903,'Woodcutter'),
 (1904,'Woodmonger'),
 (1905,'Woodranger'),
 (1906,'Woodturner'),
 (1907,'Woodward'),
 (1908,'Wool Driver'),
 (1909,'Wool Grower');
INSERT INTO `professions` (`id`,`profession`) VALUES 
 (1910,'Wool Sorter'),
 (1911,'Wool Stapler'),
 (1912,'Wool Winder'),
 (1913,'Woolcomber'),
 (1914,'Woolman'),
 (1915,'Woolsted Man'),
 (1916,'Working Cowboy'),
 (1917,'Worsted Manufacturer'),
 (1918,'Wrangler'),
 (1919,'Wright'),
 (1920,'Writer'),
 (1921,'Xenobiologist'),
 (1922,'Xylophonist'),
 (1923,'Yardman'),
 (1924,'Yatman'),
 (1925,'Yearman'),
 (1926,'Yeoman'),
 (1927,'Yodeler'),
 (1928,'Zookeeper'),
 (1929,'Zoologist');
/*!40000 ALTER TABLE `professions` ENABLE KEYS */;


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
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=latin1;

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
 (31,'REGION IV-B (MIMAROPA)','6','Romblon Province'),
 (32,'Luzon REGION V (BICOL Region)','7','Albay Province'),
 (33,'Luzon REGION V (BICOL Region)','7','Camarines Norte Province'),
 (34,'Luzon REGION V (BICOL Region)','7','Camarines Sur Province'),
 (35,'Luzon REGION V (BICOL Region)','7','Catanduanes Province'),
 (36,'Luzon REGION V (BICOL Region)','7','Masbate Province'),
 (37,'Luzon REGION V (BICOL Region)','7','Sorsogon Province');
INSERT INTO `provinces` (`id`,`region`,`region_id`,`province`) VALUES 
 (38,'VISAYAS REGION VI (WESTERN VISAYAS)','8','Aklan Province'),
 (39,'VISAYAS REGION VI (WESTERN VISAYAS)','8','Antique Province'),
 (40,'VISAYAS REGION VI (WESTERN VISAYAS)','8','Capiz Province'),
 (41,'VISAYAS REGION VI (WESTERN VISAYAS)','8','Iloilo Province'),
 (42,'VISAYAS REGION VI (WESTERN VISAYAS)','8','Guimaras Province'),
 (43,'VISAYAS REGION VI (WESTERN VISAYAS)','8','Negros Occidental Province'),
 (44,'VISAYAS REGION VII (CENTRAL VISAYAS)','9','Bohol Province'),
 (45,'VISAYAS REGION VII (CENTRAL VISAYAS)','9','Cebu Province'),
 (46,'VISAYAS REGION VII (CENTRAL VISAYAS)','9','Negros Oriental Province'),
 (47,'VISAYAS REGION VII (CENTRAL VISAYAS)','9','Siquijor Province'),
 (48,'VISAYAS REGION VIII (EASTERN VISAYAS)','10','Biliran Province'),
 (49,'VISAYAS REGION VIII (EASTERN VISAYAS)','10','Eastern Samar Province'),
 (50,'VISAYAS REGION VIII (EASTERN VISAYAS)','10','Leyte Province'),
 (51,'VISAYAS REGION VIII (EASTERN VISAYAS)','10','Northern Samar Province'),
 (52,'VISAYAS REGION VIII (EASTERN VISAYAS)','10','Samar (Western) Province');
INSERT INTO `provinces` (`id`,`region`,`region_id`,`province`) VALUES 
 (53,'VISAYAS REGION VIII (EASTERN VISAYAS)','10','Southern Leyte Province'),
 (54,'MINDANAO REGION IX (Zamboanga Peninsula)','11','Zamboanga Sibugay Province'),
 (55,'MINDANAO REGION IX (Zamboanga Peninsula)','11','Zamboanga del Norte Province'),
 (56,'MINDANAO REGION IX (Zamboanga Peninsula)','11','Zamboanga del Sur Province'),
 (57,'MINDANAO REGION X (Northern Mindanao)','12','Bukidnon Province'),
 (58,'MINDANAO REGION X (Northern Mindanao)','12','Camiguin Province'),
 (59,'MINDANAO REGION X (Northern Mindanao)','12','Misamis Occidental Province'),
 (60,'MINDANAO REGION X (Northern Mindanao)','12','Msamis Oriental Province'),
 (61,'MINDANAO REGION X (Northern Mindanao)','12','Lanao del Norte Province'),
 (62,'MINDANAO REGION XI (Davao Region)','13','Davao del Norte Province'),
 (63,'MINDANAO REGION XI (Davao Region)','13','Davao del Sur Province'),
 (64,'MINDANAO REGION XI (Davao Region)','13','Davao Oriental Province'),
 (65,'MINDANAO REGION XI (Davao Region)','13','Comostela Valley Province');
INSERT INTO `provinces` (`id`,`region`,`region_id`,`province`) VALUES 
 (66,'MINDANAO REGION XII (Soccsksargen Region)','14','North Cotabato Province'),
 (67,'MINDANAO REGION XII (Soccsksargen Region)','14','Sultan Kudarat Province'),
 (68,'MINDANAO REGION XII (Soccsksargen Region)','14','South Cotabato Province'),
 (69,'MINDANAO REGION XII (Soccsksargen Region)','14','Saranggani Province'),
 (70,'MINDANAO REGION XIII (Caraga Region)','15','Agustan del Norte Province'),
 (71,'MINDANAO REGION XIII (Caraga Region)','15','Augustan del Sur Province'),
 (72,'MINDANAO REGION XIII (Caraga Region)','15','Suriago del Norte Province'),
 (73,'MINDANAO REGION XIII (Caraga Region)','15','Suriago del Sur Province'),
 (74,'LUZON REGION XIV (Cordillera Administrative Region (CAR) Region)','16','Abra Province'),
 (75,'LUZON REGION XIV (Cordillera Administrative Region (CAR) Region)','16','Benguet Province'),
 (76,'LUZON REGION XIV (Cordillera Administrative Region (CAR) Region)','16','Ifuga Province'),
 (77,'LUZON REGION XIV (Cordillera Administrative Region (CAR) Region)','16','Kalinga Province');
INSERT INTO `provinces` (`id`,`region`,`region_id`,`province`) VALUES 
 (78,'LUZON REGION XIV (Cordillera Administrative Region (CAR) Region)','16','Apayao Province'),
 (79,'LUZON REGION XIV (Cordillera Administrative Region (CAR) Region)','16','Mountain Province'),
 (80,'MINDANAO REGION XV (Autonomous Region of Muslim Mindanao (ARMM) Region)','17','Basilan Province'),
 (81,'MINDANAO REGION XV (Autonomous Region of Muslim Mindanao (ARMM) Region)','17','Sulu Province'),
 (82,'MINDANAO REGION XV (Autonomous Region of Muslim Mindanao (ARMM) Region)','17','Tawi-Tawi Province'),
 (83,'MINDANAO REGION XV (Autonomous Region of Muslim Mindanao (ARMM) Region)','17','Lanao del Sur Province'),
 (84,'MINDANAO REGION XV (Autonomous Region of Muslim Mindanao (ARMM) Region)','17','Magrindanao Province'),
 (85,'Luzon REGION XVI (National Capital Region (NCR) Region)','18','Manila (composed of the cities within Manila)');
/*!40000 ALTER TABLE `provinces` ENABLE KEYS */;


--
-- Definition of table `puroks`
--

DROP TABLE IF EXISTS `puroks`;
CREATE TABLE `puroks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `purok` varchar(100) DEFAULT NULL,
  `barangay_id` int(11) DEFAULT NULL,
  `barangay` varchar(100) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `region_id` int(11) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `puroks`
--

/*!40000 ALTER TABLE `puroks` DISABLE KEYS */;
/*!40000 ALTER TABLE `puroks` ENABLE KEYS */;


--
-- Definition of table `regions`
--

DROP TABLE IF EXISTS `regions`;
CREATE TABLE `regions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `regions`
--

/*!40000 ALTER TABLE `regions` DISABLE KEYS */;
INSERT INTO `regions` (`id`,`region`) VALUES 
 (1,'Luzon REGION I (Ilocos Region)'),
 (2,'Luzon REGION II (Cagayan Valley)'),
 (3,'Luzon REGION III (Central Luzon)'),
 (4,'Luzon REGION IV-A (CALABARZON)'),
 (5,'REGION IV-B (MIMAROPA)'),
 (6,'Luzon REGION V (BICOL Region)'),
 (7,'Luzon REGION V (BICOL Region)'),
 (8,'VISAYAS REGION VI (WESTERN VISAYAS)'),
 (9,'VISAYAS REGION VII (CENTRAL VISAYAS)'),
 (10,'VISAYAS REGION VIII (EASTERN VISAYAS)'),
 (11,'MINDANAO REGION IX (Zamboanga Peninsula)'),
 (12,'MINDANAO REGION X (Northern Mindanao)'),
 (13,'MINDANAO REGION XI (Davao Region)'),
 (14,'MINDANAO REGION XII (Soccsksargen Region)'),
 (15,'MINDANAO REGION XIII (Caraga Region)'),
 (16,'LUZON REGION XIV (Cordillera Administrative Region (CAR) Region)');
/*!40000 ALTER TABLE `regions` ENABLE KEYS */;


--
-- Definition of table `religions`
--

DROP TABLE IF EXISTS `religions`;
CREATE TABLE `religions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `religion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `religions`
--

/*!40000 ALTER TABLE `religions` DISABLE KEYS */;
INSERT INTO `religions` (`id`,`religion`) VALUES 
 (1,'Buddhism'),
 (2,'Protestant'),
 (3,'Roman Catholic'),
 (4,'Iglesia Ni Cristo'),
 (5,'Born-Again'),
 (6,'Baptist'),
 (7,'Jehovah\'s Witness'),
 (8,'Buddhism'),
 (9,'Islam'),
 (10,'Buddhism '),
 (11,'Taoism '),
 (12,'Atheist');
/*!40000 ALTER TABLE `religions` ENABLE KEYS */;


--
-- Definition of table `roof_types`
--

DROP TABLE IF EXISTS `roof_types`;
CREATE TABLE `roof_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roof_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roof_types`
--

/*!40000 ALTER TABLE `roof_types` DISABLE KEYS */;
INSERT INTO `roof_types` (`id`,`roof_type`) VALUES 
 (1,'Iron sheets'),
 (2,'Tiles'),
 (3,'Asbestos'),
 (4,'Concrete'),
 (5,'Tins'),
 (6,'Grass/Papyrus'),
 (7,'Banana leaves/Fibres'),
 (8,'Others');
/*!40000 ALTER TABLE `roof_types` ENABLE KEYS */;


--
-- Definition of table `schools`
--

DROP TABLE IF EXISTS `schools`;
CREATE TABLE `schools` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `school` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schools`
--

/*!40000 ALTER TABLE `schools` DISABLE KEYS */;
INSERT INTO `schools` (`id`,`school`,`address`) VALUES 
 (1,'West City Exceptional Child Learning Center (SPED)',NULL),
 (2,'West City Elementary School',NULL),
 (3,'North City Elementary School',NULL),
 (4,'West City Science Elementary School',NULL),
 (5,'South City Elementary School',NULL),
 (6,'City Central Elementary School',NULL),
 (7,'Amador Dagudag Memorial Elementary School',NULL),
 (8,'Magsaysay Memorial Elementary School',NULL),
 (9,'Batinguel Elementary School',NULL),
 (10,'Babajuba Elementary School',NULL),
 (11,'Balugo Elementary School',NULL),
 (12,'Cadawinonan Elementary School',NULL),
 (13,'Calindagan Elementary School',NULL),
 (14,'Camanjac Elementary School',NULL),
 (15,'Candau-ay Elementary School',NULL),
 (16,'Cantil-E Elementary School',NULL),
 (17,'Hermenigilda F. Gloria Memorial Elementary School',NULL),
 (18,'Junob Elementary School',NULL),
 (19,'ABC Learning Center',NULL),
 (20,'Catherina Cittadini (St. Louis) School',NULL),
 (21,'Divine Grace International School',NULL),
 (22,'Dumaguete Chunghua School',NULL);
INSERT INTO `schools` (`id`,`school`,`address`) VALUES 
 (23,'Dumaguete Agape Chinese Christian Academy',NULL),
 (24,'Dumaguete Mission School',NULL),
 (25,'Dumaguete Missionary Baptist Academy',NULL),
 (26,'Galileo Learning Center',NULL),
 (27,'Holy Cross High School',NULL),
 (28,'Joshua Generation International Academy',NULL),
 (29,'Kainos Montessori Learning Center',NULL),
 (30,'Lifegiver Christian Academy',NULL),
 (31,'Little Village Educational Foundation, Inc.',NULL),
 (32,'Living Word Christian School',NULL),
 (33,'Negros Oriental Montessori International School',NULL),
 (34,'Royal Oaks International School',NULL),
 (35,'Siloam International Christian School',NULL),
 (36,'Soongsil Agapia International High School',NULL),
 (37,'SouthDale Integrated School',NULL),
 (38,'St. Louis School-Don Bosco',NULL),
 (39,'SYL (Saceda Youth Lead) High School',NULL),
 (40,'RTPM-Dumaguete Science High School (Regional Science High School of Central Visayas)',NULL),
 (41,'Dumaguete City High School (Division Leader School, Division of Dumaguete City)',NULL),
 (42,'Negros Oriental High School (Division Leader School, Division of Negros Oriental)',NULL);
INSERT INTO `schools` (`id`,`school`,`address`) VALUES 
 (43,'Junob National High School',NULL),
 (44,'Camanjac National High School',NULL),
 (45,'Hermenigilda F. Gloria Memorial High School',NULL),
 (46,'Piapi High School',NULL),
 (47,'Taclobo High School',NULL),
 (48,'AMA Computer University',NULL),
 (49,'Asian College',NULL),
 (50,'Colegio de Santa Catalina de Alejandria (COSCA)',NULL),
 (51,'Dumaguete Academy for Culinary Arts (DACA)',NULL),
 (52,'En Gedi International College',NULL),
 (53,'Maxino College',NULL),
 (54,'Metro Dumaguete College',NULL),
 (55,'Negros Maritime College Foundation, Inc.',NULL),
 (56,'Presbyterian Theological College',NULL),
 (57,'STI',NULL),
 (58,'Teamskills School for Culinary Arts and Hospitality Management (TSCAHMI)',NULL),
 (59,'Foundation University',NULL),
 (60,'Silliman University',NULL),
 (61,'St. Paul University Dumaguete',NULL),
 (62,'Negros Oriental State University',NULL);
/*!40000 ALTER TABLE `schools` ENABLE KEYS */;


--
-- Definition of table `skills`
--

DROP TABLE IF EXISTS `skills`;
CREATE TABLE `skills` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `skill` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `skills`
--

/*!40000 ALTER TABLE `skills` DISABLE KEYS */;
INSERT INTO `skills` (`id`,`skill`) VALUES 
 (1,'Accuracy'),
 (2,'Administration'),
 (3,'Advising'),
 (4,'Analysis'),
 (5,'Assembling Apparatus'),
 (6,'Being Artistic/Creative'),
 (7,'Being Thorough'),
 (8,'Budgeting'),
 (9,'Calculations'),
 (10,'Challenging Employees'),
 (11,'Classifying Records'),
 (12,'Coaching Individuals'),
 (13,'Collaboration'),
 (14,'Communication'),
 (15,'Compiling Statistics'),
 (16,'Conducting Meetings'),
 (17,'Confronting Others'),
 (18,'Construction'),
 (19,'Consultation'),
 (20,'Computer'),
 (21,'Counseling'),
 (22,'Creating Ideas'),
 (23,'Creating Innovation'),
 (24,'Creating New Solutions'),
 (25,'Creating New Procedures'),
 (26,'Creativity'),
 (27,'Defining Performance Standards'),
 (28,'Defining Problems'),
 (29,'Demonstrations'),
 (30,'Detail Management'),
 (31,'Dispensing Information'),
 (32,'Displaying Ideas'),
 (33,'Editing'),
 (34,'Emotional Control'),
 (35,'Encouragement'),
 (36,'Entertainment'),
 (37,'Equipment Operation'),
 (38,'Evaluating'),
 (39,'Expression of Feelings'),
 (40,'Financial Report Auditing');
INSERT INTO `skills` (`id`,`skill`) VALUES 
 (41,'Fundraising'),
 (42,'Goal Setting'),
 (43,'Handling Complaints'),
 (44,'Human Resources'),
 (45,'Independent Action'),
 (46,'Information Search'),
 (47,'Innovation'),
 (48,'Interviews'),
 (49,'Inventing New Ideas'),
 (50,'Investigation'),
 (51,'Involvement'),
 (52,'Knowledge of Current Governmental Affairs'),
 (53,'Language Translation'),
 (54,'Leadership'),
 (55,'Listening'),
 (56,'Locating Missing Documents/Information'),
 (57,'Logical Thinking'),
 (58,'Maintaining High Levels of Activity'),
 (59,'Maintenance'),
 (60,'Management'),
 (61,'Managing Finances'),
 (62,'Measuring Boundaries'),
 (63,'Medical Assistance'),
 (64,'Meeting Deadlines'),
 (65,'Monetary Collection'),
 (66,'Motivation'),
 (67,'Negotiation'),
 (68,'Networking'),
 (69,'Numerical Analysis'),
 (70,'Oration'),
 (71,'Organizational Management'),
 (72,'Organizational Tasks'),
 (73,'Overseeing Meetings'),
 (74,'Overseeing Operation'),
 (75,'Personal Interaction'),
 (76,'Plan Development'),
 (77,'Planning');
INSERT INTO `skills` (`id`,`skill`) VALUES 
 (78,'Prediction'),
 (79,'Preparing Written Documents'),
 (80,'Principal Concept Knowledge'),
 (81,'Prioritizing'),
 (82,'Problem Troubleshooting'),
 (83,'Promotions'),
 (84,'Proposals'),
 (85,'Proposal Writing'),
 (86,'Publications'),
 (87,'Public Relations'),
 (88,'Public Speaking'),
 (89,'Questioning Others'),
 (90,'Reading Volumes'),
 (91,'Recommendations'),
 (92,'Regulating Rules'),
 (93,'Rehabilitating Others'),
 (94,'Remembering Facts'),
 (95,'Reporting'),
 (96,'Report Writing'),
 (97,'Responsibility'),
 (98,'Service'),
 (99,'Scheduling'),
 (100,'Screening Calls'),
 (101,'Sketching'),
 (102,'Supervision'),
 (103,'Technical Support'),
 (104,'Team Building'),
 (105,'Technology'),
 (106,'Toleration'),
 (107,'Training'),
 (108,'Updating Files');
/*!40000 ALTER TABLE `skills` ENABLE KEYS */;


--
-- Definition of table `solid_waste_disposal_methods`
--

DROP TABLE IF EXISTS `solid_waste_disposal_methods`;
CREATE TABLE `solid_waste_disposal_methods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `disposal_method` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `solid_waste_disposal_methods`
--

/*!40000 ALTER TABLE `solid_waste_disposal_methods` DISABLE KEYS */;
INSERT INTO `solid_waste_disposal_methods` (`id`,`disposal_method`) VALUES 
 (1,'Skip Bin'),
 (2,'Pit'),
 (3,'Heap'),
 (4,'Garden'),
 (5,'Burning'),
 (6,'Others');
/*!40000 ALTER TABLE `solid_waste_disposal_methods` ENABLE KEYS */;


--
-- Definition of table `streets`
--

DROP TABLE IF EXISTS `streets`;
CREATE TABLE `streets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `street` varchar(100) DEFAULT NULL,
  `purok_id` int(11) DEFAULT NULL,
  `purok` varchar(100) DEFAULT NULL,
  `barangay_id` int(11) DEFAULT NULL,
  `barangay` varchar(100) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `region_id` int(11) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `streets`
--

/*!40000 ALTER TABLE `streets` DISABLE KEYS */;
/*!40000 ALTER TABLE `streets` ENABLE KEYS */;


--
-- Definition of table `toilet_types`
--

DROP TABLE IF EXISTS `toilet_types`;
CREATE TABLE `toilet_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `toilet_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `toilet_types`
--

/*!40000 ALTER TABLE `toilet_types` DISABLE KEYS */;
INSERT INTO `toilet_types` (`id`,`toilet_type`) VALUES 
 (1,'Covered Pit Latrine-Private'),
 (2,'Covered Pit Latrine-Shared'),
 (3,'Covered VIP latrine-private'),
 (4,'Covered VIP latrine-shared'),
 (5,'Uncovered Pit Latrine'),
 (6,'Flush Toilet(Private)'),
 (7,'Flush Toilet(Shared)'),
 (8,'Bush');
/*!40000 ALTER TABLE `toilet_types` ENABLE KEYS */;


--
-- Definition of table `transportation_types`
--

DROP TABLE IF EXISTS `transportation_types`;
CREATE TABLE `transportation_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `transportation_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transportation_types`
--

/*!40000 ALTER TABLE `transportation_types` DISABLE KEYS */;
INSERT INTO `transportation_types` (`id`,`transportation_type`) VALUES 
 (1,'Motor Vehicle'),
 (2,'Motor Cycle'),
 (3,'Bicycle'),
 (4,'Boat/Canoe'),
 (5,'Donkey');
/*!40000 ALTER TABLE `transportation_types` ENABLE KEYS */;


--
-- Definition of table `wall_types`
--

DROP TABLE IF EXISTS `wall_types`;
CREATE TABLE `wall_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `wall_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wall_types`
--

/*!40000 ALTER TABLE `wall_types` DISABLE KEYS */;
INSERT INTO `wall_types` (`id`,`wall_type`) VALUES 
 (1,'Burnt/stabilized bricks with cement'),
 (2,'Burnt/stabilized bricks with mud'),
 (3,'Cement Blocks'),
 (4,'Concrete'),
 (5,'Stone with cement'),
 (6,'Unburnt Bricks with cement'),
 (7,'Unburnt Bricks with mud'),
 (8,'Wood'),
 (9,'Mud and Poles');
/*!40000 ALTER TABLE `wall_types` ENABLE KEYS */;


--
-- Definition of table `water_sources`
--

DROP TABLE IF EXISTS `water_sources`;
CREATE TABLE `water_sources` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `water_source` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `water_sources`
--

/*!40000 ALTER TABLE `water_sources` DISABLE KEYS */;
INSERT INTO `water_sources` (`id`,`water_source`) VALUES 
 (1,'Tap/Piped Water'),
 (2,'Bore-Hole'),
 (3,'Protected Well/Spring'),
 (4,'Rain Water'),
 (5,'Gravity Flow Scheme'),
 (6,'Open Water sources'),
 (7,'Water truck/water vendor');
/*!40000 ALTER TABLE `water_sources` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
