-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: surfstuff
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accesorios`
--

DROP TABLE IF EXISTS `accesorios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accesorios` (
  `ID_accesorios` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `tipo` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `marca` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `para_tablas` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `para_trajes` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `otros` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `precio` int DEFAULT NULL,
  PRIMARY KEY (`ID_accesorios`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accesorios`
--

LOCK TABLES `accesorios` WRITE;
/*!40000 ALTER TABLE `accesorios` DISABLE KEYS */;
INSERT INTO `accesorios` VALUES (1,'COLD SESSION - 2.0 MM','CAPUCHA','MAGMA HOOD',NULL,'PARA TRAJES',NULL,70),(2,'XTENDHOOD COLD SESSION - 2.0 MM','CAPUCHA','XTEN HOOD',NULL,'PARA TRAJES',NULL,100),(3,'LOBSTER - 5 MM','GUANTES','MAGMA',NULL,'PARA TRAJES',NULL,90),(4,'LOBSTER - 2.5 MM','GUANTES','MAGMA',NULL,'PARA TRAJES',NULL,90),(5,'OPEN PALM - 2.5 MM','GUANTES','MAGMA',NULL,'PARA TRAJES',NULL,80),(6,'COLD SESSION - 2.5 MM','GUANTES','MAGMA',NULL,'PARA TRAJES',NULL,70),(7,'XTEND GLOVES LOBSTER - 2.0 MM','GUANTES','XTEND',NULL,'PARA TRAJES',NULL,70),(8,'X10D GLOVES COLD SESSION - 2.0 MM','GUANTES','X10D',NULL,'PARA TRAJES',NULL,80),(9,'MAGMA BOOTS ROUND TOE - 7.0 MM','BOTAS','MAGMA',NULL,'PARA TRAJES',NULL,60),(10,'MAGMA BOOTS ROUND TOE - 5.0 MM','BOTAS','MAGMA',NULL,'PARA TRAJES',NULL,60),(11,'MAGMA BOOTS SPLIT TOE - 5.0 MM','BOTAS','MAGMA',NULL,'PARA TRAJES',NULL,80),(12,'X10D BOOTS ROUND TOE - 3.0 MM','BOTAS','X10D',NULL,'PARA TRAJES',NULL,50),(13,'X10D BOOTS SPLIT TOE - 3.0 MM','BOTAS','X10D',NULL,'PARA TRAJES',NULL,80),(14,'MAGMA CAP COLD SESSION - 2.0 MM','GORRA','X10D',NULL,'PARA TRAJES',NULL,80),(15,'SEAFARER CAP COLD SESSION - 3.0 MM','GORRA','SEAFARER',NULL,'PARA TRAJES',NULL,50);
/*!40000 ALTER TABLE `accesorios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tablas`
--

DROP TABLE IF EXISTS `tablas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tablas` (
  `ID_tablas` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `tipo` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `marca` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `material` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `tamanio` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `disenio` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `Precio` int DEFAULT NULL,
  PRIMARY KEY (`ID_tablas`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tablas`
--

LOCK TABLES `tablas` WRITE;
/*!40000 ALTER TABLE `tablas` DISABLE KEYS */;
INSERT INTO `tablas` VALUES (1,'ROCKET SURF','FOIL SURF','F-ONE','BAMBOO','4’3-44’11','CONCAVE DECK',600),(2,'ROCKET SUP DOWNWIND PRO CARBON','SUP','F-ONE','CARBON FIBER','18’’-20’’',NULL,800),(3,'ROCKET SUP DOWNWIND PRO','SUP','F-ONE','BAMBOO','18’’-20’’',NULL,600),(4,'ROCKET SUP DOWNWIND','SUP','F-ONE','BAMBOO','5’10-6’6',NULL,700),(5,'ROCKET Air 4\'10','SUP','F-ONE','DROPSTITCH','4’10',NULL,1200),(6,'ROCKET AIR 5\'4','SUP','F-ONE','DROPSTITCH','5’4',NULL,1100),(7,'MITU PRO CARBON','SURF','F-ONE','FOAM CARBON','5’2-5’10',NULL,1300),(8,'SHADOW','SURF','F-ONE','FOAM Flex','5’4-5’8',NULL,1300),(9,'MITU PRO BAMBOO','SURF','F-ONE','BAMBOO','5’2-5’10',NULL,1300),(10,'SLICE BAMBOO','SURF','F-ONE','BAMBOO','5’1-5’5',NULL,1100),(11,'MITU Pro Bamboo Foil','SURF','F-ONE','BAMBOO','5’6-5’10',NULL,1100),(12,'SLICE Bamboo Foil','SURF','F-ONE','BAMBOO','5’1-5’5',NULL,1500),(13,'TWEAK','SURF','F-ONE','Foam Flex','5’2-5’4',NULL,1300),(14,'MAGNET Carbon','SURF','F-ONE','CARBON','4’11-5’1',NULL,1000),(15,'MITU Pro Flex','SURF','F-ONE','Foam Flex','5’2-5’10',NULL,1400),(16,'WTF?!','SURF','F-ONE','WOOD','127 x 37 cm-140 x 42.5 cm',NULL,1700),(17,'TRAX HRD CARBON','SURF','F-ONE','CARBON','135 x 39 cm-140 x 45 cm',NULL,700),(18,'TRAX HRD Lite Tech','SURF','F-ONE','WOOD','135 x 37 cm-140 x 45 cm',NULL,800),(19,'TRAX','SURF','F-ONE','WOOD','132 x 37 cm-137 x 42',NULL,800),(20,'ONE','SURF','F-ONE','WOOD','138 x40 cm-150 x 48 cm',NULL,1200),(21,'BIG ONE','SURF','F-ONE','WOOD','160 x 45 cm-164 x 48 cm',NULL,500),(22,'GUN Long Distance','SURF','F-ONE','BAMBOO','200 x 43,5 cm',NULL,700),(23,'Speed Gun AC21 Pro Model','SURF','F-ONE','WOOD','157 x 29 cm',NULL,800),(24,'SIT-KITE SURFBOARD','SURF','F-ONE','WOOD','157 x 29 cm',NULL,1000);
/*!40000 ALTER TABLE `tablas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trajes`
--

DROP TABLE IF EXISTS `trajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trajes` (
  `ID_trajes` int NOT NULL AUTO_INCREMENT,
  `marca` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `temporada` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `material` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `talle` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `grosor` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `tipo_de_cierre` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `nombre` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `precio` int DEFAULT NULL,
  PRIMARY KEY (`ID_trajes`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trajes`
--

LOCK TABLES `trajes` WRITE;
/*!40000 ALTER TABLE `trajes` DISABLE KEYS */;
INSERT INTO `trajes` VALUES (1,'ALT','VERANO','YULEX rubber','XS-XXL','MEDIO','FRONTAL','STEAMER - 5.4.3',1000),(2,'ALT','VERANO','YULEX rubber','XS-XXL','MEDIO','FRONTAL','STEAMER - 4.3',500),(3,'MAGMA','INVIERNO','Triplex MAGMA','XS-XXL','ALTO','FRONTAL','STEAMER HOODED - 6.4',500),(4,'MAGMA','INVIERNO','Triplex MAGMA','XS-XXL','ALTO','FRONTAL','STEAMER HOODED - 5.4.3',400),(5,'MAGMA','INVIERNO','Triplex MAGMA','XS-XXL','ALTO','FRONTAL','STEAMER - 5.4.3',800),(6,'MAGMA','INVIERNO','Triplex MAGMA','XS-XXL','ALTO','FRONTAL','STEAMER - 4.3',800),(7,'X10D','INVIERNO','Triplex X10D','XS-XXL','ALTO','FRONTAL','X10D STEAMER - 5.4.3',600),(8,'X10D','INVIERNO','Triplex X10D','XS-XXL','ALTO','FRONTAL','HOODED - 4.3',800),(9,'X10D','VERANO','Triplex X10D','XS-XXL','MEDIO','FRONTAL','X10D STEAMER - 4.3',900),(10,'X10D','INVIERNO','Triplex X10D','XS-XXL','ALTO','FRONTAL','X10D STEAMER - 3.2',900),(11,'SEAFARER','VERANO',' Triplex SEAFARER','XS-XXL','MEDIO','FRONTAL','SEAFARER+ STEAMER - 5.3',400),(12,'SEAFARER','VERANO','Triplex SEAFARER','XS-XXL','MEDIO','TRASERO','SEAFARER+ STEAMER BACKZIP - 5.3',500),(13,'SEAFARER','VERANO','Triplex SEAFARER','XS-XXL','MEDIO','FRONTAL','SEAFARER+ STEAMER - 4.3',500),(14,'SEAFARER','VERANO','Triplex SEAFARER','XS-XXL','MEDIO','FRONTAL','SEAFARER+ STEAMER - 3.2',600),(15,'SEAFARER','VERANO','Triplex SEAFARER','XS-XXL','MEDIO','FRONTAL','SEAFARER STEAMER - 5.3',600);
/*!40000 ALTER TABLE `trajes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-11 20:25:04