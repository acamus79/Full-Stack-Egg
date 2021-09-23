CREATE TABLE `usuario`.`Usuario` (
  `clave` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `correoElectronico` VARCHAR(45) NOT NULL,
  `edad` INT NOT NULL,
  PRIMARY KEY (`clave`));


INSERT INTO `usuario`.`Usuario` (`clave`, `nombre`, `correoElectronico`,`edad`) VALUES ('123', 'Martin', 'martinprofe@gmail.com', '23');
INSERT INTO `usuario`.`Usuario` (`clave`, `nombre`, `correoElectronico`,`edad`) VALUES ('456', 'Lucas', 'lucas@hotmail.com','21');
INSERT INTO `usuario`.`Usuario` (`clave`, `nombre`, `correoElectronico`,`edad`) VALUES ('345', 'Carola', 'caro@yahoo.com','18');
INSERT INTO `usuario`.`Usuario` (`clave`, `nombre`, `correoElectronico`,`edad`) VALUES ('789', 'Teresa', 'tere@gmail.com','16');
INSERT INTO `usuario`.`Usuario` (`clave`, `nombre`,`correoElectronico`,`edad`) VALUES ('678', 'Rafael','rafita@gmail.com','21');
INSERT INTO `usuario`.`Usuario` (`clave`, `nombre`,`correoElectronico`,`edad`) VALUES ('312', 'Valentino','valen@gmail.com','15');
