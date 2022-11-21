"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.getProductosXRubro = exports.getRubros = void 0;
const mysqldb_1 = require("./mysqldb");
const getRubros = (req, res) => new Promise((resolve, reject) => {
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT * FROM rubro', (err, results) => {
            if (err)
                console.error(err);
            res.send(results);
        });
    });
});
exports.getRubros = getRubros;
const getProductosXRubro = (req, res) => new Promise((resolve, reject) => {
    const idrubro = parseInt(req.params.idrubro);
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        connection.query('SELECT * FROM producto WHERE idrubro = ?', [idrubro], (err, results) => {
            if (err)
                console.error(err);
            res.send(results);
        });
    });
});
exports.getProductosXRubro = getProductosXRubro;
