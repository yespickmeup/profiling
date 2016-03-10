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
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `barangay` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=332 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barangays`
--

/*!40000 ALTER TABLE `barangays` DISABLE KEYS */;
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (1,1,'Abra',NULL,NULL,'Agtangao'),
 (2,1,'Abra',NULL,NULL,'Angad'),
 (3,1,'Abra',NULL,NULL,'Bagacao'),
 (4,1,'Abra',NULL,NULL,'Bangbangar'),
 (5,1,'Abra',NULL,NULL,'Cabuloan'),
 (6,1,'Abra',NULL,NULL,'Calaba'),
 (7,1,'Abra',NULL,NULL,'Cosili East (Proper)'),
 (8,1,'Abra',NULL,NULL,'Cosili West (Buaya)'),
 (9,1,'Abra',NULL,NULL,'Dangdangla'),
 (10,1,'Abra',NULL,NULL,'Lingtan'),
 (11,1,'Abra',NULL,NULL,'Lipcan'),
 (12,1,'Abra',NULL,NULL,'Lubong'),
 (13,1,'Abra',NULL,NULL,'Macarcarmay'),
 (14,1,'Abra',NULL,NULL,'Macray'),
 (15,1,'Abra',NULL,NULL,'Malita'),
 (16,1,'Abra',NULL,NULL,'Maoay'),
 (17,1,'Abra',NULL,NULL,'Palao'),
 (18,1,'Abra',NULL,NULL,'Patucannay'),
 (19,1,'Abra',NULL,NULL,'Sagap'),
 (20,1,'Abra',NULL,NULL,'San Antonio'),
 (21,1,'Abra',NULL,NULL,'Santa Rosa'),
 (22,1,'Abra',NULL,NULL,'Sao-atan'),
 (23,1,'Abra',NULL,NULL,'Sappaac'),
 (24,1,'Abra',NULL,NULL,'Tablac (Calot)'),
 (25,1,'Abra',NULL,NULL,'Zone 1 Pob. (Nalasin)'),
 (26,1,'Abra',NULL,NULL,'Zone 2 Pob. (Consiliman)');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (27,1,'Abra',NULL,NULL,'Zone 3 Pob. (Lalaud)'),
 (28,1,'Abra',NULL,NULL,'Zone 4 Pob. (Town Proper)'),
 (29,1,'Abra',NULL,NULL,'Zone 5 Pob. (Bo. Barikir)'),
 (30,1,'Abra',NULL,NULL,'Zone 6 Pob. (Sinapangan)'),
 (31,1,'Abra',NULL,NULL,'Amti'),
 (32,1,'Abra',NULL,NULL,'Bao-yan'),
 (33,1,'Abra',NULL,NULL,'Danac East'),
 (34,1,'Abra',NULL,NULL,'Danac West'),
 (35,1,'Abra',NULL,NULL,'Dao-angan'),
 (36,1,'Abra',NULL,NULL,'Dumagas'),
 (37,1,'Abra',NULL,NULL,'Kilong-Olao'),
 (38,1,'Abra',NULL,NULL,'Poblacion (Boliney)'),
 (39,1,'Abra',NULL,NULL,'Abang'),
 (40,1,'Abra',NULL,NULL,'Bangbangcag'),
 (41,1,'Abra',NULL,NULL,'Bangcagan'),
 (42,1,'Abra',NULL,NULL,'Banglolao'),
 (43,1,'Abra',NULL,NULL,'Bugbog'),
 (44,1,'Abra',NULL,NULL,'Calao'),
 (45,1,'Abra',NULL,NULL,'Dugong'),
 (46,1,'Abra',NULL,NULL,'Labon'),
 (47,1,'Abra',NULL,NULL,'Layugan'),
 (48,1,'Abra',NULL,NULL,'Madalipay'),
 (49,1,'Abra',NULL,NULL,'North Poblacion'),
 (50,1,'Abra',NULL,NULL,'Pagala');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (51,1,'Abra',NULL,NULL,'Pakiling'),
 (52,1,'Abra',NULL,NULL,'Palaquio'),
 (53,1,'Abra',NULL,NULL,'Patoc'),
 (54,1,'Abra',NULL,NULL,'Quimloong'),
 (55,1,'Abra',NULL,NULL,'Salnec'),
 (56,1,'Abra',NULL,NULL,'San Miguel'),
 (57,1,'Abra',NULL,NULL,'Siblong'),
 (58,1,'Abra',NULL,NULL,'South Poblacion'),
 (59,1,'Abra',NULL,NULL,'Ducligan'),
 (60,1,'Abra',NULL,NULL,'Labaan'),
 (61,1,'Abra',NULL,NULL,'Lamao (Pob.)'),
 (62,1,'Abra',NULL,NULL,'Lingay'),
 (63,1,'Abra',NULL,NULL,'Ableg'),
 (64,1,'Abra',NULL,NULL,'Cabaruyan'),
 (65,1,'Abra',NULL,NULL,'Pikek'),
 (66,1,'Abra',NULL,NULL,'Tui (Pob.)'),
 (67,1,'Abra',NULL,NULL,'Abaquid'),
 (68,1,'Abra',NULL,NULL,'Cabaruan'),
 (69,1,'Abra',NULL,NULL,'Caupasan (Pob.)'),
 (70,1,'Abra',NULL,NULL,'Danglas'),
 (71,1,'Abra',NULL,NULL,'Nagaparan'),
 (72,1,'Abra',NULL,NULL,'Padangitan'),
 (73,1,'Abra',NULL,NULL,'Pangal'),
 (74,1,'Abra',NULL,NULL,'Bayaan'),
 (75,1,'Abra',NULL,NULL,'Cabaroan'),
 (76,1,'Abra',NULL,NULL,'Calumbaya');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (77,1,'Abra',NULL,NULL,'Cardona'),
 (78,1,'Abra',NULL,NULL,'Isit'),
 (79,1,'Abra',NULL,NULL,'Kimmalaba'),
 (80,1,'Abra',NULL,NULL,'Libtec'),
 (81,1,'Abra',NULL,NULL,'Lub-lubba'),
 (82,1,'Abra',NULL,NULL,'Mudiit'),
 (83,1,'Abra',NULL,NULL,'Namit-ingan'),
 (84,1,'Abra',NULL,NULL,'Pacac'),
 (85,1,'Abra',NULL,NULL,'Poblacion'),
 (86,1,'Abra',NULL,NULL,'Salucag'),
 (87,1,'Abra',NULL,NULL,'Talogtog'),
 (88,1,'Abra',NULL,NULL,'Taping'),
 (89,1,'Abra',NULL,NULL,'Benben (Bonbon)'),
 (90,1,'Abra',NULL,NULL,'Bulbulala'),
 (91,1,'Abra',NULL,NULL,'Buli'),
 (92,1,'Abra',NULL,NULL,'Canan (Gapan)'),
 (93,1,'Abra',NULL,NULL,'Liguis'),
 (94,1,'Abra',NULL,NULL,'Malabbaga'),
 (95,1,'Abra',NULL,NULL,'Mudeng'),
 (96,1,'Abra',NULL,NULL,'Pidipid'),
 (97,1,'Abra',NULL,NULL,'Poblacion'),
 (98,1,'Abra',NULL,NULL,'San Gregorio'),
 (99,1,'Abra',NULL,NULL,'Toon'),
 (100,1,'Abra',NULL,NULL,'Udangan'),
 (101,1,'Abra',NULL,NULL,'Bacag'),
 (102,1,'Abra',NULL,NULL,'Buneg');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (103,1,'Abra',NULL,NULL,'Guinguinabang'),
 (104,1,'Abra',NULL,NULL,'Lan-ag'),
 (105,1,'Abra',NULL,NULL,'Pacoc'),
 (106,1,'Abra',NULL,NULL,'Poblacion (Talampac)'),
 (107,1,'Abra',NULL,NULL,'Aguet'),
 (108,1,'Abra',NULL,NULL,'Bacooc'),
 (109,1,'Abra',NULL,NULL,'Balais'),
 (110,1,'Abra',NULL,NULL,'Cayapa'),
 (111,1,'Abra',NULL,NULL,'Dalaguisen'),
 (112,1,'Abra',NULL,NULL,'Laang'),
 (113,1,'Abra',NULL,NULL,'Lagben'),
 (114,1,'Abra',NULL,NULL,'Laguiben'),
 (115,1,'Abra',NULL,NULL,'Nagtipulan'),
 (116,1,'Abra',NULL,NULL,'Nagtupacan'),
 (117,1,'Abra',NULL,NULL,'Paganao'),
 (118,1,'Abra',NULL,NULL,'Pawa'),
 (119,1,'Abra',NULL,NULL,'Poblacion'),
 (120,1,'Abra',NULL,NULL,'Presentar'),
 (121,1,'Abra',NULL,NULL,'San Isidro'),
 (122,1,'Abra',NULL,NULL,'Tagodtod'),
 (123,1,'Abra',NULL,NULL,'Taping'),
 (124,1,'Abra',NULL,NULL,'Ba-i'),
 (125,1,'Abra',NULL,NULL,'Collago'),
 (126,1,'Abra',NULL,NULL,'Pang-ot'),
 (127,1,'Abra',NULL,NULL,'Poblacion'),
 (128,1,'Abra',NULL,NULL,'Pulot');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (129,1,'Abra',NULL,NULL,'Baac'),
 (130,1,'Abra',NULL,NULL,'Dalayap (Nalaas)'),
 (131,1,'Abra',NULL,NULL,'Mabungtot'),
 (132,1,'Abra',NULL,NULL,'Malapaao'),
 (133,1,'Abra',NULL,NULL,'Poblacion'),
 (134,1,'Abra',NULL,NULL,'Quillat'),
 (135,1,'Abra',NULL,NULL,'Bonglo (Patagui)'),
 (136,1,'Abra',NULL,NULL,'Bulbulala'),
 (137,1,'Abra',NULL,NULL,'Cawayan'),
 (138,1,'Abra',NULL,NULL,'Domenglay'),
 (139,1,'Abra',NULL,NULL,'Lenneng'),
 (140,1,'Abra',NULL,NULL,'Mapisla'),
 (141,1,'Abra',NULL,NULL,'Mogao'),
 (142,1,'Abra',NULL,NULL,'Nalbuan'),
 (143,1,'Abra',NULL,NULL,'Poblacion'),
 (144,1,'Abra',NULL,NULL,'Subagan'),
 (145,1,'Abra',NULL,NULL,'Tumalip'),
 (146,1,'Abra',NULL,NULL,'Ampalioc'),
 (147,1,'Abra',NULL,NULL,'Barit'),
 (148,1,'Abra',NULL,NULL,'Gayaman'),
 (149,1,'Abra',NULL,NULL,'Lul-luno'),
 (150,1,'Abra',NULL,NULL,'Luzong'),
 (151,1,'Abra',NULL,NULL,'Nagbukel-Tuquipa'),
 (152,1,'Abra',NULL,NULL,'Poblacion'),
 (153,1,'Abra',NULL,NULL,'Sabnangan');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (154,1,'Abra',NULL,NULL,'Bayabas'),
 (155,1,'Abra',NULL,NULL,'Binasaran'),
 (156,1,'Abra',NULL,NULL,'Buanao'),
 (157,1,'Abra',NULL,NULL,'Dulao'),
 (158,1,'Abra',NULL,NULL,'Duldulao'),
 (159,1,'Abra',NULL,NULL,'Gacab'),
 (160,1,'Abra',NULL,NULL,'Lat-ey'),
 (161,1,'Abra',NULL,NULL,'Malibcong (Pob.)'),
 (162,1,'Abra',NULL,NULL,'Mataragan'),
 (163,1,'Abra',NULL,NULL,'Pacgued'),
 (164,1,'Abra',NULL,NULL,'Taripan'),
 (165,1,'Abra',NULL,NULL,'Umnap'),
 (166,1,'Abra',NULL,NULL,'Ayyeng (Pob.)'),
 (167,1,'Abra',NULL,NULL,'Catacdegan Nuevo'),
 (168,1,'Abra',NULL,NULL,'Catacdegan Viejo'),
 (169,1,'Abra',NULL,NULL,'Luzong'),
 (170,1,'Abra',NULL,NULL,'San Jose Norte'),
 (171,1,'Abra',NULL,NULL,'San Jose Sur'),
 (172,1,'Abra',NULL,NULL,'San Juan Norte'),
 (173,1,'Abra',NULL,NULL,'San Juan Sur'),
 (174,1,'Abra',NULL,NULL,'San Ramon East'),
 (175,1,'Abra',NULL,NULL,'San Ramon West'),
 (176,1,'Abra',NULL,NULL,'Santo Tomas'),
 (177,1,'Abra',NULL,NULL,'Dumayco');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (178,1,'Abra',NULL,NULL,'Lusuac'),
 (179,1,'Abra',NULL,NULL,'Malamsit (Pau-Malamsit)'),
 (180,1,'Abra',NULL,NULL,'Namarabar'),
 (181,1,'Abra',NULL,NULL,'Patiao'),
 (182,1,'Abra',NULL,NULL,'Poblacion'),
 (183,1,'Abra',NULL,NULL,'Riang (Tiang)'),
 (184,1,'Abra',NULL,NULL,'Santa Rosa'),
 (185,1,'Abra',NULL,NULL,'Tattawa'),
 (186,1,'Abra',NULL,NULL,'Alinaya'),
 (187,1,'Abra',NULL,NULL,'Arab'),
 (188,1,'Abra',NULL,NULL,'Garreta'),
 (189,1,'Abra',NULL,NULL,'Immuli'),
 (190,1,'Abra',NULL,NULL,'Laskig'),
 (191,1,'Abra',NULL,NULL,'Monggoc'),
 (192,1,'Abra',NULL,NULL,'Naguirayan'),
 (193,1,'Abra',NULL,NULL,'Pamutic'),
 (194,1,'Abra',NULL,NULL,'Pangtud'),
 (195,1,'Abra',NULL,NULL,'Poblacion East'),
 (196,1,'Abra',NULL,NULL,'Poblacion West'),
 (197,1,'Abra',NULL,NULL,'San Diego'),
 (198,1,'Abra',NULL,NULL,'Sulbec'),
 (199,1,'Abra',NULL,NULL,'Suyo (Malidong)'),
 (200,1,'Abra',NULL,NULL,'Yuyeng'),
 (201,1,'Abra',NULL,NULL,'Bolbolo'),
 (202,1,'Abra',NULL,NULL,'Brookside');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (203,1,'Abra',NULL,NULL,'Dalit'),
 (204,1,'Abra',NULL,NULL,'Dintan'),
 (205,1,'Abra',NULL,NULL,'Gapang'),
 (206,1,'Abra',NULL,NULL,'Kinabiti'),
 (207,1,'Abra',NULL,NULL,'Maliplipit'),
 (208,1,'Abra',NULL,NULL,'Nagcanasan'),
 (209,1,'Abra',NULL,NULL,'Nanangduan'),
 (210,1,'Abra',NULL,NULL,'Narnara'),
 (211,1,'Abra',NULL,NULL,'Ocup'),
 (212,1,'Abra',NULL,NULL,'Pang-ot'),
 (213,1,'Abra',NULL,NULL,'Patad'),
 (214,1,'Abra',NULL,NULL,'Poblacion'),
 (215,1,'Abra',NULL,NULL,'San Juan East'),
 (216,1,'Abra',NULL,NULL,'San Juan West'),
 (217,1,'Abra',NULL,NULL,'South Balioag'),
 (218,1,'Abra',NULL,NULL,'Tikitik'),
 (219,1,'Abra',NULL,NULL,'Villavieja'),
 (220,1,'Abra',NULL,NULL,'Bazar'),
 (221,1,'Abra',NULL,NULL,'Bilabila'),
 (222,1,'Abra',NULL,NULL,'Gangal (Pob.)'),
 (223,1,'Abra',NULL,NULL,'Maguyepyep'),
 (224,1,'Abra',NULL,NULL,'Naguilian'),
 (225,1,'Abra',NULL,NULL,'Saccaang'),
 (226,1,'Abra',NULL,NULL,'Sallapadan'),
 (227,1,'Abra',NULL,NULL,'Subusob');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (228,1,'Abra',NULL,NULL,'Ud-udiao'),
 (229,1,'Abra',NULL,NULL,'Cabayogan'),
 (230,1,'Abra',NULL,NULL,'Dalimag'),
 (231,1,'Abra',NULL,NULL,'Langbaban'),
 (232,1,'Abra',NULL,NULL,'Manayday'),
 (233,1,'Abra',NULL,NULL,'Pantoc'),
 (234,1,'Abra',NULL,NULL,'Poblacion'),
 (235,1,'Abra',NULL,NULL,'Sabtan-olo'),
 (236,1,'Abra',NULL,NULL,'San Marcial'),
 (237,1,'Abra',NULL,NULL,'Tangbao'),
 (238,1,'Abra',NULL,NULL,'Abualan'),
 (239,1,'Abra',NULL,NULL,'Ba-ug'),
 (240,1,'Abra',NULL,NULL,'Badas'),
 (241,1,'Abra',NULL,NULL,'Cabcaborao'),
 (242,1,'Abra',NULL,NULL,'Colabaoan'),
 (243,1,'Abra',NULL,NULL,'Culiong'),
 (244,1,'Abra',NULL,NULL,'Daoidao'),
 (245,1,'Abra',NULL,NULL,'Guimba'),
 (246,1,'Abra',NULL,NULL,'Lam-ag'),
 (247,1,'Abra',NULL,NULL,'Lumobang'),
 (248,1,'Abra',NULL,NULL,'Nangobongan'),
 (249,1,'Abra',NULL,NULL,'Pattaoig'),
 (250,1,'Abra',NULL,NULL,'Poblacion North'),
 (251,1,'Abra',NULL,NULL,'Poblacion South'),
 (252,1,'Abra',NULL,NULL,'Quidaoen');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (253,1,'Abra',NULL,NULL,'Sabangan'),
 (254,1,'Abra',NULL,NULL,'Silet'),
 (255,1,'Abra',NULL,NULL,'Supi-il'),
 (256,1,'Abra',NULL,NULL,'Tagaytay'),
 (257,1,'Abra',NULL,NULL,'Labaan'),
 (258,1,'Abra',NULL,NULL,'Palang'),
 (259,1,'Abra',NULL,NULL,'Pantoc'),
 (260,1,'Abra',NULL,NULL,'Poblacion'),
 (261,1,'Abra',NULL,NULL,'Tangadan'),
 (262,1,'Abra',NULL,NULL,'Villa Mercedes'),
 (263,1,'Abra',NULL,NULL,'Bagalay'),
 (264,1,'Abra',NULL,NULL,'Basbasa'),
 (265,1,'Abra',NULL,NULL,'Budac'),
 (266,1,'Abra',NULL,NULL,'Bumagcat'),
 (267,1,'Abra',NULL,NULL,'Cabaroan'),
 (268,1,'Abra',NULL,NULL,'Deet'),
 (269,1,'Abra',NULL,NULL,'Gaddani'),
 (270,1,'Abra',NULL,NULL,'Patucannay'),
 (271,1,'Abra',NULL,NULL,'Pias'),
 (272,1,'Abra',NULL,NULL,'Poblacion'),
 (273,1,'Abra',NULL,NULL,'Velasco'),
 (274,1,'Abra',NULL,NULL,'Alaoa'),
 (275,1,'Abra',NULL,NULL,'Anayan'),
 (276,1,'Abra',NULL,NULL,'Apao'),
 (277,1,'Abra',NULL,NULL,'Belaat'),
 (278,1,'Abra',NULL,NULL,'Caganayan');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (279,1,'Abra',NULL,NULL,'Cogon'),
 (280,1,'Abra',NULL,NULL,'Lanec'),
 (281,1,'Abra',NULL,NULL,'Lapat-Balantay'),
 (282,1,'Abra',NULL,NULL,'Naglibacan'),
 (283,1,'Abra',NULL,NULL,'Poblacion (Agsimao)'),
 (284,1,'Abra',NULL,NULL,'Alangtin'),
 (285,1,'Abra',NULL,NULL,'Amtuagan'),
 (286,1,'Abra',NULL,NULL,'Dilong'),
 (287,1,'Abra',NULL,NULL,'Kili'),
 (288,1,'Abra',NULL,NULL,'Poblacion (Mayabo)'),
 (289,1,'Abra',NULL,NULL,'Supo'),
 (290,1,'Abra',NULL,NULL,'Tabacda'),
 (291,1,'Abra',NULL,NULL,'Tiempo'),
 (292,1,'Abra',NULL,NULL,'Tubtuba'),
 (293,1,'Abra',NULL,NULL,'Wayangan'),
 (294,1,'Abra',NULL,NULL,'Ap-apaya'),
 (295,1,'Abra',NULL,NULL,'Bol-lilising'),
 (296,1,'Abra',NULL,NULL,'Cal-lao'),
 (297,1,'Abra',NULL,NULL,'Lap-lapog'),
 (298,1,'Abra',NULL,NULL,'Lumaba'),
 (299,1,'Abra',NULL,NULL,'Poblacion'),
 (300,1,'Abra',NULL,NULL,'Tamac'),
 (301,1,'Abra',NULL,NULL,'Tuquib'),
 (302,52,'Negros Oriental',108,'Dumaguete City','Bagacay'),
 (303,52,'Negros Oriental',108,'Dumaguete City','Bajumpandan');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (304,52,'Negros Oriental',108,'Dumaguete City','Balugo'),
 (305,52,'Negros Oriental',108,'Dumaguete City','Banilad'),
 (306,52,'Negros Oriental',108,'Dumaguete City','Bantayan'),
 (307,52,'Negros Oriental',108,'Dumaguete City','Batinguel'),
 (308,52,'Negros Oriental',108,'Dumaguete City','Bunao'),
 (309,52,'Negros Oriental',108,'Dumaguete City','Cadawinonan'),
 (310,52,'Negros Oriental',108,'Dumaguete City','Calindagan'),
 (311,52,'Negros Oriental',108,'Dumaguete City','Camanjac'),
 (312,52,'Negros Oriental',108,'Dumaguete City','Candau-ay'),
 (313,52,'Negros Oriental',108,'Dumaguete City','Cantil-e'),
 (314,52,'Negros Oriental',108,'Dumaguete City','Daro'),
 (315,52,'Negros Oriental',108,'Dumaguete City','Junob'),
 (316,52,'Negros Oriental',108,'Dumaguete City','Looc'),
 (317,52,'Negros Oriental',108,'Dumaguete City','Mangnao-Canal'),
 (318,52,'Negros Oriental',108,'Dumaguete City','Motong'),
 (319,52,'Negros Oriental',108,'Dumaguete City','Piapi');
INSERT INTO `barangays` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay`) VALUES 
 (320,52,'Negros Oriental',108,'Dumaguete City','Poblacion No. 1 (Barangay 1)'),
 (321,52,'Negros Oriental',108,'Dumaguete City','Poblacion No. 2 (Barangay 2)'),
 (322,52,'Negros Oriental',108,'Dumaguete City','Poblacion No. 3 (Barangay 3)'),
 (323,52,'Negros Oriental',108,'Dumaguete City','Poblacion No. 4 (Barangay 4)'),
 (324,52,'Negros Oriental',108,'Dumaguete City','Poblacion No. 5 (Barangay 5)'),
 (325,52,'Negros Oriental',108,'Dumaguete City','Poblacion No. 6 (Barangay 6)'),
 (326,52,'Negros Oriental',108,'Dumaguete City','Poblacion No. 7 (Barangay 7)'),
 (327,52,'Negros Oriental',108,'Dumaguete City','Poblacion No. 8 (Barangay 8)'),
 (328,52,'Negros Oriental',108,'Dumaguete City','Pulantubig'),
 (329,52,'Negros Oriental',108,'Dumaguete City','Tabuctubig'),
 (330,52,'Negros Oriental',108,'Dumaguete City','Taclobo'),
 (331,52,'Negros Oriental',108,'Dumaguete City','Talay');
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
  `city` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=143 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cities`
--

/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` (`id`,`province_id`,`province`,`city`) VALUES 
 (1,2,'Agusan del Norte','Butuan City'),
 (2,2,'Agusan del Norte','Cabadbaran City'),
 (3,3,'Agusan del Sur','Bayugan '),
 (4,5,'Albay','Ligao City'),
 (5,5,'Albay','Tabaco City'),
 (6,9,'Basilan','Isabela City'),
 (7,9,'Basilan','Lamitan City '),
 (8,82,'Bataan','Balanga City'),
 (9,11,'Batangas','Batangas City'),
 (10,11,'Batangas','Lipa City'),
 (11,11,'Batangas','Tanauan City '),
 (12,12,'Benguet','Baguio City'),
 (13,14,'Bohol','Tagbilaran City'),
 (14,15,'Bukidnon','Malaybalay City'),
 (15,15,'Bukidnon','Valencia City '),
 (16,16,'Bulacan','Malolos City'),
 (17,16,'Bulacan','Meycauayan City'),
 (18,16,'Bulacan','San Jose del Monte City'),
 (19,17,'Cagayan','Tuguegarao City'),
 (20,19,'Camarines Sur','Iriga City'),
 (21,19,'Camarines Sur','Naga City '),
 (22,21,'Capiz','Roxas City '),
 (23,23,'Cavite','Cavite City'),
 (24,23,'Cavite','Tagaytay City'),
 (25,23,'Cavite','Trece Martires City'),
 (26,24,'Cebu','Argao City'),
 (27,24,'Cebu','Bogo City');
