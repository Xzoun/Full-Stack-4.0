-- A continuación, se deben realizar las siguientes consultas:
-- 1. Mostrar el nombre de todos los pokemon.
select nombre from pokemon;
-- 2. Mostrar los pokemon que pesen menos de 10k.
select nombre from pokemon where peso < 10;
-- 3. Mostrar los pokemon de tipo agua.
select p.nombre from pokemon p 
left join pokemon_tipo pt on pt.numero_pokedex = p.numero_pokedex
left join tipo t on pt.id_tipo = t.id_tipo
where t.nombre = 'agua';
-- 4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
select p.nombre,t.nombre from pokemon p 
left join pokemon_tipo pt on pt.numero_pokedex = p.numero_pokedex
left join tipo t on pt.id_tipo = t.id_tipo
where t.nombre in('agua','tierra','fuego')
order by t.nombre;
-- 5. Mostrar los pokemon que son de tipo fuego y volador.
select p.nombre,t.nombre from pokemon p 
left join pokemon_tipo pt on pt.numero_pokedex = p.numero_pokedex
left join tipo t on pt.id_tipo = t.id_tipo
where t.nombre in('volador','fuego');
-- 6. Mostrar los pokemon con una estadística base de ps mayor que 200.
select p.nombre from pokemon p 
left join estadisticas_base est_ba on est_ba.numero_pokedex = p.numero_pokedex
where est_ba.ps>200;
-- 7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
select nombre, peso, altura from pokemon where numero_pokedex = (
	select pokemon_origen from evoluciona_de where pokemon_evolucionado = (
		select numero_pokedex from pokemon where nombre = 'arbok'));
-- 8. Mostrar aquellos pokemon que evolucionan por intercambio.
select nombre from pokemon p 
inner join pokemon_forma_evolucion pfe on pfe.numero_pokedex=p.numero_pokedex 
inner join forma_evolucion fe on fe.id_forma_evolucion = pfe.id_forma_evolucion
inner join tipo_evolucion te on fe.tipo_evolucion = te.id_tipo_evolucion
where te.tipo_evolucion = 'intercambio';
-- 9. Mostrar el nombre del movimiento con más prioridad.
select nombre from movimiento where prioridad = (select max(prioridad) from movimiento);
-- 10. Mostrar el pokemon más pesado.
select nombre from pokemon where peso = (select max(peso) from pokemon);
-- 11. Mostrar el nombre y tipo del ataque con más potencia.
select mo.nombre from movimiento mo inner join 
tipo ti on ti.id_tipo = mo.id_tipo
where mo.potencia = (select max(potencia) from movimiento);
-- 12. Mostrar el número de movimientos de cada tipo.
select id_tipo, count(id_movimiento) 'numero de movimientos' from movimiento group by id_tipo;
-- 13. Mostrar todos los movimientos que puedan envenenar.
select mo.nombre from movimiento mo inner join
tipo ti on mo.id_tipo = ti.id_tipo
where ti.nombre = 'veneno';
-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
select * from movimiento where descripcion like '%causa daño%' order by nombre;
-- 15. Mostrar todos los movimientos que aprende pikachu.
select distinct nombre from movimiento mo inner join
pokemon_movimiento_forma po_mo_fo where po_mo_fo.id_movimiento = mo.id_movimiento
and numero_pokedex = (select numero_pokedex from pokemon where nombre = 'pikachu');
-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
select distinct nombre from movimiento mo inner join
pokemon_movimiento_forma po_mo_fo on po_mo_fo.id_movimiento = mo.id_movimiento
where numero_pokedex = (select numero_pokedex from pokemon where nombre = 'pikachu')
and po_mo_fo.id_forma_aprendizaje in (select id_forma_aprendizaje from mt);
select* from pokemon_movimiento_forma;
-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.

-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.

-- 19. Mostrar todos los pokemon que evolucionan por piedra.

-- 20. Mostrar todos los pokemon que no pueden evolucionar.

-- 21. Mostrar la cantidad de los pokemon de cada tipo.