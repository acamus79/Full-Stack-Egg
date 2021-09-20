USE tienda;

-- EJERCICIOS --
-- 1. Lista el nombre de todos los productos que hay en la tabla producto. --
SELECT nombre FROM producto;

-- 2. Lista los nombres y los precios de todos los productos de la tabla producto. --
SELECT nombre as 'Nombre Producto', precio as 'Precio Lista $' FROM producto;

-- 3. Lista todas las columnas de la tabla producto. --
SELECT * FROM producto; 

-- 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio. --
SELECT nombre as 'Nombre Producto', round(precio) as 'Precio Lista $' FROM producto;

-- 5. Lista el código de los fabricantes que tienen productos en la tabla producto. --
SELECT codigo_fabricante from producto;

-- 10. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos. --
SELECT distinct codigo_fabricante from producto;

-- 11. Lista los nombres de los fabricantes ordenados de forma ascendente. -- 
select nombre from fabricante; -- como para ver la diferencia
select nombre from fabricante order by nombre asc; -- como se escribe
select nombre from fabricante order by nombre; -- por defecto es de forma ASCENDENTE


-- 12. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.
SELECT nombre as 'Nombre Producto', round(precio) as 'Precio Lista $' FROM producto order by nombre asc;
SELECT nombre as 'Nombre Producto', round(precio) as 'Precio Lista $' FROM producto order by precio desc; 

-- seria asi y solo se podria verificar si hubieran dos productos de igual nombre 
SELECT nombre as 'Nombre Producto', round(precio) as 'Precio Lista $' 
FROM producto order by nombre , precio desc;

-- 13. Devuelve una lista con las 5 primeras filas de la tabla fabricante. --
select * 
from fabricante
limit 5;

-- 14. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT) --
select nombre , precio
from producto
order by precio
limit 1;

-- asi no!!!! mirar el nombre del producto
select nombre, min(precio) 
from producto;

-- asi si!!
select nombre, precio 
from producto
where precio = (select min(precio) from producto);

-- 15. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT) --
select nombre , precio
from producto
order by precio desc
limit 1;

-- 16. Lista el nombre de los productos que tienen un precio menor o igual a $120. --
select nombre, precio 
from producto
where precio >= 120
order by precio;

-- 17. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN. --
select nombre, round(precio) 'Precio' 
from producto
where precio 
between 60 and 200
order by precio;

-- 18. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN. --
select nombre, round(precio) 'Precio' , codigo_fabricante
from producto
where codigo_fabricante
in (1, 3, 5)
order by precio;

-- 23. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre. --
select nombre, round(precio) 'Precio' , codigo_fabricante
from producto
where nombre
like 'Por%'
order by precio;

-- Consultas Multitabla --
-- 1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante y nombre del fabricante, de todos los productos de la base de datos. --
select p.codigo, p.nombre 'Producto Nombre', p.codigo_fabricante 'Cod. Fabricante', f.nombre 'Fabricante'
from producto p
join fabricante f
on p.codigo_fabricante = f.codigo;

-- 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base de datos. Ordene el resultado por el nombre del abricante, por orden alfabético. --
select p.codigo, p.nombre 'Producto Nombre', p.precio 'Precio', f.nombre 'Fabricante'
from producto p
join fabricante f
on p.codigo_fabricante = f.codigo
order by p.nombre;

-- 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato. --
select p.codigo, p.nombre 'Producto Nombre', p.precio 'Precio', f.nombre 'Fabricante'
from producto p
join fabricante f
on p.codigo_fabricante = f.codigo
order by precio
limit 1;

-- 4. Devuelve una lista de todos los productos del fabricante Lenovo. --
select p.codigo, p.nombre 'Producto Nombre', p.precio 'Precio', f.nombre 'Fabricante'
from producto p
join fabricante f
on p.codigo_fabricante = f.codigo
where f.nombre
like 'Len%';

-- 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200. --
select p.codigo, p.nombre 'Producto Nombre', p.precio 'Precio', f.nombre 'Fabricante'
from producto p
join fabricante f
on p.codigo_fabricante = f.codigo
where f.nombre
like 'Cru%' and p.precio > 200;