INSERT INTO `cities` (`id`,`province_id`,`province`,`city`) VALUES 
 (28,24,'Cebu','Carcar City'),
 (29,24,'Cebu','Cebu City'),
 (30,24,'Cebu','Danao City'),
 (31,24,'Cebu','Lapu-Lapu City'),
 (32,24,'Cebu','Mandaue City'),
 (33,24,'Cebu','Talisay City'),
 (34,24,'Cebu','Toledo City'),
 (35,24,'Cebu','Naga City '),
 (36,26,'Cotabato','Kidapawan City'),
 (37,27,'Davao del Norte','Island Garden City of Samal'),
 (38,27,'Davao del Norte','Panabo City'),
 (39,27,'Davao del Norte','Tagum City'),
 (40,28,'Davao del Sur','Davao City'),
 (41,28,'Davao del Sur','Digos City '),
 (42,30,'Davao Oriental','Mati City'),
 (43,32,'Eastern Samar','Borongan City '),
 (44,35,'Ilocos Norte','Laoag City'),
 (45,35,'Ilocos Norte','Batac City '),
 (46,36,'Ilocos Sur','Candon City'),
 (47,36,'Ilocos Sur','Vigan City '),
 (48,37,'Ilo-Ilo','Passi City'),
 (49,37,'Ilo-Ilo','Iloilo City '),
 (50,38,'Isabella','Cauayan City'),
 (51,38,'Isabella','Santiago City'),
 (52,39,'Kalinga','Tabuk City'),
 (53,40,'La Union','San Fernando City'),
 (54,41,'Laguna','Calamba City');
