CREATE DATABASE `nomina`;

CREATE TABLE `empleado`  ( 
	`id_empleado`  	int(11) AUTO_INCREMENT NOT NULL,
	`status`       	int(11) NOT NULL,
	`nombre`       	varchar(100) NOT NULL,
	`paterno`      	varchar(100) NOT NULL,
	`materno`      	varchar(100) NOT NULL,
	`f_nacimiento` 	date NOT NULL,
	`rfc`          	varchar(13) NOT NULL,
	`curp`         	varchar(18) NOT NULL,
	`imss`         	varchar(12) NOT NULL,
	`departamento` 	varchar(50) NULL,
	`puesto`       	varchar(50) NULL,
	`f_alta`       	date NOT NULL,
	`f_baja`       	date NULL,
	`causa_baja`   	varchar(150) NULL,
	`sexo`         	varchar(1) NOT NULL,
	`foto`         	varchar(150) NULL,
	`clasificacion`	varchar(150) NULL,
	`salariodiario`	decimal(12,2) NOT NULL,
    `tipopago` int(11) NOT NULL,
	PRIMARY KEY(`id_empleado`)
)
;

CREATE TABLE `periodopago`  ( 
	`id_ppago`  	int(11) AUTO_INCREMENT NOT NULL,
	`tipopago`       	int(11) NOT NULL,
	`numeropago`       	int(11) NOT NULL,
	`f_inicio` 	date NOT NULL,
	`f_fin` 	date NOT NULL,
	`f_pago` 	date NOT NULL,
	PRIMARY KEY(`id_ppago`)
)
;

CREATE TABLE `nomina`  ( 
	`id_empleado`  	int(11) NOT NULL,
	`id_ppago`       	int(11) NOT NULL,
	`id_nomina`  	int(11) AUTO_INCREMENT NOT NULL,
	`fecha` 	date NOT NULL,
	`status`       	int(11) NOT NULL,
	`percepciones`	decimal(12,2) NOT NULL,
	`deducciones`	decimal(12,2) NOT NULL,
	`total`	decimal(12,2) NOT NULL,
	`obligaciones`	decimal(12,2) NOT NULL,
	PRIMARY KEY(`id_nomina`),
    foreign key (id_empleado) references empleado(id_empleado),
    foreign key (id_ppago) references periodopago(id_ppago)
)
;

CREATE TABLE `asistencia`  ( 
	`id_empleado`  	int(11) NOT NULL,
	`id_incidencia`  	int(11) NOT NULL,
	`id_asistencia`  	int(11) AUTO_INCREMENT NOT NULL,
	`fecha` 	date NOT NULL,
	`h_entrada` 	time NOT NULL,
	`h_salida` 	time,
	PRIMARY KEY(`id_asistencia`),
    foreign key (id_empleado) references empleado(id_empleado)
)
;


CREATE TABLE incidencias  ( 
	id_asistencia 	int(11) NOT NULL,
	id_incidencia 	int(11) AUTO_INCREMENT NOT NULL,
	fecha         	date NOT NULL,
	tipoincidencia	int(11) NOT NULL,
	observaciones       	varchar(255) NOT NULL,
	PRIMARY KEY(`id_incidencia`),
    foreign key (id_asistencia) references asistencia(id_asistencia)
)
;


