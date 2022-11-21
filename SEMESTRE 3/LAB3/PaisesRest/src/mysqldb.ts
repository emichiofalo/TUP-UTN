import {createPool} from 'mysql'

export const cxMysql = createPool({
    host: 'localhost',
    user: 'root',
    password: 'mysql',
    database: 'paises',
    port: 3306,
    insecureAuth: true,
    connectionLimit: 100 //100 es el valor por defecto
  });
  