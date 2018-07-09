-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 18, 2016 at 04:32 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `ID` int(20) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(100) NOT NULL,
  `Age` varchar(20) NOT NULL,
  `Country` varchar(50) NOT NULL,
  `Town` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `NIDNo` varchar(30) NOT NULL,
  `MblNO` varchar(15) NOT NULL,
  `Password` varchar(15) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20 ;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`ID`, `FirstName`, `LastName`, `Age`, `Country`, `Town`, `Address`, `NIDNo`, `MblNO`, `Password`) VALUES
(7, '', '', '', '', '', '', '', '', ''),
(8, 'qa', 'qdw', 'wef', 'fwe3f', 'efef', 'wefwe', 'efe', 'efe', 'fef'),
(9, '', '', '', '', '', '', '', '', ''),
(10, '', '', '', '', '', '', '', '', ''),
(11, '', '', '', '', '', '', '', '', ''),
(12, '', '', '', '', '', '', '', '', ''),
(13, '', '', '', '', '', '', '', '', ''),
(14, '', '', '', '', '', '', '', '', ''),
(15, '', '', '', '', '', '', '', '', ''),
(16, '', '', '', '', '', '', '', '', ''),
(17, '', '', '', '', '', '', '', '', ''),
(18, '', '', '', '', '', '', '', '', ''),
(19, '', '', '', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `dining`
--

CREATE TABLE IF NOT EXISTS `dining` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `CustomerName` varchar(30) NOT NULL,
  `Meal` varchar(30) NOT NULL,
  `Persons` varchar(20) NOT NULL,
  `Status` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `dining`
--

INSERT INTO `dining` (`id`, `CustomerName`, `Meal`, `Persons`, `Status`) VALUES
(1, 'Swapnil', 'Breakfast', '4', 'Booked'),
(2, '', 'Breakfast', '0', 'BOOKED'),
(3, '', '', '', 'vacant'),
(4, '', '', '', 'vacant'),
(5, '', '', '', 'vacant'),
(6, '', '', '', 'vacant'),
(7, '', '', '', 'vacant'),
(8, '', '', '', 'vacant'),
(9, '', '', '', 'vacant'),
(10, '', '', '', 'vacant'),
(11, '', '', '', 'vacant'),
(12, '', '', '', 'vacant'),
(13, '', '', '', 'vacant'),
(14, '', '', '', 'vacant'),
(15, '', '', '', 'vacant'),
(16, '', '', '', 'vacant'),
(17, '', '', '', 'vacant'),
(18, '', '', '', 'vacant'),
(19, '', '', '', 'vacant'),
(20, '', '', '', 'vacant');

-- --------------------------------------------------------

--
-- Table structure for table `employee_list`
--

CREATE TABLE IF NOT EXISTS `employee_list` (
  `WorkId` int(20) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(20) NOT NULL,
  `EmployeeType` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Salary` varchar(20) NOT NULL,
  `Status` varchar(20) NOT NULL,
  PRIMARY KEY (`WorkId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `employee_list`
--

INSERT INTO `employee_list` (`WorkId`, `FirstName`, `LastName`, `EmployeeType`, `Address`, `Phone`, `Salary`, `Status`) VALUES
(6, 'swapnil', 'biswas', 'jani nah', 'oitao jani nah', 'komu nah', 'onekkkk', 'OFF DUTY'),
(9, 'af', 'efc', 'edcws', 'fwsfc', 'fcws', 'wsfc', 'OFF DUTY');

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE IF NOT EXISTS `manager` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `First Name` varchar(20) NOT NULL,
  `Last Name` varchar(11) NOT NULL,
  `Post` varchar(11) NOT NULL,
  `Password` int(15) NOT NULL,
  `Salary` int(20) NOT NULL,
  `Contact No` int(20) NOT NULL,
  `Shift` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`ID`, `First Name`, `Last Name`, `Post`, `Password`, `Salary`, `Contact No`, `Shift`) VALUES
(1, 'Swapnil', 'Biswas', 'Manager', 140204021, 50000, 1723017782, 'Day'),
(2, 'Shahariar', 'Shibli', 'Manager', 140204027, 35000, 1711111111, 'NIght');

-- --------------------------------------------------------

--
-- Table structure for table `meetings`
--

CREATE TABLE IF NOT EXISTS `meetings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `CustomerName` varchar(20) NOT NULL,
  `ST` varchar(20) NOT NULL,
  `ET` varchar(20) NOT NULL,
  `Place` varchar(50) NOT NULL,
  `Status` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `meetings`
--

INSERT INTO `meetings` (`id`, `CustomerName`, `ST`, `ET`, `Place`, `Status`) VALUES
(0, '', '', '', 'Garden', 'vacant'),
(1, '', '12.00', '5.00', 'Garden', 'booked'),
(3, '', '', '', 'loudge', 'vacant'),
(5, '', '', '', 'loudge', 'vacant'),
(6, '12', '123', '1234', 'Garden', 'vacant'),
(7, '12', '123', '1234', 'loudge', 'booked'),
(8, '12', '123', '1234', 'Garden', 'vacant'),
(9, '12', '123', '1234', 'loudge', 'booked'),
(10, '12', '123', '1234', 'Garden', 'booked'),
(11, '12', '123', '1234', 'loudge', 'vacant'),
(12, '12', '123', '1234', 'loudge', 'vacant'),
(13, '12', '123', '1234', 'loudge', 'vacant'),
(14, '12', '123', '1234', 'loudge', 'vacant'),
(15, '12', '123', '1234', 'Garden', 'vacant');

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE IF NOT EXISTS `rooms` (
  `RoomNO` int(11) NOT NULL AUTO_INCREMENT,
  `From` varchar(15) NOT NULL,
  `To` varchar(15) NOT NULL,
  `Type` varchar(15) NOT NULL,
  `Ready` varchar(10) NOT NULL,
  `Status` varchar(10) NOT NULL,
  PRIMARY KEY (`RoomNO`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2003 ;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`RoomNO`, `From`, `To`, `Type`, `Ready`, `Status`) VALUES
(2001, '11.02.16', '13.02.16', 'Premier', 'ok', 'booked'),
(2002, '12.02.16', '20.02.16', 'Deluxe', 'ok', 'vacant');

-- --------------------------------------------------------

--
-- Table structure for table `spa`
--

CREATE TABLE IF NOT EXISTS `spa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `CustomerName` varchar(20) NOT NULL,
  `Session` varchar(20) NOT NULL,
  `Persons` varchar(20) NOT NULL,
  `Status` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `spa`
--

INSERT INTO `spa` (`id`, `CustomerName`, `Session`, `Persons`, `Status`) VALUES
(1, 'Swapnil', '8:00 AM', '2', 'Booked'),
(2, '', '8:00 AM', '', 'vacant'),
(3, '', '8:00 AM', '', 'vacant'),
(4, '', '8:00 AM', '', 'vacant'),
(5, '', '11:30 AM', '', 'vacant'),
(6, '', '11:30 AM', '', 'vacant'),
(7, '', '11:30 AM', '', 'vacant'),
(8, '', '11:30 AM', '', 'vacant'),
(9, '', '6:00 PM', '', 'vacant'),
(10, '', '6:00 PM', '', 'vacant'),
(11, '', '6:00 PM', '', 'vacant'),
(12, '', '6:00 PM', '', 'vacant'),
(13, '', '8:00 PM', '', 'vacant'),
(14, '', '8:00 PM', '', 'vacant'),
(15, '', '8:00 PM', '', 'vacant'),
(16, '', '8:00 PM', '', 'vacant'),
(17, '', '10:00 PM', '', 'vacant'),
(18, '', '10:00 PM', '', 'vacant'),
(19, '', '10:00 PM', '', 'vacant'),
(20, '', '10:00 PM', '', 'vacant');

-- --------------------------------------------------------

--
-- Table structure for table `tourdetails`
--

CREATE TABLE IF NOT EXISTS `tourdetails` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `CustomerName` varchar(30) NOT NULL,
  `StartDate` varchar(30) NOT NULL,
  `Package` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `tourdetails`
--

INSERT INTO `tourdetails` (`id`, `CustomerName`, `StartDate`, `Package`) VALUES
(1, 'Swapnil', 'Feb 14, 2016', 'Dhaka ,Cox_Bazar, Saint Martin , Dhaka');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
