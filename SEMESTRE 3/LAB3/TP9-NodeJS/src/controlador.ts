import { Request, Response } from "express";
import { cxMysql } from './mysqldb';

export const getEmpleados = (req:Request, res:Response) => new Promise((resolve, reject) => {
    cxMysql.getConnection((err, connection) => {
        if (err){ 
          console.error(err);
          res.send(err);
          return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT * FROM empleado limit 20', (err, results) => {
          if (err) console.error(err);
          //console.log('User Query Results: ', results);
          res.send(results)
        });
      });
  }); 

export const getEmpleadosXLegajo = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const ljEmp = parseInt(req.params.id);
    cxMysql.getConnection((err, connection) => {
        if (err){
          console.error(err);
          res.send(err);
          return;
        } 
        connection.query('SELECT * FROM empleado WHERE legajo = ?', [ljEmp], (err, results) => {
          if (err) console.error(err);
          res.send(results)
        });
      });
  });

export const crearEmpleado = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const {apellido, nombre, dni, sector, fecha_ingreso, activo} = req.body;
    var values = [apellido, nombre, dni, sector, fecha_ingreso, activo];
    cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else{
            let sql:string = 'INSERT INTO empleado (apellido, nombre, dni, sector, fecha_ingreso, activo) VALUES (?, ?, ?, ?, ?, ?)';
            connection.query(sql, values, (err, results) => {
                if (err) {
                  console.error(err);
                  res.json({message:"Error al tratar de insertar"})
                }else{
                  res.json({message:"Empleado Insertado con éxito"})
                }
              });
        }          
      });
});

export const actualizarEmpleado = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const {legajo, apellido, nombre, dni, sector, fecha_ingreso, activo} = req.body;
    var values = [apellido, nombre, dni, sector, fecha_ingreso, activo, legajo];
    cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else{
            let sql:string = 'UPDATE empleado SET apellido=?, nombre=?, dni=?, sector=?, fecha_ingreso=?, activo=?  WHERE legajo=?';
            connection.query(sql, values, (err, results) => {
                if (err) {
                  console.error(err);
                  res.json({message:"Error al actualizar " + err})
                }else{
                  res.json({message:"Empleado Actualizado con éxito"})
                }
               
              });
        }          
      });
});

export const eliminarEmpleado = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const ljEmp = parseInt(req.params.id);
    cxMysql.getConnection((err, connection) => {
          if (err) {
            console.error(err);
            res.send(err);
            return;
          }
          connection.query('DELETE FROM empleado WHERE legajo = ?', [ljEmp],(err, results) => {
          if (err) {
            console.error(err);
            res.json({message:"Error al tratar de Eliminar"})
          }else{
            res.json({message:"Empleado Eliminado con éxito"})
          }
          
        });
      });
});