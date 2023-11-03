-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 03, 2023 at 10:09 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kereta6`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `ID_User` char(10) NOT NULL,
  `Password` char(5) NOT NULL,
  `No_Telepon` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ID_User`, `Password`, `No_Telepon`) VALUES
('A112200001', '12345', '08913246789');

-- --------------------------------------------------------

--
-- Table structure for table `jadwalkereta`
--

CREATE TABLE `jadwalkereta` (
  `Id_Kereta` int(11) NOT NULL,
  `Nama_Kereta` varchar(20) NOT NULL,
  `Tipe_Kereta` varchar(25) NOT NULL,
  `Rute` varchar(30) NOT NULL,
  `Jarak` varchar(10) NOT NULL,
  `Stasiun` varchar(30) NOT NULL,
  `Waktu_Keberangkatan` varchar(20) NOT NULL,
  `Waktu_Kedatangan` varchar(20) NOT NULL,
  `Tanggal` date NOT NULL,
  `ADMIN_ID_User` char(10) NOT NULL,
  `KARYAWAN_Id_Karyawan` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jadwalkereta`
--

INSERT INTO `jadwalkereta` (`Id_Kereta`, `Nama_Kereta`, `Tipe_Kereta`, `Rute`, `Jarak`, `Stasiun`, `Waktu_Keberangkatan`, `Waktu_Kedatangan`, `Tanggal`, `ADMIN_ID_User`, `KARYAWAN_Id_Karyawan`) VALUES
(1, 'Argo Parahyangan', 'KAJJ', 'Bandung-Gambir', '169 Km', 'Bandung', '09:00:00', '12:00:00', '2023-11-01', 'A112200001', 'C0001'),
(2, 'Taksaka', 'KAJJ', 'Yogyakarta-Gambir', '512 Km', 'Yogyakartra', '09:00:00', '15:00:00', '2023-11-01', 'A112200001', 'C0001');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `Id_Karyawan` char(5) NOT NULL,
  `Nama_Karyawan` varchar(20) NOT NULL,
  `Shift_Kerja` varchar(20) NOT NULL,
  `Jabatan` varchar(30) NOT NULL,
  `KARYAWAN_Id_Karyawan` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`Id_Karyawan`, `Nama_Karyawan`, `Shift_Kerja`, `Jabatan`, `KARYAWAN_Id_Karyawan`) VALUES
('C0001', 'Uswatun', 'Senin-Rabu', 'PJ_Karyawan', 'C0001');

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `ID_User` char(10) NOT NULL,
  `Password` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`ID_User`, `Password`) VALUES
('A112200001', '12345'),
('B112200001', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `penumpang`
--

CREATE TABLE `penumpang` (
  `ID_User` char(10) NOT NULL,
  `Password` char(5) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `JADWAL_KERETA_Id_Kereta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penumpang`
--

INSERT INTO `penumpang` (`ID_User`, `Password`, `Nama`, `JADWAL_KERETA_Id_Kereta`) VALUES
('B112200001', '12345', 'Silva', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID_User`);

--
-- Indexes for table `jadwalkereta`
--
ALTER TABLE `jadwalkereta`
  ADD PRIMARY KEY (`Id_Kereta`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`Id_Karyawan`),
  ADD KEY `KARYAWAN_KARYAWAN_FK` (`KARYAWAN_Id_Karyawan`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`ID_User`);

--
-- Indexes for table `penumpang`
--
ALTER TABLE `penumpang`
  ADD PRIMARY KEY (`ID_User`),
  ADD KEY `PENUMPANG_JADWALKERETA_FK` (`JADWAL_KERETA_Id_Kereta`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jadwalkereta`
--
ALTER TABLE `jadwalkereta`
  MODIFY `Id_Kereta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `ADMIN_PENGGUNA_FK` FOREIGN KEY (`ID_User`) REFERENCES `pengguna` (`ID_User`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD CONSTRAINT `KARYAWAN_KARYAWAN_FK` FOREIGN KEY (`KARYAWAN_Id_Karyawan`) REFERENCES `karyawan` (`Id_Karyawan`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `penumpang`
--
ALTER TABLE `penumpang`
  ADD CONSTRAINT `PENUMPANG_JADWALKERETA_FK` FOREIGN KEY (`JADWAL_KERETA_Id_Kereta`) REFERENCES `jadwalkereta` (`Id_Kereta`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `PENUMPANG_PENGGUNA_FK` FOREIGN KEY (`ID_User`) REFERENCES `pengguna` (`ID_User`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
