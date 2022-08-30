-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-08-2022 a las 17:47:20
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `reyxa`
--
CREATE DATABASE IF NOT EXISTS `reyxa` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `reyxa`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comandos`
--

CREATE TABLE `comandos` (
  `id_comando` int(11) NOT NULL,
  `nombre` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `id_descripcion` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `comandos`
--

INSERT INTO `comandos` (`id_comando`, `nombre`, `id_descripcion`) VALUES
(1, 'notepad', 1),
(2, 'explorer', 2),
(3, 'paint', 3),
(4, 'calculadora', 4),
(5, 'wconfig', 5),
(6, 'clima', 6),
(7, 'noticias', 7),
(8, 'instagram', 8),
(9, 'whatsapp', 9),
(10, 'gmail', 10),
(11, 'netflix', 11),
(12, 'spotify', 12),
(13, 'youtube', 13),
(14, 'progapagado', 14),
(15, 'cancapagado', 15),
(16, 'antivirus', 16),
(17, 'wupdate', 17),
(18, 'papelera1', 18),
(19, 'papelera2', 19),
(20, 'papelera3', 20),
(21, 'papelera4', 21),
(22, 'papelera5', 22),
(23, 'papelera6', 23),
(24, 'papelera7', 24),
(25, 'papelera8', 25),
(26, 'papelera9', 26),
(27, 'papelera10', 27),
(28, 'papelera11', 28),
(29, 'papelera12', 29),
(30, 'papelera13', 30),
(31, 'papelera14', 31),
(32, 'papelera15', 32),
(33, 'papelera16', 33),
(34, 'papelera17', 34),
(35, 'papelera18', 35),
(36, 'papelera19', 36),
(37, 'papelera20', 37),
(38, 'papelera21', 38),
(39, 'papelera22', 39),
(40, 'papelera23', 40),
(41, 'papelera24', 41),
(42, 'papelera25', 42);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `descripcion_comandos`
--

CREATE TABLE `descripcion_comandos` (
  `id_descripcion` int(11) NOT NULL,
  `descripcion` varchar(80) COLLATE utf8_bin DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `descripcion_comandos`
--

INSERT INTO `descripcion_comandos` (`id_descripcion`, `descripcion`) VALUES
(1, 'start notepad.exe'),
(2, 'start explorer.exe'),
(3, 'start mspaint.exe'),
(4, 'start calc.exe'),
(5, 'start ms-settings:'),
(6, 'start https://www.smn.gob.ar/'),
(7, 'start https://news.google.com/topstories?hl=es-419&gl=US&ceid=US:es-419'),
(8, 'start https://www.instagram.com/?theme=dark'),
(9, 'start https://web.whatsapp.com/'),
(10, 'start https://mail.google.com/mail/u/0/#inbox'),
(11, 'start https://www.netflix.com/ar/Login'),
(12, 'start https://open.spotify.com/'),
(13, 'start https://www.youtube.com/'),
(14, 'shutdown -s -t '),
(15, 'shutdown /a'),
(16, 'start-MpScan'),
(17, 'start ms-settings:windowsupdate'),
(18, 'rd /s /q a:\\\\$Recycle.bin'),
(19, 'rd /s /q b:\\\\$Recycle.bin'),
(20, 'rd /s /q c:\\\\$Recycle.bin'),
(21, 'rd /s /q d:\\\\$Recycle.bin'),
(22, 'rd /s /q e:\\\\$Recycle.bin'),
(23, 'rd /s /q f:\\\\$Recycle.bin'),
(24, 'rd /s /q g:\\\\$Recycle.bin'),
(25, 'rd /s /q h:\\\\$Recycle.bin'),
(26, 'rd /s /q i:\\\\$Recycle.bin'),
(27, 'rd /s /q j:\\\\$Recycle.bin'),
(28, 'rd /s /q k:\\\\$Recycle.bin'),
(29, 'rd /s /q l:\\\\$Recycle.bin'),
(30, 'rd /s /q m:\\\\$Recycle.bin'),
(31, 'rd /s /q n:\\\\$Recycle.bin'),
(32, 'rd /s /q o:\\\\$Recycle.bin'),
(33, 'rd /s /q p:\\\\$Recycle.bin'),
(34, 'rd /s /q r:\\\\$Recycle.bin'),
(35, 'rd /s /q s:\\\\$Recycle.bin'),
(36, 'rd /s /q t:\\\\$Recycle.bin'),
(37, 'rd /s /q u:\\\\$Recycle.bin'),
(38, 'rd /s /q v:\\\\$Recycle.bin'),
(39, 'rd /s /q w:\\\\$Recycle.bin'),
(40, 'rd /s /q x:\\\\$Recycle.bin'),
(41, 'rd /s /q y:\\\\$Recycle.bin'),
(42, 'rd /s /q z:\\\\$Recycle.bin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `descripcion_opiniones`
--

CREATE TABLE `descripcion_opiniones` (
  `id_descripcion` int(11) NOT NULL,
  `descripcion` varchar(40) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `descripcion_opiniones`
--

INSERT INTO `descripcion_opiniones` (`id_descripcion`, `descripcion`) VALUES
(1, 'Nashe'),
(2, 'Excelente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opiniones`
--

CREATE TABLE `opiniones` (
  `id_opinion` int(11) NOT NULL,
  `nombre` varchar(40) DEFAULT NULL,
  `id_descripcion` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `opiniones`
--

INSERT INTO `opiniones` (`id_opinion`, `nombre`, `id_descripcion`) VALUES
(1, 'Marco', 1),
(2, 'Franco', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comandos`
--
ALTER TABLE `comandos`
  ADD PRIMARY KEY (`id_comando`),
  ADD KEY `fkdesc` (`id_descripcion`);

--
-- Indices de la tabla `descripcion_comandos`
--
ALTER TABLE `descripcion_comandos`
  ADD PRIMARY KEY (`id_descripcion`);

--
-- Indices de la tabla `descripcion_opiniones`
--
ALTER TABLE `descripcion_opiniones`
  ADD PRIMARY KEY (`id_descripcion`);

--
-- Indices de la tabla `opiniones`
--
ALTER TABLE `opiniones`
  ADD PRIMARY KEY (`id_opinion`),
  ADD UNIQUE KEY `UK9r3mb142o6kg2n51x6hmfinym` (`nombre`),
  ADD KEY `fkdesc` (`id_descripcion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comandos`
--
ALTER TABLE `comandos`
  MODIFY `id_comando` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT de la tabla `descripcion_comandos`
--
ALTER TABLE `descripcion_comandos`
  MODIFY `id_descripcion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3838;

--
-- AUTO_INCREMENT de la tabla `descripcion_opiniones`
--
ALTER TABLE `descripcion_opiniones`
  MODIFY `id_descripcion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=86;

--
-- AUTO_INCREMENT de la tabla `opiniones`
--
ALTER TABLE `opiniones`
  MODIFY `id_opinion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
