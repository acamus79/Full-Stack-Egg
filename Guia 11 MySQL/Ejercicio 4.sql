
/*

1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 
libras, ordenados por nombre alfabéticamente.
3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
4. Mostrar el nombre de los equipos del este (East).
5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
10. Mostrar el número de puntos de cada jugador en toda su carrera.
11. Mostrar el número de jugadores de cada equipo.
12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante. 
18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.

*/

USE nba;

-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select Nombre, Peso
from jugadores
order by Nombre;

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 
select Nombre, Posicion, Peso
from jugadores
where Posicion = 'C' and Peso >200
order by Peso;

-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select Nombre
from equipos
order by Nombre;

-- 4. Mostrar el nombre de los equipos del este (East).
select Nombre, Conferencia
from equipos
where Conferencia like 'eas%';

select Nombre, Conferencia
from equipos
where Conferencia = 'East';

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select Nombre
from equipos
where Nombre like 'c%';

-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select Nombre, Nombre_equipo
from jugadores 
order by Nombre_equipo;

-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select Nombre, Nombre_equipo
from jugadores 
where Nombre_equipo like 'rapt%'
order by Nombre;

-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select Puntos_por_partido, jugador, Temporada
from estadisticas 
where jugador = (select codigo from jugadores where Nombre like 'Pau G%');

select e.Puntos_por_partido, e.jugador, e.Temporada, j.Nombre
from estadisticas e
join jugadores j
on j.codigo = e.jugador
where j.Nombre like 'Pau G%';

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select e.Puntos_por_partido, e.jugador, e.Temporada, j.Nombre
from estadisticas e
join jugadores j
on j.codigo = e.jugador
where j.Nombre like 'Pau G%' and e.Temporada like '04/%';

-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
select j.Nombre, round(sum(puntos_por_partido),2) as 'Total Puntos'
from estadisticas e
join jugadores j
on j.codigo = e.jugador
group by e.jugador
order by sum(puntos_por_partido);

-- 11. Mostrar el número de jugadores de cada equipo.
select Nombre_equipo, count(Nombre_equipo) as 'Nro de Jugadores'
from jugadores
group by Nombre_equipo;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
select j.Nombre, round(sum(puntos_por_partido),2) as 'Total Puntos'
from estadisticas e
join jugadores j
on j.codigo = e.jugador
group by e.jugador
order by sum(puntos_por_partido) desc limit 1;

-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select e.Nombre, e.Conferencia, e.Division, j.Nombre, j.Altura
from equipos e
join jugadores j
on j.Nombre_equipo = e.Nombre
order by j.Altura desc limit 1;

-- 14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
-- ?? de nuevo me parece que hay un fallo de redaccion o un olvido de tipeo con el punto 16 sera esto de LOCAL

select e.Nombre, e.Conferencia, e.Division, avg(puntos_local) as 'Promedio Local'
from equipos e
join partidos p
on p.equipo_local = e.Nombre
where e.Division = 'Pacific'
group by e.Nombre;


-- 15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT equipo_local, equipo_visitante, diferencia 
FROM (SELECT equipo_local, equipo_visitante, abs(puntos_local - puntos_visitante) as diferencia FROM partidos) t 
WHERE diferencia = (SELECT max(abs(puntos_local - puntos_visitante)) FROM partidos);

-- saco la diferencia de puntos por partido
SELECT equipo_local, equipo_visitante, abs(puntos_local - puntos_visitante) as diferencia 
FROM partidos;

-- la maxima diferencia
SELECT max(abs(puntos_local - puntos_visitante)) 
FROM partidos;

-- 16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
-- ?? sera esto de Visitante
select e.Nombre, e.Conferencia, e.Division, avg(puntos_visitante) as 'Promedio Visitante'
from equipos e
join partidos p
on p.equipo_visitante = e.Nombre
where e.Division = 'Pacific'
group by e.Nombre;

-- 17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante. 


-- 18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
