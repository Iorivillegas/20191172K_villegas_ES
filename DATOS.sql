CREATE TABLE Aerolinea(
	id_aerolinea NUMERIC(3),
	nombre_aerolinea VARCHAR(50),
	codigo_aerolinea CHAR(3),
	PRIMARY KEY(id_aerolinea)
);

CREATE TABLE Vuelo(
	id_vuelo NUMERIC(6),
	id_aerolinea NUMERIC(3),
	codigo_vuelo VARCHAR(10),
	cuidad_origen VARCHAR(50),
	ciudad_destino VARCHAR(50),
	costo NUMERIC(10.2),
	tipo_vuelo VARCHAR(20),
	estado CHAR(1),
	PRIMARY KEY (id_vuelo),
	FOREIGN KEY(id_aerolinea) REFERENCES Aerolinea(id_aerolinea)
);

CREATE TABLE Tramo(
	id_escala NUMERIC(9),
	id_vuelo NUMERIC(6),
	aeropuerto_llegada VARCHAR(50),
	aeropuerto_salida VARCHAR(50),
	fecha_llegada VARCHAR(10),
	fecha_salida VARCHAR(10),
	hora_llegada VARCHAR(5),
	hora_salida VARCHAR(5),
	PRIMARY KEY (id_escala),
	FOREIGN KEY(id_vuelo) REFERENCES Vuelo(id_vuelo)
);

INSERT INTO Aerolinea VALUES(1, 'Iberia', 'IAG'); 
INSERT INTO Aerolinea VALUES(2, 'American Airlines', 'AAL'); 
INSERT INTO Aerolinea VALUES(3, 'British Airways', 'BAI'); 
INSERT INTO Aerolinea VALUES(4, 'Viva Air', 'VAI'); 
INSERT INTO Aerolinea VALUES(5, 'Latam', 'LAT'); 

INSERT INTO Vuelo VALUES(1, 1,'IB6650','LIMA', 'MADRID',1346, 'directo','1');
INSERT INTO Vuelo VALUES(2, 2,'AA350','LIMA', 'MADRID',1100, 'escala','0');
INSERT INTO Vuelo VALUES(3, 3,'BA208','LIMA', 'MADRID',9500, 'escala','1');
INSERT INTO Vuelo VALUES(4, 4,'VH361','LIMA', 'MEDELIN',100, 'directo','1');
INSERT INTO Vuelo VALUES(5, 5,'LA2446','LIMA', 'MEDELIN',80, 'escala','1');

INSERT INTO Tramo VALUES(1, 1,'Jorge Chavez', 'Barajas','27-08-2021', '28-08-2021','19:05', '13:55');
INSERT INTO Tramo VALUES(2, 2,'Jorge Chavez', 'Miami','27-08-2021', '27-08-2021','08:30', '15:28');
INSERT INTO Tramo VALUES(3, 2,'Miami', 'Barajas','27-08-2021', '28-08-2021','17:30', '08:10');
INSERT INTO Tramo VALUES(4, 3,'Jorge Chavez', 'Miami','27-08-2021', '27-08-2021','08:30', '15:28');
INSERT INTO Tramo VALUES(5, 5,'Jorge Chavez', 'Barajas','27-08-2021', '28-08-2021','19:05', '13:55');

-------------------- pregunta 1-------------------------------------------
			" SELECT \n" +
                "vu.codigo_origen,vu.codigo_destino,vu.codigo_destino, vu.costo AS costo-vuelo, \n" +
                "vu.nombre_aerolinea, vu.codigo_aerolinea, vu.tipo_vuelo ,vu.estado \n" +
                "FROM \n" +
                "Vuelo vu\n" +
                "INNER JOIN Tramo tr\n" +
                "ON vu.id_vuelo = tr.id_vuelo ;" ;