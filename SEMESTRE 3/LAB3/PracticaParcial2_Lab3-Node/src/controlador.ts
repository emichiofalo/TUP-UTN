import { Request, Response } from "express";
import { cxMysql } from './mysqldb';

export const getRubros = (req:Request, res:Response) => new Promise((resolve, reject) => {
    cxMysql.getConnection((err, connection) => {
        if (err){ 
          console.error(err);
          res.send(err);
          return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT * FROM rubro', (err, results) => {
          if (err) console.error(err);
          res.send(results)
        });
      });
  }); 

export const getProductosXRubro = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const idrubro = parseInt(req.params.idrubro);
    cxMysql.getConnection((err, connection) => {
        if (err){
          console.error(err);
          res.send(err);
          return;
        } 
        connection.query('SELECT * FROM producto WHERE idrubro = ?', [idrubro], (err, results) => {
          if (err) console.error(err);
          res.send(results)
        });
      });
  });