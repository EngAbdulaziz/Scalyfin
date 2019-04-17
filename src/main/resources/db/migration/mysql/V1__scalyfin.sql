-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.9-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for scalyfin
CREATE DATABASE IF NOT EXISTS `scalyfin` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `scalyfin`;

-- Dumping structure for table scalyfin.unit_type
CREATE TABLE IF NOT EXISTS `unit_type` (
  `Unit_Type_Code` int(11) NOT NULL AUTO_INCREMENT,
  `Unit_Type_Description` varchar(200) NOT NULL,
  `Unit_Type_End_Date` date NOT NULL,
  `Is_Deleted` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Unit_Type_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
