/*

7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
8. Mostrar aquellos pokemon que evolucionan por intercambio.
9. Mostrar el nombre del movimiento con más prioridad.
10. Mostrar el pokemon más pesado.
11. Mostrar el nombre y tipo del ataque con más potencia.
12. Mostrar el número de movimientos de cada tipo.
13. Mostrar todos los movimientos que puedan envenenar.
14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
15. Mostrar todos los movimientos que aprende pikachu.
16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
19. Mostrar todos los pokemon que evolucionan por piedra. 
20. Mostrar todos los pokemon que no pueden evolucionar. 
21. Mostrar la cantidad de los pokemon de cada tipo.
14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
15. Mostrar todos los movimientos que aprende pikachu.
16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
19. Mostrar todos los pokemon que evolucionan por piedra. 
20. Mostrar todos los pokemon que no pueden evolucionar. 
21. Mostrar la cantidad de los pokemon de cada tipo.

*/
-- 1. Mostrar el nombre de todos los pokemon.
select nombre 
from pokemon;

-- 2. Mostrar los pokemon que pesen menos de 10k.
select nombre, peso
from pokemon
where peso < 10;

-- 3. Mostrar los pokemon de tipo agua.
select p.nombre
from pokemon p 
join pokemon_tipo t
on p.numero_pokedex = t.numero_pokedex
where t.id_tipo = (select id_tipo from tipo where nombre like 'ag%');

select p.nombre 'Pokemon', ti.nombre 'Tipo'
from  pokemon_tipo t
INNER JOIN  pokemon p
on t.numero_pokedex = p.numero_pokedex 
INNER JOIN tipo ti
on ti.id_tipo = t.id_tipo
where ti.nombre = 'agua';

-- 4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
select p.nombre 'Pokemon', ti.nombre 'Tipo'
from  pokemon_tipo t
INNER JOIN  pokemon p
on t.numero_pokedex = p.numero_pokedex 
INNER JOIN tipo ti
on ti.id_tipo = t.id_tipo
where ti.nombre = 'agua' or ti.nombre= 'fuego' or ti.nombre = 'tierra';

-- 5. Mostrar los pokemon que son de tipo fuego y volador.
select p.nombre 'Pokemon', ti.nombre 'Tipo'
from  pokemon_tipo t
INNER JOIN  pokemon p
on t.numero_pokedex = p.numero_pokedex 
INNER JOIN tipo ti
on ti.id_tipo = t.id_tipo
where ti.nombre = 'fuego' or ti.nombre = 'volador';

-- 6. Mostrar los pokemon con una estadística base de ps mayor que 200.

