-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: mzamomtsha_registration
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `learner_details`
--

DROP TABLE IF EXISTS `learner_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `learner_details` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL DEFAULT 'Null',
  `Surname` varchar(45) NOT NULL DEFAULT 'Null',
  `Grade` int NOT NULL DEFAULT '1',
  `Gender` varchar(45) NOT NULL,
  `GaurdianDoc` mediumblob,
  `Gaurdian_Citizenship` mediumblob,
  `Parent_ID` int NOT NULL DEFAULT '0',
  `Extra_file` mediumblob,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `learner_details`
--

LOCK TABLES `learner_details` WRITE;
/*!40000 ALTER TABLE `learner_details` DISABLE KEYS */;
INSERT INTO `learner_details` VALUES (1,'Alex','Kromker',11,'Male',NULL,NULL,2,NULL),(6,'asda','asda',4,'Female',_binary 'C:UsersAlexOneDriveDocumentsDownloadsSWOT-individual anlysis_ Alex Kromker.docx',_binary 'C:UsersAlexOneDriveDocumentsDownloadsSWOT-individual anlysis_ Alex Kromker.docx',2,_binary 'C:UsersAlexOneDriveDocumentsDownloadsSWOT-individual anlysis_ Alex Kromker.docx'),(7,'Megan','Kromker',5,'Female',_binary 'C:UsersAlexOneDriveDocumentsDownloadsSWOT-individual anlysis_ Alex Kromker.docx',_binary 'C:UsersAlexOneDriveDocumentsDownloadsSWOT-individual anlysis_ Alex Kromker.docx',2,_binary 'null'),(8,'Jason','Crawley',3,'Male',_binary 'null',_binary 'C:UsersAlexOneDriveDocumentsDownloadsSWOT-individual anlysis_ Alex Kromker.docx',7,_binary 'C:UsersAlexOneDriveDocumentsDownloadsSWOT-individual anlysis_ Alex Kromker.docx'),(9,'Dewald','Eaby',4,'Male',_binary 'C:UsersAlexOneDriveDocumentsDownloadsSWOT-individual anlysis_ Alex Kromker.docx',_binary 'C:UsersAlexOneDriveDocumentsDownloadsSWOT-individual anlysis_ Alex Kromker.docx',3,_binary 'null');
/*!40000 ALTER TABLE `learner_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-24 13:19:12
