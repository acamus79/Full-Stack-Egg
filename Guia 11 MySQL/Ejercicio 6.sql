Use pokemondb;

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
select p.nombre, e.ps
from pokemon p
inner join estadisticas_base e
on e.numero_pokedex = p.numero_pokedex
where e.ps > 200;

-- 7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
select nombre, peso, altura,  e.pokemon_origen
from pokemon p
join evoluciona_de e
on e.pokemon_origen= p.numero_pokedex
where e.pokemon_evolucionado = (select numero_pokedex from pokemon where LOWER(nombre) = 'Arbok');
-- otra forma
select p.nombre, p.altura, p.peso
from pokemon p, evoluciona_de ev
where p.numero_pokedex = ev.pokemon_origen
and ev.pokemon_evolucionado = (select numero_pokedex 
                    from pokemon 
                    where LOWER(nombre) = 'arbok');
                    
-- 8. Mostrar aquellos pokemon que evolucionan por intercambio.
select pk.nombre, tev.tipo_evolucion 
from forma_evolucion fev
inner join tipo_evolucion tev 
on (tev.id_tipo_evolucion = fev.tipo_evolucion)
inner join pokemon_forma_evolucion pfev
on (pfev.id_forma_evolucion = fev.id_forma_evolucion)
inner join pokemon pk
on (pk.numero_pokedex = pfev.numero_pokedex)
where tev.tipo_evolucion = "Intercambio";
-- CREO una vista
create view
union_pokemon as
select pk.numero_pokedex, pk.nombre, pk.peso,  pk.altura,    tev.tipo_evolucion 
from forma_evolucion fev
inner join tipo_evolucion tev 
on (tev.id_tipo_evolucion = fev.tipo_evolucion)
inner join pokemon_forma_evolucion pfev
on (pfev.id_forma_evolucion = fev.id_forma_evolucion)
inner join pokemon pk
on (pk.numero_pokedex = pfev.numero_pokedex);
-- uso la vista creada
select * from union_pokemon where tipo_evolucion = 'Intercambio';

-- 9. Mostrar el nombre del movimiento con más prioridad.
select nombre, prioridad
from movimiento
order by prioridad desc limit 1;

-- 10. Mostrar el pokemon más pesado.
select *
from pokemon
order by peso desc limit 1;
-- otra manera
select nombre, peso
from pokemon
where peso = (select max(peso) 
        from pokemon)

-- 11. Mostrar el nombre y tipo del ataque con más potencia.
select nombre, potencia
from movimiento
order by potencia desc limit 1;

-- 12. Mostrar el número de movimientos de cada tipo.
select count(t.id_tipo) 'Nro de Movimientos', t.nombre 'Movimiento tipo'
from movimiento m
join tipo t
on t.id_tipo = m.id_tipo
group by m.id_tipo;

-- 13. Mostrar todos los movimientos que puedan envenenar.
select m.*, mes.probabilidad, es.efecto_secundario
from movimiento_efecto_secundario mes
join efecto_secundario es
on es.id_efecto_secundario = mes.id_efecto_secundario
join movimiento m
on mes.id_movimiento = m.id_movimiento
where mes.id_efecto_secundario = (select id_efecto_secundario
from efecto_secundario where efecto_secundario like 'env%');

-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.

-- 15. Mostrar todos los movimientos que aprende pikachu.

-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).

-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
-- 19. Mostrar todos los pokemon que evolucionan por piedra. 
-- 20. Mostrar todos los pokemon que no pueden evolucionar. 
-- 21. Mostrar la cantidad de los pokemon de cada tipo.
-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
-- 15. Mostrar todos los movimientos que aprende pikachu.
-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
-- 19. Mostrar todos los pokemon que evolucionan por piedra. 
-- 20. Mostrar todos los pokemon que no pueden evolucionar. 
-- 21. Mostrar la cantidad de los pokemon de cada tipo.
