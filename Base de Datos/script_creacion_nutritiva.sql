-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bdd_nutritiva
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `bdd_nutritiva` ;

-- -----------------------------------------------------
-- Schema bdd_nutritiva
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdd_nutritiva` DEFAULT CHARACTER SET utf8 ;
USE `bdd_nutritiva` ;

-- -----------------------------------------------------
-- Table `bdd_nutritiva`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_nutritiva`.`clientes` (
  `idclientes` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL COMMENT 'Pueden estar todos los campos vacíos, pero al menos necesitamos el nombre',
  `apellido` VARCHAR(45) NULL DEFAULT NULL,
  `dni` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `telefono` VARCHAR(45) NULL DEFAULT NULL,
  `direccion` VARCHAR(45) NULL DEFAULT NULL,
  `anulado` BIT NOT NULL DEFAULT 0,
  PRIMARY KEY (`idclientes`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `bdd_nutritiva`.`movimientos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_nutritiva`.`movimientos` (
  `idmovimientos` INT NOT NULL AUTO_INCREMENT,
  `monto` FLOAT NOT NULL,
  `observacion` VARCHAR(45) NULL DEFAULT NULL,
  `fecha` DATE NOT NULL,
  `efectivo` VARCHAR(45) NOT NULL,
  `anulado` BIT NOT NULL,
  PRIMARY KEY (`idmovimientos`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `bdd_nutritiva`.`viandas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_nutritiva`.`viandas` (
  `idviandas` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `precio` FLOAT NOT NULL,
  `anulado` BIT NOT NULL DEFAULT 0,
  PRIMARY KEY (`idviandas`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `bdd_nutritiva`.`pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_nutritiva`.`pedidos` (
  `idpedidos` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `tipo` ENUM('almuerzo', 'cena') NOT NULL,
  `clientes_idclientes` INT NOT NULL,
  `viandas_idviandas` INT NOT NULL,
  `anulado` BIT NOT NULL,
  PRIMARY KEY (`idpedidos`),
  INDEX `fk_pedidos_clientes_idx` (`clientes_idclientes` ASC) VISIBLE,
  INDEX `fk_pedidos_viandas1_idx` (`viandas_idviandas` ASC) VISIBLE,
  CONSTRAINT `fk_pedidos_clientes`
    FOREIGN KEY (`clientes_idclientes`)
    REFERENCES `bdd_nutritiva`.`clientes` (`idclientes`),
  CONSTRAINT `fk_pedidos_viandas1`
    FOREIGN KEY (`viandas_idviandas`)
    REFERENCES `bdd_nutritiva`.`viandas` (`idviandas`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `bdd_nutritiva`.`usuarios_sistema`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_nutritiva`.`usuarios_sistema` (
  `idusuarios_sistema` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idusuarios_sistema`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `bdd_nutritiva`.`ventas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_nutritiva`.`ventas` (
  `idventas` INT NOT NULL AUTO_INCREMENT,
  `monto` DOUBLE NOT NULL,
  `fecha` DATE NOT NULL,
  `pedidos_idpedidos` INT NOT NULL,
  `anulado` BIT NOT NULL,
  PRIMARY KEY (`idventas`),
  INDEX `fk_ventas_pedidos1_idx` (`pedidos_idpedidos` ASC) VISIBLE,
  CONSTRAINT `fk_ventas_pedidos1`
    FOREIGN KEY (`pedidos_idpedidos`)
    REFERENCES `bdd_nutritiva`.`pedidos` (`idpedidos`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `bdd_nutritiva`.`cierres_caja`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_nutritiva`.`cierres_caja` (
  `idcierres_caja` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `efectivo` DOUBLE NOT NULL,
  `banco` DOUBLE NOT NULL,
  `anulado` BIT(1) NOT NULL,
  PRIMARY KEY (`idcierres_caja`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
