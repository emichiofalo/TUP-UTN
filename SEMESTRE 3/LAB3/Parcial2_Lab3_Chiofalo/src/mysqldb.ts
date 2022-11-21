import {createPool} from 'mysql'

export const cxMysql = createPool({
    host: 'localhost',
    user: 'root',
    password: 'mysql',
    database: 'clientes',         
    connectionLimit: 100 
  });