INSERT INTO `cities` (`id`,`province_id`,`province`,`city`) VALUES 
 (55,41,'Laguna','San Pablo City'),
 (56,41,'Laguna','Santa Rosa City '),
 (57,42,'Lanao del Norte','Iligan City'),
 (58,43,'Lanao del Sur','Marawi City '),
 (59,44,'Leyte','Baybay City'),
 (60,44,'Leyte','Ormoc City'),
 (61,44,'Leyte','Tacloban City'),
 (62,45,'Maguindanao','Cotabato City'),
 (63,46,'Marinduque','Boac'),
 (64,46,'Marinduque','Buenavista'),
 (65,46,'Marinduque','Gasan'),
 (66,46,'Marinduque','Mogpog'),
 (67,46,'Marinduque','Santa Cruz'),
 (68,46,'Marinduque','Torrijos '),
 (69,47,'Masbate','Masbate City'),
 (70,81,'Metro Manila','Caloocan'),
 (71,81,'Metro Manila','Las Pi¤as'),
 (72,81,'Metro Manila','Makati'),
 (73,81,'Metro Manila','Malabon'),
 (74,81,'Metro Manila','Mandaluyong'),
 (75,81,'Metro Manila','Manila'),
 (76,81,'Metro Manila','Marikina'),
 (77,81,'Metro Manila','Muntinlupa'),
 (78,81,'Metro Manila','Navotas'),
 (79,81,'Metro Manila','Para¤aque'),
 (80,81,'Metro Manila','Pasay'),
 (81,81,'Metro Manila','Pasig'),
 (82,81,'Metro Manila','Quezon City');
