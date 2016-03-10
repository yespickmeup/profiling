
DROP TABLE IF EXISTS `blood_types`;
CREATE TABLE `blood_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `blood_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood_types`
--

/*!40000 ALTER TABLE `blood_types` DISABLE KEYS */;
INSERT INTO `blood_types` (`id`,`blood_type`) VALUES 
 (1,'O+'),
 (2,'O-'),
 (3,'A+'),
 (4,'A-'),
 (5,'B+'),
 (6,'B-'),
 (7,'AB+'),
 (8,'AB-');
/*!40000 ALTER TABLE `blood_types` ENABLE KEYS */;