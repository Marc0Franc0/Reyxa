-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-07-2022 a las 02:34:16
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

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comandos_utilidad`
--
ALTER TABLE `comandos_utilidad`
  ADD PRIMARY KEY (`id_comando`),
  ADD KEY `fkdesc` (`id_descripcion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comandos_utilidad`
--
ALTER TABLE `comandos_utilidad`
  MODIFY `id_comando` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
