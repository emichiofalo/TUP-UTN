import { Request, Response } from "express";
import { cxMysql } from '../mysqldb';

export const getPaises = (req:Request, res:Response) => new Promise((resolve, reject) => {
    cxMysql.getConnection((err, connection) => {
        if (err){ 
          console.error(err);
          res.send(err);
          return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT codigo,nombre,continente,poblacion FROM pais', (err, results) => {
          if (err) console.error(err);
          //console.log('User Query Results: ', results);
          res.send(results)
        });
        
      });
  }); 

  export const getPaisesXPoblacion= (req:Request, res:Response) => new Promise((resolve, reject) => {
    const busqueda = req.params.busqueda;
    var values = busqueda.split("-");
    var pmax : number= parseInt(values[0]);
    var pmin : number= parseInt(values[1]);
    cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else{
            let sql:string = 'SELECT codigo,nombre,continente,poblacion FROM pais WHERE poblacion < '+ pmax +' and poblacion > ' + pmin;
            connection.query(sql, values, (err, results) => {
                if (err) console.error(err);
                //console.log('User Query Results: ', results);
                res.send(results)
              });
        }          
      });
});