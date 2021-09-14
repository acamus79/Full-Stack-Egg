/*Elimino la base si existe*/
DROP DATABASE IF EXISTS superheroes;

/*Creo la base si existe*/
CREATE DATABASE superheroes CHARACTER SET utf8mb4;

/*Selecciono la Base de datos o SCHEMA*/
USE superheroes;

/*Crear Tabla de Creadores*/
CREATE TABLE creador (
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre VARCHAR(20) NOT NULL
);
INSERT INTO `superheroes`.`creador` (`id_creador`, `nombre`) VALUES ('1', 'Marvel');
INSERT INTO `superheroes`.`creador` (`id_creador`, `nombre`) VALUES ('2', 'DC Comics');

/*Crear la Tabla de Personajes*/
CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador)
  );
/*Llenar la Tabla de Personajes*/
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Bruce Banner', 'Hulk', '160', '600 mil', '75', '98', '1962', 'Fisico Nuclear', '1');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Tony Stark', 'Iron Man', '170', '200 mil', '70', '123', '1963', 'Inventor Industrial', '1');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Thor Odinson', 'Thor', '145', 'infinita', '100', '235', '1962', 'Rey de Asgard', '1');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Wanda Maximoff', 'Bruja Escarlata', '170', '100 mil', '90', '343', '1964', 'Bruja', '1');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Carol Danvers', 'Capitana Marvel', '157', '250 mil', '85', '128', '1968', 'Oficial de Inteligencia', '1');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Thanos', 'Thanos', '170', 'infinita', '40', '306', '1973', 'Adorador de la Muerte', '1');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Peter Parker', 'Spiderman', '176', '25 mil', '80', '74', '1962', 'Fotografo', '1');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Steve Rogers', 'Capitan America', '145', '600 mil', '45', '60', '1941', 'Oficial Federal', '1');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Bobby Drake', 'Iceman', '140', '2000', '64', '122', '1963', 'Contador', '1');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Barry Allen', 'Flash', '160', '10 mil', '120', '168', '1956', 'Cientifico Forense', '2');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Bruce Wayne', 'Batman', '170', '500', '32', '47', '1939', 'Hombre de Negocios', '2');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Clarck Kent', 'Superman', '165', 'infinita', '120', '182', '1948', 'Reportero', '2');
INSERT INTO `superheroes`.`personajes` (`nombre_real`, `personaje`, `inteligencia`, `fuerza`, `velocidad`, `poder`, `aparicion`, `ocupacion`, `id_creador`) VALUES ('Diana Prince', 'Wonderwoman', '160', 'infinita', '95', '127', '1949', 'Princesa Guerrera', '2');

/* Selecciono todo de cada tabla*/
SELECT * FROM superheroes.creador;
SELECT * FROM superheroes.personajes;

/*Cambia el año de aparicion de Supermamn a 1938*/
UPDATE `superheroes`.`personajes` SET `aparicion` = '1938' WHERE (`id_personaje` = '12');
SELECT * FROM superheroes.personajes;

/*Eliminar el Personaje Flash*/
DELETE FROM `superheroes`.`personajes` WHERE (`id_personaje` = '10');
SELECT * FROM superheroes.personajes;

/*Eliminar la Base Superheroes*/
DROP DATABASE IF EXISTS superheroes;