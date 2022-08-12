-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-08-2022 a las 17:22:00
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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comandos_sistema`
--

CREATE TABLE `comandos_sistema` (
  `id_comando` int(11) NOT NULL,
  `nombre` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `id_descripcion` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `comandos_sistema`
--

INSERT INTO `comandos_sistema` (`id_comando`, `nombre`, `id_descripcion`) VALUES
(1, 'Notepad', 1),
(2, 'Explorador de archivos', 2),
(3, 'Paint', 3),
(4, 'Calculadora', 4),
(5, 'Configuración de Windows', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comandos_utilidad`
--

CREATE TABLE `comandos_utilidad` (
  `id_comando` int(11) NOT NULL,
  `nombre` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `id_descripcion` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `comandos_utilidad`
--

INSERT INTO `comandos_utilidad` (`id_comando`, `nombre`, `id_descripcion`) VALUES
(1, 'Programar apagado de pc', 14),
(2, 'Cancelar apagado de pc', 15),
(3, 'Analisis con Windows Defender', 16),
(4, 'Windows Update', 17),
(5, 'Borrar papelera ', 18),
(6, 'Borrar papelera ', 19),
(7, 'Borrar papelera ', 20),
(8, 'Borrar papelera ', 21),
(9, 'Borrar papelera ', 22),
(10, 'Borrar papelera ', 23),
(11, 'Borrar papelera ', 24),
(12, 'Borrar papelera ', 25),
(13, 'Borrar papelera ', 26),
(14, 'Borrar papelera ', 27),
(15, 'Borrar papelera ', 28),
(16, 'Borrar papelera ', 29),
(17, 'Borrar papelera ', 30),
(18, 'Borrar papelera ', 31),
(19, 'Borrar papelera ', 32),
(20, 'Borrar papelera ', 33),
(21, 'Borrar papelera ', 34),
(22, 'Borrar papelera ', 35),
(23, 'Borrar papelera ', 36),
(25, 'Borrar papelera ', 37),
(26, 'Borrar papelera ', 38),
(27, 'Borrar papelera ', 39),
(28, 'Borrar papelera ', 40),
(29, 'Borrar papelera ', 41),
(30, 'Borrar papelera ', 42);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comandos_web`
--

CREATE TABLE `comandos_web` (
  `id_comando` int(11) NOT NULL,
  `nombre` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `id_descripcion` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `comandos_web`
--

INSERT INTO `comandos_web` (`id_comando`, `nombre`, `id_descripcion`) VALUES
(1, 'Clima', 6),
(2, 'Noticias', 7),
(3, 'Instagram', 8),
(4, 'WhatsApp', 9),
(5, 'Gmail', 10),
(6, 'Netflix', 11),
(7, 'Spotify', 12),
(8, 'Youtube', 13);

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
(1, 'Nashe');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(52);

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
(1, 'Marco', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comandos_sistema`
--
ALTER TABLE `comandos_sistema`
  ADD PRIMARY KEY (`id_comando`),
  ADD KEY `fkdesc` (`id_descripcion`);

--
-- Indices de la tabla `comandos_utilidad`
--
ALTER TABLE `comandos_utilidad`
  ADD PRIMARY KEY (`id_comando`),
  ADD KEY `fkdesc` (`id_descripcion`);

--
-- Indices de la tabla `comandos_web`
--
ALTER TABLE `comandos_web`
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
-- AUTO_INCREMENT de la tabla `comandos_sistema`
--
ALTER TABLE `comandos_sistema`
  MODIFY `id_comando` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `comandos_utilidad`
--
ALTER TABLE `comandos_utilidad`
  MODIFY `id_comando` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `comandos_web`
--
ALTER TABLE `comandos_web`
  MODIFY `id_comando` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `descripcion_comandos`
--
ALTER TABLE `descripcion_comandos`
  MODIFY `id_descripcion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3838;

--
-- AUTO_INCREMENT de la tabla `descripcion_opiniones`
--
ALTER TABLE `descripcion_opiniones`
  MODIFY `id_descripcion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `opiniones`
--
ALTER TABLE `opiniones`
  MODIFY `id_opinion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
