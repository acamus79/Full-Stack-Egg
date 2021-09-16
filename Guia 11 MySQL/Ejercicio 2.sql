
USE personal;

-- METODOS USADOS --

-- LIKE = Contiene debe ir con WHERE --
-- ORDER BY = Orden --
-- WHERE = Donde --
-- AS = Cambio de nombre en la tabla (muestra) --
-- NOT = Negacion / No contiene --
-- FROM = De donde sacamos los datos --
-- NOT IN = Para decir que no muestre lo que hay dentro del campo --
-- DISTINCT = Muestra solamente los distintos --
-- MAX(campo de la tabla) = Muestra valor Maximo --
-- MIN(campo de la tabla) = Muestra valor Minimo --
-- AVG(columna) promedio de los valores de una columna --
-- SUM(columna) suma todos los valores de una columna --
-- ROUND(valor,cantidad de decimales) redondeo de decimales --
-- HAVING clausula que se usa con GROUP BY para funcionar como un where con grupos 


-- ACLARACIONES !!!--
-- Si o si el % va detras de la letra o cadena para que no aparezca --

-- Ejercicios--

-- 1. punto - Obtener los datos completos de los empleados --
SELECT * FROM personal.empleados;

-- 2. Obtener los datos completos de los departamentos. --
SELECT * FROM personal.departamentos;

-- 3. Listar el nombre de los departamentos --
SELECT nombre_depto FROM personal.departamentos;
SELECT distinct nombre_depto FROM personal.departamentos;

-- 4. Obtener el nombre y salario de todos los empleados. --
SELECT nombre, sal_emp FROM personal.empleados;

-- 5. Listar todas las comisiones --
SELECT comision_emp FROM personal.empleados;
SELECT nombre, comision_emp FROM personal.empleados;

-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’ --
SELECT * FROM personal.empleados WHERE cargo_emp = "Secretaria";
SELECT * FROM personal.empleados WHERE cargo_emp = 'Secretaria';

-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente. --
SELECT * FROM personal.empleados WHERE cargo_emp = 'Vendedor' ORDER BY nombre;

-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor. --
SELECT nombre, cargo_emp, sal_emp FROM personal.empleados ORDER BY sal_emp;

-- 9. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados. --
SELECT nombre AS "Nombre", cargo_emp AS "Cargo" FROM personal.empleados;
SELECT nombre, cargo_emp FROM personal.empleados;

-- 10. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor --
SELECT nombre AS "Nombre", sal_emp AS "Salario", comision_emp AS "Comision" FROM personal.empleados WHERE id_depto = 2000;

-- 11. Obtener el valor total a pagar que resulta de sumar el salario y la comisión de los empleados del departamento 3000 una bonificación de 500, en orden alfabético del empleado. --
SELECT nombre AS "Nombre",
sal_emp AS "Salario", 
comision_emp AS "Comision", 
(sal_emp + comision_emp + 500) AS "Salario + Comision + Bonificación" 
FROM personal.empleados WHERE id_depto = 3000 ORDER BY nombre;

-- 12. Muestra los empleados cuyo nombre empiece con la letra J. --
-- pagina 18 de la guia --
SELECT nombre AS "Nombre" FROM empleados WHERE nombre LIKE "J%"; -- Empieza con J --
SELECT nombre AS "Nombre" FROM empleados WHERE nombre LIKE "%a"; -- terminan con A --
SELECT nombre AS "Nombre" FROM empleados WHERE nombre LIKE "%j%"; -- Contiene J ó Empieza con J --
SELECT nombre AS "Nombre" FROM empleados WHERE nombre LIKE "_%j%"; -- Contiene J --
SELECT nombre AS "Nombre" FROM empleados WHERE nombre LIKE "_o%"; -- Su segunda letra es O --

-- 13. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.--
SELECT sal_emp AS "Salario", comision_emp AS "Comision", (sal_emp + comision_emp) AS "Salario + Comision", nombre AS "Nombre" FROM personal.empleados WHERE comision_emp > 1000;

-- 14. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.
SELECT sal_emp AS "Salario", comision_emp AS "Comision", (sal_emp + comision_emp) AS "Salario + Comision", nombre AS "Nombre" FROM personal.empleados WHERE comision_emp = 0;

