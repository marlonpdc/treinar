SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

CREATE TABLE IF NOT EXISTS `cliente` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `cpf` bigint(20) NOT NULL,
  `nome` varchar(256) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

INSERT INTO `cliente` (`codigo`, `cpf`, `nome`) VALUES
(3, 1312, 'fasdfasd');

CREATE TABLE IF NOT EXISTS `conta` (
  `codigoConta` int(11) NOT NULL AUTO_INCREMENT,
  `saldo` decimal(10,0) NOT NULL,
  `situacao` int(11) NOT NULL,
  `cliente` int(11) NOT NULL,
  `taxaManutencao` decimal(10,0) NOT NULL,
  `limiteCredito` decimal(10,0) NOT NULL,
  `discriminador` int(11) NOT NULL,
  PRIMARY KEY (`codigoConta`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

INSERT INTO `conta` (`codigoConta`, `saldo`, `situacao`, `cliente`, `taxaManutencao`, `limiteCredito`, `discriminador`) VALUES
(1, '1212', 0, 3, '0', '0', 1);