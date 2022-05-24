-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-05-2022 a las 13:12:47
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pixelada`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `ID_CLIENTES` tinyint(2) NOT NULL,
  `NOMBRE` char(45) NOT NULL,
  `DNI` varchar(9) NOT NULL,
  `DIRECCION` varchar(50) NOT NULL,
  `TELEFONO` int(8) NOT NULL,
  `CORREO` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `ID_FACTURA` tinyint(2) NOT NULL,
  `ID_CLIENTES` tinyint(2) NOT NULL,
  `ID_PROD` tinyint(2) NOT NULL,
  `CANTIDAD` int(40) NOT NULL,
  `FECHA` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `ID_PROD` tinyint(2) NOT NULL,
  `NOMBRE` char(45) NOT NULL,
  `PRECIO_VENTA` decimal(20,0) NOT NULL,
  `PRECIO_COMPRA` decimal(20,0) NOT NULL,
  `CANTIDAD` int(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`ID_PROD`, `NOMBRE`, `PRECIO_VENTA`, `PRECIO_COMPRA`, `CANTIDAD`) VALUES
(1, 'Canon 70D', '1000', '800', 2),
(2, 'Objetivo Canon 50mm', '100', '120', 5),
(3, 'Canon 5D', '2000', '2100', 1),
(4, 'Objetivo Canon 35mm', '250', '200', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`ID_CLIENTES`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`ID_CLIENTES`,`ID_PROD`),
  ADD KEY `ID_PROD` (`ID_PROD`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`ID_PROD`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`ID_CLIENTES`) REFERENCES `clientes` (`ID_CLIENTES`),
  ADD CONSTRAINT `factura_ibfk_2` FOREIGN KEY (`ID_PROD`) REFERENCES `productos` (`ID_PROD`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
