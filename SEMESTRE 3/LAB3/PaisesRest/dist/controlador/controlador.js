"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.getPaisesXPoblacion = exports.getPaises = void 0;
const mysqldb_1 = require("../mysqldb");
const getPaises = (req, res) => new Promise((resolve, reject) => {
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT codigo,nombre,continente,poblacion FROM pais', (err, results) => {
            if (err)
                console.error(err);
            //console.log('User Query Results: ', results);
            res.send(results);
        });
    });
});
exports.getPaises = getPaises;
const getPaisesXPoblacion = (req, res) => new Promise((resolve, reject) => {
    const busqueda = req.params.busqueda;
    var values = busqueda.split("-");
    var pmax = parseInt(values[0]);
    var pmin = parseInt(values[1]);
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else {
            let sql = 'SELECT codigo,nombre,continente,poblacion FROM pais WHERE poblacion < ' + pmax + ' and poblacion > ' + pmin;
            connection.query(sql, values, (err, results) => {
                if (err)
                    console.error(err);
                //console.log('User Query Results: ', results);
                res.send(results);
            });
        }
    });
});
exports.getPaisesXPoblacion = getPaisesXPoblacion;
