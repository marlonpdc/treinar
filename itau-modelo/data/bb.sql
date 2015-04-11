-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Máquina: 127.0.0.1
-- Data de Criação: 11-Abr-2015 às 19:36
-- Versão do servidor: 5.5.32
-- versão do PHP: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `bb`
--
CREATE DATABASE IF NOT EXISTS `bb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bb`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `bb_parametro`
--

CREATE TABLE IF NOT EXISTS `bb_parametro` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nomeParametro` varchar(255) DEFAULT NULL,
  `valorParametro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta`
--

CREATE TABLE IF NOT EXISTS `conta` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `saldo` double(9,2) DEFAULT NULL,
  `id_pessoa` bigint(10) NOT NULL,
  `numeroConta` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_corrente`
--

CREATE TABLE IF NOT EXISTS `conta_corrente` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `tarifa` double(9,2) DEFAULT NULL,
  `limiteCredito` double(9,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_investimento`
--

CREATE TABLE IF NOT EXISTS `conta_investimento` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `tarifa` double(9,2) DEFAULT NULL,
  `fatorCaptalizacao` int(2) DEFAULT NULL,
  `dataInicioInvestimento` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_poupanca`
--

CREATE TABLE IF NOT EXISTS `conta_poupanca` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `diaBaseDeposito` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_salario`
--

CREATE TABLE IF NOT EXISTS `conta_salario` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `dataCreditoSalario` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE IF NOT EXISTS `pessoa` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `cpf` bigint(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