INSERT INTO `cities` (`id`,`province_id`,`province`,`city`) VALUES 
 (83,81,'Metro Manila','San Juan'),
 (84,81,'Metro Manila','Taguig'),
 (85,81,'Metro Manila','Valenzuela '),
 (86,48,'Misamis Occidental','Oroquieta City'),
 (87,48,'Misamis Occidental','Ozamis City'),
 (88,48,'Misamis Occidental','Tangub City '),
 (89,49,'Misamis Oriental','Cagayan de Oro'),
 (90,49,'Misamis Oriental','Gingoog City'),
 (91,49,'Misamis Oriental','El Salvador City '),
 (92,51,'Negros Occidental','Bacolod City'),
 (93,51,'Negros Occidental','Bago City'),
 (94,51,'Negros Occidental','Cadiz City'),
 (95,51,'Negros Occidental','Escalante City'),
 (96,51,'Negros Occidental','Himamaylan City'),
 (97,51,'Negros Occidental','Kabankalan City'),
 (98,51,'Negros Occidental','La Carlota City'),
 (99,51,'Negros Occidental','Sagay City'),
 (100,51,'Negros Occidental','San Carlos City'),
 (101,51,'Negros Occidental','Silay City'),
 (102,51,'Negros Occidental','Sipalay City'),
 (103,51,'Negros Occidental','Talisay City'),
 (104,51,'Negros Occidental','Victorias City ');
