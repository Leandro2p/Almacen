-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-11-2019 a las 14:47:51
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `almacen`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_prod` int(11) NOT NULL,
  `Codigo_prod` varchar(6) NOT NULL,
  `Name_prod` varchar(64) NOT NULL,
  `descripcion_prod` varchar(64) NOT NULL,
  `id_proveedorProd` int(11) NOT NULL,
  `Stock_prod` int(11) NOT NULL,
  `precio_coste_prod` double NOT NULL,
  `precio_venta_prod` double NOT NULL,
  `State_Prod` enum('True','False') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_prod`, `Codigo_prod`, `Name_prod`, `descripcion_prod`, `id_proveedorProd`, `Stock_prod`, `precio_coste_prod`, `precio_venta_prod`, `State_Prod`) VALUES
(1, '101', 'HALF LIFE', 'MATA MOUNSTRITOS', 3, 1000, 500, 550, 'True');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `IdProveedor` int(11) NOT NULL,
  `NombreProveedor` varchar(64) NOT NULL,
  `Direcion` varchar(64) NOT NULL,
  `Ciudad` varchar(64) NOT NULL,
  `email_provee` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`IdProveedor`, `NombreProveedor`, `Direcion`, `Ciudad`, `email_provee`) VALUES
(1, 'Kalvin', 'aaa', 'por ahi', 'Kalvins@yopmail.com'),
(2, 'POP', 'aaa', 'aaa', 'zzz@zzzz'),
(3, 'VALVE', 'YANQILANDIA', 'NO SABO', 'STEAMAZUL@VALVE.COM');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_prod`),
  ADD UNIQUE KEY `Codigo_prod` (`Codigo_prod`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`IdProveedor`),
  ADD UNIQUE KEY `email_provee` (`email_provee`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_prod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `IdProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