-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Utilizando el operador IN. --
select p.codigo, p.nombre 'Producto Nombre', p.precio 'Precio', f.nombre 'Fabricante'
from producto p
join fabricante f
on p.codigo_fabricante = f.codigo
where f.nombre
in ('Asus', 'Hewlett-Packard')
order by precio;


/*7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los productos que tengan un precio mayor o igual 
 a $180. Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente) */
select p.nombre 'Producto Nombre', p.precio 'Precio', f.nombre 'Fabricante'
from producto p
join fabricante f
on p.codigo_fabricante = f.codigo
where p.precio >= 180 
order by p.precio and p.nombre asc;
-- Asi si debe ser
select p.nombre 'Producto Nombre', f.nombre 'Fabricante', p.precio 'Precio'
from producto p
join fabricante f
on p.codigo_fabricante = f.codigo
where p.precio >= 180 
order by f.nombre, p.precio desc;


/* Consultas Multitabla 
Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.*/

/* 1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los productos que tiene cada uno de ellos. El listado deberá 
mostrar también aquellos fabricantes que no tienen productos asociados.*/
select p.nombre 'Producto Nombre', p.precio 'Precio', f.nombre 'Fabricante'
from fabricante f
left join producto p
on f.codigo = p.codigo_fabricante;

-- 2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado. --
select p.nombre 'Producto Nombre', p.precio 'Precio', f.nombre 'Fabricante'
from fabricante f
left join producto p
on f.codigo = p.codigo_fabricante
where p.nombre is null;

/*Subconsultas (En la cláusula WHERE) Con operadores básicos de comparación*/
-- 1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN). --

-- ????? me parece que no es asi
select nombre, precio , codigo_fabricante
from producto
where codigo_fabricante = (select fabricante.codigo from fabricante where fabricante.nombre like 'Leno%');

select *
from fabricante f, producto p
WHERE p.codigo_fabricante=f.codigo and f.nombre = (select f.nombre from fabricante f where f.nombre like 'Leno%');

select *
from fabricante f, producto p
WHERE p.codigo_fabricante=f.codigo and f.nombre = 'Lenovo';

-- 2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
-- primero le cambio el precio a un producto para poder comparar
UPDATE `tienda`.`producto` SET `precio` = '559' WHERE (`codigo` = '2');

SELECT *
FROM producto
WHERE precio = (SELECT MAX(precio)
  FROM producto
  WHERE codigo_fabricante = (SELECT codigo
    FROM fabricante
    WHERE nombre = 'Lenovo'));

-- vuelvo al precio que tenia
UPDATE `tienda`.`producto` SET `precio` = '120' WHERE (`codigo` = '2');

-- 3. Lista el nombre del producto más caro del fabricante Lenovo.
select len.*
from (select p.nombre, p.precio, f.nombre as 'fabricante'
from fabricante f
inner join producto p
on p.codigo_fabricante=f.codigo and f.nombre='lenovo') len
order by len.precio desc
limit 1;

select len.*
from (select p.nombre, p.precio, f.nombre as 'fabricante'
from fabricante f
inner join producto p
on p.codigo_fabricante= f.codigo and f.nombre='lenovo') len, producto p
group by p.precio
having max(len.precio) limit 1;

-- 4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.
select len.*
from (select p.nombre, p.precio, f.nombre as 'fabricante'
from fabricante f
inner join producto p
on p.codigo_fabricante= f.codigo and f.nombre='Asus') len, producto p
group by p.precio
having precio > avg(len.precio);


-- Subconsultas con IN y NOT IN 
-- 1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).
select distinct nombre 'Nombre Fabricante'
from fabricante 
where codigo in (select codigo_fabricante from producto);


-- 2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
select nombre 'Nombre Fabricante'
from fabricante
where codigo not in (select codigo_fabricante from producto);


-- Subconsultas (En la cláusula HAVING) 
-- 1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo --
select f.nombre 'Nombre Fabricante'
from fabricante f inner join producto p
on f.codigo = p.codigo_fabricante
GROUP BY f.codigo
having count(p.codigo_fabricante) >= 2;