INSERT INTO `cities` (`id`,`province_id`,`province`,`city`) VALUES 
 (105,52,'Negros Oriental','Bais'),
 (106,52,'Negros Oriental','Bayawan'),
 (107,52,'Negros Oriental','Canlaon'),
 (108,52,'Negros Oriental','Dumaguete'),
 (109,52,'Negros Oriental','Guihulngan'),
 (110,52,'Negros Oriental','Tanjay '),
 (111,54,'Nueva Ecija','Cabanatuan City'),
 (112,54,'Nueva Ecija','Gapan City'),
 (113,54,'Nueva Ecija','Palayan City'),
 (114,54,'Nueva Ecija','San Jose City'),
 (115,54,'Nueva Ecija','Science City of Mu¤oz '),
 (116,57,'Oriental Mindoro','Calapan City'),
 (117,58,'Puerto Princessa','Puerto Princesa City'),
 (118,59,'Pampanga','Angeles City'),
 (119,59,'Pampanga','City of San Fernando '),
 (120,60,'Pangasinan','Alaminos City'),
 (121,60,'Pangasinan','Dagupan City'),
 (122,60,'Pangasinan','San Carlos City'),
 (123,60,'Pangasinan','Urdaneta City '),
 (124,61,'Quezon','Lucena City'),
 (125,61,'Quezon','Tayabas City '),
 (126,63,'Rizal','Antipolo City'),
 (127,65,'Samar','Catbalogan City'),
 (128,65,'Samar','Calbayog City ');
INSERT INTO `cities` (`id`,`province_id`,`province`,`city`) VALUES 
 (129,68,'Sorsogon','Sorsogon City'),
 (130,69,'South Cotabato','General Santos City'),
 (131,69,'South Cotabato','Koronadal City'),
 (132,70,'Southern Leyte','Maasin CIty'),
 (133,71,'Sultan Kudarat','Tacurong City'),
 (134,73,'Surigao del Norte','Surigao City '),
 (135,74,'Surigao del Sur','Bislig CIty'),
 (136,74,'Surigao del Sur','Tandag CIty'),
 (137,75,'Tarlac','Tarlac City'),
 (138,77,'Zambales','Olongapo City'),
 (139,78,'Zamboanga del Norte','Dapitan City'),
 (140,79,'Zamboanga del Norte','Dipolog CIty'),
 (141,80,'Zamboanga del Sur','Pagadian City'),
 (142,81,'Zamboanga del Sur','Zamboanga City');
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
-- Definition of table `genders`
--

DROP TABLE IF EXISTS `genders`;
CREATE TABLE `genders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gender` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `genders`
--

/*!40000 ALTER TABLE `genders` DISABLE KEYS */;
INSERT INTO `genders` (`id`,`gender`) VALUES 
 (1,'Male'),
 (2,'Female');
/*!40000 ALTER TABLE `genders` ENABLE KEYS */;


--
-- Definition of table `household_consumptions`
--

DROP TABLE IF EXISTS `household_consumptions`;
CREATE TABLE `household_consumptions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `house_no` varchar(100) DEFAULT NULL,
  `household_no` int(11) DEFAULT NULL,
  `basic_need` varchar(100) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `consumption_date` date DEFAULT NULL,
  `date_added` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `household_consumptions`
--

/*!40000 ALTER TABLE `household_consumptions` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_consumptions` ENABLE KEYS */;


