USE game;
-- Insertar datos en `comuna`
INSERT INTO `comuna` (`nombre`) VALUES
('Santiago'),
('Valparaíso'),
('Concepción'),
('Temuco'),
('Antofagasta'),
('La Serena'),
('Rancagua'),
('Viña del Mar'),
('Punta Arenas'),
('Puerto Montt');

-- Insertar datos en `contrasena`
INSERT INTO `contrasena` (`pass`) VALUES
('password123'),
('123456'),
('qwerty123'),
('mypassword1'),
('adminpass'),
('secret123'),
('123qwerty'),
('password1'),
('letmein'),
('admin123');

-- Insertar datos en `genero`
INSERT INTO `genero` (`nombregenero`) VALUES
('Aventura'),
('Shooter'),
('Deportes'),
('RPG');

-- Insertar datos en `rol`
INSERT INTO `rol` (`nombre`) VALUES
('Admin'),
('Usuario'),
('Moderador'),
('Vendedor');

-- Insertar datos en `permisos`
INSERT INTO `permisos` (`nombrepermiso`) VALUES
('Ver juegos'),
('Comprar juegos'),
('Administrar usuarios'),
('Modificar juegos'),
('Eliminar juegos'),
('Ver compras'),
('Gestionar roles'),
('Acceso total'),
('Acceso restringido'),
('Ver reportes');


INSERT INTO `rolpermisos` (`rol_id_fk`, `permiso_id_fk`) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 1),
(2, 2),
(3, 4),
(3, 5),
(4, 6),
(4, 7);

-- Insertar datos en `usuario`
INSERT INTO `usuario` (`email`, `fechanacimiento`, `fecharegistro`, `nombre`, `nombrecalle`, `numerocasa`, `comuna_id_fk`, `pass_id_fk`, `roll_id_fk`) VALUES
('juan@mail.com', '1990-05-15', '2023-01-10', 'Juan Pérez', 'Calle Falsa', 123, 1, 1, 2),
('maria@mail.com', '1985-08-20', '2023-02-12', 'María López', 'Av. Libertador', 456, 2, 2, 1),
('pedro@mail.com', '1992-03-05', '2023-03-15', 'Pedro González', 'Calle 12', 789, 3, 3, 3),
('lucia@mail.com', '1988-10-25', '2023-04-20', 'Lucía Sánchez', 'Paseo Los Héroes', 321, 4, 4, 4),
('jose@mail.com', '1994-07-12', '2023-05-25', 'José Rodríguez', 'Calle Real', 654, 5, 5, 2),
('ana@mail.com', '1980-02-18', '2023-06-30', 'Ana Martínez', 'Paseo Marítimo', 987, 6, 6, 1),
('javier@mail.com', '1991-11-22', '2023-07-15', 'Javier Díaz', 'Calle 56', 654, 7, 7, 3),
('carla@mail.com', '1987-06-10', '2023-08-20', 'Carla Ramírez', 'Av. Central', 123, 8, 8, 4),
('juanita@mail.com', '1993-04-14', '2023-09-10', 'Juanita Ruiz', 'Calle del Sol', 555, 9, 9, 2),
('roberto@mail.com', '1983-12-01', '2023-10-05', 'Roberto Gómez', 'Calle de los Álamos', 888, 10, 10, 1);


-- Insertar datos en `carrito_compras`
INSERT INTO `carrito_compras` (`cantidad`, `estado`, `total`, `usuario_id_fk`) VALUES
(3, 'Pendiente', 150.00, 1),
(2, 'Finalizado', 120.00, 2),
(5, 'Pendiente', 250.00, 3),
(1, 'Finalizado', 50.00, 4),
(4, 'Pendiente', 200.00, 5),
(2, 'Finalizado', 100.00, 6),
(1, 'Pendiente', 50.00, 7),
(3, 'Finalizado', 150.00, 8),
(2, 'Pendiente', 100.00, 9),
(1, 'Finalizado', 50.00, 10);

-- Insertar datos en `juego`
INSERT INTO `juego` (`nombre`, `precio_dcto`, `precio_original`, `total`) VALUES
('Juego A', 50.00, 60.00, 100.00),
('Juego B', 40.00, 50.00, 80.00),
('Juego C', 30.00, 40.00, 70.00),
('Juego D', 20.00, 30.00, 60.00),
('Juego E', 60.00, 70.00, 120.00),
('Juego F', 10.00, 20.00, 30.00),
('Juego G', 70.00, 80.00, 140.00),
('Juego H', 90.00, 100.00, 180.00),
('Juego I', 80.00, 90.00, 160.00),
('Juego J', 100.00, 110.00, 200.00);

-- Insertar datos en `boleta`
INSERT INTO `boleta` (`estado_compra`, `fechacompra`, `metodo_pago`, `monto_total`, `carrito_id_fk`) VALUES
('Completada', '2023-01-10', 'Tarjeta', 150.00, 1),
('Cancelada', '2023-02-12', 'Transferencia', 120.00, 2),
('Pendiente', '2023-03-15', 'Efectivo', 250.00, 3),
('Completada', '2023-04-20', 'Tarjeta', 50.00, 4),
('Cancelada', '2023-05-25', 'Transferencia', 200.00, 5),
('Pendiente', '2023-06-30', 'Efectivo', 100.00, 6),
('Completada', '2023-07-15', 'Tarjeta', 50.00, 7),
('Pendiente', '2023-08-20', 'Transferencia', 150.00, 8),
('Completada', '2023-09-10', 'Efectivo', 100.00, 9),
('Cancelada', '2023-10-05', 'Tarjeta', 50.00, 10);

-- Insertar datos en `carritocompras_juego`
INSERT INTO `carritocompras_juego` (`carrito_id_fk`, `juego_id_fk`) VALUES
(1, 1),
(1, 2),
(2, 3),
(3, 4),
(4, 5),
(5, 6),
(6, 7),
(7, 8),
(8, 9),
(9, 10);

-- Insertar datos en `juegoxgenero`
INSERT INTO `juegoxgenero` (`genero_id_fk`, `juego_id_fk`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(1, 5),
(2, 6),
(3, 7),
(4, 8),
(1, 9),
(2, 10);


