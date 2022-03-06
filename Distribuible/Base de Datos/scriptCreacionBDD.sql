-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: nutritiva
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `idcliente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `dni` int DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` bigint DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (2,'Roberto','Urquia',1,'Int. Urquia esq. Sarmiento',3584392564),(3,'Belen','Salera',1,'',3585186127),(4,'Patri','Carloni',1,'',3585617368),(5,'Cari','Pedraza',1,'',3584388600),(8,'Gabi','Salera',1,'',3585168833),(9,'Cata','Martinez',1,'',0),(10,'Ethel','Cavalchini',1,'',3585092797),(11,'Diego ','Calderon',1,'',3585609065),(12,'Jessica','Vera',1,'',3584825930),(13,'Belen','Casale',1,'',3584190125),(14,'Pitty','Marengo',1,'',3584821178),(15,'Negra','Serassio',1,'',3584907790),(16,'Alcira','Medina',1,'',3583640407),(17,'Maggi','Perucca',1,'',3584224349),(18,'Ceci','Urquia',1,'',3513081999),(19,'Patri','Alanis',1,'',3584242753),(20,'Majo','Antonelli',1,'',3584818932),(21,'Roma','Vecina',1,'',3534273568),(22,'Miguel ','Calderon',1,'',0),(23,'Caro','Berro',1,'',3584296778),(24,'Anamar','Saldaño',1,'',3585043990),(25,'Mica','Sequeira',1,'',3584129064),(26,'Oscar','Breitkopf',1,'',3584826358),(27,'Gabi','Barbieri',30808769,'',3584122315),(50,'Ivan ','Gomez',1,'',3584362812),(51,'Javier ','Gomez',1,'',3584242601),(52,'Analia','Perlo',1,'',3585163426),(53,'Hector','Ponsetti',1,'',3584907914),(54,'Sole ','Palacios',1,'',3584374475),(55,'Eliana','Torres',1,'',0),(56,'Fran','Grosso',1,'',3584122424),(59,'Luciana','Diaz',1,'',3585092054),(60,'Susana','Bertone',1,'',0),(61,'Juanqui','Suarez',1,'',3584365573),(62,'Alvaro','Ferrero',1,'',3585486991),(63,'Aldo','Galimbertti',1,'',3534192920),(64,'Miqueas','Magallanes',1,'',3585607296),(65,'Lala','Mugna',1,'',3584387190),(66,'Julio','Destefanis',1,'',3585626655),(67,'Susana','Morra',1,'',3584184022),(68,'Eugenia ','Ceridono',1,'',3584181292),(69,'Sol','Vignati',1,'',3584363485),(70,'Cari','Machuca',1,'',3584194379),(71,'Dai','Ramos',1,'',3585173035),(72,'Mile','Chiaramello',1,'',3584903939),(73,'Pao','Moyano',1,'',3584390550),(74,'Haidee','Bustos',1,'',3585616101),(75,'Ana','Trejo',1,'',3584188583),(76,'Carlos','Montiel',1,'',3585042462),(78,'Romina','Brignone',1,'',3585600764),(80,'Marcia','Valle',1,'',3468566805),(81,'Roman','Host',1,'',3584816109),(82,'Dani','Presiutti',1,'',3585603594),(83,'Juan Carlos','Palacios',1,'',3584834167),(84,'Manu','Stucky',1,'',3584290030),(85,'Rosana ','Ruffer',1,'',3584198194),(86,'Tito','Caudana',1,'',3584118693),(87,'Humberto','Scataglini',1,'',3584360986),(88,'Mati','Toffolo',1,'',3534454687),(89,'Canela ','Raimonda',1,'',3584287816),(91,'Tomas','Re',1,'',3534266405),(92,'Alexandra','Hurrass',1,'',3584247657),(93,'Diego ','Chamas',1,'',3534236224),(94,'Martin','Pignattelli',1,'',3584287214),(95,'Lara','Salvaterra',1,'Bv 9 de Julio 375',3586002455),(96,'Eva','Crivello',1,'Corrientes 79',3584907388),(97,'Gloria','Albano',1,'',3584821139),(98,'Noe ','Genesio',1,'',3584366223),(99,'Maria','Correcaminos',1,'',3585146949),(100,'Benjamin','Amelong',37079368,'',3584127002),(101,'Gabi','Freytes',1,'',3584369602),(102,'Martin','Crivello',37523549,'',3585049637),(103,'Julio','Gorosito',1,'',3584834849),(104,'Gabi','Bancor',1,'',3534233979),(105,'Gabi','Interdonatto',1,'',3584111217),(106,'Agus','Gariglio',1,'',3534064065),(107,'Silvia','Visozo',1,'',3585603345),(108,'Fede','Bertazo',1,'',3584224843),(109,'Alicia','Scataglini',4,'a',3584245114),(111,'Alicia','Scataglini',4,'a',3584245114);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientos`
--

DROP TABLE IF EXISTS `movimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimientos` (
  `idmovimiento` int NOT NULL AUTO_INCREMENT,
  `monto` float NOT NULL,
  `especificacion` varchar(200) NOT NULL,
  `ingreso` tinyint NOT NULL,
  `efectivo` tinyint NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`idmovimiento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientos`
--

LOCK TABLES `movimientos` WRITE;
/*!40000 ALTER TABLE `movimientos` DISABLE KEYS */;
/*!40000 ALTER TABLE `movimientos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `idpedido` int NOT NULL AUTO_INCREMENT,
  `cliente` varchar(45) DEFAULT NULL,
  `vianda` varchar(45) DEFAULT NULL,
  `unidades` int DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `dias` enum('Lunes','Martes','MiercolesC','MiercolesP','Jueves','Viernes') NOT NULL,
  `tipo` enum('Almuerzo','Cena','AyC') DEFAULT NULL,
  PRIMARY KEY (`idpedido`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idusuarios` int NOT NULL AUTO_INCREMENT,
  `user` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`idusuarios`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'admin','admin'),(2,'root','toor'),(3,'Juani','Lavini');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `idventa` int NOT NULL AUTO_INCREMENT,
  `cliente` varchar(45) NOT NULL,
  `vianda` varchar(45) NOT NULL,
  `unidades` int NOT NULL,
  `precio` float NOT NULL,
  `fecha` date NOT NULL,
  `tipo` enum('Almuerzo','Cena','AyC') NOT NULL,
  PRIMARY KEY (`idventa`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,'Diego  Calderon','Ensalada',1,320,'2021-12-01','Almuerzo'),(2,'Ethel Cavalchini','Tarta con carne',1,260,'2021-12-01','Almuerzo'),(3,'Gabi Salera','Cena',1,700,'2021-12-01','Almuerzo');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `viandas`
--

DROP TABLE IF EXISTS `viandas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `viandas` (
  `idvianda` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `precio` float NOT NULL,
  PRIMARY KEY (`idvianda`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viandas`
--

LOCK TABLES `viandas` WRITE;
/*!40000 ALTER TABLE `viandas` DISABLE KEYS */;
INSERT INTO `viandas` VALUES (2,'Almuerzo Reforzado',400),(3,'Cena',350),(4,'Cena Reforzada',350),(5,'Menù infantil',160),(6,'Ensalada',160),(7,'Ensalada especial',200),(9,'Tarta con carne',130),(10,'Sandwichs',110),(12,'Postre',60),(13,'EFG',150),(14,'EFC',100),(15,'EnFcAs',105),(18,'Tarta individual',110),(19,'EFC',100),(20,'EFC',100);
/*!40000 ALTER TABLE `viandas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-01 18:30:20
