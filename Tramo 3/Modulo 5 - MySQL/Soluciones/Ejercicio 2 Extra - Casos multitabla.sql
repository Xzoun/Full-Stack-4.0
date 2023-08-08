-- Consultas multitabla (Composición interna) | Las consultas se deben resolver con INNER JOIN.

-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
select nombre_cliente, concat(nombre,', ', apellido1,' ',apellido2) 'Representante de Ventas' 
from cliente inner join empleado e on codigo_empleado = codigo_empleado_rep_ventas;
--  2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus
-- representantes de ventas.
select nombre_cliente, concat(nombre,', ', apellido1,' ',apellido2) 'Representante de Ventas' 
from cliente inner join empleado e on codigo_empleado = codigo_empleado_rep_ventas 
and codigo_cliente in(select codigo_cliente from pago);
select * from pago;
-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de
-- sus representantes de ventas.
select nombre_cliente, concat(nombre,', ', apellido1,' ',apellido2) 'Representante de Ventas' 
from cliente inner join empleado e on codigo_empleado = codigo_empleado_rep_ventas 
and codigo_cliente not in(select codigo_cliente from pago);
-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes
-- junto con la ciudad de la oficina a la que pertenece el representante.
select nombre_cliente, concat(nombre,', ', apellido1,' ',apellido2) 'Representante de Ventas',
o.ciudad 'Oficina del Rep.Ventas' from cliente inner join empleado e inner join oficina o on codigo_empleado = codigo_empleado_rep_ventas 
and codigo_cliente in(select codigo_cliente from pago) and e.codigo_oficina = o.codigo_oficina;
-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus
-- representantes junto con la ciudad de la oficina a la que pertenece el representante.
select nombre_cliente, concat(nombre,', ', apellido1,' ',apellido2) 'Representante de Ventas', o.ciudad 'Oficina del Rep.Ventas' 
from cliente inner join empleado e inner join oficina o on codigo_empleado = codigo_empleado_rep_ventas 
and codigo_cliente not in(select codigo_cliente from pago) and e.codigo_oficina = o.codigo_oficina;
-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
select o.linea_direccion1,o.linea_direccion2 from cliente inner join empleado e inner join oficina o on codigo_empleado = codigo_empleado_rep_ventas 
and e.codigo_oficina = o.codigo_oficina and cliente.ciudad = 'Fuenlabrada';
-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad
-- de la oficina a la que pertenece el representante.
select nombre_cliente,concat(nombre,', ', apellido1,' ',apellido2) 'Representante de Ventas',o.ciudad
from cliente c inner join empleado e inner join oficina o 
on o.codigo_oficina=e.codigo_oficina and e.codigo_empleado=c.codigo_empleado_rep_ventas;
-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
select concat(e.nombre, ', ', e.apellido1, ' ', e.apellido2) 'Nombre empleado',
       concat(j.nombre, ', ', j.apellido1, ' ', j.apellido2) 'Nombre jefe'
from empleado e left join empleado j on e.codigo_jefe = j.codigo_empleado;
-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
select nombre_cliente from cliente where codigo_cliente in (
select codigo_cliente from pedido where fecha_entrega > fecha_esperada);
-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.

select cl.nombre_cliente Cliente, group_concat(distinct pr.gama) 'Gamas Compradas'from cliente cl
join pedido pe on cl.codigo_cliente = pe.codigo_cliente
join detalle_pedido de_pe on pe.codigo_pedido = de_pe.codigo_pedido
join producto pr on de_pe.codigo_producto = pr.codigo_producto
where pe.estado = 'entregado'
group by cl.codigo_cliente;

-- Consultas multitabla (Composición externa)
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.

-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
select nombre_cliente Cliente 
from cliente cl left join pago pa on cl.codigo_cliente = pa.codigo_cliente
where pa.codigo_cliente is null;
-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
select nombre_cliente Cliente 
from cliente cl left join pedido pe on cl.codigo_cliente = pe.codigo_cliente
where pe.codigo_cliente is null;
-- 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que
-- no han realizado ningún pedido.
select nombre_cliente Cliente, pa.codigo_cliente 'Cliente s/pagos', pe.codigo_cliente 'Cliente s/pedidos' from cliente cl 
left join pedido pe on cl.codigo_cliente = pe.codigo_cliente
left join pago pa on cl.codigo_cliente = pa.codigo_cliente
where pa.codigo_cliente is null or pe.codigo_cliente is null;
-- 4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.
select concat(e.nombre,', ',e.apellido1,' ',e.apellido2) Empleado from empleado e
left join oficina o on e.codigo_oficina = o.codigo_oficina
where o.codigo_oficina is null;
-- 5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.
select concat(e.nombre,', ',e.apellido1,' ',e.apellido2) Empleado from cliente cl
right join  empleado e on cl.codigo_empleado_rep_ventas = e.codigo_empleado
where cl.codigo_empleado_rep_ventas is null; 
-- 6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los
-- que no tienen un cliente asociado.
select concat(e.nombre,', ',e.apellido1,' ',e.apellido2) Empleado from empleado e 
left join cliente cl on  cl.codigo_empleado_rep_ventas = e.codigo_empleado
left join oficina o on e.codigo_oficina = o.codigo_oficina
where ; 
-- 7. Devuelve un listado de los productos que nunca han aparecido en un pedido.
-- 8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los
-- representantes de ventas de algún cliente que haya realizado la compra de algún producto
-- de la gama Frutales.
-- 9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago.
select ;
-- 10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el nombre de su jefe asociado.
