SELECT * FROM City; 
SELECT NAME, Population FROM City; 
SELECT NAME, Population FROM City LIMIT 10; 
SELECT NAME, Population FROM City ORDER BY NAME; 
SELECT City.`District`, AVG(City.`Population`) FROM City GROUP BY District ORDER BY District;
SELECT City.`CountryCode`, SUM(City.`Population`) FROM City GROUP BY CountryCode; 
SELECT NAME, Population FROM City WHERE Population > 100000;
SELECT NAME, Population FROM City WHERE Population < 100000;
SELECT NAME, Population FROM City WHERE Population BETWEEN 100000 AND 10000000;
SELECT NAME, CountryCode FROM City WHERE CountryCode = 'NLD';
SELECT NAME, CountryCode FROM City WHERE CountryCode = 'AFG' OR CountryCode = 'CAN' OR CountryCode = 'MEX';
SELECT NAME, CountryCode FROM City WHERE NAME LIKE 'P%';
SELECT NAME, CountryCode FROM City WHERE NAME LIKE '%P';
SELECT NAME, CountryCode FROM City WHERE NAME LIKE '%MA%';
SELECT SUM(City.`Population`) AS PoblacionMundial FROM City;
SELECT AVG(City.`Population`) AS PromedioPobMundial FROM City;
SELECT COUNT(City.`ID`) AS TotalCities FROM City;
SELECT MAX(City.`Population`) FROM City;
SELECT MIN(City.`Population`) FROM City;
INSERT INTO City (NAME, CountryCode, District, Population) VALUES ('TUNUYAN', 'ARG', 'MENDOZA', 110000);
INSERT INTO Country (NAME, CODE, Capital) VALUES ('MENDOZA', 'MZA', (SELECT ID FROM City WHERE NAME = 'TUNUYAN'));
UPDATE City SET NAME = 'TUPUNGATO' WHERE NAME = 'TUNUYAN'; 
UPDATE CountryLanguage SET LANGUAGE = 'espaniol' WHERE LANGUAGE = 'Spanish'; 
DELETE FROM Country WHERE NAME = 'MENDOZA';
DELETE FROM City WHERE NAME = 'TUPUNGATO';
SELECT City.`Name` AS City, City.`District`, Country.`Name` AS Country FROM City 
	INNER JOIN Country ON Country.CODE = City.`CountryCode` WHERE City.`Name` = 'Buenos Aires';
SELECT City.`Name` AS City, City.`District`, Country.`Name` AS Country, CountryLanguage.`Language` FROM City 
	INNER JOIN Country ON Country.`Code` = City.`CountryCode` 
	INNER JOIN CountryLanguage ON CountryLanguage.`CountryCode` = Country.`Code` 
	WHERE Country.`Code` = 'ARG' ORDER BY City.`District`;
SELECT * FROM City INNER JOIN Country INNER JOIN CountryLanguage; 
SELECT * FROM City INNER JOIN Country INNER JOIN CountryLanguage WHERE Country.`Code` = 'ARG';
SELECT * FROM City INNER JOIN Country INNER JOIN CountryLanguage WHERE CountryLanguage.`Language` = 'English' 
	OR CountryLanguage.`Language` = 'Spanish' OR CountryLanguage.`Language` = 'Portuguese' OR Country.`Population` > 1000000; 
SELECT * FROM Country LEFT JOIN CountryLanguage ON CountryLanguage.`CountryCode` = Country.`Code` 
	WHERE CountryLanguage.`IsOfficial` = 'T';