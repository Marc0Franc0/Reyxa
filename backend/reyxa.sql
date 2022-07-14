-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-07-2022 a las 01:37:00
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
-- Estructura de tabla para la tabla `comandos`
--

CREATE TABLE `comandos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(40) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `comandos`
--

INSERT INTO `comandos` (`id`, `nombre`) VALUES
(1, 'Explorador de archivos'),
(5, 'Configuración de Windows'),
(6, 'Paint'),
(7, 'Calculadora'),
(8, 'Clima'),
(9, 'Noticias'),
(10, 'Youtube'),
(11, 'Twitch'),
(12, 'Instagram'),
(13, 'Whatsapp'),
(14, 'Gmail'),
(15, 'Netflix'),
(16, 'Spotify');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `descpcion_comandos`
--

CREATE TABLE `descpcion_comandos` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(40) COLLATE utf8_bin NOT NULL,
  `id_comando` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `descpcion_comandos`
--

INSERT INTO `descpcion_comandos` (`id`, `descripcion`, `id_comando`) VALUES
(2, 'start explorer.exe', 1),
(3, 'start ms-settings:', 5),
(4, 'start mspaint.exe', 6),
(5, 'start calc.exe', 7),
(6, 'start https://www.smn.gob.ar/', 8);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comandos`
--
ALTER TABLE `comandos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `descpcion_comandos`
--
ALTER TABLE `descpcion_comandos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `comando_fk` (`id_comando`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comandos`
--
ALTER TABLE `comandos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `descpcion_comandos`
--
ALTER TABLE `descpcion_comandos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `descpcion_comandos`
--
ALTER TABLE `descpcion_comandos`
  ADD CONSTRAINT `comando_fk` FOREIGN KEY (`id_comando`) REFERENCES `comandos` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