--
-- Definition of table `household_list`
--

DROP TABLE IF EXISTS `household_list`;
CREATE TABLE `household_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `house_no` varchar(100) DEFAULT NULL,
  `household_no` varchar(100) DEFAULT NULL,
  `no_of_members` int(11) DEFAULT NULL,
  `date_modified` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `household_list`
--

/*!40000 ALTER TABLE `household_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_list` ENABLE KEYS */;


--
-- Definition of table `household_member_certification`
--

DROP TABLE IF EXISTS `household_member_certification`;
CREATE TABLE `household_member_certification` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `household_member_id` int(11) DEFAULT NULL,
  `certification` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `household_member_certification`
--

/*!40000 ALTER TABLE `household_member_certification` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_certification` ENABLE KEYS */;


--
-- Definition of table `household_member_educational_background`
--

DROP TABLE IF EXISTS `household_member_educational_background`;
CREATE TABLE `household_member_educational_background` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `educational_status` varchar(100) DEFAULT NULL,
  `household_member_id` int(11) DEFAULT NULL,
  `name_of_school` varchar(100) DEFAULT NULL,
  `highest_grade_computed` varchar(100) DEFAULT NULL,
  `year` date DEFAULT NULL,
  `achievements` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `household_member_educational_background`
--

/*!40000 ALTER TABLE `household_member_educational_background` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_educational_background` ENABLE KEYS */;


--
-- Definition of table `household_member_employment_status`
--

DROP TABLE IF EXISTS `household_member_employment_status`;
CREATE TABLE `household_member_employment_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `household_member_id` int(11) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `employment_status` varchar(100) DEFAULT NULL,
  `name_of_business` varchar(100) DEFAULT NULL,
  `business_address` varchar(100) DEFAULT NULL,
  `mailing_address` varchar(100) DEFAULT NULL,
  `type_of_business` varchar(100) DEFAULT NULL,
  `is_homebased_business` varchar(100) DEFAULT NULL,
  `net_income_estimation` double DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `profession` varchar(100) DEFAULT NULL,
  `financial_assistance_amount` double DEFAULT NULL,
  `reason_for_migration` varchar(100) DEFAULT NULL,
  `date_started` date DEFAULT NULL,
  `date_ended` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `household_member_employment_status`
--

/*!40000 ALTER TABLE `household_member_employment_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_employment_status` ENABLE KEYS */;


--
-- Definition of table `household_member_health_status`
--

DROP TABLE IF EXISTS `household_member_health_status`;
CREATE TABLE `household_member_health_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `household_member_id` int(11) DEFAULT NULL,
  `is_seeing_a_doctor` varchar(100) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `name_of_doctor` varchar(100) DEFAULT NULL,
  `level_of_disability` varchar(100) DEFAULT NULL,
  `cause` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `household_member_health_status`
--

/*!40000 ALTER TABLE `household_member_health_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_health_status` ENABLE KEYS */;


--
-- Definition of table `household_member_medication`
--

DROP TABLE IF EXISTS `household_member_medication`;
CREATE TABLE `household_member_medication` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `household_member_id` int(11) DEFAULT NULL,
  `medication` varchar(100) DEFAULT NULL,
  `doctor_name` varchar(100) DEFAULT NULL,
  `prescription` varchar(100) DEFAULT NULL,
  `dose` varchar(100) DEFAULT NULL,
  `begin_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `household_member_medication`
--

/*!40000 ALTER TABLE `household_member_medication` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_member_medication` ENABLE KEYS */;


--
-- Definition of table `household_members`
--

DROP TABLE IF EXISTS `household_members`;
CREATE TABLE `household_members` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `house_no` varchar(100) DEFAULT NULL,
  `household_no` varchar(100) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `barangay_id` int(11) DEFAULT NULL,
  `barangay` varchar(100) DEFAULT NULL,
  `purok_id` int(11) DEFAULT NULL,
  `purok` varchar(100) DEFAULT NULL,
  `street_id` int(11) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  `household_f_name` varchar(100) DEFAULT NULL,
  `household_m_name` varchar(100) DEFAULT NULL,
  `household_l_name` varchar(100) DEFAULT NULL,
  `gender` varchar(100) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `marital_status` varchar(100) DEFAULT NULL,
  `no_occupancy_year` date DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `birth_place` varchar(100) DEFAULT NULL,
  `prior_residence` varchar(100) DEFAULT NULL,
  `email_address` varchar(100) DEFAULT NULL,
  `relation_to_household` varchar(100) DEFAULT NULL,
  `citizenship` varchar(100) DEFAULT NULL,
  `religion` varchar(100) DEFAULT NULL,
  `skills` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `household_members`
--

/*!40000 ALTER TABLE `household_members` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_members` ENABLE KEYS */;


--
-- Definition of table `household_members_educational_bacground`
--

DROP TABLE IF EXISTS `household_members_educational_bacground`;
CREATE TABLE `household_members_educational_bacground` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `household_members_id` int(11) DEFAULT NULL,
  `educational_status` varchar(100) DEFAULT NULL,
  `name_of_school` varchar(100) DEFAULT NULL,
  `highest_grade_computed` varchar(100) DEFAULT NULL,
  `year` date DEFAULT NULL,
  `achievements` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `household_members_educational_bacground`
--

