-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-10-2022 a las 20:11:46
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
  `sintaxis_comando` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `comandos`
--

INSERT INTO `comandos` (`id_comando`, `nombre`, `sintaxis_comando`) VALUES
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
-- Estructura de tabla para la tabla `comentarios`
--

CREATE TABLE `comentarios` (
  `id_comentario` int(11) NOT NULL,
  `comentario` varchar(200) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `comentarios`
--

INSERT INTO `comentarios` (`id_comentario`, `comentario`) VALUES
(1, 'Nashe');

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
(8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sintaxis_de_comandos`
--

CREATE TABLE `sintaxis_de_comandos` (
  `id_descripcion` int(11) NOT NULL,
  `sintaxis` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `descripcion` varchar(80) COLLATE utf8_bin DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `sintaxis_de_comandos`
--

INSERT INTO `sintaxis_de_comandos` (`id_descripcion`, `sintaxis`, `descripcion`) VALUES
(1, 'start notepad.exe', NULL),
(2, 'start explorer.exe', NULL),
(3, 'start mspaint.exe', NULL),
(4, 'start calc.exe', NULL),
(5, 'start ms-settings:', NULL),
(6, 'start https://www.smn.gob.ar/', NULL),
(7, 'start https://news.google.com/topstories?hl=es-419&gl=US&ceid=US:es-419', NULL),
(8, 'start https://www.instagram.com/?theme=dark', NULL),
(9, 'start https://web.whatsapp.com/', NULL),
(10, 'start https://mail.google.com/mail/u/0/#inbox', NULL),
(11, 'start https://www.netflix.com/ar/Login', NULL),
(12, 'start https://open.spotify.com/', NULL),
(13, 'start https://www.youtube.com/', NULL),
(14, 'shutdown -s -t ', NULL),
(15, 'shutdown /a', NULL),
(16, 'start-MpScan', NULL),
(17, 'start ms-settings:windowsupdate', NULL),
(18, 'rd /s /q a:\\\\$Recycle.bin', NULL),
(19, 'rd /s /q b:\\\\$Recycle.bin', NULL),
(20, 'rd /s /q c:\\\\$Recycle.bin', NULL),
(21, 'rd /s /q d:\\\\$Recycle.bin', NULL),
(22, 'rd /s /q e:\\\\$Recycle.bin', NULL),
(23, 'rd /s /q f:\\\\$Recycle.bin', NULL),
(24, 'rd /s /q g:\\\\$Recycle.bin', NULL),
(25, 'rd /s /q h:\\\\$Recycle.bin', NULL),
(26, 'rd /s /q i:\\\\$Recycle.bin', NULL),
(27, 'rd /s /q j:\\\\$Recycle.bin', NULL),
(28, 'rd /s /q k:\\\\$Recycle.bin', NULL),
(29, 'rd /s /q l:\\\\$Recycle.bin', NULL),
(30, 'rd /s /q m:\\\\$Recycle.bin', NULL),
(31, 'rd /s /q n:\\\\$Recycle.bin', NULL),
(32, 'rd /s /q o:\\\\$Recycle.bin', NULL),
(33, 'rd /s /q p:\\\\$Recycle.bin', NULL),
(34, 'rd /s /q r:\\\\$Recycle.bin', NULL),
(35, 'rd /s /q s:\\\\$Recycle.bin', NULL),
(36, 'rd /s /q t:\\\\$Recycle.bin', NULL),
(37, 'rd /s /q u:\\\\$Recycle.bin', NULL),
(38, 'rd /s /q v:\\\\$Recycle.bin', NULL),
(39, 'rd /s /q w:\\\\$Recycle.bin', NULL),
(40, 'rd /s /q x:\\\\$Recycle.bin', NULL),
(41, 'rd /s /q y:\\\\$Recycle.bin', NULL),
(42, 'rd /s /q z:\\\\$Recycle.bin', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `nombre_de_usuario` varchar(40) DEFAULT NULL,
  `comentario_usuario` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre_de_usuario`, `comentario_usuario`) VALUES
(1, 'Marco', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comandos`
--
ALTER TABLE `comandos`
  ADD PRIMARY KEY (`id_comando`),
  ADD KEY `fkdesc` (`sintaxis_comando`);

--
-- Indices de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD PRIMARY KEY (`id_comentario`);

--
-- Indices de la tabla `sintaxis_de_comandos`
--
ALTER TABLE `sintaxis_de_comandos`
  ADD PRIMARY KEY (`id_descripcion`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `UK21rk2fn7ui04bfun59fnr8jp9` (`nombre_de_usuario`),
  ADD KEY `fkcomentario` (`comentario_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comandos`
--
ALTER TABLE `comandos`
  MODIFY `id_comando` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  MODIFY `id_comentario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=94;

--
-- AUTO_INCREMENT de la tabla `sintaxis_de_comandos`
--
ALTER TABLE `sintaxis_de_comandos`
  MODIFY `id_descripcion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3838;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
