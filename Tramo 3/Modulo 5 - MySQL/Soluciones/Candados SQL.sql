-- CANDADO A
-- Posición: Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.

Select count(*) 'Posicion Candado A' from 
estadisticas where Asistencias_por_partido = (Select max(Asistencias_por_partido) from estadisticas); 

-- Clave: Muestre la suma total del peso de los jugadores, donde la conferencia sea 'East' y la posición sea 'C'.

select sum(j.peso) 'Clave Candado A' from 
jugadores j join equipos e on e.nombre = j.nombre_equipo where e.conferencia = 'East' and j.posicion like '%C%';

-- CANDADO B
-- Posición: Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de jugadores que tiene el equipo Heat.

select count(asistencias_por_partido) 'Posicion Candado B' from
 estadisticas where Asistencias_por_partido > (select count(*) from jugadores where Nombre_equipo = 'heat');

-- Clave: Será igual al conteo de partidos jugados durante las temporadas del año 1999.

select count(*) 'Clave Candado B' from partidos where temporada like '%99%';

-- CANDADO C
-- Posición: La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman parte de equipos de 
-- la conferencia West. Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a 195, y a
-- eso le vamos a sumar 0.9945.

select (count(*)/(select count(peso) from jugadores where peso >=195) + 0.9945) 'Posicion Candado C' from
 jugadores j join equipos e on  j.Nombre_equipo = e.Nombre where j.procedencia = 'Michigan' and e.conferencia = 'West';

-- Clave: Redondear hacia abajo el resultado que se devuelve de sumar: el promedio de puntos por partido, el conteo de asistencias
-- por partido, y la suma de tapones por partido. Además, este resultado debe ser, donde la división sea central.

select floor(avg(e.puntos_por_partido) + count(e.asistencias_por_partido) + sum(e.tapones_por_partido)) 'Clave Candado C' from
 estadisticas e join jugadores j on e.jugador = j.codigo 
 join equipos eq on j.Nombre_equipo = eq.Nombre where eq.Division = 'Central';

-- CANDADO D
-- Posición: Redondear los tapones por partido del jugador Corey Maggette durante la temporada 00/01. 

select round(e.tapones_por_partido) 'Posicion Candado D' from estadisticas e join jugadores j on j.codigo = e.jugador
where j.nombre = 'Corey Maggette' and e.temporada = '00/01';

-- Clave: Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido de todos los jugadores 
-- de procedencia argentina.

select floor(sum(puntos_por_partido)) 'Clave Candado D' 
from estadisticas e join jugadores j on j.codigo = e.jugador where
j.procedencia = 'argentina';