/*!40000 ALTER TABLE `household_members_educational_bacground` DISABLE KEYS */;
/*!40000 ALTER TABLE `household_members_educational_bacground` ENABLE KEYS */;


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
  `house_no` varchar(100) DEFAULT NULL,
  `household_no` varchar(100) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `barangay_id` int(11) DEFAULT NULL,
  `barangay` varchar(100) DEFAULT NULL,
  `purok_id` int(11) DEFAULT NULL,
  `purok` varchar(100) DEFAULT NULL,
  `street_id` int(11) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  `building_type_id` int(11) DEFAULT NULL,
  `building_type` varchar(100) DEFAULT NULL,
  `building_condition_id` int(11) DEFAULT NULL,
  `building_condition` varchar(100) DEFAULT NULL,
  `no_rooms_for_sleeping` int(11) DEFAULT NULL,
  `toilet_type_id` int(11) DEFAULT NULL,
  `toilet_type` varchar(100) DEFAULT NULL,
  `bathroom_type_id` int(11) DEFAULT NULL,
  `bathroom_type` varchar(100) DEFAULT NULL,
  `solid_waste_disposal_method_id` int(11) DEFAULT NULL,
  `solid_waste_disposal_method` varchar(100) DEFAULT NULL,
  `kitchen_type_id` int(11) DEFAULT NULL,
  `kitchen_type` varchar(100) DEFAULT NULL,
  `transportation_type_id` int(11) DEFAULT NULL,
  `transportation_type` varchar(100) DEFAULT NULL,
  `roof_type_id` int(11) DEFAULT NULL,
  `roof_type` varchar(100) DEFAULT NULL,
  `wall_type_id` int(11) DEFAULT NULL,
  `wall_type` varchar(100) DEFAULT NULL,
  `floor_type_id` int(11) DEFAULT NULL,
  `floor_type` varchar(100) DEFAULT NULL,
  `communication_type_id` int(11) DEFAULT NULL,
  `communication_type` varchar(100) DEFAULT NULL,
  `fuel_use_for_lighting_id` int(11) DEFAULT NULL,
  `fuel_use_for_lighting` varchar(100) DEFAULT NULL,
  `fuel_use_for_cooking_id` int(11) DEFAULT NULL,
  `fuel_use_for_cooking` varchar(100) DEFAULT NULL,
  `water_source_id` int(11) DEFAULT NULL,
  `water_source` varchar(100) DEFAULT NULL,
  `drinking_water_source_distance` varchar(100) DEFAULT NULL,
  `nearest_water_source_distance` varchar(100) DEFAULT NULL,
  `no_of_household` varchar(100) DEFAULT NULL,
  `no_of_household_members` varchar(100) DEFAULT NULL,
  `occupancy_type` varchar(100) DEFAULT NULL,
  `is_land_owner` varchar(100) DEFAULT NULL,
  `is_bldg_owner` varchar(100) DEFAULT NULL,
  `tenure` varchar(100) DEFAULT NULL,
  `monthly_rental` varchar(100) DEFAULT NULL,
  `household_assets` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  `house_no` varchar(100) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `barangay_id` int(11) DEFAULT NULL,
  `barangay` varchar(100) DEFAULT NULL,
  `purok_id` int(11) DEFAULT NULL,
  `purok` varchar(100) DEFAULT NULL,
  `street_id` int(11) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  `building_type_id` int(11) DEFAULT NULL,
  `building_type` varchar(100) DEFAULT NULL,
  `building_condition_id` int(11) DEFAULT NULL,
  `building_condition` varchar(100) DEFAULT NULL,
  `no_rooms_for_sleeping` int(11) DEFAULT NULL,
  `toilet_type_id` int(11) DEFAULT NULL,
  `toilet_type` varchar(100) DEFAULT NULL,
  `bathroom_type_id` int(11) DEFAULT NULL,
  `bathroom_type` varchar(100) DEFAULT NULL,
  `solid_waste_disposal_method_id` int(11) DEFAULT NULL,
  `solid_waste_disposal_method` varchar(100) DEFAULT NULL,
  `kitchen_type_id` int(11) DEFAULT NULL,
  `kitchen_type` varchar(100) DEFAULT NULL,
  `transportation_type_id` int(11) DEFAULT NULL,
  `transportation_type` varchar(100) DEFAULT NULL,
  `roof_type_id` int(11) DEFAULT NULL,
  `roof_type` varchar(100) DEFAULT NULL,
  `wall_type_id` int(11) DEFAULT NULL,
  `wall_type` varchar(100) DEFAULT NULL,
  `floor_type_id` int(11) DEFAULT NULL,
  `floor_type` varchar(100) DEFAULT NULL,
  `communication_type_id` int(11) DEFAULT NULL,
  `communication_type` varchar(100) DEFAULT NULL,
  `fuel_use_for_lighting_id` int(11) DEFAULT NULL,
  `fuel_use_for_lighting` varchar(100) DEFAULT NULL,
  `fuel_use_for_cooking_id` int(11) DEFAULT NULL,
  `fuel_use_for_cooking` varchar(100) DEFAULT NULL,
  `water_source_id` int(11) DEFAULT NULL,
  `water_source` varchar(100) DEFAULT NULL,
  `drinking_water_source_distance` varchar(100) DEFAULT NULL,
  `nearest_water_source_distance` varchar(100) DEFAULT NULL,
  `assets` varchar(100) DEFAULT NULL,
  `no_of_household` int(11) DEFAULT NULL,
  `no_of_household_members` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `houses`
--

/*!40000 ALTER TABLE `houses` DISABLE KEYS */;
/*!40000 ALTER TABLE `houses` ENABLE KEYS */;


--
-- Definition of table `kicthen_types`
--

DROP TABLE IF EXISTS `kicthen_types`;
CREATE TABLE `kicthen_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kicthen_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kicthen_types`
--

/*!40000 ALTER TABLE `kicthen_types` DISABLE KEYS */;
INSERT INTO `kicthen_types` (`id`,`kicthen_type`) VALUES 
 (1,'Inside'),
 (2,'Outside (built)'),
 (3,'Outside (makeshift)'),
 (4,'None');
/*!40000 ALTER TABLE `kicthen_types` ENABLE KEYS */;


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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marital_statuses`
--

/*!40000 ALTER TABLE `marital_statuses` DISABLE KEYS */;
INSERT INTO `marital_statuses` (`id`,`marital_status`) VALUES 
 (1,'Single'),
 (2,'Married'),
 (3,'Annulled');
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
  `province` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `provinces`
--

/*!40000 ALTER TABLE `provinces` DISABLE KEYS */;
INSERT INTO `provinces` (`id`,`province`) VALUES 
 (1,'Abra'),
 (2,'Agusan del Norte'),
 (3,'Agusan del Sur'),
 (4,'Aklan'),
 (5,'Albay'),
 (6,'Antique'),
 (7,'Apayao'),
 (8,'Aurora'),
 (9,'Basilan'),
 (10,'Batanes'),
 (11,'Batangas'),
 (12,'Benguet'),
 (13,'Biliran'),
 (14,'Bohol'),
 (15,'Bukidnon'),
 (16,'Bulacan'),
 (17,'Cagayan'),
 (18,'Camarines Norte 	'),
 (19,'Camarines Sur'),
 (20,'Camiguin'),
 (21,'Capiz'),
 (22,'Catanduanes'),
 (23,'Cavite'),
 (24,'Cebu'),
 (25,'Compostela Valley'),
 (26,'Cotabato'),
 (27,'Davao del Norte'),
 (28,'Davao del Sur['),
 (29,'Davao Occidental'),
 (30,'Davao Oriental'),
 (31,'Dinagat Islands'),
 (32,'Eastern Samar'),
 (33,'Guimaras'),
 (34,'Ifugao'),
 (35,'Ilocos Norte'),
 (36,'Ilocos Sur'),
 (37,'Iloilo'),
 (38,'Isabela'),
 (39,'Kalinga'),
 (40,'La Union'),
 (41,'Laguna'),
 (42,'Lanao del Norte'),
 (43,'Lanao del Sur'),
 (44,'Leyte'),
 (45,'Maguindanao'),
 (46,'Marinduque'),
 (47,'Masbate'),
 (48,'Misamis Occidental'),
 (49,'Misamis Oriental'),
 (50,'Mountain Province'),
 (51,'Negros Occidental');
INSERT INTO `provinces` (`id`,`province`) VALUES 
 (52,'Negros Oriental'),
 (53,'Northern Samar'),
 (54,'Nueva Ecija'),
 (55,'Nueva Vizcaya'),
 (56,'Occidental Mindoro'),
 (57,'Oriental Mindoro'),
 (58,'Palawan'),
 (59,'Pampanga'),
 (60,'Pangasinan'),
 (61,'Quezon'),
 (62,'Quirino'),
 (63,'Rizal'),
 (64,'Romblon'),
 (65,'Samar'),
 (66,'Sarangani'),
 (67,'Siquijor'),
 (68,'Sorsogon'),
 (69,'South Cotabato'),
 (70,'Southern Leyte'),
 (71,'Sultan Kudarat'),
 (72,'Sulu'),
 (73,'Surigao del Norte'),
 (74,'Surigao del Sur'),
 (75,'Tarlac'),
 (76,'Tawi-Tawi'),
 (77,'Zambales'),
 (78,'Zamboanga del Norte'),
 (79,'Zamboanga del Sur'),
 (80,'Zamboanga Sibugay'),
 (81,'Metro Manila'),
 (82,'Bataan');
/*!40000 ALTER TABLE `provinces` ENABLE KEYS */;


--
-- Definition of table `puroks`
--

DROP TABLE IF EXISTS `puroks`;
CREATE TABLE `puroks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `barangay_id` varchar(100) DEFAULT NULL,
  `barangay` varchar(100) DEFAULT NULL,
  `purok` varchar(100) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `puroks`
