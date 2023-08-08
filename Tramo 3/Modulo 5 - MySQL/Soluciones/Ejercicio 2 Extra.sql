-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
select codigo_oficina, ciudad from oficina;
-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
select ciudad,telefono from oficina where pais = 'España';
-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un
-- código de jefe igual a 7.
select concat(nombre,', ', apellido1,' ', apellido2) 'Nombre',email 'E- mail' from empleado where codigo_jefe = 7;
-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
select puesto Puesto, concat(nombre,', ', apellido1,' ', apellido2) 'Nombre',email 'E- mail' 
from empleado where puesto = 'Director General';
-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean
-- representantes de ventas.
 select puesto Puesto, concat(nombre,', ', apellido1,' ', apellido2) 'Nombre' from empleado where puesto not like('Representante Ventas');
-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.
select nombre_cliente Nombre from cliente where pais = 'Spain';
-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
select distinct estado from pedido;
-- 8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago
-- en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan
-- repetidos. Resuelva la consulta:
-- o Utilizando la función YEAR de MySQL.
-- o Utilizando la función DATE_FORMAT de MySQL.
-- o Sin utilizar ninguna de las funciones anteriores.
select distinct codigo_cliente from pago where year(fecha_pago) = 2008;
-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
-- entrega de los pedidos que no han sido entregados a tiempo.
select codigo_pedido Pedido, codigo_cliente Cliente, fecha_esperada 'Estimado de entrega',fecha_entrega 'Entrega real'
from pedido where datediff(fecha_esperada,fecha_entrega)<0;
-- 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de
-- los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha esperada.
-- o Utilizando la función ADDDATE de MySQL.
-- o Utilizando la función DATEDIFF de MySQL.
select codigo_pedido Pedido, codigo_cliente Cliente, fecha_esperada 'Estimado de entrega',fecha_entrega 'Entrega real'
from pedido where datediff(fecha_esperada,fecha_entrega)>=2;
select date_sub('2018-01-01', interval 2 day);
-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
select * from pedido where estado = 'rechazado' and (year(fecha_esperada)=2009 || year(fecha_entrega)=2009);
-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de
-- cualquier año.
select * from pedido where month(fecha_entrega) = 1;
-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
-- Ordene el resultado de mayor a menor.
select * from pago where year(fecha_pago)=2008 && forma_pago = 'PayPal' order by total desc;
-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en
-- cuenta que no deben aparecer formas de pago repetidas.
select distinct forma_pago from pago;
-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que
-- tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de
-- venta, mostrando en primer lugar los de mayor precio.
select * from producto where gama = 'ornamentales' and cantidad_en_stock>=100 order by precio_venta desc;
-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo
-- representante de ventas tenga el código de empleado 11 o 30.
select * from cliente where (ciudad = 'Madrid' || ciudad = 'Cuyo') and codigo_empleado_rep_ventas between 11 and 30;
