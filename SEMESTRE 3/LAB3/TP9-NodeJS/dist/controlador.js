"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.getEmpleadosXApellido = exports.eliminarEmpleado = exports.actualizarEmpleado = exports.crearEmpleado = exports.getEmpleadosXLegajo = exports.getEmpleados = void 0;
const mysqldb_1 = require("./mysqldb");
const getEmpleados = (req, res) => new Promise((resolve, reject) => {
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT * FROM empleado limit 20', (err, results) => {
            if (err)
                console.error(err);
            //console.log('User Query Results: ', results);
            res.send(results);
        });
    });
});
exports.getEmpleados = getEmpleados;
const getEmpleadosXLegajo = (req, res) => new Promise((resolve, reject) => {
    const ljEmp = parseInt(req.params.legajo);
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        connection.query('SELECT * FROM empleado WHERE legajo = ?', [ljEmp], (err, results) => {
            if (err)
                console.error(err);
            res.send(results[0]);
        });
    });
});
exports.getEmpleadosXLegajo = getEmpleadosXLegajo;
const crearEmpleado = (req, res) => new Promise((resolve, reject) => {
    const { apellido, nombre, dni, sector, fecha_ingreso, activo } = req.body;
    var values = [apellido, nombre, dni, sector, fecha_ingreso, activo];
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else {
            let sql = 'INSERT INTO empleado (apellido, nombre, dni, sector, fecha_ingreso, activo) VALUES (?, ?, ?, ?, ?, ?)';
            connection.query(sql, values, (err, results) => {
                if (err) {
                    console.error(err);
                    res.json({ message: "Error al tratar de insertar" });
                }
                else {
                    res.json({ message: "Empleado Insertado con éxito" });
                }
            });
        }
    });
});
exports.crearEmpleado = crearEmpleado;
const actualizarEmpleado = (req, res) => new Promise((resolve, reject) => {
    const { legajo, apellido, nombre, dni, sector, fecha_ingreso, activo } = req.body;
    var values = [apellido, nombre, dni, sector, fecha_ingreso, activo, legajo];
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else {
            let sql = 'UPDATE empleado SET apellido=?, nombre=?, dni=?, sector=?, fecha_ingreso=?, activo=?  WHERE legajo=?';
            connection.query(sql, values, (err, results) => {
                if (err) {
                    console.error(err);
                    res.json({ message: "Error al actualizar " + err });
                }
                else {
                    res.json({ message: "Empleado Actualizado con éxito" });
                }
            });
        }
    });
});
exports.actualizarEmpleado = actualizarEmpleado;
const eliminarEmpleado = (req, res) => new Promise((resolve, reject) => {
    const ljEmp = parseInt(req.params.legajo);
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        connection.query('DELETE FROM empleado WHERE legajo = ?', [ljEmp], (err, results) => {
            if (err) {
                console.error(err);
                res.json({ message: "Error al tratar de Eliminar" });
            }
            else {
                res.json({ message: "Empleado Eliminado con éxito" });
            }
        });
    });
});
exports.eliminarEmpleado = eliminarEmpleado;
const getEmpleadosXApellido = (req, res) => new Promise((resolve, reject) => {
    const apellido = (req.params.apellido);
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT * FROM empleado WHERE apellido LIKE "%' + apellido + '%" limit 30', (err, results) => {
            if (err)
                console.error(err);
            res.send(results);
        });
    });
});
exports.getEmpleadosXApellido = getEmpleadosXApellido;