--

/*!40000 ALTER TABLE `puroks` DISABLE KEYS */;
/*!40000 ALTER TABLE `puroks` ENABLE KEYS */;


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
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `barangay_id` int(11) DEFAULT NULL,
  `barangay` varchar(100) DEFAULT NULL,
  `purok_id` int(11) DEFAULT NULL,
  `purok` varchar(100) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `streets`
--

/*!40000 ALTER TABLE `streets` DISABLE KEYS */;
INSERT INTO `streets` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay_id`,`barangay`,`purok_id`,`purok`,`street`) VALUES 
 (1,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Rovira Road'),
 (2,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Piapi-Bantayan Road'),
 (3,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Magsaysay'),
 (4,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Osme¤a'),
 (5,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Quezon'),
 (6,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'EJ Blanca'),
 (7,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Kamagong'),
 (8,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Dao'),
 (9,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Molave'),
 (10,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Narra'),
 (11,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Yakal'),
 (12,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Tindalo');
INSERT INTO `streets` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay_id`,`barangay`,`purok_id`,`purok`,`street`) VALUES 
 (13,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Aldecoa'),
 (14,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Looc-Piapi Road'),
 (15,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'JP Martinez'),
 (16,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Flores'),
 (17,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Katada'),
 (18,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Hibbard Ave'),
 (19,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Dumaguete North Road'),
 (20,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Route 8'),
 (21,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Camanjac Road'),
 (22,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Larena Drive'),
 (23,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Espina Road'),
 (24,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Palipinon Dumaguete Road');
INSERT INTO `streets` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay_id`,`barangay`,`purok_id`,`purok`,`street`) VALUES 
 (25,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Dr. V. Locsin'),
 (26,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Maciano Road'),
 (27,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Independencia'),
 (28,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'TAFT'),
 (29,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Colon'),
 (30,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Balugo Dumaguete Road'),
 (31,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Dumaguete-Valencia Road'),
 (32,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Canday-ong Road'),
 (33,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Uypitching'),
 (34,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'LUKEWRIGHT'),
 (35,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Sta. Rosa'),
 (36,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Perdices');
INSERT INTO `streets` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay_id`,`barangay`,`purok_id`,`purok`,`street`) VALUES 
 (37,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Siliman Ave'),
 (38,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Cervantes '),
 (39,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Real'),
 (40,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Ma. Cristina'),
 (41,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'San Juan'),
 (42,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'NOBLEFRANCA'),
 (43,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'San Jose'),
 (44,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Legaspi'),
 (45,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Teves'),
 (46,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Burgos'),
 (47,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Sta. Catalina'),
 (48,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Pinili');
INSERT INTO `streets` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay_id`,`barangay`,`purok_id`,`purok`,`street`) VALUES 
 (49,52,'Negros Oriental',108,'Dumaguete City',NULL,NULL,NULL,NULL,'Rizal Avenue'),
 (50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Rovira Rd.'),
 (51,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Piapi-Bantayan Rd.',NULL),
 (52,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Looc-Piapi Rd. '),
 (53,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Magsaysay '),
 (54,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Osmena '),
 (55,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Quezon '),
 (56,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Route 7'),
 (57,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'EJ Blanco '),
 (58,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Kamagon '),
 (59,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Dao '),
 (60,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Narra '),
 (61,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Yakal'),
 (62,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Tindalo '),
 (63,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Molave '),
 (64,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Route B ');
INSERT INTO `streets` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay_id`,`barangay`,`purok_id`,`purok`,`street`) VALUES 
 (65,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Dumaguete North Rd. '),
 (66,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Aldecoa Rd.'),
 (67,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Hibbard Ave. '),
 (68,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Flores '),
 (69,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Pier 1 '),
 (70,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Pier 2 '),
 (71,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'JP Martinez'),
 (72,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Katada '),
 (73,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Silliman Ave. '),
 (74,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'San Juan '),
 (75,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Noble Franca '),
 (76,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'San Jose'),
 (77,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,' Legaspi '),
 (78,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Teves '),
 (79,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Burgos '),
 (80,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Pinili ');
INSERT INTO `streets` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay_id`,`barangay`,`purok_id`,`purok`,`street`) VALUES 
 (81,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Rizal Ave.'),
 (82,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Sta. Catalina '),
 (83,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Luke Wright '),
 (84,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Sta. Rosa '),
 (85,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Katada  '),
 (86,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Ma. Cristina '),
 (87,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Taft '),
 (88,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Independencia '),
 (89,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Cervantes '),
 (90,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Colon '),
 (91,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Dr. Mariano Rd.'),
 (92,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Dr. V Locsin '),
 (93,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Espina Rd.'),
 (94,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,' Camanjac Rd. '),
 (95,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Larena Rd. '),
 (96,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Palinpinon Dumaguete Rd.');
INSERT INTO `streets` (`id`,`province_id`,`province`,`city_id`,`city`,`barangay_id`,`barangay`,`purok_id`,`purok`,`street`) VALUES 
 (97,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Balugo Dgte. Rd. '),
 (98,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Dumaguete Valencia Rd. '),
 (99,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Dumaguete South Rd. '),
 (100,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Canday-Ong Rd. '),
 (101,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Uypitching');
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
