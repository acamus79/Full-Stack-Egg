
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

