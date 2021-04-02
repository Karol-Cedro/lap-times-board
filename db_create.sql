DROP DATABASE IF EXISTS lap_times_board;
CREATE USER laptimesboarduser WITH PASSWORD 'password';
CREATE DATABASE lap_times_board WITH TEMPLATE = template0 OWNER=laptimesboarduser;
\c lap_times_board;

ALTER DEFAULT PRIVILEGES GRANT ALL ON TABLES TO laptimesboarduser;
ALTER DEFAULT PRIVILEGES GRANT ALL ON SEQUENCES TO laptimesboarduser;

CREATE TABLE lap_times (
  id SERIAL PRIMARY KEY NOT NULL,
  time TIME DEFAULT NULL,
  vehicle VARCHAR(60) DEFAULT NULL,
  driver VARCHAR(60) DEFAULT NULL,
  date DATE DEFAULT NULL,
  notes VARCHAR(200) DEFAULT NULL
);

INSERT INTO lap_times(time, vehicle, driver, date, notes) VALUES
	('6:43.616','Mercedes-AMG GT Black Series','Maro Engel','2020-11-04','Mercedes conducted test with OEM Michelin Pilot Sport Cup 2 R MO tyres.'),
	('6:44.97','Lamborghini Aventador SVJ LP770-4','Marco Mapelli','2018-07-26','Lamborghini conducted test, full roll cage, Pirelli P Zero Trofeo R.'),
	('6:47.25','Porsche 911 GT2 RS','Lars Kern','2017-09-20','Porsche conducted test. OEM Michelin Pilot Sport Cup 2 ''N2'', OEM "Weissach Package", OEM deletion of audio and communication system, Porsche Motorsport bucket seat and harness on driver''s side.'),
	('6:52.01','Lamborghini Huracán Performante LP640-4','Marco Mapelli','2016-10-05','Lamborghini conducted test, full roll cage, Pirelli Trofeo R.');
