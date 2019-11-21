-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 21, 2019 at 12:55 AM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tpsb_banque`
--

-- --------------------------------------------------------

--
-- Table structure for table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `idCompte` int(11) NOT NULL AUTO_INCREMENT,
  `sold` varchar(255) CHARACTER SET latin1 NOT NULL,
  `solde` double NOT NULL,
  PRIMARY KEY (`idCompte`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data for table `compte`
--

INSERT INTO `compte` (`idCompte`, `sold`, `solde`) VALUES
(1, '5000', 0),
(2, '7000', 0),
(3, '3000', 0),
(4, '4000', 0);

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
CREATE TABLE IF NOT EXISTS `transaction` (
  `idTransaction` int(11) NOT NULL AUTO_INCREMENT,
  `idCompte` int(11) NOT NULL,
  `montant` double NOT NULL,
  `dateTransaction` datetime NOT NULL,
  `dateDebit` varchar(255) NOT NULL,
  PRIMARY KEY (`idTransaction`),
  KEY `idCompte` (`idCompte`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`idTransaction`, `idCompte`, `montant`, `dateTransaction`, `dateDebit`) VALUES
(1, 1, 2000, '2015-01-02 23:15:00', '2019-11-20 23:45:05'),
(2, 2, 1800, '2015-01-02 13:15:00', '2019-11-20 23:45:07'),
(3, 3, 1000, '2015-01-05 09:15:00', '2019-11-20 23:45:08'),
(4, 4, 3100, '2015-10-02 00:15:00', '2019-11-20 23:45:10');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaction`
--
ALTER TABLE `transaction`
  ADD CONSTRAINT `FKcpuw2u15iwfd5745vatmrnu7y` FOREIGN KEY (`idCompte`) REFERENCES `compte` (`idCompte`),
  ADD CONSTRAINT `transaction_ibfk_1` FOREIGN KEY (`idCompte`) REFERENCES `compte` (`idCompte`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
