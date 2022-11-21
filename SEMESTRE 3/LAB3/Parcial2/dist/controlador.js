"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.getClientesXApellido = exports.eliminarCliente = exports.actualizarCliente = exports.crearCliente = exports.getClientesXid = exports.getClientes = void 0;
const mysqldb_1 = require("./mysqldb");
const getClientes = (req, res) => new Promise((resolve, reject) => {
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT * FROM cliente limit 20', (err, results) => {
            if (err)
                console.error(err);
            res.send(results);
        });
    });
});
exports.getClientes = getClientes;
const getClientesXid = (req, res) => new Promise((resolve, reject) => {
    const id = parseInt(req.params.id);
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        connection.query('SELECT * FROM cliente WHERE id = ?', [id], (err, results) => {
            if (err)
                console.error(err);
            res.send(results[0]);
        });
    });
});
exports.getClientesXid = getClientesXid;
const crearCliente = (req, res) => new Promise((resolve, reject) => {
    const { nombre, apellido, saldo, domicilio, telefono, cuit } = req.body;
    var values = [nombre, apellido, saldo, domicilio, telefono, cuit];
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else {
            let sql = 'INSERT INTO cliente (nombre, apellido, saldo, domicilio, telefono, cuit) VALUES (?, ?, ?, ?, ?, ?)';
            connection.query(sql, values, (err, results) => {
                if (err) {
                    console.error(err);
                    res.json({ message: "Error al tratar de insertar" });
                }
                else {
                    res.json({ message: "Cliente Insertado con éxito" });
                }
            });
        }
    });
});
exports.crearCliente = crearCliente;
const actualizarCliente = (req, res) => new Promise((resolve, reject) => {
    const { nombre, apellido, saldo, domicilio, telefono, cuit, id } = req.body;
    var values = [nombre, apellido, saldo, domicilio, telefono, cuit, id];
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else {
            let sql = 'UPDATE cliente SET nombre=?, apellido=?, saldo=?, domicilio=?, telefono=?, cuit=?  WHERE id=?';
            connection.query(sql, values, (err, results) => {
                if (err) {
                    console.error(err);
                    res.json({ message: "Error al actualizar " + err });
                }
                else {
                    res.json({ message: "Cliente Actualizado con éxito" });
                }
            });
        }
    });
});
exports.actualizarCliente = actualizarCliente;
const eliminarCliente = (req, res) => new Promise((resolve, reject) => {
    const id = parseInt(req.params.id);
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        connection.query('DELETE FROM cliente WHERE id = ?', [id], (err, results) => {
            if (err) {
                console.error(err);
                res.json({ message: "Error al tratar de Eliminar" });
            }
            else {
                res.json({ message: "Cliente Eliminado con éxito" });
            }
        });
    });
});
exports.eliminarCliente = eliminarCliente;
const getClientesXApellido = (req, res) => new Promise((resolve, reject) => {
    const apellido = (req.params.apellido);
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT * FROM cliente WHERE apellido LIKE "%' + apellido + '%" limit 30', (err, results) => {
            if (err)
                console.error(err);
            res.send(results);
        });
    });
});
exports.getClientesXApellido = getClientesXApellido;