-- 15. Obtener la lista de los empleados que ganan una comisión superior a su sueldo. --
SELECT nombre AS "Nombre", sal_emp AS "Salario", comision_emp AS "Comision" 
FROM personal.empleados WHERE comision_emp > sal_emp ORDER BY nombre;

-- 16. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo. --
SELECT nombre AS "Nombre", comision_emp AS "Comision", sal_emp AS "Salario" 
FROM personal.empleados WHERE comision_emp <= sal_emp * 0.30 ORDER BY nombre;

-- 17. Hallar los empleados cuyo nombre no contiene la cadena “MA” --
SELECT nombre AS "Nombre" 
FROM personal.empleados WHERE nombre NOT LIKE "MA%";

-- 18. Obtener los nombres de los departamentos que sean “Ventas” , “Investigación” y ‘Mantenimiento". --
SELECT DISTINCT nombre_depto AS "Nombre Departamento" 
FROM personal.departamentos WHERE nombre_depto IN ("Ventas", "Investigación", "Mantenimiento");

-- 19. Ahora obtener los nombres de los departamentos que NO sean “Ventas” ni “Investigación” ni ‘Mantenimiento. --
SELECT nombre_depto AS "Nombre Departamento" 
FROM personal.departamentos WHERE nombre_depto NOT IN ("Ventas", "Mantenimiento", "Investigación");

-- 20. Mostrar el salario más alto de la empresa --
SELECT MAX(sal_emp) AS "Salario MAXIMO", nombre AS "Nombre" 
FROM personal.empleados;

-- 21. Mostrar el nombre del último empleado de la lista por orden alfabético. --
select nombre from personal.empleados ORDER BY nombre desc ;
select MAX(nombre) from personal.empleados;
-- con subconsulta
select * from personal.empleados where nombre=(select MAX(nombre) from personal.empleados);

-- 22. Hallar el salario más alto, el más bajo y la diferencia entre ellos. --
select MAX(sal_emp) AS 'Salario mas Alto', MIN(sal_emp) AS 'Salario mas Bajo', MAX(sal_emp)- MIN(sal_emp) AS 'Diferencia'  from personal.empleados;

-- 23. Hallar el salario promedio por departamento. --

SELECT SUM(sal_emp) AS 'Total Salarios', COUNT(sal_emp) as 'Cant. de Salarios',  round(SUM(sal_emp) / COUNT(sal_emp),2) as 'Promedio' FROM personal.empleados;

SELECT SUM(sal_emp) AS 'Total Salarios', COUNT(sal_emp) as 'Cant. de Salarios', round(avg(sal_emp),2) as 'Promedio' FROM personal.empleados;
-- aca arriba algo nos falta 


-- Consultas con Having PAGINA 22 --
-- 24. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos. --
select id_depto as 'Codigo de Departamento', count(id_emp) as 'Cantidad de Empleados' 
from empleados
group by id_depto having count(id_depto)>3;

-- 25. Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige. Solo los que tengan más de dos empleados (2 incluido).



/* ??????

SELECT cod_jefe as 'Codigo' ,  nombre AS "Nombre", cargo_emp 'Cargo'  
from empleados WHERE cargo_emp LIKE 'Jefe%'
group by cod_jefe having count(id_emp)>=2 ;

select cod_jefe as 'Codigo de Jefe', nombre, count(id_emp) as 'Cantidad de Empleados' 
from empleados group by id_depto having count(id_depto)>=2;

select nombre, count(id_emp) as 'Cant. Empleados'
from empleados
where cargo_emp like 'Jefe%'
group by id_depto having count(id_emp) >= 2;

SELECT nombre, cargo_emp AS "Nombre" FROM personal.empleados WHERE cargo_emp LIKE "Jefe%";
*/

-- 26. Hallar los departamentos que no tienen empleados 
DELETE FROM empleados WHERE (`id_emp` = '338');
-- 1ro se tuvo que borrar un empleado para verificar que algun departamento no tenga empleado

select nombre_depto as 'Departamento sin Empleados'
from departamentos d
left join empleados e
on d.id_depto = e.id_depto where e.id_emp is null;

-- Consulta con Subconsulta
-- 27. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.
select nombre 'Nombre Empleado', sal_emp 'Salario mayor o igual al promedio' 
from empleados 
where sal_emp >= (select avg(sal_emp) from empleados);


