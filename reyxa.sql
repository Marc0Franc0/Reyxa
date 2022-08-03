-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-08-2022 a las 17:44:49
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
(10, 'NASHEeeeeeeeeeeeeeeeeeeeeeeeee');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `descripcion_opiniones`
--
ALTER TABLE `descripcion_opiniones`
  ADD PRIMARY KEY (`id_descripcion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