SELECT fabricante.nombre, COUNT(producto.codigo)
FROM fabricante INNER JOIN producto
ON fabricante.codigo = producto.codigo_fabricante
GROUP BY fabricante.codigo
HAVING COUNT(producto.codigo) >= (SELECT COUNT(producto.codigo)
    FROM fabricante INNER JOIN producto
    ON fabricante.codigo = producto.codigo_fabricante
    WHERE fabricante.nombre = 'Lenovo');


/*
PREGUNTAS DE APRENDIZAJE
1) Responda Verdadero (V) o Falso (F) 
V F
Una primary key es la columna (columnas) que tiene datos 
completamente únicos a lo largo de la tabla.
(V) ( )
La función principal de una clave primaria en una tabla es mantener su 
integridad.
(V) ( )
Las foreign keys o llaves foráneas son campos que vinculan una tabla 
con la clave primaria o externa de otra tabla.
(V) ( )
Una tabla no puede tener más de una clave foránea definida.
( ) (F)
INSERT, UPDATE y CREATE son commandos DDL. 
() (F)
El comando DROP se utiliza para eliminar todas las filas de una tabla. 
( ) (F)
2) ¿Cuál de las siguientes sentencias son ciertas sobre las relaciones? 
a) Las relaciones son entidades (F)
b) Las relaciones son enlaces lógicos entre las tablas implementadas a través de 
primary y foreign keys. (V)
c) Las relaciones son almacenadas como atributos en la base de datos. (F)
d) Las relaciones explícitamente definen una asociación entre 2 tablas. (V)

3) ¿Cómo se crea una base de datos con SQL? 
a) CREATE DATABASE (V)
b) UPDATE DATABASE
c) ALTER DATABASE
d) Las anteriores respuestas no son correctas

4) En SQL, ¿cuál de estas sentencias añade una fila a una tabla en una base de datos? 
a) ADD
b) INSERT (V)
c) UPDATE
d) INCLUDE

5) En SQL, para modificar la estructura de una tabla de una base de datos se emplea la 
instrucción 
a) ALTER TABLE (V)
b) CHANGE TABLE
c) MODIFY TABLE
d) Las anteriores respuestas no son correctas
 
6) ¿Qué instrucción se emplea para eliminar todo el contenido de una tabla, pero 
conservando la tabla? 
a) DELETE TABLE (V)
b) DROP TABLE
c) TRUNCATE TABLE
d) Las anteriores respuestas no son correctas

7) ¿Cómo se borra toda una base de datos con SQL? 
a) DELETE DATABASE 
b) DROP DATABASE (V)
c) ERASE DATABASE
d) Las anteriores respuestas no son correctas

8) ¿En cuál de las siguientes sentencias del lenguaje SQL se emplea la cláusula SET? 
a) DELETE
b) DROP
c) SELECT
d) UPDATE (V)

9) En SQL, para eliminar las filas duplicadas del resultado de una sentencia SELECT se 
emplea: 
a) NO DUPLICATE
b) UNIQUE
c) DISTINCT (V)
d) Las anteriores respuestas no son correctas

10) Una sentencia SELECT sin la cláusula WHERE devuelve 
a) Todos los registros existentes en la tabla que no estén relacionados con otra tabla
b) Todos los registros existentes en la tabla (V)
c) No se puede ejecutar una sentencia SELECT sin la cláusula WHERE
d) Las anteriores respuestas no son correctas

11) En SQL, para ordenar los datos devueltos por una sentencia SELECT se emplea la 
cláusula 
a) ORDER BY (V)
b) ORDERED BY
c) SORT BY
d) SORTED BY

12) En una cláusula LIKE, ¿cómo se obtienen todos los nombres de personas que 
comienzan con "Juan"? 
a) LIKE "Juan%" (V)
b) LIKE "Juan*"
c) LIKE "Juan$"
d) LIKE "Juan&"
 
13) ¿Cuál de las siguientes no es una función de agregación? 
a) AVG()
b) MAX()
c) SUM()
d) LIMIT() (V)

14) ¿Cuál de las siguientes si es una función de agregación? 
a) ROUND()
b) ORDER BY
c) FLOOR()
d) COUNT() (V)

*/
