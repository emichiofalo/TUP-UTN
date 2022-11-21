import { Request, Response } from "express";
import { cxMysql } from './mysqldb';

export const getClientes = (req:Request, res:Response) => new Promise((resolve, reject) => {
    cxMysql.getConnection((err, connection) => {
        if (err){ 
          console.error(err);
          res.send(err);
          return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT * FROM cliente limit 20', (err, results) => {
          if (err) console.error(err);
          res.send(results)
        });
      });
  }); 

export const getClientesXid = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const id = parseInt(req.params.id);
    cxMysql.getConnection((err, connection) => {
        if (err){
          console.error(err);
          res.send(err);
          return;
        } 
        connection.query('SELECT * FROM cliente WHERE legajo = ?', [id], (err, results) => {
          if (err) console.error(err);
          res.send(results[0])
        });
      });
  });

export const crearCliente = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const {nombre, apellido, saldo, domicilio, telefono, cuit} = req.body;
    var values = [nombre, apellido, saldo, domicilio, telefono, cuit];
    cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else{
            let sql:string = 'INSERT INTO cliente (nombre, apellido, saldo, domicilio, telefono, cuit) VALUES (?, ?, ?, ?, ?, ?)';
            connection.query(sql, values, (err, results) => {
                if (err) {
                  console.error(err);
                  res.json({message:"Error al tratar de insertar"})
                }else{
                  res.json({message:"Cliente Insertado con éxito"})
                }
              });
        }          
      });
});

export const actualizarCliente = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const {id, nombre, apellido, saldo, domicilio, telefono, cuit} = req.body;
    var values = [id, nombre, apellido, saldo, domicilio, telefono, cuit];
    cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else{
            let sql:string = 'UPDATE cliente SET nombre=?, apellido=?, saldo=?, domicilio=?, telefono=?, cuit=?  WHERE id=?';
            connection.query(sql, values, (err, results) => {
                if (err) {
                  console.error(err);
                  res.json({message:"Error al actualizar " + err})
                }else{
                  res.json({message:"Cliente Actualizado con éxito"})
                }
               
              });
        }          
      });
});

export const eliminarCliente = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const id = parseInt(req.params.id);
    cxMysql.getConnection((err, connection) => {
          if (err) {
            console.error(err);
            res.send(err);
            return;
          }
          connection.query('DELETE FROM cliente WHERE id = ?', [id],(err, results) => {
          if (err) {
            console.error(err);
            res.json({message:"Error al tratar de Eliminar"})
          }else{
            res.json({message:"Cliente Eliminado con éxito"})
          }
          
        });
      });
});

export const getClientesXApellido = (req:Request, res:Response) => new Promise((resolve, reject) => {
  const apellido = (req.params.apellido);
  cxMysql.getConnection((err, connection) => {
    if (err){ 
      console.error(err);
      res.send(err);
      return;
    }
    console.log('MySQL Connection: ', connection.threadId);
    connection.query('SELECT * FROM cliente WHERE apellido LIKE "%'+apellido+'%" limit 30', (err, results) => {
      if (err) console.error(err);
      res.send(results)
    });
  });
});